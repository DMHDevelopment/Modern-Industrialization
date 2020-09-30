package aztech.modern_industrialization.pipes.item;

import aztech.modern_industrialization.MIIdentifier;
import aztech.modern_industrialization.pipes.impl.PipePackets;
import com.mojang.blaze3d.systems.RenderSystem;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemPipeScreen extends HandledScreen<ItemPipeScreenHandler> {
    private static final Identifier TEXTURE = new MIIdentifier("textures/gui/pipe/item.png");
    private static final Style SECONDARY_INFO = Style.EMPTY.withColor(TextColor.fromRgb(0xa9a9a9)).withItalic(true);
    private final ButtonWidget.TooltipSupplier priorityTooltip = (button, matrices, mouseX, mouseY) -> {
        List<Text> lines = new ArrayList<>();
        lines.add(new TranslatableText("text.modern_industrialization.priority", handler.pipeInterface.getPriority()));
        lines.add(new TranslatableText("text.modern_industrialization.priority_help").setStyle(SECONDARY_INFO));
        renderTooltip(matrices, lines, mouseX, mouseY);
    };

    public ItemPipeScreen(ItemPipeScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

        this.backgroundHeight = 180;
        this.playerInventoryTitleY = this.backgroundHeight - 94;
    }

    @Override
    protected void init() {
        super.init();
        addButton(new WhitelistButton(
                this.x, this.y, widget -> {
                    boolean newWhitelist = !handler.pipeInterface.isWhitelist();
                    handler.pipeInterface.setWhitelist(newWhitelist);
                    PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
                    buf.writeInt(handler.syncId);
                    buf.writeBoolean(newWhitelist);
                    ClientSidePacketRegistry.INSTANCE.sendToServer(PipePackets.SET_ITEM_WHITELIST, buf);
                }, (button, matrices, mouseX, mouseY) -> {
                    List<Text> lines = new ArrayList<>();
                    if(handler.pipeInterface.isWhitelist()) {
                        lines.add(new TranslatableText("text.modern_industrialization.whitelist"));
                        lines.add(new TranslatableText("text.modern_industrialization.click_to_toggle_blacklist").setStyle(SECONDARY_INFO));
                    } else {
                        lines.add(new TranslatableText("text.modern_industrialization.blacklist"));
                        lines.add(new TranslatableText("text.modern_industrialization.click_to_toggle_whitelist").setStyle(SECONDARY_INFO));
                    }
                    renderTooltip(matrices, lines, mouseX, mouseY);
                }
        ));
        addButton(new ConnectionTypeButton(148+this.x, 22+this.y, 20, 20, null, widget -> {
            int newType = (handler.pipeInterface.getConnectionType()+1) % 3;
            handler.pipeInterface.setConnectionType(newType);
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeInt(handler.syncId);
            buf.writeInt(newType);
            ClientSidePacketRegistry.INSTANCE.sendToServer(PipePackets.SET_ITEM_CONNECTION_TYPE, buf);
        }, (button, matrices, mouseX, mouseY) -> {
            List<Text> lines = new ArrayList<>();
            lines.add(new TranslatableText("text.modern_industrialization.item_connection_tooltip_" + handler.pipeInterface.getConnectionType()));
            lines.add(new TranslatableText("text.modern_industrialization.item_connection_help").setStyle(SECONDARY_INFO));
            renderTooltip(matrices, lines, mouseX, mouseY);
        }));
        addPriorityButton(72, 72, 20, 188, "--", -10);
        addPriorityButton(94, 72, 12, 176, "-", -1);
        addPriorityButton(134, 72, 12, 176, "+", +1);
        addPriorityButton(148, 72, 20, 188, "++", +10);
        addButton(new PriorityDisplay(106+this.x, 72+this.y, 28, 12, new LiteralText(""), priorityTooltip));
    }

    private void addPriorityButton(int x, int y, int width, int u, String text, int delta) {
        addButton(new PriorityButton(x+this.x, y+this.y, width, u, text, button -> {
            handler.pipeInterface.incrementPriority(delta);
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeInt(handler.syncId);
            buf.writeInt(delta);
            ClientSidePacketRegistry.INSTANCE.sendToServer(PipePackets.INCREMENT_ITEM_PRIORITY, buf);
        }, priorityTooltip));
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        this.renderBackground(matrices);
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.client.getTextureManager().bindTexture(TEXTURE);
        this.drawTexture(matrices, this.x, this.y, 0, 0, this.backgroundWidth, this.backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        super.drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    private class WhitelistButton extends ButtonWidget {
        public WhitelistButton(int i, int j, ButtonWidget.PressAction onPress, ButtonWidget.TooltipSupplier tooltipSupplier) {
            super(i + 148, j + 44, 20, 20, new LiteralText("test!"), onPress, tooltipSupplier);
        }

        @Override
        public void renderButton(MatrixStack matrices, int mouseX, int mouseY, float delta) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            minecraftClient.getTextureManager().bindTexture(TEXTURE);
            int u = handler.pipeInterface.isWhitelist() ? 176 : 196;
            int v = this.isHovered() ? 20 : 0;

            RenderSystem.enableDepthTest();
            drawTexture(matrices, this.x, this.y, u, v, this.width, this.height);
            if (this.isHovered()) {
                this.renderToolTip(matrices, mouseX, mouseY);
            }
        }
    }

    private class ConnectionTypeButton extends ButtonWidget {
        public ConnectionTypeButton(int x, int y, int width, int height, Text message, PressAction onPress, TooltipSupplier tooltipSupplier) {
            super(x, y, width, height, message, onPress, tooltipSupplier);
        }

        @Override
        public Text getMessage() {
            return new TranslatableText("text.modern_industrialization.item_connection_" + handler.pipeInterface.getConnectionType());
        }
    }

    private static class PriorityButton extends ButtonWidget {
        private final int u;
        public PriorityButton(int x, int y, int width, int u, String message, PressAction onPress, TooltipSupplier tooltipSupplier) {
            super(x, y, width, 12, new LiteralText(message), onPress, tooltipSupplier);
            this.u = u;
        }

        @Override
        public void renderButton(MatrixStack matrices, int mouseX, int mouseY, float delta) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            TextRenderer textRenderer = minecraftClient.textRenderer;
            minecraftClient.getTextureManager().bindTexture(TEXTURE);
            int v = this.isHovered() ? 40 + this.height : 40;
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.alpha);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableDepthTest();
            drawTexture(matrices, this.x, this.y, u, v, this.width, this.height);
            int j = this.active ? 16777215 : 10526880;
            drawCenteredText(matrices, textRenderer, getMessage(), this.x + this.width / 2, this.y + (this.height - 8) / 2, j | MathHelper.ceil(this.alpha * 255.0F) << 24);
            if (this.isHovered()) {
                this.renderToolTip(matrices, mouseX, mouseY);
            }
        }
    }

    private class PriorityDisplay extends ButtonWidget {
        public PriorityDisplay(int x, int y, int width, int height, Text message, TooltipSupplier tooltipSupplier) {
            super(x, y, width, height, message, button -> {}, tooltipSupplier);
            this.active = false;
        }

        @Override
        public Text getMessage() {
            return new LiteralText(Integer.toString(handler.pipeInterface.getPriority()));
        }

        @Override
        public void renderButton(MatrixStack matrices, int mouseX, int mouseY, float delta) {
            OrderedText orderedText = getMessage().asOrderedText();
            textRenderer.draw(matrices, orderedText, (float)(this.x + this.width / 2 - textRenderer.getWidth(orderedText) / 2), (float)(this.y + (this.height - 8) / 2), 4210752);
            if (this.isHovered()) {
                this.renderToolTip(matrices, mouseX, mouseY);
            }
        }
    }
}

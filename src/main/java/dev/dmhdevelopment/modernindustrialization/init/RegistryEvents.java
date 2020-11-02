package dev.dmhdevelopment.modernindustrialization.init;

import dev.dmhdevelopment.modernindustrialization.items.ore.AluminumOre;
import dev.dmhdevelopment.modernindustrialization.utils.ModernIndustrializationCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new AluminumOre());
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties()
                .group(ModernIndustrializationCreativeTab.ModernIndustrializationCreativeTab);
        event.getRegistry().register(new BlockItem(ModBlocks.ALUMINUMORE, properties).setRegistryName("aluminum_ore"));
    }
}
package dev.dmhdevelopment.modernindustrialization;

import dev.dmhdevelopment.modernindustrialization.init.ItemRegistry;
import dev.dmhdevelopment.modernindustrialization.items.dust.AluminiumDust;
import dev.dmhdevelopment.modernindustrialization.items.dust.BronzeDust;
import dev.dmhdevelopment.modernindustrialization.items.dust.ChromeDust;
import dev.dmhdevelopment.modernindustrialization.items.dust.GoldDust;
import dev.dmhdevelopment.modernindustrialization.items.ingot.*;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("modernindustrialization")
public class ModernIndustrialization
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "modernindustrialization";

    public ModernIndustrialization() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll
                    (
                            ItemRegistry.AluminiumIngot = new AluminiumIngot().setRegistryName(location("aluminium_ingot")),
                            ItemRegistry.BronzeIngot = new BronzeIngot().setRegistryName(location("bronz_ingot")),
                            ItemRegistry.ChromeIngot = new ChromeIngot().setRegistryName(location("chrome_ingot")),
                            ItemRegistry.GoldDust = new GoldDust().setRegistryName(location("gold_dust")),
                            ItemRegistry.AluminiumDust = new AluminiumDust().setRegistryName(location("aluminium_dust")),
                            ItemRegistry.BronzeDust = new BronzeDust().setRegistryName(location("bronze_dust")),
                            ItemRegistry.ChromeDust = new ChromeDust().setRegistryName(location("chrome_dust")),
                            ItemRegistry.TinIngot = new TinIngot().setRegistryName(location("tin_ingot")),
                            ItemRegistry.CopperIngot = new CopperIngot().setRegistryName(location("copper_ingot")),
                            ItemRegistry.NickelIngot = new NickelIngot().setRegistryName(location("nickel_ingot")),
                            ItemRegistry.AntimonyIngot = new AntimonyIngot().setRegistryName(location("antimony_ingot")),
                            ItemRegistry.SaltIngot = new SaltIngot().setRegistryName(location("salt_ingot")),
                            ItemRegistry.BauxiteIngot = new BauxiteIngot().setRegistryName(location("bauxite_ingot")),
                            ItemRegistry.LeadIngot = new LeadIngot().setRegistryName(location("lead_ingot")),
                            ItemRegistry.SilverIngot = new SilverIngot().setRegistryName(location("silver_ingot"))
                    );
        }
       /* public static void RegisterOre(final RegistryEvent.Register<Ore> event){
            event.getRegistry().registerAll(

            );
        }
*/
        private static ResourceLocation location(String name) {
            return new ResourceLocation(MOD_ID, name);
        }
    }

}

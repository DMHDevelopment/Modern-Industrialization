package dev.dmhdevelopment.modernindustrialization;

import dev.dmhdevelopment.modernindustrialization.init.ItemRegistry;
import dev.dmhdevelopment.modernindustrialization.items.dust.*;
import dev.dmhdevelopment.modernindustrialization.items.dust.ElectrumIngot;
import dev.dmhdevelopment.modernindustrialization.items.dust.InvarIngot;
import dev.dmhdevelopment.modernindustrialization.items.dust.ManganeseIngot;
import dev.dmhdevelopment.modernindustrialization.items.dust.SiliconIngot;
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
                            //алюминий
                            ItemRegistry.AluminiumIngot = new AluminiumIngot().setRegistryName(location("aluminium_ingot")),
                            ItemRegistry.AluminiumDust = new AluminiumDust().setRegistryName(location("aluminium_dust")),
                            //бронза
                            ItemRegistry.BronzeIngot = new BronzeIngot().setRegistryName(location("bronz_ingot")),
                            ItemRegistry.BronzeDust = new BronzeDust().setRegistryName(location("bronze_dust")),
                            //хром
                            ItemRegistry.ChromeIngot = new ChromeIngot().setRegistryName(location("chrome_ingot")),
                            ItemRegistry.ChromeDust = new ChromeDust().setRegistryName(location("chrome_dust")),
                            //золото
                            ItemRegistry.GoldDust = new GoldDust().setRegistryName(location("gold_dust")),
                            //тин
                            ItemRegistry.TinIngot = new TinIngot().setRegistryName(location("tin_ingot")),
                            ItemRegistry.TinDust = new TinDust().setRegistryName(location("tin_dust")),
                            //медь
                            ItemRegistry.CopperIngot = new CopperIngot().setRegistryName(location("copper_ingot")),
                            ItemRegistry.CopperDust = new CopperDust().setRegistryName(location("copper_dust")),
                            //никель
                            ItemRegistry.NickelIngot = new NickelIngot().setRegistryName(location("nickel_ingot")),
                            ItemRegistry.NickelDust = new NickelDust().setRegistryName(location("nickel_dust")),
                            //антимоний
                            ItemRegistry.AntimonyIngot = new AntimonyIngot().setRegistryName(location("antimony_ingot")),
                            ItemRegistry.AntimonyDust = new AntimonyDust().setRegistryName(location("antimony_dust")),
                            //свинец
                            ItemRegistry.LeadIngot = new LeadIngot().setRegistryName(location("lead_ingot")),
                            ItemRegistry.LeadDust = new LeadDust().setRegistryName(location("lead_dust")),
                            //серебро
                            ItemRegistry.SilverIngot = new SilverIngot().setRegistryName(location("silver_ingot")),
                            ItemRegistry.SilverDust = new SilverDust().setRegistryName(location("silver_dust")),
                            //баксит
                            ItemRegistry.BauxiteDust = new BauxiteDust().setRegistryName(location("bauxite_dust")),
                            //уголь
                            ItemRegistry.CoalDust = new CoalDust().setRegistryName(location("coal_dust")),
                            //супроникель
                            ItemRegistry.CupronickelIngot = new CupronickelIngot().setRegistryName(location("cupronickel_ingot")),
                            ItemRegistry.CupronickelDust = new CupronickelDust().setRegistryName(location("cupronickel_dust")),
                            //электрум
                            ItemRegistry.ElectrumIngot = new ElectrumIngot().setRegistryName(location("electrum_ingot")),
                            ItemRegistry.ElectrumDust = new ElectrumDust().setRegistryName(location("electrum_dust")),
                            //инвар
                            ItemRegistry.InvarIngot = new InvarIngot().setRegistryName(location("invar_ingot")),
                            ItemRegistry.InvarDust = new InvarDust().setRegistryName(location("invar_dust")),
                            //железо
                            ItemRegistry.IronDust = new IronDust().setRegistryName(location("iron_dust")),
                            //марганец
                            ItemRegistry.ManganeseIngot = new ManganeseIngot().setRegistryName(location("manganise_ingot")),
                            ItemRegistry.ManganeseDust = new ManganeseDust().setRegistryName(location("manganise_dust")),
                            //кварц
                            ItemRegistry.QuartzDust = new QuartzDust().setRegistryName(location("quartz_dust")),
                            //
                            ItemRegistry.SaltDust = new SaltDust().setRegistryName(location("salt_dust")),
                            //силикон
                            ItemRegistry.SiliconIngot = new SiliconIngot().setRegistryName(location("silicon_ingot")),
                            ItemRegistry.SiliconDust = new SiliconDust().setRegistryName(location("silicon_dust")),
                            //содиум
                            ItemRegistry.SodiumIngot = new SodiumIngot().setRegistryName(location("sodium_ingot")),
                            ItemRegistry.SodiumDust = new SodiumDust().setRegistryName(location("sodium_dust")),
                            //суперсталь
                            ItemRegistry.StainlesssteelIngot = new StainlesssteelIngot().setRegistryName(location("stainlesssteel_ingot")),
                            ItemRegistry.StainlesssteelDust = new StainlesssteelDust().setRegistryName(location("stainlesssteel_dust")),
                            //сталь
                            ItemRegistry.SteelIngot = new SteelIngot().setRegistryName(location("steel_ingot")),
                            ItemRegistry.SteelDust = new SteelDust().setRegistryName(location("steel_dust")),
                            //титан
                            ItemRegistry.TitaniumIngot = new TitaniumIngot().setRegistryName(location("titanium_ingot")),
                            ItemRegistry.TitaniumDust = new TitaniumDust().setRegistryName(location("titanium_dust"))
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

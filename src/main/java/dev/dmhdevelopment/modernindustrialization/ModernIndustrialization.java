package dev.dmhdevelopment.modernindustrialization;

import dev.dmhdevelopment.modernindustrialization.init.ItemRegistry;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Aluminium.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyNugget;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Bronze.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Chrome.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Copper.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Gold.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Lead.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Nickel.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silver.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Tin.*;
import dev.dmhdevelopment.modernindustrialization.items.dust.*;
import dev.dmhdevelopment.modernindustrialization.items.dust.ElectrumIngot;
import dev.dmhdevelopment.modernindustrialization.items.dust.InvarIngot;
import dev.dmhdevelopment.modernindustrialization.items.ingot.ManganeseIngot;
import dev.dmhdevelopment.modernindustrialization.items.dust.SiliconIngot;
import dev.dmhdevelopment.modernindustrialization.items.ingot.*;
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

import static dev.dmhdevelopment.modernindustrialization.init.ItemRegistry.GoldTinyDust;
import static dev.dmhdevelopment.modernindustrialization.init.ItemRegistry.TinCurvedPlate;

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
                            ItemRegistry.Aluminum_Ingot = new Aluminum_Ingot().setRegistryName(location("aluminum_ingot")),
                            ItemRegistry.Aluminum_Dust = new Aluminum_Dust().setRegistryName(location("aluminum_dust")),
                            ItemRegistry.AluminiumBlade = new AluminiumBlade().setRegistryName(location("aluminum_blade")),
                            ItemRegistry.AluminiumBolt = new AluminiumBolt().setRegistryName(location("aluminum_bolt")),
                            ItemRegistry.AluminiumCrushedDust = new AluminiumCrushedDust().setRegistryName(location("aluminum_crushed_dust")),
                            ItemRegistry.AluminiumCurvedPlate = new AluminiumCurvedPlate().setRegistryName(location("aluminum_curved_plate")),
                            ItemRegistry.AluminiumDoubleIngot = new AluminiumDoubleIngot().setRegistryName(location("aluminum_double_ingot")),
                            ItemRegistry.AluminiumGear = new AluminiumGear().setRegistryName(location("aluminum_gear")),
                            ItemRegistry.AluminiumLargePlate = new AluminiumLargePlate().setRegistryName(location("aluminum_large_plate")),
                            ItemRegistry.AluminiumNugget = new AluminiumNugget().setRegistryName(location("aluminum_nugget")),
                            ItemRegistry.AluminiumPlate = new AluminiumPlate().setRegistryName(location("aluminum_plate")),
                            ItemRegistry.AluminiumRing = new AluminiumRing().setRegistryName(location("aluminum_ring")),
                            ItemRegistry.AluminiumRod = new AluminiumRod().setRegistryName(location("aluminum_rod")),
                            ItemRegistry.AluminiumRotor = new AluminiumRotor().setRegistryName(location("aluminum_rotor")),
                            ItemRegistry.AluminiumTinyDust = new AluminiumTinyDust().setRegistryName(location("aluminum_tiny_dust")),
                            ItemRegistry.AluminiumWire = new AluminiumWire().setRegistryName(location("aluminum_wire")),
                            //бронза
                            ItemRegistry.BronzeIngot = new BronzeIngot().setRegistryName(location("bronze_ingot")),
                            ItemRegistry.BronzeDust = new BronzeDust().setRegistryName(location("bronze_dust")),
                            ItemRegistry.BronzeBlade = new BronzeBlade().setRegistryName(location("bronze_blade")),
                            ItemRegistry.BronzeBolt = new BronzeBolt().setRegistryName(location("bronze_bolt")),
                            ItemRegistry.BronzeGear = new BronzeGear().setRegistryName(location("bronze_gear")),
                            ItemRegistry.BronzeCurvedPlate = new BronzeCurvedPlate().setRegistryName(location("bronze_curved_plate")),
                            ItemRegistry.BronzeDoubleIngot = new BronzeDoubleIngot().setRegistryName(location("bronze_double_ingot")),
                            ItemRegistry.BronzeLargePlate = new BronzeLargePlate().setRegistryName(location("bronze_large_plate")),
                            ItemRegistry.BronzeNugget = new BronzeNugget().setRegistryName(location("bronze_nugget")),
                            ItemRegistry.BronzePlate = new BronzePlate().setRegistryName(location("bronze_plate")),
                            ItemRegistry.BronzeRing = new BronzeRing().setRegistryName(location("bronze_ring")),
                            ItemRegistry.BronzeRod = new BronzeRod().setRegistryName(location("bronze_rod")),
                            ItemRegistry.BronzeRotor = new BronzeRotor().setRegistryName(location("bronze_rotor")),
                            ItemRegistry.BronzeTinyDust = new BronzeTinyDust().setRegistryName(location("bronze_tiny_dust")),
                            //хром
                            ItemRegistry.ChromeIngot = new ChromeIngot().setRegistryName(location("chrome_ingot")),
                            ItemRegistry.ChromeDust = new ChromeDust().setRegistryName(location("chrome_dust")),
                            ItemRegistry.ChromeCrushedDust = new ChromeCrushedDust().setRegistryName(location("chrome_crushed_dust")),
                            ItemRegistry.ChromeDoubleIngot = new ChromeDoubleIngot().setRegistryName(location("chrome_double_ingot")),
                            ItemRegistry.ChromeLargePlate = new ChromeLargePlate().setRegistryName(location("chrome_large_plate")),
                            ItemRegistry.ChromeNugget = new ChromeNugget().setRegistryName(location("chrome_crushed_dust")),
                            ItemRegistry.ChromePlate = new ChromePlate().setRegistryName(location("chrome_double_ingot")),
                            ItemRegistry.ChromeTinyDust = new ChromeTinyDust().setRegistryName(location("chrome_large_plate")),
                            //золото
                            ItemRegistry.GoldDust = new GoldDust().setRegistryName(location("gold_dust")),
                            ItemRegistry.GoldCrushedDust = new GoldCrushedDust().setRegistryName(location("gold_crushed_dust")),
                            ItemRegistry.GoldCurvedPlate = new GoldCurvedPlate().setRegistryName(location("gold_curved_plate")),
                            ItemRegistry.GoldDoubleIngot = new GoldDoubleIngot().setRegistryName(location("gold_double_ingot")),
                            ItemRegistry.GoldLargePlate = new GoldLargePlate().setRegistryName(location("gold_large_plate")),
                            ItemRegistry.GoldPlate = new GoldPlate().setRegistryName(location("gold_plate")),
                            ItemRegistry.GoldTinyDust = new GoldTinyDust().setRegistryName(location("gold_tiny_dust")),
                            //тин
                            ItemRegistry.TinIngot = new TinIngot().setRegistryName(location("tin_ingot")),
                            ItemRegistry.TinDust = new TinDust().setRegistryName(location("tin_dust")),
                            ItemRegistry.TinBlade = new TinBlade().setRegistryName(location("tin_blade")),
                            ItemRegistry.TinBolt = new TinBolt().setRegistryName(location("tin_bolt")),
                            ItemRegistry.TinCrushedDust = new TinCrushedDust().setRegistryName(location("tin_crushed_dust")),
                            ItemRegistry.TinCurvedPlate = new TinCurvedPlate().setRegistryName(location("tin_curved_plate")),
                            ItemRegistry.TinDoubleIngot = new TinDoubleIngot().setRegistryName(location("tin_double_ingot")),
                            ItemRegistry.TinGear = new TinGear().setRegistryName(location("tin_gear")),
                            ItemRegistry.TinLargePlate = new TinLargePlate().setRegistryName(location("tin_large_plate")),
                            ItemRegistry.TinNugget = new TinNugget().setRegistryName(location("tin_nugget")),
                            ItemRegistry.TinPlate = new TinPlate().setRegistryName(location("tin_plate")),
                            ItemRegistry.TinRing = new TinRing().setRegistryName(location("tin_ring")),
                            ItemRegistry.TinRod = new TinRod().setRegistryName(location("tin_rod")),
                            ItemRegistry.TinRotor = new TinRotor().setRegistryName(location("tin_rotor")),
                            ItemRegistry.TinTinyDust = new TinTinyDust().setRegistryName(location("tin_tiny_dust")),
                            ItemRegistry.TinWire = new TinWire().setRegistryName(location("tin_wire")),
                            //медь
                            ItemRegistry.CopperIngot = new CopperIngot().setRegistryName(location("copper_ingot")),
                            ItemRegistry.CopperDust = new CopperDust().setRegistryName(location("copper_dust")),
                            ItemRegistry.CopperBlade = new CopperBlade().setRegistryName(location("copper_blade")),
                            ItemRegistry.CopperBolt = new CopperBolt().setRegistryName(location("copper_bolt")),
                            ItemRegistry.CopperCrushedDust = new CopperCrushedDust().setRegistryName(location("copper_crushed_dust")),
                            ItemRegistry.CopperCurvedPlate = new CopperCurvedPlate().setRegistryName(location("copper_curved_plate")),
                            ItemRegistry.CopperDoubleIngot = new CopperDoubleIngot().setRegistryName(location("copper_double_ingot")),
                            ItemRegistry.CopperFineWire = new CopperFineWire().setRegistryName(location("copper_fine_wire")),
                            ItemRegistry.CopperPlate = new CopperPlate().setRegistryName(location("copper_plate")),
                            ItemRegistry.CopperRing = new CopperRing().setRegistryName(location("copper_ring")),
                            ItemRegistry.CopperRod = new CopperRod().setRegistryName(location("copper_rod")),
                            ItemRegistry.CopperRotor = new CopperRotor().setRegistryName(location("copper_rotor")),
                            ItemRegistry.CopperTinyDust = new CopperTinyDust().setRegistryName(location("copper_tiny_dust")),
                            ItemRegistry.CopperWire = new CopperWire().setRegistryName(location("copper_wire")),
                            //никель
                            ItemRegistry.NickelIngot = new NickelIngot().setRegistryName(location("nickel_ingot")),
                            ItemRegistry.NickelDust = new NickelDust().setRegistryName(location("nickel_dust")),
                            ItemRegistry.NickelCrushedDust = new NickelCrushedDust().setRegistryName(location("nickel_crushed_dust")),
                            ItemRegistry.NickelCurvedPlate = new NickelCurvedPlate().setRegistryName(location("nickel_curved_plate")),
                            ItemRegistry.NickelDoubleIngot = new NickelDoubleIngot().setRegistryName(location("nickel_double_ingot")),
                            ItemRegistry.NickelLargePlate = new NickelLargePlate().setRegistryName(location("nickel_large_plate")),
                            ItemRegistry.NickelNugget = new NickelNugget().setRegistryName(location("nickel_nugget")),
                            ItemRegistry.NickelPlate = new NickelPlate().setRegistryName(location("nickel_plate")),
                            ItemRegistry.NickelTinyDust = new NickelTinyDust().setRegistryName(location("nickel_tiny_dust")),
                            //антимоний
                            ItemRegistry.AntimonyIngot = new AntimonyIngot().setRegistryName(location("antimony_ingot")),
                            ItemRegistry.AntimonyDust = new AntimonyDust().setRegistryName(location("antimony_dust")),
                            ItemRegistry.AntimonyCrushedDust = new AntimonyCrushedDust().setRegistryName(location("antimony_ingot")),
                            ItemRegistry.AntimonyNugget = new AntimonyNugget().setRegistryName(location("antimony_dust")),
                            ItemRegistry.AntimonyTinyDust = new AntimonyTinyDust().setRegistryName(location("antimony_ingot")),
                            //свинец
                            ItemRegistry.LeadIngot = new LeadIngot().setRegistryName(location("lead_ingot")),
                            ItemRegistry.LeadDust = new LeadDust().setRegistryName(location("lead_dust")),
                            ItemRegistry.LeadCrushedDust = new LeadCrushedDust().setRegistryName(location("lead_crushed_dust")),
                            ItemRegistry.LeadCurvedPlate = new LeadCurvedPlate().setRegistryName(location("lead_curved_plate")),
                            ItemRegistry.LeadDoubleIngot = new LeadDoubleIngot().setRegistryName(location("lead_double_ingot")),
                            ItemRegistry.LeadLargePlate = new LeadLargePlate().setRegistryName(location("lead_large_plate")),
                            ItemRegistry.LeadNugget = new LeadNugget().setRegistryName(location("lead_nugget")),
                            ItemRegistry.LeadPlate = new LeadPlate().setRegistryName(location("lead_plate")),
                            ItemRegistry.LeadTinyDust = new LeadTinyDust().setRegistryName(location("lead_tiny_dust")),
                            //серебро
                            ItemRegistry.SilverIngot = new SilverIngot().setRegistryName(location("silver_ingot")),
                            ItemRegistry.SilverDust = new SilverDust().setRegistryName(location("silver_dust")),
                            ItemRegistry.SilverCrushedDust = new SilverCrushedDust().setRegistryName(location("silver_crushed_dust")),
                            ItemRegistry.SilverCurvedPlate = new SilverCurvedPlate().setRegistryName(location("silver_curved_plate")),
                            ItemRegistry.SilverDoubleIngot = new SilverDoubleIngot().setRegistryName(location("silver_double_ingot")),
                            ItemRegistry.SilverLargePlate = new SilverLargePlate().setRegistryName(location("silver_dust")),
                            ItemRegistry.SilverNugget = new SilverNugget().setRegistryName(location("silver_ingot")),
                            ItemRegistry.SilverPlate = new SilverPlate().setRegistryName(location("silver_dust")),
                            ItemRegistry.SilverTinyDust = new SilverTinyDust().setRegistryName(location("silver_tiny_dust")),
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
                            ItemRegistry.ManganeseIngot = new ManganeseIngot().setRegistryName(location("manganese_ingot")),
                            ItemRegistry.ManganeseDust = new ManganeseDust().setRegistryName(location("manganese_dust")),
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
                            ItemRegistry.Stainless_steelIngot = new Stainless_steelIngot().setRegistryName(location("stainless_steel_ingot")),
                            ItemRegistry.Stainless_steelDust = new Stainless_steelDust().setRegistryName(location("stainless_steel_dust")),
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

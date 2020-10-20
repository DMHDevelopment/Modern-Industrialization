package dev.dmhdevelopment.modernindustrialization;

import dev.dmhdevelopment.modernindustrialization.init.ItemRegistry;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Aluminium.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyNugget;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Antimony.AntimonyTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Battery_alloy.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Bauxite.BauxiteCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Bauxite.BauxiteTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Bronze.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Chrome.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Coal.CoalCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Coal.CoalTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Copper.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Cupronickel.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Electrum.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Gold.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Invar.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Iron.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Lead.*;
import dev.dmhdevelopment.modernindustrialization.items.ingot.Lignite_coal;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Lignite_coal.Lignite_coalCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.dust.Lignite_coalDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Lignite_coal.Lignite_coalTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Manganese.ManganeseCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Manganese.ManganeseNugget;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Manganese.ManganeseTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Nickel.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Quartz.QuartzCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Quartz.QuartzTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Redstone.RedstoneCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Redstone.RedstoneTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Salt.SaltCrushedDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Salt.SaltTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silicon.SiliconDoubleIngot;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silicon.SiliconNugget;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silicon.SiliconPlate;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silicon.SiliconTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Silver.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Sodium.SodiumNugget;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Sodium.SodiumTinyDust;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Stainless_steel.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Steel.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Tin.*;
import dev.dmhdevelopment.modernindustrialization.items.craft_block.Titanium.*;
import dev.dmhdevelopment.modernindustrialization.items.dust.*;
import dev.dmhdevelopment.modernindustrialization.items.dust.ElectrumIngot;
import dev.dmhdevelopment.modernindustrialization.items.ingot.InvarIngot;
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
                            ItemRegistry.CopperGear = new CopperGear().setRegistryName(location("copper_gear")),
                            ItemRegistry.CopperLargePlate = new CopperLargePlate().setRegistryName(location("copper_large_plate")),
                            ItemRegistry.CopperNugget = new CopperNugget().setRegistryName(location("copper_nugget")),
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
                            ItemRegistry.BauxiteCrushedDust = new BauxiteCrushedDust().setRegistryName(location("bauxite_crushed_dust")),
                            ItemRegistry.BauxiteTinyDust = new BauxiteTinyDust().setRegistryName(location("bauxite_tiny_dust")),
                            //уголь
                            ItemRegistry.CoalDust = new CoalDust().setRegistryName(location("coal_dust")),
                            ItemRegistry.CoalCrushedDust = new CoalCrushedDust().setRegistryName(location("coal_crushed_dust")),
                            ItemRegistry.CoalTinyDust = new CoalTinyDust().setRegistryName(location("coal_tiny_dust")),
                            //купроникель
                            ItemRegistry.CupronickelIngot = new CupronickelIngot().setRegistryName(location("cupronickel_ingot")),
                            ItemRegistry.CupronickelDust = new CupronickelDust().setRegistryName(location("cupronickel_dust")),
                            ItemRegistry.CupronickelDoubleIngot = new CupronickelDoubleIngot().setRegistryName(location("cupronickel_double_ingot")),
                            ItemRegistry.CupronickelNugget = new CupronickelNugget().setRegistryName(location("cupronickel_nugget")),
                            ItemRegistry.CupronickelPlate = new CupronickelPlate().setRegistryName(location("cupronickel_plate")),
                            ItemRegistry.CupronickelTinyDust = new CupronickelTinyDust().setRegistryName(location("cupronickel_tiny_dust")),
                            ItemRegistry.CupronickelWire = new CupronickelWire().setRegistryName(location("cupronickel_wire")),
                            //электрум
                            ItemRegistry.ElectrumIngot = new ElectrumIngot().setRegistryName(location("electrum_ingot")),
                            ItemRegistry.ElectrumDust = new ElectrumDust().setRegistryName(location("electrum_dust")),
                            ItemRegistry.ElectrumCurvedPlate = new ElectrumCurvedPlate().setRegistryName(location("electrum_curved_plate")),
                            ItemRegistry.ElectrumDoubleIngot = new ElectrumDoubleIngot().setRegistryName(location("electrum_double_ingot")),
                            ItemRegistry.ElectrumFineWire = new ElectrumFineWire().setRegistryName(location("electrum_fine_wire")),
                            ItemRegistry.ElectrumLargePlate = new ElectrumLargePlate().setRegistryName(location("electrum_large_plate")),
                            ItemRegistry.ElectrumNugget = new ElectrumNugget().setRegistryName(location("electrum_nugget")),
                            ItemRegistry.ElectrumPlate = new ElectrumPlate().setRegistryName(location("electrum_plate")),
                            ItemRegistry.ElectrumTinyDust = new ElectrumTinyDust().setRegistryName(location("electrum_tiny_dust")),
                            ItemRegistry.ElectrumWire = new ElectrumWire().setRegistryName(location("electrum_wire")),
                            //инвар
                            ItemRegistry.InvarIngot = new InvarIngot().setRegistryName(location("invar_ingot")),
                            ItemRegistry.InvarDust = new InvarDust().setRegistryName(location("invar_dust")),
                            ItemRegistry.InvarDoubleIngot = new InvarDoubleIngot().setRegistryName(location("invar_double_ingot")),
                            ItemRegistry.InvarGear = new InvarGear().setRegistryName(location("invar_gear")),
                            ItemRegistry.InvarLargePlate = new InvarLargePlate().setRegistryName(location("invar_large_plate")),
                            ItemRegistry.InvarNugget = new InvarNugget().setRegistryName(location("invar_nugget")),
                            ItemRegistry.InvarPlate = new InvarPlate().setRegistryName(location("invar_plate")),
                            ItemRegistry.InvarTinyDust = new InvarTinyDust().setRegistryName(location("invar_tiny_dust")),
                            //железо
                            ItemRegistry.IronDust = new IronDust().setRegistryName(location("iron_dust")),
                            ItemRegistry.IronCrushedDust = new IronCrushedDust().setRegistryName(location("iron_crushed_dust")),
                            ItemRegistry.IronCurvedPlate = new IronCurvedPlate().setRegistryName(location("iron_curved_plate")),
                            ItemRegistry.IronDoubleIngot = new IronDoubleIngot().setRegistryName(location("iron_double_ingot")),
                            ItemRegistry.IronLargePlate = new IronLargePlate().setRegistryName(location("iron_large_plate")),
                            ItemRegistry.IronPlate = new IronPlate().setRegistryName(location("iron_plate")),
                            ItemRegistry.IronTinyDust = new IronTinyDust().setRegistryName(location("iron_tiny_dust")),
                            //марганец
                            ItemRegistry.ManganeseIngot = new ManganeseIngot().setRegistryName(location("manganese_ingot")),
                            ItemRegistry.ManganeseDust = new ManganeseDust().setRegistryName(location("manganese_dust")),
                            ItemRegistry.ManganeseCrushedDust = new ManganeseCrushedDust().setRegistryName(location("manganese_crushed_dust")),
                            ItemRegistry.ManganeseNugget = new ManganeseNugget().setRegistryName(location("manganese_nugget")),
                            ItemRegistry.ManganeseTinyDust = new ManganeseTinyDust().setRegistryName(location("manganese_tiny_dust")),
                            //кварц
                            ItemRegistry.QuartzDust = new QuartzDust().setRegistryName(location("quartz_dust")),
                            ItemRegistry.QuartzCrushedDust = new QuartzCrushedDust().setRegistryName(location("quartz_crushed_dust")),
                            ItemRegistry.QuartzTinyDust = new QuartzTinyDust().setRegistryName(location("quartz_tiny_dust")),
                            //salt(я незнаю как по русски)
                            ItemRegistry.SaltDust = new SaltDust().setRegistryName(location("salt_dust")),
                            ItemRegistry.SaltCrushedDust = new SaltCrushedDust().setRegistryName(location("salt_crushed_dust")),
                            ItemRegistry.SaltTinyDust = new SaltTinyDust().setRegistryName(location("salt_tiny_dust")),
                            //силикон
                            ItemRegistry.SiliconIngot = new SiliconIngot().setRegistryName(location("silicon_ingot")),
                            ItemRegistry.SiliconDust = new SiliconDust().setRegistryName(location("silicon_dust")),
                            ItemRegistry.SiliconDoubleIngot = new SiliconDoubleIngot().setRegistryName(location("silicon_double_ingot")),
                            ItemRegistry.SiliconNugget = new SiliconNugget().setRegistryName(location("silicon_nugget")),
                            ItemRegistry.SiliconPlate = new SiliconPlate().setRegistryName(location("silicon_plate")),
                            ItemRegistry.SiliconTinyDust = new SiliconTinyDust().setRegistryName(location("silicon_tiny_dust")),
                            //содиум
                            ItemRegistry.SodiumIngot = new SodiumIngot().setRegistryName(location("sodium_ingot")),
                            ItemRegistry.SodiumDust = new SodiumDust().setRegistryName(location("sodium_dust")),
                            ItemRegistry.SodiumNugget = new SodiumNugget().setRegistryName(location("sodium_nugget")),
                            ItemRegistry.SodiumTinyDust = new SodiumTinyDust().setRegistryName(location("sodium_tiny_dust")),
                            //суперсталь
                            ItemRegistry.Stainless_steelIngot = new Stainless_steelIngot().setRegistryName(location("stainless_steel_ingot")),
                            ItemRegistry.Stainless_steelDust = new Stainless_steelDust().setRegistryName(location("stainless_steel_dust")),
                            ItemRegistry.Stainless_steelBlade = new Stainless_steelBlade().setRegistryName(location("stainless_steel_blade")),
                            ItemRegistry.Stainless_steelBolt = new Stainless_steelBolt().setRegistryName(location("stainless_steel_bolt")),
                            ItemRegistry.Stainless_steelCurvedPlate = new Stainless_steelCurvedPlate().setRegistryName(location("stainless_steel_curved_plate")),
                            ItemRegistry.Stainless_steelDoubleIngot = new Stainless_steelDoubleIngot().setRegistryName(location("stainless_steel_double_ingot")),
                            ItemRegistry.Stainless_steelGear = new Stainless_steelGear().setRegistryName(location("stainless_steel_gear")),
                            ItemRegistry.Stainless_steelLargePlate = new Stainless_steelLargePlate().setRegistryName(location("stainless_steel_large_plate")),
                            ItemRegistry.Stainless_steelNugget = new Stainless_steelIngot().setRegistryName(location("stainless_steel_nugget")),
                            ItemRegistry.Stainless_steelPlate = new Stainless_steelDust().setRegistryName(location("stainless_steel_plate")),
                            ItemRegistry.Stainless_steelRing = new Stainless_steelIngot().setRegistryName(location("stainless_steel_ring")),
                            ItemRegistry.Stainless_steelRod = new Stainless_steelRod().setRegistryName(location("stainless_steel_rod")),
                            ItemRegistry.Stainless_steelRotor = new Stainless_steelRotor().setRegistryName(location("stainless_steel_rotor")),
                            ItemRegistry.Stainless_steelTinyDust = new Stainless_steelTinyDust().setRegistryName(location("stainless_steel_tiny_dust")),
                            //сталь
                            ItemRegistry.SteelIngot = new SteelIngot().setRegistryName(location("steel_ingot")),
                            ItemRegistry.SteelDust = new SteelDust().setRegistryName(location("steel_dust")),
                            ItemRegistry.SteelBlade = new SteelIngot().setRegistryName(location("steel_blade")),
                            ItemRegistry.SteelBolt = new SteelDust().setRegistryName(location("steel_bolt")),
                            ItemRegistry.SteelCurvedPlate = new SteelIngot().setRegistryName(location("steel_curved_plate")),
                            ItemRegistry.SteelDoubleIngot = new SteelDoubleIngot().setRegistryName(location("steel_double_ingot")),
                            ItemRegistry.SteelGear = new SteelGear().setRegistryName(location("steel_gear")),
                            ItemRegistry.SteelLargePlate = new SteelLargePlate().setRegistryName(location("steel_large_plate")),
                            ItemRegistry.SteelNugget = new SteelNugget().setRegistryName(location("steel_nugget")),
                            ItemRegistry.SteelPlate = new SteelPlate().setRegistryName(location("steel_plate")),
                            ItemRegistry.SteelRing = new SteelRing().setRegistryName(location("steel_ring")),
                            ItemRegistry.SteelRod= new SteelRod().setRegistryName(location("steel_rod")),
                            ItemRegistry.SteelRotor = new SteelRotor().setRegistryName(location("steel_rotor")),
                            ItemRegistry.SteelTinyDust = new SteelTinyDust().setRegistryName(location("steel_tiny_dust")),
                            //титан
                            ItemRegistry.TitaniumIngot = new TitaniumIngot().setRegistryName(location("titanium_ingot")),
                            ItemRegistry.TitaniumDust = new TitaniumDust().setRegistryName(location("titanium_dust")),
                            ItemRegistry.TitaniumBlade = new TitaniumBlade().setRegistryName(location("titanium_blade")),
                            ItemRegistry.TitaniumBolt = new TitaniumBolt().setRegistryName(location("titanium_bolt")),
                            ItemRegistry.TitaniumCurvedPlate = new TitaniumCurvedPlate().setRegistryName(location("titanium_curved_plate")),
                            ItemRegistry.TitaniumDoubleIngot = new TitaniumDoubleIngot().setRegistryName(location("titanium_double_ingot")),
                            ItemRegistry.TitaniumGear = new TitaniumGear().setRegistryName(location("titanium_gear")),
                            ItemRegistry.TitaniumLargePlate = new TitaniumLargePlate().setRegistryName(location("titanium_large_plate")),
                            ItemRegistry.TitaniumNugget = new TitaniumNugget().setRegistryName(location("titanium_nugget")),
                            ItemRegistry.TitaniumPlate = new TitaniumPlate().setRegistryName(location("titanium_plate")),
                            ItemRegistry.TitaniumRing = new TitaniumRing().setRegistryName(location("titanium_ring")),
                            ItemRegistry.TitaniumRod = new TitaniumRod().setRegistryName(location("titanium_rod")),
                            ItemRegistry.TitaniumRotor = new TitaniumRotor().setRegistryName(location("titanium_rotor")),
                            ItemRegistry.TitaniumTinyDust = new TitaniumTinyDust().setRegistryName(location("titanium_tiny_dust")),
                            //Аккумуляторный сплав
                            ItemRegistry.Battery_alloyIngot = new Battery_alloyIngot().setRegistryName(location("battery_alloy_ingot")),
                            ItemRegistry.Battery_alloyDust = new Battery_alloyDust().setRegistryName(location("battery_alloy_dust")),
                            ItemRegistry.Battery_alloyCurvedPlate = new Battery_alloyCurvedPlate().setRegistryName(location("battery_alloy_curved_plate")),
                            ItemRegistry.Battery_alloyDoubleIngot = new Battery_alloyDoubleIngot().setRegistryName(location("battery_alloy_double_ingot")),
                            ItemRegistry.Battery_alloyNugget = new Battery_alloyNugget().setRegistryName(location("battery_alloy_nugget")),
                            ItemRegistry.Battery_alloyPlate = new Battery_alloyPlate().setRegistryName(location("battery_alloy_plate")),
                            ItemRegistry.Battery_alloyTinyDust = new Battery_alloyTinyDust().setRegistryName(location("battery_alloy_tiny_dust")),
                            //бурый уголь
                            ItemRegistry.Lignite_coalCrushedDust = new Lignite_coalCrushedDust().setRegistryName(location("lignite_coal_tiny_dust")),
                            ItemRegistry.Lignite_coalDust = new Lignite_coalDust().setRegistryName(location("lignite_coal_dust")),
                            ItemRegistry.Lignite_coalTinyDust = new Lignite_coalTinyDust().setRegistryName(location("lignite_coal_tiny_dust")),
                            ItemRegistry.Lignite_coal = new Lignite_coal().setRegistryName(location("lignite_coal")),
                            //красный камень
                            ItemRegistry.RedstoneCrushedDust = new RedstoneCrushedDust().setRegistryName(location("redstone_tiny_dust")),
                            ItemRegistry.RedstoneTinyDust = new RedstoneTinyDust().setRegistryName(location("redstone_tiny_dust"))
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
package dev.dmhdevelopment.modernindustrialization.init;

import dev.dmhdevelopment.modernindustrialization.items.casings.*;
import dev.dmhdevelopment.modernindustrialization.items.ore.*;
import dev.dmhdevelopment.modernindustrialization.utils.ModernIndustrializationCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        //руды
        event.getRegistry().register(new AluminumOre());
        event.getRegistry().register(new TinOre());
        event.getRegistry().register(new CopperOre());
        event.getRegistry().register(new NickelOre());
        event.getRegistry().register(new AntimonyOre());
        event.getRegistry().register(new SaltOre());
        event.getRegistry().register(new BauxiteOre());
        event.getRegistry().register(new LeadOre());
        event.getRegistry().register(new SilverOre());
        event.getRegistry().register(new Lignite_CoalOre());
        event.getRegistry().register(new EvCasing());
        //корпуса
        event.getRegistry().register(new BrickedBronzeCasing());
        event.getRegistry().register(new BrickedSteelCasing());
        event.getRegistry().register(new BricksCasing());
        event.getRegistry().register(new BronzeCasing());
        event.getRegistry().register(new BronzePlatedBricksCasing());
        event.getRegistry().register(new FirebricksCasing());
        event.getRegistry().register(new FrostproofCasing());
        event.getRegistry().register(new HeatproofCasing());
        event.getRegistry().register(new HvCasing());
        event.getRegistry().register(new LvCasing());
        event.getRegistry().register(new MvCasing());
        event.getRegistry().register(new SteelCasing());
        event.getRegistry().register(new SteelCrateCasing());
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties()
                .group(ModernIndustrializationCreativeTab.ModernIndustrializationCreativeTab);
        //руды
        event.getRegistry().register(new BlockItem(ModBlocks.ALUMINUMORE, properties).setRegistryName("aluminum_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.TINORE, properties).setRegistryName("tin_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.COPPERORE, properties).setRegistryName("copper_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.NICKELORE, properties).setRegistryName("nickel_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.ANTIMONYORE, properties).setRegistryName("antimony_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.SALTORE, properties).setRegistryName("salt_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.BAUXITEORE, properties).setRegistryName("bauxite_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.LEADORE, properties).setRegistryName("lead_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.SILVERORE, properties).setRegistryName("silver_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.LIGNITECOALORE, properties).setRegistryName("lignite_coal_ore"));
        //корпуса
        event.getRegistry().register(new BlockItem(ModBlocks.BRICKEDBRONZECASING, properties).setRegistryName("bricked_bronze_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.BRICKEDSTEELCASING, properties).setRegistryName("bricked_steel_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.BRICKSCASING, properties).setRegistryName("bricks_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.BRONZECASING, properties).setRegistryName("bronze_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.BRONZEPLATEDBRICKSCASING, properties).setRegistryName("bronze_plated_bricks_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.EVCASING, properties).setRegistryName("ev_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.FIREBRICKSCASING, properties).setRegistryName("firebricks_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.FROSTPROOFCASING, properties).setRegistryName("frostproof_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.HEATPROOFCASING, properties).setRegistryName("heatproof_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.HVCASING, properties).setRegistryName("hv_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.LVCASING, properties).setRegistryName("lv_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.MVCASING, properties).setRegistryName("mv_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.STEELCASING, properties).setRegistryName("steel_casing"));
        event.getRegistry().register(new BlockItem(ModBlocks.STEELCRATECASING, properties).setRegistryName("steel_crate_casing"));
    }
}
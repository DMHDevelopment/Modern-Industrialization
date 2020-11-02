package dev.dmhdevelopment.modernindustrialization.init;

import dev.dmhdevelopment.modernindustrialization.items.ore.*;
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
        event.getRegistry().register(new TinOre());
        event.getRegistry().register(new CopperOre());
        event.getRegistry().register(new NickelOre());
        event.getRegistry().register(new AntimonyOre());
        event.getRegistry().register(new SaltOre());
        event.getRegistry().register(new BauxiteOre());
        event.getRegistry().register(new LeadOre());
        event.getRegistry().register(new SilverOre());
        event.getRegistry().register(new Lignite_CoalOre());
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties()
                .group(ModernIndustrializationCreativeTab.ModernIndustrializationCreativeTab);
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
    }
}
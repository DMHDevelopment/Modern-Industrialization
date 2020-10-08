package dev.dmhdevelopment.modernindustrialization.utils;

import dev.dmhdevelopment.modernindustrialization.init.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModernIndustrializationCreativeTab {
    public static final ItemGroup ModernIndustrializationCreativeTab = new ItemGroup("mod_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.Aluminum_Ingot.getItem());
        }
    };

}
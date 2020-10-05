package com.dmitrium.modernindustrialization.utils;

import com.dmitrium.modernindustrialization.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class groups {
    public static ItemGroup createGroup(String id, RegistryObject<Item> icon) {
        return new ItemGroup(id) {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(icon.get());
            }
        };
    }

    public static ItemGroup MOD_TAB = createGroup("mod_tab", ModItems.aluminium_ingot);

}
package com.dmitrium.modernindustrialization.init;

import com.dmitrium.modernindustrialization.modernindustrialization;
import com.dmitrium.modernindustrialization.items.MaterialItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, modernindustrialization.MOD_ID);

//бронза
    public static final RegistryObject<Item> bronz_ingot = ITEMS.register("bronz_ingot", MaterialItem::new );

//алюминий
    public static final RegistryObject<Item> aluminium_ingot = ITEMS.register("aluminium_ingot", MaterialItem::new );

//хром
    public static final RegistryObject<Item> chrome_ingot = ITEMS.register("aluminium_ingot", MaterialItem::new );

//золото
    public static final RegistryObject<Item> gold_dust = ITEMS.register("aluminium_ingot", MaterialItem::new );
}



package dev.dmhdevelopment.modernindustrialization.items.casings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FrostproofCasing extends Block {

    public FrostproofCasing() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("frostproof_casing");
    }
}
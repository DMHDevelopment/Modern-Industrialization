package dev.dmhdevelopment.modernindustrialization.items.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SaltOre extends Block {

    public SaltOre() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("tin_ore");
    }
}
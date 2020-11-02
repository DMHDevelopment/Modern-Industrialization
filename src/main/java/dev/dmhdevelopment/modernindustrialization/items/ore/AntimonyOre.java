package dev.dmhdevelopment.modernindustrialization.items.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AntimonyOre extends Block {

    public AntimonyOre() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("tin_ore");
    }
}
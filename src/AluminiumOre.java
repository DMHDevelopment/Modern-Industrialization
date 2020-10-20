package net.minecraft.src;
import java.util.Random;
public class BlockNew extends Block
{
    public BlockNew(int i, int j)
    {
        super(i, j, Material.rock);
    }
    public int idDropped(int i, int j)
    {
        return mod_gcc.newblock.blockID;
    }
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
}
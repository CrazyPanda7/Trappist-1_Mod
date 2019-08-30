package crazypanda.trappist1.planets.trappist1b.world.gen;

import java.util.Random;

import crazypanda.trappist1.init.ModBlocks;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeAdaptive;
import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeTrappist1b extends BiomeGenBaseGC{
	
	public static final BlockMetaPair BLOCK_TOP = new BlockMetaPair(ModBlocks.B_SURFACEROCK, (byte) 5);
    public static final BlockMetaPair BLOCK_FILL = new BlockMetaPair(ModBlocks.B_SUBROCK, (byte) 6);
    public static final BlockMetaPair BLOCK_LOWER = new BlockMetaPair(ModBlocks.B_ROCK, (byte) 9);

	public BiomeTrappist1b(BiomeProperties var1) {
		super(var1);
	}
	
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
    {
        this.fillerBlock = BLOCK_LOWER.getBlockState();
        this.topBlock = BLOCK_TOP.getBlockState();
        super.genTerrainBlocks(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

}

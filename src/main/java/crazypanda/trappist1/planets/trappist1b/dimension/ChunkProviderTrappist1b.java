package crazypanda.trappist1.planets.trappist1b.dimension;

import java.util.List;

import asmodeuscore.core.astronomy.dimension.world.gen.ChunkProviderSpaceLakes;
import crazypanda.trappist1.init.ModBlocks;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;

public class ChunkProviderTrappist1b extends ChunkProviderSpaceLakes{

	public ChunkProviderTrappist1b(World world, long seed, boolean flag) {
		super(world, seed, flag);
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Biome[] getBiomesForGeneration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onChunkProvider(int cX, int cZ, ChunkPrimer primer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPopulate(int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getHeightModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMountainHeightModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValleyHeightModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWaterLevel() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public boolean canGenerateWaterBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canGenerateIceBlock() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getCraterProbability() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	protected BlockMetaPair getWaterBlock() {
		return new BlockMetaPair(Blocks.ICE, (byte) 2);
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(ModBlocks.B_SURFACEROCK, (byte) 2);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(ModBlocks.B_SUBROCK, (byte) 2);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(ModBlocks.B_ROCK, (byte) 2);
	}

	@Override
	protected boolean enableBiomeGenBaseBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected GenType getGenType() {
		// TODO Auto-generated method stub
		return null;
	}
}

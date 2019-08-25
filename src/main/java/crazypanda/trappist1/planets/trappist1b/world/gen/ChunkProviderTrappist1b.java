package crazypanda.trappist1.planets.trappist1b.world.gen;

import java.util.List;

import crazypanda.trappist1.init.ModBlocks;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeAdaptive;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;

public class ChunkProviderTrappist1b extends ChunkProviderSpace{

	public ChunkProviderTrappist1b(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
		// TODO Auto-generated constructor stub
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
		return new Biome[] { BiomeAdaptive.biomeDefault };
	}

	@Override
	protected int getSeaLevel() {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		// TODO Auto-generated method stub
		return BiomeTrappist1b.BLOCK_TOP;
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		// TODO Auto-generated method stub
		return BiomeTrappist1b.BLOCK_FILL;
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		// TODO Auto-generated method stub
		return BiomeTrappist1b.BLOCK_LOWER;
	}

	@Override
	public double getHeightModifier() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMountainHeightModifier() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double getValleyHeightModifier() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getCraterProbability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, ChunkPrimer primer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPopulate(int cX, int cZ) {
		// TODO Auto-generated method stub
		
	}

}

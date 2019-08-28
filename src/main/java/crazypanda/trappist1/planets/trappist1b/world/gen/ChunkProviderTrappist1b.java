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
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		
		
	}

	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		
		return null;
	}

	@Override
	protected Biome[] getBiomesForGeneration() {
		
		return new Biome[] { BiomeAdaptive.biomeDefault };
	}

	@Override
	protected int getSeaLevel() {
		
		return 90;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		
		return null;
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		
		return BiomeTrappist1b.BLOCK_TOP;
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		
		return BiomeTrappist1b.BLOCK_FILL;
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		
		return BiomeTrappist1b.BLOCK_LOWER;
	}

	@Override
	public double getHeightModifier() {
		
		return 5;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		
		return 0;
	}

	@Override
	public double getMountainHeightModifier() {
		
		return 3;
	}

	@Override
	public double getValleyHeightModifier() {
		
		return 1;
	}

	@Override
	public int getCraterProbability() {
		
		return 0;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, ChunkPrimer primer) {
		
		
	}

	@Override
	public void onPopulate(int cX, int cZ) {
		
		
	}

}

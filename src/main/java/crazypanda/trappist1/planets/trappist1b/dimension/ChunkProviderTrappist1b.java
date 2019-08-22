/*package crazypanda.trappist1.planets.trappist1b.dimension;

import java.util.List;

import com.google.common.collect.Lists;

import asmodeuscore.core.astronomy.dimension.world.gen.ChunkProviderSpaceLakes;
import crazypanda.trappist1.init.ModBlocks;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeAdaptive;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;

public class ChunkProviderTrappist1b extends ChunkProviderSpaceLakes{
	@Override
	protected List<MapGenBaseMeta> getWorldGenerators()
	{
		List<MapGenBaseMeta> generators = Lists.newArrayList();
		return generators;
	}
	
	public ChunkProviderTrappist1b(World par1World, long seed, boolean mapFeaturesEnabled)	
	{
		super(par1World, seed, mapFeaturesEnabled);
	}
	
	@Override	
	protected BiomeDecoratorSpace getBiomeGenerator() {	
	    return null;	
	}
	
	@Override	
	protected Biome[] getBiomesForGeneration() {	
	    return new Biome[]{BiomeAdaptive.biomeDefault};	
	}
	
	@Override
	public int getCraterProbability() {	
	    return 150;	
	}
	
	@Override
	public double getHeightModifier() {	
	    return 20;	
	}
	
	@Override
	public void onChunkProvider(int cX, int cZ, ChunkPrimer primer) {
	}
	
	@Override
	public void onPopulate(int cX, int cZ) {
	}
	
	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
	}
	
	@Override
	public double getMountainHeightModifier() {
	    return 0;
	}
	
	@Override
	public int getWaterLevel() {
	    return 80;
	}
	
	@Override	
	public double getSmallFeatureHeightModifier() {	
	    return 1;	
	}
	
	@Override	
	public double getValleyHeightModifier() {	
	    return 0;	
	}
	
	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(ModBlocks.B_SURFACEROCK, (byte) 0);
	}
	
	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(ModBlocks.B_SUBROCK, (byte) 0);
	}
	
	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(ModBlocks.B_ROCK, (byte) 0);
	}
	
	@Override
	protected boolean enableBiomeGenBaseBlock() {
		return false;
	}
	
	@Override
	public boolean canGenerateWaterBlock() {
		return false;
	}
	
	@Override
	public boolean canGenerateIceBlock() {
		return true;
	}
	
	@Override
	protected BlockMetaPair getWaterBlock() {
		return null;
	}
	
	@Override
	protected GenType getGenType() {
		return GenType.VANILLA;
	}
	
}*/

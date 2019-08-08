package crazypanda.trappist1.planets.trappist1b.world.gen.we;

import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_Biome;
import asmodeuscore.core.astronomy.dimension.world.worldengine.standardcustomgen.WE_BiomeLayer;
import crazypanda.trappist1.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class Trappist1bMountains extends WE_Biome{
	public Trappist1bMountains() {
		super(new BiomeProperties("Trappist1bMountains"), new int[] {0x00FF00, 0xEEDD44, 0x00FF00});
		biomeMinValueOnMap      =   0.8D;
		biomeMaxValueOnMap      =   1.4D;
		biomePersistence        =   1.5D;
		biomeNumberOfOctaves    =      5;
		biomeScaleX             = 280.0D;
		biomeScaleY             =   1.7D;
		biomeSurfaceHeight      =     100;
		biomeInterpolateQuality =     15;
		
		decorateChunkGen_List.clear();		
		createChunkGen_InXZ_List.clear();
		
		WE_BiomeLayer standardBiomeLayers = new WE_BiomeLayer();
		standardBiomeLayers.add(ModBlocks.B_SURFACEROCK, (byte)1, ModBlocks.B_SURFACEROCK, (byte)2, -256, 0,   -4, -1,  true);
		standardBiomeLayers.add(ModBlocks.B_ROCK, (byte)0, ModBlocks.B_ROCK, (byte)1, -256, 0, -256,  0, false);
		standardBiomeLayers.add(Blocks.BEDROCK, (byte)0,                                0, 2,  0,  0, true);
		createChunkGen_InXZ_List.add(standardBiomeLayers);
	}
}

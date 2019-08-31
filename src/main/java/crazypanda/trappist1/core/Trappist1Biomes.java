package crazypanda.trappist1.core;

import java.util.LinkedList;
import java.util.List;


import crazypanda.trappist1.planets.trappist1b.world.gen.BiomeTrappist1b;
import crazypanda.trappist1.util.handlers.RegistryHandler;
import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;

public class Trappist1Biomes {
	public static final List<BiomeGenBaseGC> biomeList = new LinkedList<>();
	private static int totalBiomes = 0;
	
	public static final Biome TRAPPIST1B = new BiomeTrappist1b(new BiomeProperties("Trappist1b"));
	
	public static void init() {
		Trappist1Biomes.addBiome(Trappist1Biomes.TRAPPIST1B);
		
	}
	
	public static void addBiome(Biome biome, BiomeDictionary.Type... biomeType) {
		RegistryHandler.registerBiome(biome);
		RegistryHandler.registerBiomeType(biome, biomeType);
	}
}

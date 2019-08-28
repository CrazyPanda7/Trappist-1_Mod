package crazypanda.trappist1.core;

import java.util.LinkedList;
import java.util.List;


import crazypanda.trappist1.planets.trappist1b.world.gen.BiomeTrappist1b;
import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class Trappist1Biomes {
	public static final List<BiomeGenBaseGC> biomeList = new LinkedList<>();
	private static int totalBiomes = 0;
	
	public static final Biome TRAPPIST1B = new BiomeTrappist1b(new BiomeProperties("Trappist1b"));
}

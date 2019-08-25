package crazypanda.trappist1.planets.trappist1b.world.gen;

import java.util.ArrayList;
import java.util.List;

import crazypanda.trappist1.planets.Trappist1_Planets;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;

public class BiomeProviderTrappist1b extends BiomeProvider{
	
	private CelestialBody body;
	private BiomeCache biomeCache;
	private List<Biome> biomesToSpawnIn;
	
	protected BiomeProviderTrappist1b() {
		body = Trappist1_Planets.Trappist1b;
		biomeCache = new BiomeCache(this);
		biomesToSpawnIn = new ArrayList<>();
	}
}

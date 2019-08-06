package crazypanda.trappist1;

import crazypanda.trappist1.planets.trappist1b.WorldProviderTrappist1b;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProvider;

public class Trappist1_Planets {
	public static Planet TRAPPIST1B;
	
	public static void init() {
		initializePlanets();
		registerPlanets();
	}
	
	private static void initializePlanets()
	{
		TRAPPIST1B.setDimensionInfo(71, WorldProviderTrappist1b.class);
		TRAPPIST1B = new Planet("trappist1b").setParentSolarSystem(GalacticraftCore.solarSystemSol);
		TRAPPIST1B.setBodyIcon(new ResourceLocation("textures/CelestialBodies/trappist1bicon.png"));
	}
	
	private static void registerPlanets() 
	{
		
	}
}

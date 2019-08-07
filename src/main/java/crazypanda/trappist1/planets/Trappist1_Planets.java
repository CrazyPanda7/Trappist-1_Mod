package crazypanda.trappist1.planets;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import net.minecraft.util.ResourceLocation;

public class Trappist1_Planets {
	public static SolarSystem Trappist1System;
	public static Star Trappist1;
	public static Planet Trappist1b;
	
	public static void init()
	{
		Trappist1System = new SolarSystem("TrappistOneSystem", "milkyWay").setMapPosition(new Vector3(0.0F, 1.0F, 0.0F));
		Trappist1 = (Star) new Star("Trappist1").setParentSolarSystem(Trappist1System).setTierRequired(-1);
		Trappist1.setBodyIcon(new ResourceLocation("textures/celestialbodies/trappist1.png"));
		Trappist1System.setMainStar(Trappist1);
		
		Trappist1b = (Planet) new Planet("TrappistOneB").setParentSolarSystem(Trappist1System);
		Trappist1b.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1b.setPhaseShift((float) Math.PI);
		Trappist1b.setTierRequired(1);
		Trappist1b.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
		Trappist1b.setRelativeOrbitTime(0.24096385542168674698795180722892F);
		Trappist1b.setBodyIcon(new ResourceLocation("textures/celestialbodies/trappist1bicon.png"));
		//Trappist1b.setDimensionInfo(-35, WorldProviderTrappistOneB.class);
		
		registryCelestial();
		registryTeleport();
	}

	private static void registryTeleport() 
	{
		
	}

	private static void registryCelestial() 
	{
		GalaxyRegistry.registerSolarSystem(Trappist1System);
		GalaxyRegistry.registerPlanet(Trappist1b);
	}
}

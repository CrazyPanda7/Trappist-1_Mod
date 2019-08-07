package crazypanda.trappist1.planets;

import asmodeuscore.core.astronomy.BodiesHelper.Galaxies;
import crazypanda.trappist1.util.Reference;
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
	public static Planet Trappist1c;
	public static Planet Trappist1d;
	
	public static void init()
	{
		Trappist1System = new SolarSystem("TrappistOneSystem", Galaxies.MILKYWAY.getName()).setMapPosition(new Vector3(3.0F, 1.5F, 0.0F));
		Trappist1 = (Star) new Star("Trappist1").setParentSolarSystem(Trappist1System).setTierRequired(-1);
		Trappist1.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1.png"));
		Trappist1System.setMainStar(Trappist1);
		
		Trappist1b = (Planet) new Planet("TrappistOneB").setParentSolarSystem(Trappist1System);
		Trappist1b.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1b.setPhaseShift((float) Math.PI);
		Trappist1b.setTierRequired(6);
		Trappist1b.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
		Trappist1b.setRelativeOrbitTime(0.2F);
		Trappist1b.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1bicon.png"));
		
		Trappist1c = (Planet) new Planet("TrappistOneC").setParentSolarSystem(Trappist1System);
		Trappist1c.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1c.setPhaseShift((float) Math.PI);
		Trappist1c.setTierRequired(6);
		Trappist1c.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.5F, 0.5F));
		Trappist1c.setRelativeOrbitTime(0.4F);
		Trappist1c.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1cicon.png"));
		
		Trappist1d = (Planet) new Planet("TrappistOneD").setParentSolarSystem(Trappist1System);
		Trappist1d.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1d.setPhaseShift((float) Math.PI);
		Trappist1d.setTierRequired(6);
		Trappist1d.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.5F, 0.5F));
		Trappist1d.setRelativeOrbitTime(0.8F);
		Trappist1d.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1dicon.png"));
		
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
		GalaxyRegistry.registerPlanet(Trappist1c);
		GalaxyRegistry.registerPlanet(Trappist1d);
	}
}

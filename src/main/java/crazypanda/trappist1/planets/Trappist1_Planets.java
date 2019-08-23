package crazypanda.trappist1.planets;

import asmodeuscore.api.dimension.IAdvancedSpace.ClassBody;
import asmodeuscore.core.astronomy.BodiesData;
import asmodeuscore.core.astronomy.BodiesHelper;
import asmodeuscore.core.astronomy.BodiesHelper.Galaxies;
import crazypanda.trappist1.planets.trappist1b.dimension.TeleportTypeTrappist1b;
import crazypanda.trappist1.planets.trappist1b.dimension.WorldProviderTrappist1b;
//import crazypanda.trappist1.planets.trappist1b.dimension.TeleportTypeTrappist1b;
//import crazypanda.trappist1.planets.trappist1b.dimension.WorldProviderTrappist1b;
import crazypanda.trappist1.util.Reference;
import crazypanda.trappist1.util.Trappist1Dimensions;
//import crazypanda.trappist1.util.Trappist1Dimensions;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.Constants;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import micdoodle8.mods.galacticraft.core.util.WorldUtil;

public class Trappist1_Planets {
	public static SolarSystem Trappist1System;
	public static Star Trappist1;
	public static Planet Trappist1b;
	public static Planet Trappist1c;
	public static Planet Trappist1d;
	public static Planet Trappist1e;
	public static Planet Trappist1f;
	public static Planet Trappist1g;
	public static Planet Trappist1h;
	
	public static void init()
	{
		
		Trappist1System = new SolarSystem("TrappistOneSystem", Galaxies.MILKYWAY.getName()).setMapPosition(new Vector3(3.0F, 1.5F, 0.0F));
		Trappist1 = (Star) new Star("Trappist1").setParentSolarSystem(Trappist1System).setTierRequired(6);
		Trappist1.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1.png"));
		Trappist1System.setMainStar(Trappist1);
		
		Trappist1b = (Planet) new Planet("TrappistOneB").setParentSolarSystem(Trappist1System);
		Trappist1b.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1b.setPhaseShift((float) Math.PI);
		Trappist1b.setTierRequired(6);
		Trappist1b.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.3F, 0.3F));
		Trappist1b.setRelativeOrbitTime(0.2F);
		Trappist1b.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1bicon.png"));
		Trappist1b.setDimensionInfo(-711, WorldProviderTrappist1b.class);
		
		Trappist1c = (Planet) new Planet("TrappistOneC").setParentSolarSystem(Trappist1System);
		Trappist1c.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1c.setPhaseShift((float) Math.PI * 2);
		Trappist1c.setTierRequired(6);
		Trappist1c.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.6F, 0.6F));
		Trappist1c.setRelativeOrbitTime(0.4F);
		Trappist1c.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1cicon.png"));
		
		Trappist1d = (Planet) new Planet("TrappistOneD").setParentSolarSystem(Trappist1System);
		Trappist1d.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1d.setPhaseShift((float) Math.PI * 4);
		Trappist1d.setTierRequired(6);
		Trappist1d.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.9F, 0.9F));
		Trappist1d.setRelativeOrbitTime(0.8F);
		Trappist1d.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1dicon.png"));
		
		Trappist1e = (Planet) new Planet("TrappistOneE").setParentSolarSystem(Trappist1System);
		Trappist1e.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1e.setPhaseShift((float) Math.PI * 8);
		Trappist1e.setTierRequired(6);
		Trappist1e.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.2F, 1.2F));
		Trappist1e.setRelativeOrbitTime(1.6F);
		Trappist1e.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1eicon.png"));
		
		Trappist1f = (Planet) new Planet("TrappistOneF").setParentSolarSystem(Trappist1System);
		Trappist1f.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1f.setPhaseShift((float) Math.PI * 16);
		Trappist1f.setTierRequired(6);
		Trappist1f.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.5F, 1.5F));
		Trappist1f.setRelativeOrbitTime(3.2F);
		Trappist1f.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1ficon.png"));
		
		Trappist1g = (Planet) new Planet("TrappistOneG").setParentSolarSystem(Trappist1System);
		Trappist1g.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1g.setPhaseShift((float) Math.PI * 32);
		Trappist1g.setTierRequired(6);
		Trappist1g.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.8F, 1.8F));
		Trappist1g.setRelativeOrbitTime(6.4F);
		Trappist1g.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1gicon.png"));
		
		Trappist1h = (Planet) new Planet("TrappistOneH").setParentSolarSystem(Trappist1System);
		Trappist1h.setRingColorRGB(0.0F, 0.4F, 0.9F);
		Trappist1h.setPhaseShift((float) Math.PI * 64);
		Trappist1h.setTierRequired(6);
		Trappist1h.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(2.1F, 2.1F));
		Trappist1h.setRelativeOrbitTime(12.8F);
		Trappist1h.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1hicon.png"));
		
		registryCelestial();
		registryTeleport();
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {		
		Trappist1Dimensions.TRAPPIST1B = WorldUtil.getDimensionTypeById(-711);
	}

	private static void registryTeleport() 
	{
		GalacticraftRegistry.registerTeleportType(WorldProviderTrappist1b.class, new TeleportTypeTrappist1b());
	}

	private static void registryCelestial() 
	{
		GalaxyRegistry.registerSolarSystem(Trappist1System);
		GalaxyRegistry.registerPlanet(Trappist1b);
		GalaxyRegistry.registerPlanet(Trappist1c);
		GalaxyRegistry.registerPlanet(Trappist1d);
		GalaxyRegistry.registerPlanet(Trappist1e);
		GalaxyRegistry.registerPlanet(Trappist1f);
		GalaxyRegistry.registerPlanet(Trappist1g);
		GalaxyRegistry.registerPlanet(Trappist1h);
		
		BodiesData data = new BodiesData(BodiesHelper.red + " " + BodiesHelper.getClassBody(ClassBody.DWARF), 20.336F, 0, 0, false);
		BodiesHelper.registerBodyWithClass(Trappist1System.getMainStar(), data);
		
	}
}

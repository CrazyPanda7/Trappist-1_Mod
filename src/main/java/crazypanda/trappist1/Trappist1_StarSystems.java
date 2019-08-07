package crazypanda.trappist1;

import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import net.minecraft.util.ResourceLocation;

public class Trappist1_StarSystems 
{
	public static SolarSystem trappist1;
	
	public static void init() {
		initializeSolarSystems();
		registerSolarSystems();
	}
	
	private static void initializeSolarSystems() {
		
		trappist1 = new SolarSystem("trappist1", "milkyWay").setMapPosition(new Vector3(90.0F, 30.0F, 0));
		Star starSol = (Star) new Star("trappist1").setParentSolarSystem(trappist1).setTierRequired(-1);
		starSol.setBodyIcon(new ResourceLocation(GalacticraftCore.NAME, "textures/celestialbodies/trappist1.png"));
		trappist1.setMainStar(starSol);
		
	}
	
	private static void registerSolarSystems() 
	{
		GalaxyRegistry.registerSolarSystem(trappist1);
	}
}

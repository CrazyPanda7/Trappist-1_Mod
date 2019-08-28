package crazypanda.trappist1;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import crazypanda.trappist1.planets.Trappist1_Planets;
import crazypanda.trappist1.proxy.CommonProxy;
import crazypanda.trappist1.util.Reference;
import crazypanda.trappist1.util.Trappist1Dimensions;
//import crazypanda.trappist1.util.Trappist1Dimensions;
import micdoodle8.mods.galacticraft.core.util.WorldUtil;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION /*, dependencies = "required-after:GalacticraftCore;"*/)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	private SolarSystem Trappist1System;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
    {	
		Trappist1_Planets.init();
		
    }
	
	public void postInit(FMLPostInitializationEvent event) {
		
		Trappist1Dimensions.init();
			
	}
}

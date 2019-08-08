package crazypanda.trappist1.util;

import crazypanda.trappist1.planets.trappist1b.dimension.WorldProviderTrappist1b;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class Trappist1Dimensions {
	public static final DimensionType TRAPPIST1B = DimensionType.register("Trappist1b", "Dim", -71, WorldProviderTrappist1b.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(-71, TRAPPIST1B);
	}
}

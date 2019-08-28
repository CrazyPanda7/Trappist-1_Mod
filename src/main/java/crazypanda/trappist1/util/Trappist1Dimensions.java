package crazypanda.trappist1.util;

import crazypanda.trappist1.planets.Trappist1_Planets;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.world.DimensionType;

public class Trappist1Dimensions {
	
	public static DimensionType TRAPPIST1B;
	
	public static void init() {
		Trappist1Dimensions.TRAPPIST1B = Trappist1Dimensions.getDimType(-711);
	}
	
	public static DimensionType getDimType(int dimId) {
		return WorldUtil.getDimensionTypeById(dimId);
	}
	
}
package crazypanda.trappist1.util;

import net.minecraft.world.DimensionType;
import micdoodle8.mods.galacticraft.core.util.WorldUtil;

public class Trappist1Dimensions {
	public static DimensionType TRAPPIST1B;
	
	public static void init()
    {
        Trappist1Dimensions.TRAPPIST1B = WorldUtil.getDimensionTypeById(TRAPPIST1B.getId());
    }
}

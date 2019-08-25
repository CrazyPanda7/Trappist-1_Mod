package crazypanda.trappist1.planets.trappist1b.dimension;

import java.util.LinkedList;
import java.util.List;

import crazypanda.trappist1.init.ModBlocks;
import crazypanda.trappist1.planets.Trappist1_Planets;
import crazypanda.trappist1.planets.trappist1b.world.gen.ChunkProviderTrappist1b;
import crazypanda.trappist1.util.Trappist1Dimensions;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DimensionType;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderTrappist1b extends WorldProviderSpace implements ISolarLevel{

	@Override
	public float getGravity() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double getFuelUsageMultiplier() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return true;
	}

	@Override
	public float getFallDamageModifier() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public CelestialBody getCelestialBody() {
		// TODO Auto-generated method stub
		return Trappist1_Planets.Trappist1b;
	}

	@Override
	public int getDungeonSpacing() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResourceLocation getDungeonChestType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Block> getSurfaceBlocks() {
		List<Block> list = new LinkedList<>();
        list.add(ModBlocks.B_SURFACEROCK);
        return list;
	}

	@Override
	public double getSolarEnergyMultiplier() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Vector3 getFogColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector3 getSkyColor() {
		// TODO Auto-generated method stub
		float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(154 / 255.0F * f, 114 / 255.0F * f, 66 / 255.0F * f);
	}

	@Override
	public boolean hasSunset() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getDayLength() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Class<? extends IChunkGenerator> getChunkProviderClass() {
		// TODO Auto-generated method stub
		return ChunkProviderTrappist1b.class;
	}

	@Override
	public DimensionType getDimensionType() {
		// TODO Auto-generated method stub
		return Trappist1Dimensions.TRAPPIST1B;
	}
	
}

package crazypanda.trappist1.planets.trappist1b;

import java.util.List;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DimensionType;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderTrappist1b extends WorldProviderSpace implements IGalacticraftWorldProvider, ISolarLevel{

	@Override
	public double getSolarEnergyMultiplier() {
		return 0;
	}

	@Override
	public float getGravity() {
		return 0;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 0;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return false;
	}

	@Override
	public float getFallDamageModifier() {
		return 0;
	}

	@Override
	public CelestialBody getCelestialBody() {
		return null;
	}

	@Override
	public int getDungeonSpacing() {
		return 0;
	}

	@Override
	public ResourceLocation getDungeonChestType() {
		return null;
	}

	@Override
	public List<Block> getSurfaceBlocks() {
		return null;
	}

	@Override
	public Vector3 getFogColor() {
		return null;
	}

	@Override
	public Vector3 getSkyColor() {
		return null;
	}

	@Override
	public boolean hasSunset() {
		return false;
	}

	@Override
	public long getDayLength() {
		
		return 0;
	}

	@Override
	public Class<? extends IChunkGenerator> getChunkProviderClass() {
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return null;
	}
	
}

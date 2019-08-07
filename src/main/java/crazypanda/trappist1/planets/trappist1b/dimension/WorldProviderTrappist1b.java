package crazypanda.trappist1.planets.trappist1b.dimension;

import java.util.List;

import asmodeuscore.api.dimension.IProviderFreeze;
import asmodeuscore.core.astronomy.dimension.world.gen.WorldProviderAdvancedSpace;
import crazypanda.trappist1.planets.Trappist1_Planets;
import crazypanda.trappist1.planets.trappist1b.world.gen.BiomeProviderTrappist1b;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderTrappist1b extends WorldProviderAdvancedSpace implements IProviderFreeze{

	@Override
	public double getFuelUsageMultiplier() {
		return 0.8;
	}

	@Override
	public float getFallDamageModifier() {
		return 0.16F;
	}

	@Override
	public CelestialBody getCelestialBody() {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean enableAdvancedThermalLevel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector3 getFogColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector3 getSkyColor() {
		// TODO Auto-generated method stub
		return new Vector3(0, 0, 0);
	}

	@Override
	public boolean hasSunset() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Class<? extends IChunkGenerator> getChunkProviderClass() {
		// TODO Auto-generated method stub
		return ChunkProviderTrappist1b.class;
	}

	@Override
	public DimensionType getDimensionType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isSkyColored() {
		return false;
	}
	
	@Override
    public boolean shouldForceRespawn() {
        return !ConfigManagerCore.forceOverworldRespawn;
    }
	
	@Override 
    public Class<? extends BiomeProvider> getBiomeProviderClass() { 
    	return BiomeProviderTrappist1b.class; 
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        final float var2 = this.world.getCelestialAngle(par1);
        float var3 = 1.0F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }

        if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        return var3 * var3 * 0.5F + 0.3F;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public float getSunBrightness(float par1) {
       float f1 = this.world.getCelestialAngle(1.0F);
       float f2 = 1.25F - (MathHelper.cos(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
       float f3 = this.world.getWorldTime();
       if(f2 < 0.0F) {
          f2 = 0.0F;
       }

       if(f2 > 1.0F) {
          f2 = 1.0F;
       }

       f2 = 1.0F - f2;
       return f2 * 0.8F + 0.2F;
    }
	
	@Override
	public void getLightmapColors(float partialTicks, float sunBrightness, float skyLight, float blockLight, float[] colors) 
	{
		EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();
		/*
		if (player != null)
		{
			if(player.getPosition().getY() >= world.getHeight(player.getPosition().getX(), player.getPosition().getZ()))
			{
				float light = 0.20F;
				//colors[0] = colors[0] + light;
				//colors[1] = 0.05F - sunBrightness;
				//colors[2] = 0.02F - sunBrightness;
			}
		}*/
	}

}
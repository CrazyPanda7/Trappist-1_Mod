package crazypanda.trappist1.planets.trappist1b.dimension;

import java.util.List;

import javax.annotation.Nullable;

import asmodeuscore.api.dimension.IProviderFreeze;
import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_Biome;
import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_ChunkProvider;
import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_WorldProvider;
import asmodeuscore.core.astronomy.dimension.world.worldengine.standardcustomgen.WE_TerrainGenerator;
import crazypanda.trappist1.init.ModBlocks;
import crazypanda.trappist1.planets.Trappist1_Planets;
import crazypanda.trappist1.planets.trappist1b.world.gen.BiomeProviderTrappist1b;
import crazypanda.trappist1.planets.trappist1b.world.gen.we.Trappist1bMountains;
import crazypanda.trappist1.planets.trappist1b.world.gen.we.Trappist1bPlains;
import crazypanda.trappist1.util.Trappist1Dimensions;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderTrappist1b extends WE_WorldProvider implements IProviderFreeze {
	
	private final float[] colorsSunriseSunset = new float[4];
	public static WE_ChunkProvider chunk;
	
	@Override 
	public double getHorizon() {
		return 40.0D;
	}
	
	@Override 
	public float getFallDamageModifier() {
		return 0.2F;
	}
	
	@Override
	public double getFuelUsageMultiplier() {
		return 1.6;
	}
	
	@Override
    public double getMeteorFrequency() {
        return 0.0;
    }
	
	@Override
    public float getSoundVolReductionAmount() {
        return Float.MIN_VALUE;
    }
	
	@Override
    public boolean canRainOrSnow() {
        return false;
    }
	
	@Override
	public CelestialBody getCelestialBody() {
		return Trappist1_Planets.Trappist1b;
	}
	
	@Override
    public Class<? extends IChunkGenerator> getChunkProviderClass() {
        return WE_ChunkProvider.class;

    }
	
	@Override 
    public Class<? extends BiomeProvider> getBiomeProviderClass() { 
    	return BiomeProviderTrappist1b.class; 
    }
	
	@Override 
    @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 180.0F;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public Vector3 getFogColor() {
    	float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(140 / 255.0F * f, 167 / 255.0F * f, 207 / 255.0F * f);
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public Vector3 getSkyColor() {

    	float f = 0.5F - this.getStarBrightness(1.0F);
    	return new Vector3(61 / 255.0F * f, 86 / 255.0F * f, 175 / 255.0F * f);

    }
	
	@Override
	public boolean isSkyColored() {
		return true;
	}
	
	@Override
	public boolean hasSunset() {
		return false;
	}
	
	@Override
    public boolean shouldForceRespawn() {
        return !ConfigManagerCore.forceOverworldRespawn;
    }  
	
	@Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
    	float f = this.world.getCelestialAngle(par1);
        float f1 = 1.0F - (MathHelper.cos(f * ((float)Math.PI * 2F)) * 2.0F + 0.25F);
        f1 = MathHelper.clamp(f1, 0.0F, 1.0F);
        return f1 * f1 * 0.5F;   	
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public float getSunBrightness(float par1) {
       float f1 = this.world.getCelestialAngle(1.0F);
       float f2 = 1.0F - (MathHelper.cos(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
       f2 = MathHelper.clamp(f2, 0.0F, 1.0F);

       f2 = 1.2F - f2;
       return f2 * 0.8F;
    }
	
	@Override
    public IRenderHandler getCloudRenderer(){
        return super.getCloudRenderer();
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
	public DimensionType getDimensionType() {
	
		return Trappist1Dimensions.TRAPPIST1B;
	}
	
	@Override
	public void genSettings(WE_ChunkProvider cp) {		
		chunk = cp;
		
		cp.createChunkGen_List .clear(); 
		cp.createChunkGen_InXZ_List .clear(); 
		cp.createChunkGen_InXYZ_List.clear(); 
		cp.decorateChunkGen_List .clear(); 
		
		WE_Biome.setBiomeMap(cp, 1.2D, 4, 3800.0D, 1.0D);	

		WE_TerrainGenerator terrainGenerator = new WE_TerrainGenerator(); 
		terrainGenerator.worldStoneBlock = ModBlocks.B_ROCK; 
		terrainGenerator.worldStoneBlockMeta = 1;
		terrainGenerator.worldSeaGen = false;
		terrainGenerator.worldSeaGenBlock = Blocks.WATER;
		terrainGenerator.worldSeaGenMaxY = 64;
		cp.createChunkGen_List.add(terrainGenerator);
		
		cp.biomesList.clear();
		
		WE_Biome.addBiomeToGeneration(cp, new Trappist1bPlains());
		WE_Biome.addBiomeToGeneration(cp, new Trappist1bMountains());	
		
	}

	@Override
	public BiomeDecoratorSpace getDecorator() {
		return null;
	}

	@Override
	public boolean enableAdvancedThermalLevel() {
		return false;
	}

}

package crazypanda.trappist1.planets.trappist1b.dimension.sky;

import asmodeuscore.core.astronomy.sky.SkyProviderBase;
import crazypanda.trappist1.util.Reference;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;

public class SkyProviderTrappist1b extends SkyProviderBase{

	@Override
	protected void rendererSky(Tessellator tessellator, BufferBuilder buffer, float f10, float ticks) {
		
		
	}

	@Override
	protected int modeLight() {
		
		return 0;
	}

	@Override
	protected boolean enableBaseImages() {
		
		return false;
	}

	@Override
	protected float sunSize() {
		
		return 50F;
	}

	@Override
	protected ResourceLocation sunImage() {
		
		return new ResourceLocation(Reference.MOD_ID, "textures/gui/celestialbodies/trappist1.png");
	}

	@Override
	protected boolean enableStar() {
		
		return true;
	}

	@Override
	protected Vector3 colorSunAura() {
		
		return new Vector3(150, 150, 150);
	}

	@Override
	protected Vector3 getAtmosphereColor() {
		
		return null;
	}
	
	@Override
	public int addSizeAura() {return 32;}
	
	

}

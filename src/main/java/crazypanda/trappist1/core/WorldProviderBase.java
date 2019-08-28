package crazypanda.trappist1.core;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.recipe.SchematicRegistry;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStats;
import micdoodle8.mods.galacticraft.core.event.EventHandlerGC;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class WorldProviderBase extends WorldProviderSpace implements ISolarLevel
{
    @Override
    public boolean canRespawnHere()
    {
        if (EventHandlerGC.bedActivated)
        {
            EventHandlerGC.bedActivated = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean hasSunset()
    {
        return false;
    }

    @Override
    public double getFuelUsageMultiplier()
    {
        return 0.9D;
    }

    public void setup(EntityPlayerMP player)
    {
        GCPlayerStats stats = GCPlayerStats.get(player);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IRenderHandler getSkyRenderer()
    {
        if (super.getSkyRenderer() == null)
        {
            this.renderSky();
        }
        return super.getSkyRenderer();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IRenderHandler getCloudRenderer()
    {
        if (super.getCloudRenderer() == null)
        {
            this.renderCloud();
        }
        return super.getCloudRenderer();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IRenderHandler getWeatherRenderer()
    {
        if (super.getWeatherRenderer() == null)
        {
            this.renderWeather();
        }
        return super.getWeatherRenderer();
    }

    @Override
    public BiomeProvider getBiomeProvider()
    {
        return this.biomeProvider;
    }

    @Override
    protected void init()
    {
        this.hasSkyLight = true;
    }

    @Override
    public Class<? extends IChunkGenerator> getChunkProviderClass()
    {
        return null;
    }

    @Override
    public ResourceLocation getDungeonChestType()
    {
        return null;
    }

    protected void renderCloud()
    {
        this.setCloudRenderer(new CloudRenderer());
    }

    protected void renderSky() {}
    protected void renderWeather() {}

    @Override
    public abstract IChunkGenerator createChunkGenerator();
}
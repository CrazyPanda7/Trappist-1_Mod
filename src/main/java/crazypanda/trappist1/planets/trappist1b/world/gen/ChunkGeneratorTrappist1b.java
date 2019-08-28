package crazypanda.trappist1.planets.trappist1b.world.gen;

import java.util.Optional;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import crazypanda.trappist1.init.ModBlocks;
import crazypanda.trappist1.util.ChunkGeneratorBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;

public class ChunkGeneratorTrappist1b extends ChunkGeneratorBase
{
    private final BiomeDecoratorTrappist1b decorator = new BiomeDecoratorTrappist1b();

    public ChunkGeneratorTrappist1b(World world, long seed)
    {
        super(world, seed);
    }

    @Override
    protected void preGenerateChunk(ChunkPrimer primer, int chunkX, int chunkZ)
    {
        this.createCraters(chunkX, chunkZ, primer);
    }

    @Override
    protected void generateChunk(ChunkPrimer primer, int chunkX, int chunkZ)
    {
    }

    @Override
    protected void populate(BlockPos pos, ChunkPos chunkpos, Biome biome, int chunkX, int chunkZ, int x, int z)
    {
        int y = this.rand.nextInt(this.rand.nextInt(248) + 8);
        this.decorator.decorate(this.world, this.rand, biome, pos);
    }

    @Override
    public void recreateStructures(Chunk chunk, int chunkX, int chunkZ)
    {
    }

    @Override
    public boolean isInsideStructure(World world, String name, BlockPos pos)
    {
        return false;
    }

    @Override
    @Nullable
    public BlockPos getNearestStructurePos(World world, String name, BlockPos pos, boolean findUnexplored)
    {
        return null;
    }

    @Override
    protected IBlockState getTopBlock()
    {
        return ModBlocks.B_SURFACEROCK.getDefaultState();
    }

    @Override
    protected IBlockState getSubBlock()
    {
        return ModBlocks.B_SUBROCK.getDefaultState();
    }

    @Override
    protected IBlockState getStoneBlock()
    {
        return ModBlocks.B_ROCK.getDefaultState();
    }
}
package crazypanda.trappist1.init;

import java.util.ArrayList;
import java.util.List;

import crazypanda.trappist1.blocks.bRock;
import crazypanda.trappist1.blocks.bSubRock;
import crazypanda.trappist1.blocks.bSurfaceRock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block B_SURFACEROCK = new bSurfaceRock("b_surfacerock", Material.ROCK);
	public static final Block B_SUBROCK = new bSubRock("b_subrock", Material.ROCK);
	public static final Block B_ROCK = new bRock("b_rock", Material.ROCK);
}

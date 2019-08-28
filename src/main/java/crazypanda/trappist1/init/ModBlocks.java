package crazypanda.trappist1.init;

import java.util.ArrayList;
import java.util.List;

import crazypanda.trappist1.blocks.bRock;
import crazypanda.trappist1.blocks.bSubRock;
import crazypanda.trappist1.blocks.bSurfaceRock;
import crazypanda.trappist1.blocks.cRock;
import crazypanda.trappist1.blocks.cSubRock;
import crazypanda.trappist1.blocks.cSurfaceRock;
import crazypanda.trappist1.blocks.dRock;
import crazypanda.trappist1.blocks.dSubRock;
import crazypanda.trappist1.blocks.dSurfaceRock;
import crazypanda.trappist1.util.handlers.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block B_SURFACEROCK = new bSurfaceRock("b_surfacerock", Material.ROCK);
	public static final Block B_SUBROCK = new bSubRock("b_subrock", Material.ROCK);
	public static final Block B_ROCK = new bRock("b_rock", Material.ROCK);
	
	public static final Block C_SURFACEROCK = new cSurfaceRock("c_surfacerock", Material.ROCK);
	public static final Block C_SUBROCK = new cSubRock("c_subrock", Material.ROCK);
	public static final Block C_ROCK = new cRock("c_rock", Material.ROCK);
	
	public static final Block D_SURFACEROCK = new dSurfaceRock("d_surfacerock", Material.ROCK);
	public static final Block D_SUBROCK = new dSubRock("d_subrock", Material.ROCK);
	public static final Block D_ROCK = new dRock("d_rock", Material.ROCK);
	
	
	
}

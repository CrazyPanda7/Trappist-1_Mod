package crazypanda.trappist1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class dSubRock extends BlockBase
{

	public dSubRock(String name, Material material) 
	{
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
	}

}

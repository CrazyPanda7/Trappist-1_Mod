package crazypanda.trappist1.util.handlers;

import javax.annotation.Nonnull;

import crazypanda.trappist1.init.ModBlocks;
import crazypanda.trappist1.init.ModItems;
import crazypanda.trappist1.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@EventBusSubscriber	
public class RegistryHandler 
{
	
	public static void registerBiome(Biome biome) {
		ForgeRegistries.BIOMES.register(biome);
	}
	
	public static void registerBiomeType(Biome biome, @Nonnull BiomeDictionary.Type... biomeType) {
		BiomeDictionary.addTypes(biome, biomeType);
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
		for(Item item : ModItems.ITEMS)
		{
			
			if(item instanceof IHasModel)
			{
				
				((IHasModel)item).registerModels();
				
			}
			
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			
			if(block instanceof IHasModel)
			{
				
				((IHasModel)block).registerModels();
				
			}
			
		}
		
	}

}

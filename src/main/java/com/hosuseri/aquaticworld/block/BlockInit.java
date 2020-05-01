package com.hosuseri.aquaticworld.block;

import net.minecraft.item.Item;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.blocks.BlockList;
import com.hosuseri.aquaticworld.block.ores.OreList;
import com.hosuseri.aquaticworld.util.LogClass;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(AquaticWorld.MOD_ID)
@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus= Bus.MOD)
public class BlockInit {
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) { // for every block you register you also need to register the item for it
		LogClass.debug("Begin blocks Registy");
		
		event.getRegistry().register(BlockList.aquamarine_block);
		
		event.getRegistry().register(BlockList.beryl_block);
		
		event.getRegistry().register(BlockList.opal_block);

		event.getRegistry().register(OreList.aquamarine_ore);

		event.getRegistry().register(OreList.opal_ore);
		
		event.getRegistry().register(OreList.beryl_ore);
		
		event.getRegistry().register(BlockList.water_stone);
		
		event.getRegistry().register(BlockList.water_cobblestone);
		
		LogClass.debug("Finish blocks Registry");
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		LogClass.debug("Begin item_blocks Registy");
		 
		event.getRegistry().register(BlockList.aquamarine_block.asItem());
		
		event.getRegistry().register(BlockList.beryl_block.asItem());
		
		event.getRegistry().register(BlockList.opal_block.asItem());
		
		event.getRegistry().register(OreList.aquamarine_ore.asItem());
		
		event.getRegistry().register(OreList.opal_ore.asItem());
		
		event.getRegistry().register(OreList.beryl_ore.asItem());
		
		event.getRegistry().register(BlockList.water_stone.asItem());
		
		event.getRegistry().register(BlockList.water_cobblestone.asItem());
		
		LogClass.debug("Finish item_blocks Registry");
	}
}

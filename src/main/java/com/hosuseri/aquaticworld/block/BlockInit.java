package com.hosuseri.aquaticworld.block;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.blocks.AquamarineOre;
import com.hosuseri.aquaticworld.util.LogClass;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

@ObjectHolder(AquaticWorld.MOD_ID)
@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus= Bus.MOD)
public class BlockInit {
	public static Block aquamarine_ore = null;
	public static Block aquamarine_block = null;
	public static BlockItem aquamarine_block_item = null;
	public static BlockItem aquamarine_ore_item = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) { // for every block you register you also need to register the item for it
		LogClass.debug("Begin blocks Registy");
		
		Block.Properties aquamarine_block_props = Block.Properties.create(Material.IRON);
		aquamarine_block_props.hardnessAndResistance(7f, 15.0f);
		aquamarine_block_props.sound(SoundType.METAL);
		aquamarine_block_props.harvestTool(ToolType.PICKAXE);
		aquamarine_block_props.harvestLevel(3);
		aquamarine_block = new Block(aquamarine_block_props);
		aquamarine_block.setRegistryName("aquamarine_block");
		
		event.getRegistry().register(aquamarine_block);

		Block.Properties aquamarine_ore_props = Block.Properties.create(Material.ROCK); 
		aquamarine_ore_props.hardnessAndResistance(4f, 10f);
		aquamarine_ore_props.sound(SoundType.STONE);
		aquamarine_ore_props.harvestLevel(3);
		aquamarine_ore_props.harvestTool(ToolType.PICKAXE);
		aquamarine_ore = new AquamarineOre(aquamarine_ore_props);
		aquamarine_ore.setRegistryName("aquamarine_ore");
		
		event.getRegistry().register(aquamarine_ore);
		
		LogClass.debug("Finish blocks Registry");
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		LogClass.debug("Begin item_blocks Registy");
		
		Item.Properties props = new Item.Properties();
		props.maxStackSize(64);
		props.group(AquaticWorldItemGroup.instance);
		
		aquamarine_block_item = new BlockItem(aquamarine_block, props);
		aquamarine_block_item.setRegistryName("aquamarine_block"); 
		
		event.getRegistry().register(aquamarine_block_item);
		
		aquamarine_ore_item = new BlockItem(aquamarine_ore, props);
		aquamarine_ore_item.setRegistryName("aquamarine_ore");
		
		event.getRegistry().register(aquamarine_ore_item);
		
		LogClass.debug("Finish item_blocks Registry");
	}
}

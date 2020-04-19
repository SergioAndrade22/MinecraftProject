package com.hosuseri.tutorialmod.init;

import com.hosuseri.tutorialmod.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TutorialMod.MOD_ID)
@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus= Bus.MOD)
public class BlockInit {
	public static final Block aquamarine_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) { // for every block you register you also need to register the item for it
		TutorialMod.instance.log("Begin blocks Registy");
		
		Block.Properties props = Block.Properties.create(Material.IRON);
		props.hardnessAndResistance(7f, 15.0f);
		props.sound(SoundType.METAL);
		props.harvestTool(ToolType.PICKAXE);
		props.harvestLevel(3);
		Block to_reg = new Block(props);
		to_reg.setRegistryName("aquamarine_block");
		
		event.getRegistry().register(to_reg);
		
		TutorialMod.instance.log("Finish blocks Registry");
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		TutorialMod.instance.log("Begin blocks Registy");
		
		Item.Properties props = new Item.Properties();
		props.maxStackSize(16);
		props.group(TutorialMod.TutorialItemGroup.instance);
		
		BlockItem to_reg = new BlockItem(aquamarine_block, props);
		to_reg.setRegistryName("aquamarine_block"); 
		
		event.getRegistry().register(to_reg);
		
		TutorialMod.instance.log("Finish blocks Registry");
	}
}

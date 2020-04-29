package com.hosuseri.aquaticworld.block.blocks;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class AquamarineBlock extends Block {

	private static Properties props = Block.Properties.create(Material.IRON).hardnessAndResistance(7f, 15.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3);
	private BlockItem item; 
	
	public AquamarineBlock() {
		super(props);
		setRegistryName("aquamarine_block");
		
		Item.Properties item_props = new Item.Properties();
		item_props.maxStackSize(64);
		item_props.group(AquaticWorldItemGroup.instance);
		
		item = new BlockItem(this, item_props);
		item.setRegistryName("aquamarine_block");
	}
	
	@Override
	public Item asItem() {
		return item;
	}
}
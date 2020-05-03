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
	public static final String name = "aquamarine_block";
	
	public AquamarineBlock() {
		super(props);
		
		Item.Properties item_props = new Item.Properties();
		item_props.maxStackSize(64);
		item_props.group(AquaticWorldItemGroup.instance);
		
		item = new BlockItem(this, item_props);
		item.setRegistryName(name);
	}
	
	@Override
	public Item asItem() {
		return item;
	}
}

package com.hosuseri.aquaticworld.block.blocks;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class WaterStone extends Block {

	public static Properties props = Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE);
	public static final String name = "water_stone";
	private BlockItem item;
	
	public WaterStone() {
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
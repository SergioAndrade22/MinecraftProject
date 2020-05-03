package com.hosuseri.aquaticworld.block.extras;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class WaterStonePressurePlate extends PressurePlateBlock {

	public static final String name = "water_stone_pressure_plate";
	private static final Properties props = Block.Properties.from(BlockInit.WATER_STONE.get());
	private BlockItem item;
	
	public WaterStonePressurePlate() {
		super(Sensitivity.MOBS, props);
		
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

package com.hosuseri.aquaticworld.block.extras;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class WaterCobblestonePressurePlate extends PressurePlateBlock {

	public static final String name = "water_cobblestone_pressure_plate";
	private static final Properties props = Block.Properties.from(BlockInit.WATER_COBBLESTONE.get());
	private BlockItem item;
	
	public WaterCobblestonePressurePlate() {
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

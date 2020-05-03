package com.hosuseri.aquaticworld.block.extras;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class WaterStoneFence extends FenceBlock {

	public static final String name = "water_stone_fence";
	private static final Properties props = Block.Properties.from(BlockInit.WATER_STONE.get());
	private BlockItem item;
	
	public WaterStoneFence() {
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

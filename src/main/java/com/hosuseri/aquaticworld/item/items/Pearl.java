package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class Pearl extends Item {

private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public Pearl() {
		super(props);
		setRegistryName("pearl");
	}
}
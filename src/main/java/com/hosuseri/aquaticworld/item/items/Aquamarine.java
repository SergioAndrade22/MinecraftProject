package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class Aquamarine extends Item{

	private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public Aquamarine() {
		super(props);
		setRegistryName("aquamarine");
	}
}

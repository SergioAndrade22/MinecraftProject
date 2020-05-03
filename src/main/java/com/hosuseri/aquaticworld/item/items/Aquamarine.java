package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class Aquamarine extends Item{

	private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public static final String name = "aquamarine";
	
	public Aquamarine() {
		super(props);
	}
}

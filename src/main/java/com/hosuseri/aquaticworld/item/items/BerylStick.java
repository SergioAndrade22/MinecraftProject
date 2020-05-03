package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class BerylStick extends Item {

	private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public static final String name = "beryl_stick";
	
	public BerylStick() {
		super(props);
	}
}

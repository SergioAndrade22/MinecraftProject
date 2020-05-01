package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class PrismarineStick extends Item {

private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public PrismarineStick() {
		super(props);
		setRegistryName("prismarine_stick");
	}
}

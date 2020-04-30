package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Item;

public class SeaTear extends Item {

private static Item.Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance);
	
	public SeaTear() {
		super(props);
		setRegistryName("sea_tear");
	}
}

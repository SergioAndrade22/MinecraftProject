package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class OpalHoe extends HoeItem {

	private static IItemTier tier = ModItemTier.OPAL;
	private static float attackSpeed = -3.2f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	

	public OpalHoe() {
		super(tier, attackSpeed, props);
		setRegistryName("opal_hoe");
	}
}
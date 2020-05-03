package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class BerylHoe extends HoeItem {

	public static final String name = "beryl_hoe";
	private static IItemTier tier = ModItemTier.BERYL;
	private static float attackSpeed = -3.2f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	
	public BerylHoe() {
		super(tier, attackSpeed, props);
	}
}
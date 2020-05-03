package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class BerylSword extends SwordItem {

	public static final String name = "beryl_sword";
	private static IItemTier tier = ModItemTier.BERYL;
	private static int attackDamage = 11;
	private static float attackSpeed = -1.2f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	
	public BerylSword() {
		super(tier, attackDamage, attackSpeed, props);
	}
}

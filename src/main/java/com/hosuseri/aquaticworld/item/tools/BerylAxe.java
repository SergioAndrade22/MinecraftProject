package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class BerylAxe extends AxeItem {

	public static final String name = "beryl_axe";
	private static IItemTier tier = ModItemTier.BERYL;
	private static int attackDamage = 14;
	private static float attackSpeed = -2.1f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);

	public BerylAxe() {
		super(tier, attackDamage, attackSpeed, props);
	}
	
}

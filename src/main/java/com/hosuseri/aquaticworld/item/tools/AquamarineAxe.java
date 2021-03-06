package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AquamarineAxe extends AxeItem {

	public static final String name = "aquamarine_axe";
	private static IItemTier tier = ModItemTier.AQUAMARINE;
	private static int attackDamage = 11;
	private static float attackSpeed = -2.4f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	
	public AquamarineAxe() {
		super(tier, attackDamage, attackSpeed, props);
	}
	
}

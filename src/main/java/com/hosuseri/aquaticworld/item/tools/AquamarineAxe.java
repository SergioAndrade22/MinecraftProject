package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.item.ModItemTier;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AquamarineAxe extends AxeItem {

	private static IItemTier tier = ModItemTier.AQUAMARINE;
	private static int attackDamage = 11;
	private static float attackSpeed = -2.4f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	

	public AquamarineAxe() {
		super(tier, attackDamage, attackSpeed, props);
		setRegistryName("aquamarine_axe");
	}
	
}

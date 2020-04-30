package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.item.ModItemTier;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class AquamarineSword extends SwordItem {
	
	private static IItemTier tier = ModItemTier.AQUAMARINE;
	private static int attackDamage = 8;
	private static float attackSpeed = -1.5f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	

	public AquamarineSword() {
		super(tier, attackDamage, attackSpeed, props);
		setRegistryName("aquamarine_sword");
	}
}

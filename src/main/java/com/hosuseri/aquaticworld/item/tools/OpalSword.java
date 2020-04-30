package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class OpalSword extends SwordItem {
	
	private static IItemTier tier = ModItemTier.OPAL;
	private static int attackDamage = 14;
	private static float attackSpeed = -0.9f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	

	public OpalSword() {
		super(tier, attackDamage, attackSpeed, props);
		setRegistryName("opal_sword");
	}
}

package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class OpalAxe extends AxeItem {

	public static final String name = "opal_axe";
	private static IItemTier tier = ModItemTier.OPAL;
	private static int attackDamage = 17;
	private static float attackSpeed = -1.8f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	
	public OpalAxe() {
		super(tier, attackDamage, attackSpeed, props);
	}
	
}

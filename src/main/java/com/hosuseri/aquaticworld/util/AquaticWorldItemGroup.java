package com.hosuseri.aquaticworld.util;

import com.hosuseri.aquaticworld.item.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AquaticWorldItemGroup extends ItemGroup{
	public static final AquaticWorldItemGroup instance = new AquaticWorldItemGroup(ItemGroup.GROUPS.length, "aquatic_world_tab"); 
	
	private AquaticWorldItemGroup(int index, String label) {
		super(index, label);
	}
	
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.POSEIDON_TRIDENT.get());
	}
}

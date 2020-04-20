package com.hosuseri.aquaticworld.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TutorialItemGroup extends ItemGroup{
	public static final TutorialItemGroup instance = new TutorialItemGroup(ItemGroup.GROUPS.length, "aquatic_world_tab"); 
	
	private TutorialItemGroup(int index, String label) {
		super(index, label);
	}
	
	public ItemStack createIcon() {
		return new ItemStack(BlockInit.aquamarine_block);
	}
}

package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BerylChestplate extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.BERYL;
	private static EquipmentSlotType slot = EquipmentSlotType.CHEST;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	public static final String name = "beryl_chestplate";
	
	public BerylChestplate() {
		super(material, slot, props);
	}
}

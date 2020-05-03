package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BerylLeggings extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.BERYL;
	private static EquipmentSlotType slot = EquipmentSlotType.LEGS;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	public static final String name = "beryl_leggings";
	
	public BerylLeggings() {
		super(material, slot, props);
	}
}

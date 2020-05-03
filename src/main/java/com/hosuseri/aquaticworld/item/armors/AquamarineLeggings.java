package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class AquamarineLeggings extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.AQUAMARINE;
	private static EquipmentSlotType slot = EquipmentSlotType.LEGS;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	public static final String name = "aquamarine_leggings";
	
	public AquamarineLeggings() {
		super(material, slot, props);
	}
}

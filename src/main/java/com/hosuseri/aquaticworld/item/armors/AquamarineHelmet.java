package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class AquamarineHelmet extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.AQUAMARINE;
	private static EquipmentSlotType slot = EquipmentSlotType.HEAD;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	private static final String name = "aquamarine_helmet";
	
	public AquamarineHelmet() {
		super(material, slot, props);
		setRegistryName(name);
	}
}

package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class OpalHelmet extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.OPAL;
	private static EquipmentSlotType slot = EquipmentSlotType.HEAD;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	private static final String name = "opal_helmet";
	
	public OpalHelmet() {
		super(material, slot, props);
		setRegistryName(name);
	}
}

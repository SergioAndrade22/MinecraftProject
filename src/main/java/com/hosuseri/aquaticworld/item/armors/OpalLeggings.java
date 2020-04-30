package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class OpalLeggings extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.OPAL;
	private static EquipmentSlotType slot = EquipmentSlotType.LEGS;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	private static final String name = "opal_leggings";
	
	public OpalLeggings() {
		super(material, slot, props);
		setRegistryName(name);
	}
}

package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class AquamarineChestplate extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.AQUAMARINE;
	private static EquipmentSlotType slot = EquipmentSlotType.CHEST;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	private static final String name = "aquamarine_chestplate";
	
	public AquamarineChestplate() {
		super(material, slot, props);
		setRegistryName(name);
	}
}

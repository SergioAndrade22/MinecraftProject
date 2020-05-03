package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class OpalBoots extends ArmorItem {

	private static ModArmorMaterial material = ModArmorMaterial.OPAL;
	private static EquipmentSlotType slot = EquipmentSlotType.FEET;
	private static Properties props = new Properties().group(AquaticWorldItemGroup.instance);
	public static final String name = "opal_boots";
	
	public OpalBoots() {
		super(material, slot, props);
	}
}

package com.hosuseri.aquaticworld.item.armors;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.item.items.ItemList;

import java.util.function.Supplier;

import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public enum ModArmorMaterial implements IArmorMaterial {

	//MOD_ID + ":name for the layers", damage factor, damage reduction for each part of the armor{boots, leggings, chestplate, helmet}, enchantability, sound, toughness
	AQUAMARINE(AquaticWorld.MOD_ID + ":aquamarine", 38, new int[]{5, 8, 10, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5f, () ->{
		return Ingredient.fromItems(ItemList.aquamarine);
	}),
	BERYL(AquaticWorld.MOD_ID + ":beryl", 45, new int[]{8, 11, 13, 9}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8f, () ->{
		return Ingredient.fromItems(ItemList.beryl);
	}),
	OPAL(AquaticWorld.MOD_ID + ":opal", 52, new int[]{11, 14, 16, 12}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 11f, () ->{
		return Ingredient.fromItems(ItemList.opal);
	});
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {12, 14, 16, 11};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float thoughnessIn, Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantability = enchantabilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = thoughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial.getValue();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}

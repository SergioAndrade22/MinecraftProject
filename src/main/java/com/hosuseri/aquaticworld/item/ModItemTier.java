package com.hosuseri.aquaticworld.item;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier{
	AQUAMARINE(4, 3124, 14.0f, 1.0f, 24, () -> {
		return Ingredient.fromItems(ItemInit.aquamarine);
	});

	private final int harvest_level;
	private final int durability;
	private final float efficency;
	private final float attack_damage;		
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvest_level, int durability, float efficency, float attck_damage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvest_level = harvest_level;
		this.durability = durability;
		this.efficency = efficency;
		this.attack_damage = attck_damage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<Ingredient>(repairMaterial);
	}
	
	@Override
	public int getMaxUses() {
		return durability;
	}

	@Override
	public float getEfficiency() {
		return efficency;
	}

	@Override
	public float getAttackDamage() {
		return attack_damage;
	}

	@Override
	public int getHarvestLevel() {
		return harvest_level;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial.getValue();
	}
	
}
package com.hosuseri.aquaticworld.item.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class AquamarineShovel extends ShovelItem {

	public AquamarineShovel(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		for (PlayerEntity player : worldIn.getPlayers()) {
			if (player.getHeldItemMainhand() == stack && player.isInWater())
				player.addPotionEffect(new EffectInstance(Effects.HASTE, 1, 10));
		}
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}

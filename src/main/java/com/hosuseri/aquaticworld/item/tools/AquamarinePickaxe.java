package com.hosuseri.aquaticworld.item.tools;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class AquamarinePickaxe extends PickaxeItem {

	public static final String name = "aquamarine_pickaxe";
	private static IItemTier tier = ModItemTier.AQUAMARINE;
	private static int attackDamage = 0;
	private static float attackSpeed = -3.2f;
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxStackSize(1);
	
	public AquamarinePickaxe() {
		super(tier, attackDamage, attackSpeed, props);
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

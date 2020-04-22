package com.hosuseri.aquaticworld.item.items;

import java.util.List;

import com.hosuseri.aquaticworld.util.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class PoseidonTrident extends Item {
	private CooldownTracker lightning_cooldown = new CooldownTracker();
	private CooldownTracker regeneration_cooldown = new CooldownTracker();
	
	public PoseidonTrident(Properties properties) {
		super(properties);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("SHIFT + R_click: triggers rain for 5s and gives 10s regeneration IV \n"
												+ "R_click on target: cast a lightning on them"));
		}
		else {
			tooltip.add(new StringTextComponent("Current lightning cooldown: " + Math.round(lightning_cooldown.getCooldown(this, 0) * 100) + "s \n"
												+ "Current regeneration cooldown: " + regeneration_cooldown.getCooldown(this, 0) + "s \n"
												+ "Hold" + "\u00A7e" + " shift " + "\u00A77" + "for more information"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
		lightning_cooldown.tick();
		regeneration_cooldown.tick();		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (KeyboardHelper.isHoldingShift() && !regeneration_cooldown.hasCooldown(this)) {
			worldIn.setRainStrength(2.0f);
			playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 300, 5));
			
			regeneration_cooldown.setCooldown(this, 1200);
		}
		else {
		    if (!worldIn.isRemote && !lightning_cooldown.hasCooldown(this)) {
	    	    Vec3d player_look = playerIn.getLookVec();

	    	    LightningBoltEntity bolt = new LightningBoltEntity(worldIn, playerIn.getPosX() + player_look.x, playerIn.getPosY() + player_look.y, playerIn.getPosZ() + player_look.z, false);
	    	    bolt.addVelocity(player_look.x, player_look.y, player_look.z);
	    	    worldIn.addEntity(bolt);
	    	    
	    	    lightning_cooldown.setCooldown(this, 400);
		    }
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
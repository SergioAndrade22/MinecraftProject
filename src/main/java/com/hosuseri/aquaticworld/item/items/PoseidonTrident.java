package com.hosuseri.aquaticworld.item.items;

import java.util.List;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.util.KeyboardHelper;
import com.hosuseri.aquaticworld.util.LogClass;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.settings.ParticleStatus;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class PoseidonTrident extends Item {
	private Minecraft mc = Minecraft.getInstance();

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
												+ "R_click on target: cast a lightning_bolt on them"));
		}
		else {
			tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " shift " + "\u00A77" + "for more information"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (KeyboardHelper.isHoldingShift()) {
			worldIn.setRainStrength(1.0f);
			playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 200, 5));
			return super.onItemRightClick(worldIn, playerIn, handIn);
		}
		else {
		    if (!worldIn.isRemote) {
		    	Vec3d pos = mc.objectMouseOver.getHitVec();
		    	LogClass.info(pos.toString());
		    	LightningBoltEntity entitylightning = new LightningBoltEntity(worldIn, pos.x, pos.y, pos.z, true);
				worldIn.addEntity(entitylightning);
				worldIn.addOptionalParticle(ParticleTypes.FLASH, pos.x, pos.y, pos.z, 1.0f, 1.0f, 1.0f);
		      return super.onItemRightClick(worldIn, playerIn, handIn);
		    }
		    return super.onItemRightClick(worldIn, playerIn, handIn);
		}
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		
		return super.hitEntity(stack, target, attacker);
	}
	
	/*
	@Override
	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
		// when you drop the item it creates a block underneath it, hence, onEntityItemUpdate activates when the item is on the world "by itself"
		entity.getEntityWorld().setBlockState(entity.getPosition().down(), BlockInit.aquamarine_block.getDefaultState());
		return super.onEntityItemUpdate(stack, entity);
	}
	*/
}

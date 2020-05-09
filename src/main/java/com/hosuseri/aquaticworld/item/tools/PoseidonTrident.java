package com.hosuseri.aquaticworld.item.tools;

import java.util.List;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;
import com.hosuseri.aquaticworld.util.KeyboardHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class PoseidonTrident extends TridentItem {
	
	public static final String name = "poseidon_trident";
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).maxDamage(15).setNoRepair();
	private CooldownTracker lightning_cooldown = new CooldownTracker();
	private CooldownTracker regeneration_cooldown = new CooldownTracker();
	private Minecraft mc = Minecraft.getInstance();
	
	public PoseidonTrident() {
		super(props);
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
			tooltip.add(new StringTextComponent("Current lightning cooldown: " + lightning_cooldown.getCooldown(this, 0) / 10 + "s \n"
												+ "Current regeneration cooldown: " + regeneration_cooldown.getCooldown(this, 0) / 10 + "s \n"
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
		    if (!worldIn.isRemote && !lightning_cooldown.hasCooldown(this) && mc.objectMouseOver != null && mc.getRenderViewEntity() != null) {
		    	ServerWorld server = (ServerWorld) worldIn;	
		    	Entity viewpoint = mc.getRenderViewEntity();
		    	
		    	Vec3d target = this.rayTrace(viewpoint, mc.playerController.getBlockReachDistance(), 0).getHitVec();

	    	    LightningBoltEntity bolt = new LightningBoltEntity(worldIn, target.x, target.y, target.z, false);
	    	    server.addLightningBolt(bolt);
	    	    
	    	    lightning_cooldown.setCooldown(this, 400);
		    }
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	public RayTraceResult rayTrace(Entity entity, double playerReach, float partialTicks) {
        Vec3d eyePosition = entity.getEyePosition(partialTicks);
        Vec3d lookVector = entity.getLook(partialTicks);
        Vec3d traceEnd = eyePosition.add(lookVector.x * playerReach, lookVector.y * playerReach, lookVector.z * playerReach);

        RayTraceContext.FluidMode fluidView = RayTraceContext.FluidMode.NONE;
        RayTraceContext context = new RayTraceContext(eyePosition, traceEnd, RayTraceContext.BlockMode.OUTLINE, fluidView, entity);
        return entity.getEntityWorld().rayTraceBlocks(context);
    }
}

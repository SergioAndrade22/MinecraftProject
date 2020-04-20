package com.hosuseri.aquaticworld.event;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.util.LogClass;


@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT) // could be bus = Bus.MOD in case modifying a custom event; for things that happen server-only you use value = Dist.DEDICATED_SERVER
public class TestJumpEvent {
	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event){
		LogClass.info("testJumpEvent fired.");
		LivingEntity entity = event.getEntityLiving();
//		World world = entity.getEntityWorld();
//		world.setBlockState(entity.getPosition().add(0, 5, 0), BlockInit.aquamarine_block.getDefaultState());
		entity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 255));
		entity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5000, 255));
		entity.setGlowing(true);
	}
}

package com.hosuseri.aquaticworld.event;

import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.potion.Effects;
//import net.minecraft.potion.EffectInstance;
import com.hosuseri.aquaticworld.util.LogClass;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.hosuseri.aquaticworld.AquaticWorld;


@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT) // could be bus = Bus.MOD in case modifying a custom event; for things that happen server-only you use value = Dist.DEDICATED_SERVER
public class TestJumpEvent {
	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event){
		try {
			PlayerEntity player = (PlayerEntity) event.getEntity();
			LogClass.info("testJumpEvent fired.");
//			player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 2));
//			player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5000, 255));
			player.setGlowing(true);
		}
		catch(ClassCastException ex) {
			
		}
	}
}

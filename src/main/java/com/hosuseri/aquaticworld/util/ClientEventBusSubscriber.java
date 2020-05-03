package com.hosuseri.aquaticworld.util;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.WATER_COBBLESTONE_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WATER_STONE_DOOR.get(), RenderType.getCutout());
	}
}

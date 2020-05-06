package com.hosuseri.aquaticworld.util;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.world.dimension.DimensionInit;
import com.hosuseri.aquaticworld.world.dimension.leviathan.LeviathanDimension;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;;

@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

	private static final ResourceLocation LEVIATHAN_DIMENSION_TYPE = new ResourceLocation(AquaticWorld.MOD_ID, LeviathanDimension.name);
	
	@SubscribeEvent
	public static void registerDimensions(final RegisterDimensionsEvent event) {
		if(DimensionType.byName(LEVIATHAN_DIMENSION_TYPE) == null) {
			DimensionManager.registerDimension(LEVIATHAN_DIMENSION_TYPE, DimensionInit.LEVIATHAN_DIMENSION.get(), null, true);
		}
		
		LogClass.info("Dimensions registered");
	}
}

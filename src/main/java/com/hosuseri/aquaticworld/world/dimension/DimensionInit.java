package com.hosuseri.aquaticworld.world.dimension;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.world.dimension.leviathan.LeviathanDimension;
import com.hosuseri.aquaticworld.world.dimension.leviathan.LeviathanDimensionMask;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

	public static final DeferredRegister<ModDimension> MOD_DIMENSIONS= new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, AquaticWorld.MOD_ID);
	
	public static final RegistryObject<ModDimension> LEVIATHAN_DIMENSION  = MOD_DIMENSIONS.register(LeviathanDimension.name, () -> new LeviathanDimensionMask());
	
	
}

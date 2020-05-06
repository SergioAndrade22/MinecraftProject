package com.hosuseri.aquaticworld.tileentity;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.block.blocks.QuarryBlock;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes{
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, AquaticWorld.MOD_ID);
	
	public static final RegistryObject<TileEntityType<QuarryTileEntity>> quarry = TILE_ENTITY_TYPES.register(QuarryBlock.name, () -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));
}
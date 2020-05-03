package com.hosuseri.aquaticworld.block;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.blocks.*;
import com.hosuseri.aquaticworld.block.ores.*;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AquaticWorld.MOD_ID);
	
	public static final RegistryObject<Block> AQUAMARINE_ORE = BLOCKS.register(AquamarineOre.name, () -> new AquamarineOre());
	
	public static final RegistryObject<Block> BERYL_ORE = BLOCKS.register(BerylOre.name, () -> new BerylOre());
	
	public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register(OpalOre.name, () -> new OpalOre());
	
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = BLOCKS.register(AquamarineBlock.name, () -> new AquamarineBlock());
	
	public static final RegistryObject<Block> BERYL_BLOCK = BLOCKS.register(BerylBlock.name, () -> new BerylBlock());
	
	public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register(OpalBlock.name, () -> new OpalBlock());
	
	public static final RegistryObject<Block> WATER_STONE = BLOCKS.register(WaterStone.name, () -> new WaterStone());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE = BLOCKS.register(WaterCobblestone.name, () -> new WaterCobblestone());
	
	public static final RegistryObject<Block> QUARRY = BLOCKS.register(BlockQuarry.name, () -> new BlockQuarry());
}

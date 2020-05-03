package com.hosuseri.aquaticworld.block;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.block.blocks.*;
import com.hosuseri.aquaticworld.block.extras.*;
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
	
	public static final RegistryObject<Block> QUARRY = BLOCKS.register(BlockQuarry.name, () -> new BlockQuarry());
	
	public static final RegistryObject<Block> WATER_STONE = BLOCKS.register(WaterStone.name, () -> new WaterStone());
	
	public static final RegistryObject<Block> WATER_STONE_STAIRS = BLOCKS.register(WaterStoneStairs.name, () -> new WaterStoneStairs());
	
	public static final RegistryObject<Block> WATER_STONE_DOOR = BLOCKS.register(WaterStoneDoor.name, () -> new WaterStoneDoor());
	
	public static final RegistryObject<Block> WATER_STONE_FENCE = BLOCKS.register(WaterStoneFence.name, () -> new WaterStoneFence());
	
	public static final RegistryObject<Block> WATER_STONE_FENCE_GATE = BLOCKS.register(WaterStoneFenceGate.name, () -> new WaterStoneFenceGate());
	
	public static final RegistryObject<Block> WATER_STONE_BUTTON = BLOCKS.register(WaterStoneButton.name, () -> new WaterStoneButton());
	
	public static final RegistryObject<Block> WATER_STONE_PRESSURE_PLATE = BLOCKS.register(WaterStonePressurePlate.name, () -> new WaterStonePressurePlate());
	
	public static final RegistryObject<Block> WATER_STONE_SLAB = BLOCKS.register(WaterStoneSlab.name, () -> new WaterStoneSlab());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE = BLOCKS.register(WaterCobblestone.name, () -> new WaterCobblestone());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_STAIRS = BLOCKS.register(WaterCobblestoneStairs.name, () -> new WaterCobblestoneStairs());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_DOOR = BLOCKS.register(WaterCobblestoneDoor.name, () -> new WaterCobblestoneDoor());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_BUTTON = BLOCKS.register(WaterCobblestoneButton.name, () -> new WaterCobblestoneButton());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_FENCE = BLOCKS.register(WaterCobblestoneFence.name, () -> new WaterCobblestoneFence());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_FENCE_GATE = BLOCKS.register(WaterCobblestoneFenceGate.name, () -> new WaterCobblestoneFenceGate());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register(WaterCobblestonePressurePlate.name, () -> new WaterCobblestonePressurePlate());
	
	public static final RegistryObject<Block> WATER_COBBLESTONE_SLAB = BLOCKS.register(WaterCobblestoneSlab.name, () -> new WaterCobblestoneSlab());
}

package com.hosuseri.aquaticworld.world.gen;

import com.hosuseri.aquaticworld.block.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	// ore and structures = feature
	public static void generateOre() {
		// CountRangeConfig(how common it is 20 is more common than coal, from 0 how many blocks above, from world height how many blocks below, maximum height can generate - top offset)
		ConfiguredPlacement<?> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 5, 5, 25));
		// OreFeatureConfig(on which type of block it generates, the block to generate, the number of ores in the vein)
		OreFeatureConfig oreConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.aquamarine_block.getDefaultState(), 5);
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome.getCategory() == Biome.Category.OCEAN){
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(oreConfig).withPlacement(customConfig));
			}
		}
	}
}

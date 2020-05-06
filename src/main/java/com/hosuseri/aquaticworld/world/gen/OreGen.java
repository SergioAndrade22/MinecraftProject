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
	
	// OreFeatureConfig(on which type of block it generates, the block to generate, the number of ores in the vein)
	private static OreFeatureConfig aquamarine_config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.AQUAMARINE_ORE.get().getDefaultState(), 5);
	private static OreFeatureConfig beryl_config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BERYL_ORE.get().getDefaultState(), 4);
	private static OreFeatureConfig opal_config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.OPAL_ORE.get().getDefaultState(), 3);

	// CountRangeConfig(how common it is 20 is more common than coal, from 0 how many blocks above, from world height how many blocks below, maximum height can generate - top offset)
	private static ConfiguredPlacement<?> aquamarine_placement = Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 5, 10, 62));
	private static ConfiguredPlacement<?> beryl_placement = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 5, 10, 46));
	private static ConfiguredPlacement<?> opal_placement = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 5, 10, 26));
	
	// ore and structures = feature
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {			
			if (biome.getCategory() == Biome.Category.OCEAN){
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(aquamarine_config).withPlacement(aquamarine_placement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(beryl_config).withPlacement(beryl_placement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(opal_config).withPlacement(opal_placement));
			}
		}
	}
}

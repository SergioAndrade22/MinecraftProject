package com.hosuseri.aquaticworld.world.biome;

import com.hosuseri.aquaticworld.block.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.SeaGrassConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.feature.structure.OceanRuinConfig;
import net.minecraft.world.gen.feature.structure.ShipwreckConfig;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.feature.structure.OceanRuinStructure;

public class HiddenSeaBiome extends Biome {

	private static final SurfaceBuilderConfig builderConfig = new SurfaceBuilderConfig(Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), BlockInit.WATER_STONE.get().getDefaultState());

	public static final String name = "hidden_sea_biome";

	// .downfall(float) indicates how often it rains
	private static final Builder builder = new Biome.Builder().precipitation(RainType.NONE).scale(0.9f)
			.temperature(0.2f).waterColor(3089572).waterFogColor(1320056).downfall(0f)
			.surfaceBuilder(SurfaceBuilder.DEFAULT, builderConfig).category(Category.OCEAN).depth(-1.85f)
			.parent("deep_ocean"); // indicates how up and lower your biomes generates

	// use the DefaultBiomeFeatures class to look for possible additions
	public HiddenSeaBiome() {
		super(builder);
		addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CANYON, new ProbabilityConfig(0.022345f)));
		addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.KELP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(120, 80.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
		addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(48, 0.8D)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		DefaultBiomeFeatures.addExtraKelp(this);
		addStructure(Feature.OCEAN_MONUMENT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
		addStructure(Feature.SHIPWRECK.withConfiguration(new ShipwreckConfig(false)));
		addStructure(Feature.OCEAN_RUIN.withConfiguration(new OceanRuinConfig(OceanRuinStructure.Type.WARM, 0.3F, 0.9F)));
		addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 40, 2, 4));
		addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.COD, 50, 5, 15));
		addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.DOLPHIN, 35, 3, 10));

	}

}

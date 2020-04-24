package com.hosuseri.aquaticworld.world.gen;

import java.io.FileWriter;
import java.io.IOException;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.util.LogClass;

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
		// OreFeatureConfig(on which type of block it generates, the block to generate, the number of ores in the vein)
		for (Biome biome : ForgeRegistries.BIOMES) {			
			OreFeatureConfig oreConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.aquamarine_ore.getDefaultState(), 5);
			if (biome.getCategory() == Biome.Category.OCEAN){
				int height = (int) biome.getSurfaceBuilder().getConfig().getTop().getFluidState().getFluid().getHeight(biome.getSurfaceBuilder().getConfig().getTop().getFluidState());
				// CountRangeConfig(how common it is 20 is more common than coal, from 0 how many blocks above, from world height how many blocks below, maximum height can generate - top offset)
				ConfiguredPlacement<?> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 15, height));
				try {
				      FileWriter myObj = new FileWriter("C:\\Users\\Hola\\Desktop\\filename.txt");
				      myObj.write("La altura máxima es: " + height);
				      myObj.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				LogClass.info("LA ALTURA DE GENERACION ES: " + height);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(oreConfig).withPlacement(customConfig));
			}
		}
	}
}

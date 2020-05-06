package com.hosuseri.aquaticworld.world.biome;

import com.hosuseri.aquaticworld.AquaticWorld;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {

	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, AquaticWorld.MOD_ID);
	
	public static final RegistryObject<Biome> HIDDEN_SEA = BIOMES.register(HiddenSeaBiome.name, () -> new HiddenSeaBiome());
	
	public static void registerBiomes() {
		registerBiome(HIDDEN_SEA.get(), Type.OCEAN, Type.OVERWORLD);
	}
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 100));
		BiomeManager.addSpawnBiome(biome);
	}
	
}

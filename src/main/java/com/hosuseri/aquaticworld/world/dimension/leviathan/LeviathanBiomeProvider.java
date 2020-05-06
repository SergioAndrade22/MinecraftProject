package com.hosuseri.aquaticworld.world.dimension.leviathan;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.hosuseri.aquaticworld.world.biome.BiomeInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class LeviathanBiomeProvider extends BiomeProvider {

	private static Random rand;
	
	private static final Set<Biome> biomesList = ImmutableSet.of(BiomeInit.HIDDEN_SEA.get());
	
	public LeviathanBiomeProvider() {
		super(biomesList);
		rand = new Random();
	}

	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
		return biomesList.iterator().next();	
	}

}

package com.hosuseri.aquaticworld.item.items;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FructusMare extends Item {
	
	private static Properties props = new Item.Properties().group(AquaticWorldItemGroup.instance).food(createBuilder().build());
	
	public FructusMare() {
		super(props);
		setRegistryName("fructus_mare");
	}
			
	private static Food.Builder createBuilder(){
		Food.Builder builder = new Food.Builder();

		builder = builder.hunger(6);
		builder = builder.fastToEat();
		builder = builder.saturation(3.0f);
		builder = builder.setAlwaysEdible();
		builder = builder.effect(() -> new EffectInstance(Effects.WATER_BREATHING, 4800, 5), 1.0f);
		builder = builder.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 4800, 5), 1.0f);
		builder = builder.effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 4800, 5), 1.0f);
		return builder;
	}

}

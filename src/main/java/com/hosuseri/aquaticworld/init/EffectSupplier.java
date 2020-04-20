package com.hosuseri.aquaticworld.init;

import java.util.function.Supplier;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

class EffectSupplier<E extends EffectInstance> implements Supplier<EffectInstance>{
	private Effect desired_effect = null;
	private int duration = 0;
	private int level = 0; 
	
	public EffectSupplier(Effect de, int d, int l){
		super();
		desired_effect = de;
		duration = d;
		level = l;
	}
	
	public EffectInstance get() {
		return new EffectInstance(desired_effect, duration, level);
	}
}
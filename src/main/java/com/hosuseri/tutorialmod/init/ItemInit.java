package com.hosuseri.tutorialmod.init;

import java.util.function.Supplier;
import com.hosuseri.tutorialmod.TutorialMod;
import com.hosuseri.tutorialmod.TutorialMod.TutorialItemGroup;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TutorialMod.MOD_ID)
public class ItemInit {
	
	public static final Item aquamarine_item = null;
	public static final Item fructus_mare = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		TutorialMod.instance.log("Begin item registry");
		
		Item.Properties aquamarine_props = new Item.Properties();
		aquamarine_props.group(TutorialItemGroup.instance);
		aquamarine_props.maxStackSize(16);
		
		Item aquamarine_item = new Item(aquamarine_props);
		aquamarine_item.setRegistryName("aquamarine_item");
		event.getRegistry().register(aquamarine_item); //the name here needs to be exactly equal to the name of the variable
		
		Item.Properties fructus_mare_properties = new Item.Properties();
		fructus_mare_properties.group(TutorialItemGroup.instance);
		
		EffectSupplier<EffectInstance> wb_supp = new EffectSupplier<EffectInstance>(Effects.WATER_BREATHING);
		EffectSupplier<EffectInstance> nv_supp = new EffectSupplier<EffectInstance>(Effects.NIGHT_VISION);
		EffectSupplier<EffectInstance> dg_supp = new EffectSupplier<EffectInstance>(Effects.DOLPHINS_GRACE);
		fructus_mare_properties.food(new Food.Builder().hunger(6).fastToEat().saturation(3.0f).setAlwaysEdible().effect(wb_supp, 1.0f).effect(nv_supp, 1.0f).effect(dg_supp, 1.0f).build());
		
		Item fructus_mare_item = new Item(fructus_mare_properties);
		fructus_mare_item.setRegistryName("fructus_mare");
		
		event.getRegistry().register(fructus_mare_item);
		TutorialMod.instance.log("Finish item registry");
	}
	
	public static class EffectSupplier<E extends EffectInstance> implements Supplier<EffectInstance>{
		private Effect desired_effect = null;
		
		public EffectSupplier(Effect de){
			super();
			desired_effect = de;
		}
		
		public EffectInstance get() {
			return new EffectInstance(desired_effect, 4800, 5);
		}
	}
}

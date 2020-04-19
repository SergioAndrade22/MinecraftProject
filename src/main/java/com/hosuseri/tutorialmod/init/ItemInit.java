package com.hosuseri.tutorialmod.init;

import com.hosuseri.tutorialmod.TutorialMod;
import com.hosuseri.tutorialmod.TutorialMod.TutorialItemGroup;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TutorialMod.MOD_ID)
public class ItemInit {	
	public static Item aquamarine = null;
	public static Item fructus_mare = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		TutorialMod.log("Begin item registry");
		
		Item.Properties aquamarine_props = new Item.Properties();
		aquamarine_props.group(TutorialItemGroup.instance);
		aquamarine_props.maxStackSize(16);
		
		aquamarine = new Item(aquamarine_props);
		aquamarine.setRegistryName("aquamarine");
		event.getRegistry().register(aquamarine);
		
		Item.Properties fructus_mare_properties = new Item.Properties();
		fructus_mare_properties.group(TutorialItemGroup.instance);		
		
		Food.Builder builder = createBuilder();		
		
		fructus_mare_properties.food(builder.build());
		
		fructus_mare = new Item(fructus_mare_properties);
		fructus_mare.setRegistryName("fructus_mare");
		
		event.getRegistry().register(fructus_mare);
		TutorialMod.log("Finish item registry");
	}
	
	private static Food.Builder createBuilder(){
		Food.Builder builder = new Food.Builder();

		builder = builder.hunger(6);
		builder = builder.fastToEat();
		builder = builder.saturation(3.0f);
		builder = builder.setAlwaysEdible();
		builder = builder.effect(new EffectSupplier<EffectInstance>(Effects.WATER_BREATHING, 4800, 5), 1.0f);
		builder = builder.effect(new EffectSupplier<EffectInstance>(Effects.NIGHT_VISION, 4800, 5), 1.0f);
		builder = builder.effect(new EffectSupplier<EffectInstance>(Effects.DOLPHINS_GRACE, 4800, 5), 1.0f);
		return builder;
	}
}

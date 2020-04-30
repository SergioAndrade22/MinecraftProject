package com.hosuseri.aquaticworld.item;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.util.LogClass;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AquaticWorld.MOD_ID)
public class ItemInit {	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		LogClass.debug("Begin item registry");
		
		itemRegistry(event);
		toolRegistry(event);
		armorRegistry(event);
		
		LogClass.debug("Finish item registry");
	}
	
	private static void itemRegistry(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(ItemList.aquamarine);
		
		event.getRegistry().register(ItemList.beryl);
		
		event.getRegistry().register(ItemList.opal);
		
		event.getRegistry().register(ItemList.scale);
		
		event.getRegistry().register(ItemList.pearl);
		
		event.getRegistry().register(ItemList.sea_tear);
		
		event.getRegistry().register(ItemList.clam);
		
		event.getRegistry().register(ItemList.fructus_mare);
		
		event.getRegistry().register(ItemList.poseidon_trident);
	}
	
	private static void toolRegistry(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(ToolList.aquamarine_sword);
		
		event.getRegistry().register(ToolList.aquamarine_shovel);
		
		event.getRegistry().register(ToolList.aquamarine_pickaxe);
		
		event.getRegistry().register(ToolList.aquamarine_hoe);
		
		event.getRegistry().register(ToolList.aquamarine_axe);
	}
	
	private static void armorRegistry(final RegistryEvent.Register<Item> event) {
		// Boots
		event.getRegistry().register(ArmorList.aquamarine_boots);
		event.getRegistry().register(ArmorList.beryl_boots);
		event.getRegistry().register(ArmorList.opal_boots);
		
		// Leggings
		event.getRegistry().register(ArmorList.aquamarine_leggings);
		event.getRegistry().register(ArmorList.beryl_leggings);
		event.getRegistry().register(ArmorList.opal_leggings);
		
		// Chestplates
		event.getRegistry().register(ArmorList.aquamarine_chestplate);
		event.getRegistry().register(ArmorList.beryl_chestplate);
		event.getRegistry().register(ArmorList.opal_chestplate);
		
		// Helmets
		event.getRegistry().register(ArmorList.aquamarine_helmet);
		event.getRegistry().register(ArmorList.beryl_helmet);
		event.getRegistry().register(ArmorList.opal_helmet);
	}
}
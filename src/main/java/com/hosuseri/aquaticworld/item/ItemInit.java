package com.hosuseri.aquaticworld.item;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.util.LogClass;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;
import com.hosuseri.aquaticworld.item.items.*;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AquaticWorld.MOD_ID)
public class ItemInit {	
	public static Item aquamarine = null;
	public static Item fructus_mare = null;
	public static Item poseidon_trident = null;

	public static Item aquamarine_sword = null;
	public static Item aquamarine_pickaxe = null;
	public static Item aquamarine_shovel = null;
	public static Item aquamarine_hoe = null;
	public static Item aquamarine_axe = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		LogClass.debug("Begin item registry");
		
		itemRegistry(event);
		
		toolRegistry(event);
		
		LogClass.debug("Finish item registry");
	}
	
	private static void itemRegistry(final RegistryEvent.Register<Item> event) {
		Item.Properties aquamarine_props = new Item.Properties();
		aquamarine_props.group(AquaticWorldItemGroup.instance);
		aquamarine_props.maxStackSize(16);
		
		aquamarine = new Item(aquamarine_props);
		aquamarine.setRegistryName("aquamarine");
		event.getRegistry().register(aquamarine);
		
		Item.Properties fructus_mare_properties = new Item.Properties();
		fructus_mare_properties.group(AquaticWorldItemGroup.instance);		
		
		Food.Builder builder = createBuilder();		
		
		fructus_mare_properties.food(builder.build());
		
		fructus_mare = new Item(fructus_mare_properties);
		fructus_mare.setRegistryName("fructus_mare");
		
		event.getRegistry().register(fructus_mare);
		
		Item.Properties poseidon_trident_props = new Item.Properties();
		poseidon_trident_props.group(AquaticWorldItemGroup.instance);
		poseidon_trident_props.defaultMaxDamage(10);
		poseidon_trident_props.setNoRepair();
		
		poseidon_trident = new PoseidonTrident(poseidon_trident_props);
		poseidon_trident.setRegistryName("poseidon_trident");
		
		event.getRegistry().register(poseidon_trident);
	}
	
	private static void toolRegistry(final RegistryEvent.Register<Item> event) {	
		Item.Properties tool_props = new Item.Properties();
		tool_props.group(AquaticWorldItemGroup.instance);
		tool_props.maxStackSize(1);
		
		aquamarine_sword = new SwordItem(ModItemTier.AQUAMARINE, 8, -1.5f, tool_props);
		aquamarine_sword.setRegistryName("aquamarine_sword");
		event.getRegistry().register(aquamarine_sword);
		
		aquamarine_shovel = new ShovelItem(ModItemTier.AQUAMARINE, 0, -3.2f, tool_props);
		aquamarine_shovel.setRegistryName("aquamarine_shovel");
		event.getRegistry().register(aquamarine_shovel);
		
		aquamarine_pickaxe = new PickaxeItem(ModItemTier.AQUAMARINE, 0, -3.2f, tool_props);
		aquamarine_pickaxe.setRegistryName("aquamarine_pickaxe");
		event.getRegistry().register(aquamarine_pickaxe);
		
		aquamarine_hoe = new HoeItem(ModItemTier.AQUAMARINE, -3.2f, tool_props);
		aquamarine_hoe.setRegistryName("aquamarine_hoe");
		event.getRegistry().register(aquamarine_hoe);
		
		aquamarine_axe = new AxeItem(ModItemTier.AQUAMARINE, 11, -2.25f, tool_props);
		aquamarine_axe.setRegistryName("aquamarine_axe");
		event.getRegistry().register(aquamarine_axe);
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
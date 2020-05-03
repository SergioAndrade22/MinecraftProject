package com.hosuseri.aquaticworld.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import com.hosuseri.aquaticworld.AquaticWorld;
import com.hosuseri.aquaticworld.item.items.*;
import com.hosuseri.aquaticworld.item.tools.*;
import com.hosuseri.aquaticworld.item.armors.*;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AquaticWorld.MOD_ID);
	
	public static final RegistryObject<Item> PEARL = ITEMS.register(Pearl.name, () -> new Pearl());
	public static final RegistryObject<Item> SCALE = ITEMS.register(Scale.name, () -> new Scale());
	public static final RegistryObject<Item> SEA_TEAR = ITEMS.register(SeaTear.name, () -> new SeaTear());
	public static final RegistryObject<Item> CLAM = ITEMS.register(Clam.name, () -> new Clam());
	public static final RegistryObject<Item> FRUCTUS_MARE = ITEMS.register(FructusMare.name, () -> new FructusMare());
	public static final RegistryObject<Item> PRISMARINE_STICK = ITEMS.register(PrismarineStick.name, () -> new PrismarineStick());
	
	public static final RegistryObject<Item> POSEIDON_TRIDENT = ITEMS.register(PoseidonTrident.name, () -> new PoseidonTrident());
	
	public static final RegistryObject<Item> AQUAMARINE = ITEMS.register(Aquamarine.name, () -> new Aquamarine());
	public static final RegistryObject<Item> AQUAMARINE_STICK = ITEMS.register(AquamarineStick.name, () -> new AquamarineStick());
	public static final RegistryObject<Item> AQUAMARINE_BOOTS = ITEMS.register(AquamarineBoots.name, () -> new AquamarineBoots());
	public static final RegistryObject<Item> AQUAMARINE_LEGGINGS = ITEMS.register(AquamarineLeggings.name, () -> new AquamarineLeggings());
	public static final RegistryObject<Item> AQUAMARINE_CHESTPLATE = ITEMS.register(AquamarineChestplate.name, () -> new AquamarineChestplate());
	public static final RegistryObject<Item> AQUAMARINE_HELMET = ITEMS.register(AquamarineHelmet.name, () -> new AquamarineHelmet());
	public static final RegistryObject<Item> AQUAMARINE_SWORD = ITEMS.register(AquamarineSword.name, () -> new AquamarineSword());
	public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register(AquamarinePickaxe.name, () -> new AquamarinePickaxe());
	public static final RegistryObject<Item> AQUAMARINE_AXE = ITEMS.register(AquamarineAxe.name, () -> new AquamarineAxe());
	public static final RegistryObject<Item> AQUAMARINE_SHOVEL = ITEMS.register(AquamarineShovel.name, () -> new AquamarineShovel());
	public static final RegistryObject<Item> AQUAMARINE_HOE = ITEMS.register(AquamarineHoe.name, () -> new AquamarineHoe());
	
	public static final RegistryObject<Item> BERYL = ITEMS.register(Beryl.name, () -> new Beryl());
	public static final RegistryObject<Item> BERYL_STiCK = ITEMS.register(BerylStick.name, () -> new BerylStick());
	public static final RegistryObject<Item> BERYL_BOOTS = ITEMS.register(BerylBoots.name, () -> new BerylBoots());
	public static final RegistryObject<Item> BERYL_LEGGINGS = ITEMS.register(BerylLeggings.name, () -> new BerylLeggings());
	public static final RegistryObject<Item> BERYL_CHESTPLATE = ITEMS.register(BerylChestplate.name, () -> new BerylChestplate());
	public static final RegistryObject<Item> BERYL_HELMET = ITEMS.register(BerylHelmet.name, () -> new BerylHelmet());
	public static final RegistryObject<Item> BERYL_SWORD = ITEMS.register(BerylSword.name, () -> new BerylSword());
	public static final RegistryObject<Item> BERYL_PICKAXE = ITEMS.register(BerylPickaxe.name, () -> new BerylPickaxe());
	public static final RegistryObject<Item> BERYL_AXE = ITEMS.register(BerylAxe.name, () -> new BerylAxe());
	public static final RegistryObject<Item> BERYL_SHOVEL = ITEMS.register(BerylShovel.name, () -> new BerylShovel());
	public static final RegistryObject<Item> BERYL_HOE = ITEMS.register(BerylHoe.name, () -> new BerylHoe());
	
	public static final RegistryObject<Item> OPAL = ITEMS.register(Opal.name, () -> new Opal());
	public static final RegistryObject<Item> OPAL_BOOTS = ITEMS.register(OpalBoots.name, () -> new OpalBoots());
	public static final RegistryObject<Item> OPAL_LEGGINGS = ITEMS.register(OpalLeggings.name, () -> new OpalLeggings());
	public static final RegistryObject<Item> OPAL_CHESTPLATE = ITEMS.register(OpalChestplate.name, () -> new OpalChestplate());
	public static final RegistryObject<Item> OPAL_HELMET = ITEMS.register(OpalHelmet.name, () -> new OpalHelmet());
	public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register(OpalSword.name, () -> new OpalSword());
	public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register(OpalPickaxe.name, () -> new OpalPickaxe());
	public static final RegistryObject<Item> OPAL_AXE = ITEMS.register(OpalAxe.name, () -> new OpalAxe());
	public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register(OpalShovel.name, () -> new OpalShovel());
	public static final RegistryObject<Item> OPAL_HOE = ITEMS.register(OpalHoe.name, () -> new OpalHoe());
}
package com.hosuseri.aquaticworld;

import com.hosuseri.aquaticworld.block.BlockInit;
import com.hosuseri.aquaticworld.item.ItemInit;
import com.hosuseri.aquaticworld.tileentity.ModTileEntityTypes;
import com.hosuseri.aquaticworld.util.ClientEventBusSubscriber;
import com.hosuseri.aquaticworld.world.biome.BiomeInit;
import com.hosuseri.aquaticworld.world.dimension.DimensionInit;
import com.hosuseri.aquaticworld.world.gen.OreGen;

import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("aquaticworld")
@Mod.EventBusSubscriber(modid = AquaticWorld.MOD_ID, bus= Bus.MOD)
public class AquaticWorld{
    
    public static final String MOD_ID = "aquaticworld";

    public AquaticWorld() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
    		registry.register(block.asItem());
    	});
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	OreGen.generateOre();
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent<Biome> event) {
    	BiomeInit.registerBiomes();
    }
    
    private void setup(final FMLCommonSetupEvent event){
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	ClientEventBusSubscriber.clientSetup(event);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }
}

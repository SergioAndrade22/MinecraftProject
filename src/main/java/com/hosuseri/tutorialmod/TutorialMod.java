package com.hosuseri.tutorialmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("tutorialmod")
public class TutorialMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID = "tutorialmod";
    
    public static TutorialMod instance;

    public TutorialMod() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        
        instance = this;
    }

    private void setup(final FMLCommonSetupEvent event){
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }
    
    public static void log(String msg) {
    	LOGGER.debug(msg);
    }
}

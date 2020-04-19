package com.hosuseri.tutorialmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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

import com.hosuseri.tutorialmod.init.BlockInit;

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
    
    public static class TutorialItemGroup extends ItemGroup{
    	public static final TutorialItemGroup instance = new TutorialItemGroup(ItemGroup.GROUPS.length, "aquatic_world_tab"); 
    	
    	private TutorialItemGroup(int index, String label) {
    		super(index, label);
    	}
    	
    	public ItemStack createIcon() {
    		return new ItemStack(BlockInit.aquamarine_block);
    	}
    }
}

package com.hosuseri.aquaticworld.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogClass{

    private static final Logger LOGGER = LogManager.getLogger();
	
    public static void debug(String msg) {
    	LOGGER.debug(msg);
    }
    
    public static void info(String info) {
    	LOGGER.info(info);
    }
}

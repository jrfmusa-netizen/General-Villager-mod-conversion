package com.mystery2010yt.general_villager;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralVillagerMod implements ModInitializer {
    public static final String MOD_ID = "general_villager";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing General Villager Mod!");
        ModEntities.registerModEntities();
    }
}
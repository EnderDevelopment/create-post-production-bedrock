package com.enderdevelopment.createport;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatePortMod implements ModInitializer {
    public static final String MOD_ID = "createport";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Create Port mod initialized");
    }
}
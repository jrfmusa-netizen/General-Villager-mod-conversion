package com.mystery2010yt.general_villager.client;

import com.mystery2010yt.general_villager.GeneralVillagerMod;
import com.mystery2010yt.general_villager.entity.GeneralVillagerEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class GeneralVillagerClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GeneralVillagerMod.LOGGER.info("Initializing General Villager Client Mod!");

        // 1. Register the Model Layer (Crucial for the placeholder model)
        EntityModelLayerRegistry.registerModelLayer(
                GeneralVillagerModel.MODEL_LAYER, 
                GeneralVillagerModel::getTexturedModelData
        );

        // 2. Register the Renderer
        EntityRendererRegistry.register(
                GeneralVillagerMod.GENERAL_VILLAGER,
                GeneralVillagerRenderer::new
        );
    }
}
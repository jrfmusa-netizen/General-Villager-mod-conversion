package com.mystery2010yt.general_villager.client;

import com.mystery2010yt.general_villager.entity.GeneralVillagerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GeneralVillagerRenderer extends MobEntityRenderer<GeneralVillagerEntity, GeneralVillagerModel> {
    
    // Using a vanilla texture as a placeholder until we add your custom PNGs
    private static final Identifier TEXTURE = Identifier.of("minecraft", "textures/entity/villager/villager.png");

    public GeneralVillagerRenderer(EntityRendererFactory.Context context) {
        super(context, new GeneralVillagerModel(context.getPart(GeneralVillagerModel.MODEL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GeneralVillagerEntity entity) {
        return TEXTURE;
    }
}
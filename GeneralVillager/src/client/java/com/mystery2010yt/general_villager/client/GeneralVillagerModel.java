package com.mystery2010yt.general_villager.client;

import com.mystery2010yt.general_villager.entity.GeneralVillagerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.util.Identifier;

public class GeneralVillagerModel extends EntityModel<GeneralVillagerEntity> {
    
    // This is the unique ID for our model layer
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
            Identifier.of("general_villager", "general_villager"), 
            "main"
    );

    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart head;

    public GeneralVillagerModel(ModelPart root) {
        super(root);
        this.root = root;
        this.body = root.getChild(EntityModelPartNames.BODY);
        this.head = this.body.getChild(EntityModelPartNames.HEAD);
    }

    // This builds the placeholder geometry
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        
        // Create a simple body
        ModelPartData body = modelPartData.addChild(
                EntityModelPartNames.BODY, 
                ModelPartBuilder.create().uv(16, 20).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), 
                ModelTransform.pivot(0.0F, 12.0F, 0.0F)
        );
        
        // Create a simple head attached to the body
        ModelPartData head = body.addChild(
                EntityModelPartNames.HEAD, 
                ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), 
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(GeneralVillagerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        // We will add walking and looking animations here later!
    }
}
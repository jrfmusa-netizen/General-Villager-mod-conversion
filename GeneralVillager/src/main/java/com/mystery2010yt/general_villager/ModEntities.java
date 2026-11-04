package com.mystery2010yt.general_villager;

import com.mystery2010yt.general_villager.entity.GeneralVillagerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<GeneralVillagerEntity> GENERAL_VILLAGER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(GeneralVillagerMod.MOD_ID, "general_villager"),
            EntityType.Builder.create(GeneralVillagerEntity::new, SpawnGroup.MISC)
                    .dimensions(0.6f, 1.9f)
                    .build("general_villager")
    );

    public static void registerModEntities() {
        GeneralVillagerMod.LOGGER.info("Registering Mod Entities for " + GeneralVillagerMod.MOD_ID);
    }
}
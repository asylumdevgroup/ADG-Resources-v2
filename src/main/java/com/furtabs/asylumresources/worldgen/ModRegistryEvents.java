package com.furtabs.asylumresources.worldgen;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.minecraft.core.registries.Registries;

public class ModRegistryEvents {
    @SubscribeEvent
    public static void registerFeatures(RegisterEvent event) {
        event.register(Registries.CONFIGURED_FEATURE, helper -> {
            ModConfiguredFeatures.bootstrap(helper);
        });
    }
} 
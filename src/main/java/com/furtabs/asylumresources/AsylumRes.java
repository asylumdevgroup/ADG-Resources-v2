package com.furtabs.asylumresources;

import com.mojang.logging.LogUtils;
import com.furtabs.asylumresources.block.ModBlocks;
import com.furtabs.asylumresources.item.ModCreativeModTabs;
import com.furtabs.asylumresources.item.ModItems;
import com.furtabs.asylumresources.loot.ModLootModifiers;
import com.furtabs.asylumresources.worldgen.ModConfiguredFeatures;
import org.slf4j.Logger;
import net.neoforged.fml.common.Mod;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(AsylumRes.MOD_ID)
public class AsylumRes {
    public static final String MOD_ID = "asylumresources";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AsylumRes() {
        // Register a listener for the RegisterEvent
        NeoForge.EVENT_BUS.addListener(this::registerFeatures);
    }

    private void registerFeatures(RegisterEvent event) {
        event.register(Registries.CONFIGURED_FEATURE, helper -> {
            ModConfiguredFeatures.bootstrap(helper);
        });
    }
}

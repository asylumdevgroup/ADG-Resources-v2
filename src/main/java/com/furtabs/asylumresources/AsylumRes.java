package com.furtabs.asylumresources;

import com.mojang.logging.LogUtils;
import com.furtabs.asylumresources.block.ModBlocks;
import com.furtabs.asylumresources.item.ModCreativeModTabs;
import com.furtabs.asylumresources.item.ModItems;
import com.furtabs.asylumresources.loot.ModLootModifiers;
import com.furtabs.asylumresources.worldgen.ModConfiguredFeatures;
import com.furtabs.asylumresources.worldgen.ModRegistryEvents;
import org.slf4j.Logger;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(AsylumRes.MOD_ID)
public class AsylumRes {
    public static final String MOD_ID = "asylumresources";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AsylumRes(IEventBus modEventBus) {
        // Register items
        ModItems.ITEMS.register(modEventBus);
        
        // Register blocks
        ModBlocks.BLOCKS.register(modEventBus);
        
        // Register creative tabs
        ModCreativeModTabs.TABS.register(modEventBus);
        
        LOGGER.info("Asylum Resources mod initialized!");
    }
}

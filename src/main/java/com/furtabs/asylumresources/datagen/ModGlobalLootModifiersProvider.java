package com.furtabs.asylumresources.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> providerFuture) {
        super(output, providerFuture, com.furtabs.asylumresources.AsylumRes.MOD_ID);
    }

    @Override
    protected void start() {

    }
}

package com.furtabs.asylumresources.datagen;

import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import java.util.concurrent.CompletableFuture;
import java.io.IOException;
import net.minecraft.data.CachedOutput;

public class ModBlockStateProvider implements DataProvider {
    private final PackOutput output;

    public ModBlockStateProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public java.util.concurrent.CompletableFuture<?> run(net.minecraft.data.CachedOutput cache) {
        // TODO: Implement blockstate generation
        return java.util.concurrent.CompletableFuture.completedFuture(null);
    }

    @Override
    public String getName() {
        return "Mod BlockStates";
    }
}

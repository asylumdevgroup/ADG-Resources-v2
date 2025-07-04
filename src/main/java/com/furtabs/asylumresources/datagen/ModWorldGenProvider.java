package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.worldgen.ModBiomeModifiers;
import com.furtabs.asylumresources.worldgen.ModConfiguredFeatures;
import com.furtabs.asylumresources.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::datagenBootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::datagenBootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(com.furtabs.asylumresources.AsylumRes.MOD_ID));
    }
}

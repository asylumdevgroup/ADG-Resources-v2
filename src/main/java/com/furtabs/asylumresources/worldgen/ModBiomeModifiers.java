package com.furtabs.asylumresources.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.minecraft.core.HolderGetter;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ORES = registerKey("add_ores");
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_ALUMINUM_ORE = registerKey("add_aluminum_ore");
    public static final ResourceKey<BiomeModifier> ADD_APATITE_ORE = registerKey("add_apatite_ore");
    public static final ResourceKey<BiomeModifier> ADD_CINNABAR_ORE = registerKey("add_cinnabar_ore");
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = registerKey("add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = registerKey("add_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_OSMIUM_ORE = registerKey("add_osmium_ore");
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE = registerKey("add_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_ZINC_ORE = registerKey("add_zinc_ore");

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(net.neoforged.neoforge.registries.NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, name));
    }

    // Datagen bootstrap: add our ore placed features to all overworld biomes at the UNDERGROUND_ORES step
    public static void datagenBootstrap(net.minecraft.data.worldgen.BootstrapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<net.minecraft.world.level.levelgen.placement.PlacedFeature> placed = context.lookup(Registries.PLACED_FEATURE);

        // Target: all overworld biomes via tag
        HolderSet<Biome> overworldTag = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        // Register one modifier per ore (single dimension, all biomes)
        context.register(ADD_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.ALUMINUM_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_APATITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.APATITE_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.CINNABAR_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.LEAD_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.NICKEL_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_OSMIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.OSMIUM_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.PLATINUM_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.SILVER_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.TIN_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.URANIUM_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
            overworldTag,
            HolderSet.direct(placed.getOrThrow(ModPlacedFeatures.ZINC_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
}
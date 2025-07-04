package com.furtabs.asylumresources.worldgen;

import com.furtabs.asylumresources.AsylumRes;
import com.furtabs.asylumresources.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.registries.RegisterEvent.RegisterHelper;
import net.minecraft.data.worldgen.BootstrapContext;

import java.util.List;

public class ModConfiguredFeatures {
    // ResourceKeys for each ore
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "aluminum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> APATITE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "apatite_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> CINNABAR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "cinnabar_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "nickel_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "osmium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "platinum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "sapphire_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "silver_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "tin_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "uranium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AsylumRes.MOD_ID, "zinc_ore"));

    public static void bootstrap(RegisterHelper<ConfiguredFeature<?, ?>> helper) {
        // Aluminum Ore
        helper.register(ALUMINUM_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.ALUMINUM_ORE.defaultBlockState()
                    )
                ),
                9
            )
        ));
        // Apatite Ore
        helper.register(APATITE_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.APATITE_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        // Cinnabar Ore
        helper.register(CINNABAR_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.CINNABAR_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        // Lead Ore
        helper.register(LEAD_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.LEAD_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        // Nickel Ore
        helper.register(NICKEL_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.NICKEL_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        // Osmium Ore
        helper.register(OSMIUM_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.OSMIUM_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        // Platinum Ore
        helper.register(PLATINUM_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.PLATINUM_ORE.defaultBlockState()
                    )
                ),
                6
            )
        ));
        // Ruby Ore
        helper.register(RUBY_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.RUBY_ORE.defaultBlockState()
                    )
                ),
                5
            )
        ));
        // Sapphire Ore
        helper.register(SAPPHIRE_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.SAPPHIRE_ORE.defaultBlockState()
                    )
                ),
                5
            )
        ));
        // Silver Ore
        helper.register(SILVER_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.SILVER_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        // Tin Ore
        helper.register(TIN_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.TIN_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        // Uranium Ore
        helper.register(URANIUM_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.URANIUM_ORE.defaultBlockState()
                    )
                ),
                4
            )
        ));
        // Zinc Ore
        helper.register(ZINC_ORE.location(), new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.ZINC_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
    }

    // Datagen bootstrap for use with RegistrySetBuilder
    public static void datagenBootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.register(ALUMINUM_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.ALUMINUM_ORE.defaultBlockState()
                    )
                ),
                9
            )
        ));
        context.register(APATITE_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.APATITE_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        context.register(CINNABAR_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.CINNABAR_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        context.register(LEAD_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.LEAD_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        context.register(NICKEL_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.NICKEL_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        context.register(OSMIUM_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.OSMIUM_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        context.register(PLATINUM_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.PLATINUM_ORE.defaultBlockState()
                    )
                ),
                6
            )
        ));
        context.register(RUBY_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.RUBY_ORE.defaultBlockState()
                    )
                ),
                5
            )
        ));
        context.register(SAPPHIRE_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.SAPPHIRE_ORE.defaultBlockState()
                    )
                ),
                5
            )
        ));
        context.register(SILVER_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.SILVER_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
        context.register(TIN_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.TIN_ORE.defaultBlockState()
                    )
                ),
                7
            )
        ));
        context.register(URANIUM_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.URANIUM_ORE.defaultBlockState()
                    )
                ),
                4
            )
        ));
        context.register(ZINC_ORE, new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(
                List.of(
                    OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.ZINC_ORE.defaultBlockState()
                    )
                ),
                8
            )
        ));
    }
}
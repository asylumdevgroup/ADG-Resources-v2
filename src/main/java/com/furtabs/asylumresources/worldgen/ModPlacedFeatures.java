package com.furtabs.asylumresources.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> APATITE_ORE_PLACED_KEY = registerKey("apatite_ore_placed");
    public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, name));
    }

    public static void datagenBootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        context.register(ALUMINUM_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE),
            List.of(
                CountPlacement.of(20),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(APATITE_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.APATITE_ORE),
            List.of(
                CountPlacement.of(16),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(CINNABAR_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.CINNABAR_ORE),
            List.of(
                CountPlacement.of(12),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(LEAD_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE),
            List.of(
                CountPlacement.of(16),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(NICKEL_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.NICKEL_ORE),
            List.of(
                CountPlacement.of(16),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(OSMIUM_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.OSMIUM_ORE),
            List.of(
                CountPlacement.of(12),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(PLATINUM_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE),
            List.of(
                CountPlacement.of(8),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(RUBY_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE),
            List.of(
                CountPlacement.of(6),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(SAPPHIRE_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE),
            List.of(
                CountPlacement.of(6),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(SILVER_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE),
            List.of(
                CountPlacement.of(16),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(TIN_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_ORE),
            List.of(
                CountPlacement.of(12),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(URANIUM_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.URANIUM_ORE),
            List.of(
                CountPlacement.of(4),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));

        context.register(ZINC_ORE_PLACED_KEY, new PlacedFeature(
            configuredFeatures.getOrThrow(ModConfiguredFeatures.ZINC_ORE),
            List.of(
                CountPlacement.of(16),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))
            )
        ));
    }
}
package com.furtabs.asylumresources.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import java.util.HashMap;
import java.util.Map;

public class ModBiomeModifiers {
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
}
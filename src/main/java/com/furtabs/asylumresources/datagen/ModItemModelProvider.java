package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.item.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, com.furtabs.asylumresources.AsylumRes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINUM_COIN);
        simpleItem(ModItems.ALUMINUM_DUST);
        simpleItem(ModItems.ALUMINUM_GEAR);
        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.ALUMINUM_NUGGET);
        simpleItem(ModItems.ALUMINUM_PLATE);
        simpleItem(ModItems.ALUMINUM_ROD);
        simpleItem(ModItems.AMETHYST_DUST);
        simpleItem(ModItems.ANDESITE_ALLOY_COIN);
        simpleItem(ModItems.ANDESITE_ALLOY_DUST);
        simpleItem(ModItems.ANDESITE_ALLOY_GEAR);
        simpleItem(ModItems.ANDESITE_ALLOY_INGOT);
        simpleItem(ModItems.ANDESITE_ALLOY_NUGGET);
        simpleItem(ModItems.ANDESITE_ALLOY_PLATE);
        simpleItem(ModItems.ANDESITE_ALLOY_ROD);
        simpleItem(ModItems.APATITE);
        simpleItem(ModItems.APATITE_COIN);
        simpleItem(ModItems.APATITE_DUST);
        simpleItem(ModItems.APATITE_PLATE);
        simpleItem(ModItems.APATITE_ROD);
        simpleItem(ModItems.BRASS_COIN);
        simpleItem(ModItems.BRASS_DUST);
        simpleItem(ModItems.BRASS_GEAR);
        simpleItem(ModItems.BRASS_INGOT);
        simpleItem(ModItems.BRASS_NUGGET);
        simpleItem(ModItems.BRASS_PLATE);
        simpleItem(ModItems.BRASS_ROD);
        simpleItem(ModItems.BRONZE_COIN);
        simpleItem(ModItems.BRONZE_DUST);
        simpleItem(ModItems.BRONZE_GEAR);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_NUGGET);
        simpleItem(ModItems.BRONZE_PLATE);
        simpleItem(ModItems.BRONZE_ROD);
        simpleItem(ModItems.CALCITE_DUST);
        simpleItem(ModItems.CHARCOAL_DUST);
        simpleItem(ModItems.CINNABAR);
        simpleItem(ModItems.CINNABAR_COIN);
        simpleItem(ModItems.CINNABAR_DUST);
        simpleItem(ModItems.CINNABAR_PLATE);
        simpleItem(ModItems.CINNABAR_ROD);
        simpleItem(ModItems.COAL_DUST);
        simpleItem(ModItems.CONSTANTAN_COIN);
        simpleItem(ModItems.CONSTANTAN_DUST);
        simpleItem(ModItems.CONSTANTAN_GEAR);
        simpleItem(ModItems.CONSTANTAN_INGOT);
        simpleItem(ModItems.CONSTANTAN_NUGGET);
        simpleItem(ModItems.CONSTANTAN_PLATE);
        simpleItem(ModItems.CONSTANTAN_ROD);
        simpleItem(ModItems.COPPER_COIN);
        simpleItem(ModItems.COPPER_DUST);
        simpleItem(ModItems.COPPER_GEAR);
        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.COPPER_PLATE);
        simpleItem(ModItems.COPPER_ROD);
        simpleItem(ModItems.DIAMOND_COIN);
        simpleItem(ModItems.DIAMOND_DUST);
        simpleItem(ModItems.DIAMOND_GEAR);
        simpleItem(ModItems.DIAMOND_PLATE);
        simpleItem(ModItems.ELECTRUM_COIN);
        simpleItem(ModItems.ELECTRUM_DUST);
        simpleItem(ModItems.ELECTRUM_GEAR);
        simpleItem(ModItems.ELECTRUM_INGOT);
        simpleItem(ModItems.ELECTRUM_NUGGET);
        simpleItem(ModItems.ELECTRUM_PLATE);
        simpleItem(ModItems.ELECTRUM_ROD);
        simpleItem(ModItems.EMERALD_COIN);
        simpleItem(ModItems.EMERALD_DUST);
        simpleItem(ModItems.EMERALD_GEAR);
        simpleItem(ModItems.EMERALD_PLATE);
        simpleItem(ModItems.ENDER_PEARL_DUST);
        simpleItem(ModItems.END_STONE_DUST);
        simpleItem(ModItems.ENDERIUM_COIN);
        simpleItem(ModItems.ENDERIUM_DUST);
        simpleItem(ModItems.ENDERIUM_GEAR);
        simpleItem(ModItems.ENDERIUM_INGOT);
        simpleItem(ModItems.ENDERIUM_NUGGET);
        simpleItem(ModItems.ENDERIUM_PLATE);
        simpleItem(ModItems.ENDERIUM_ROD);
        simpleItem(ModItems.ENRICHED_URANIUM);
        simpleItem(ModItems.ENRICHED_URANIUM_DUST);
        simpleItem(ModItems.GOLD_COIN);
        simpleItem(ModItems.GOLD_DUST);
        simpleItem(ModItems.GOLD_GEAR);
        simpleItem(ModItems.GOLD_PLATE);
        simpleItem(ModItems.GOLD_ROD);
        simpleItem(ModItems.GRAPHITE_DUST);
        simpleItem(ModItems.GRAPHITE_INGOT);
        simpleItem(ModItems.GRAPHITE_PLATE);
        simpleItem(ModItems.GRAPHITE_ROD);
        simpleItem(ModItems.INVAR_COIN);
        simpleItem(ModItems.INVAR_DUST);
        simpleItem(ModItems.INVAR_GEAR);
        simpleItem(ModItems.INVAR_INGOT);
        simpleItem(ModItems.INVAR_NUGGET);
        simpleItem(ModItems.INVAR_PLATE);
        simpleItem(ModItems.INVAR_ROD);
        simpleItem(ModItems.IRON_COMPRESSED_COIN);
        simpleItem(ModItems.IRON_COMPRESSED_DUST);
        simpleItem(ModItems.IRON_COMPRESSED_GEAR);
        simpleItem(ModItems.IRON_COMPRESSED_INGOT);
        simpleItem(ModItems.IRON_COMPRESSED_NUGGET);
        simpleItem(ModItems.IRON_COMPRESSED_PLATE);
        simpleItem(ModItems.IRON_COMPRESSED_ROD);
        simpleItem(ModItems.IRON_COIN);
        simpleItem(ModItems.IRON_DUST);
        simpleItem(ModItems.IRON_GEAR);
        simpleItem(ModItems.IRON_PLATE);
        simpleItem(ModItems.IRON_ROD);
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.LAPIS_LAZULI_COIN);
        simpleItem(ModItems.LAPIS_LAZULI_DUST);
        simpleItem(ModItems.LAPIS_LAZULI_GEAR);
        simpleItem(ModItems.LAPIS_LAZULI_PLATE);
        simpleItem(ModItems.LEAD_COIN);
        simpleItem(ModItems.LEAD_DUST);
        simpleItem(ModItems.LEAD_GEAR);
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.LEAD_NUGGET);
        simpleItem(ModItems.LEAD_PLATE);
        simpleItem(ModItems.LEAD_ROD);
        simpleItem(ModItems.LUMIUM_COIN);
        simpleItem(ModItems.LUMIUM_DUST);
        simpleItem(ModItems.LUMIUM_GEAR);
        simpleItem(ModItems.LUMIUM_INGOT);
        simpleItem(ModItems.LUMIUM_NUGGET);
        simpleItem(ModItems.LUMIUM_PLATE);
        simpleItem(ModItems.LUMIUM_ROD);
        simpleItem(ModItems.NETHERRACK_DUST);
        simpleItem(ModItems.NETHERITE_COIN);
        simpleItem(ModItems.NETHERITE_DUST);
        simpleItem(ModItems.NETHERITE_GEAR);
        simpleItem(ModItems.NETHERITE_NUGGET);
        simpleItem(ModItems.NETHERITE_PLATE);
        simpleItem(ModItems.NETHERITE_ROD);
        simpleItem(ModItems.NICKEL_COIN);
        simpleItem(ModItems.NICKEL_DUST);
        simpleItem(ModItems.NICKEL_GEAR);
        simpleItem(ModItems.NICKEL_INGOT);
        simpleItem(ModItems.NICKEL_NUGGET);
        simpleItem(ModItems.NICKEL_PLATE);
        simpleItem(ModItems.NICKEL_ROD);
        simpleItem(ModItems.OBSIDIAN_DUST);
        simpleItem(ModItems.OSMIUM_COIN);
        simpleItem(ModItems.OSMIUM_DUST);
        simpleItem(ModItems.OSMIUM_GEAR);
        simpleItem(ModItems.OSMIUM_INGOT);
        simpleItem(ModItems.OSMIUM_NUGGET);
        simpleItem(ModItems.OSMIUM_PLATE);
        simpleItem(ModItems.OSMIUM_ROD);
        simpleItem(ModItems.PLASTIC_PLATE);
        simpleItem(ModItems.PLASTIC_ROD);
        simpleItem(ModItems.PLATINUM_COIN);
        simpleItem(ModItems.PLATINUM_DUST);
        simpleItem(ModItems.PLATINUM_GEAR);
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.PLATINUM_PLATE);
        simpleItem(ModItems.PLATINUM_ROD);
        simpleItem(ModItems.POLISHED_APATITE);
        simpleItem(ModItems.POLISHED_CINNABAR);
        simpleItem(ModItems.POLISHED_DIAMOND);
        simpleItem(ModItems.POLISHED_EMERALD);
        simpleItem(ModItems.POLISHED_QUARTZ);
        simpleItem(ModItems.POLISHED_LAPIS_LAZULI);
        simpleItem(ModItems.POLISHED_RUBY);
        simpleItem(ModItems.POLISHED_SAPPHIRE);
        simpleItem(ModItems.CRYING_OBSIDIAN_DUST);
        simpleItem(ModItems.PRISMARINE_DUST);
        simpleItem(ModItems.QUARTZ_COIN);
        simpleItem(ModItems.QUARTZ_DUST);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_COIN);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_DUST);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_GEAR);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_INGOT);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_NUGGET);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_PLATE);
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_ROD);
        simpleItem(ModItems.QUARTZ_GEAR);
        simpleItem(ModItems.QUARTZ_PLATE);
        simpleItem(ModItems.QUARTZ_COIN);
        simpleItem(ModItems.QUARTZ_DUST);
        simpleItem(ModItems.RAW_ALUMINUM);
        simpleItem(ModItems.RAW_LEAD);
        simpleItem(ModItems.RAW_NICKEL);
        simpleItem(ModItems.RAW_OSMIUM);
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.RAW_URANIUM);
        simpleItem(ModItems.RAW_ZINC);
        simpleItem(ModItems.REFINED_GLOWSTONE_COIN);
        simpleItem(ModItems.REFINED_GLOWSTONE_DUST);
        simpleItem(ModItems.REFINED_GLOWSTONE_GEAR);
        simpleItem(ModItems.REFINED_GLOWSTONE_INGOT);
        simpleItem(ModItems.REFINED_GLOWSTONE_NUGGET);
        simpleItem(ModItems.REFINED_GLOWSTONE_PLATE);
        simpleItem(ModItems.REFINED_GLOWSTONE_ROD);
        simpleItem(ModItems.REFINED_OBSIDIAN_COIN);
        simpleItem(ModItems.REFINED_OBSIDIAN_DUST);
        simpleItem(ModItems.REFINED_OBSIDIAN_GEAR);
        simpleItem(ModItems.REFINED_OBSIDIAN_INGOT);
        simpleItem(ModItems.REFINED_OBSIDIAN_NUGGET);
        simpleItem(ModItems.REFINED_OBSIDIAN_PLATE);
        simpleItem(ModItems.REFINED_OBSIDIAN_ROD);
        simpleItem(ModItems.ROSE_GOLD_COIN);
        simpleItem(ModItems.ROSE_GOLD_DUST);
        simpleItem(ModItems.ROSE_GOLD_GEAR);
        simpleItem(ModItems.ROSE_GOLD_INGOT);
        simpleItem(ModItems.ROSE_GOLD_NUGGET);
        simpleItem(ModItems.ROSE_GOLD_PLATE);
        simpleItem(ModItems.ROSE_GOLD_ROD);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RUBY_COIN);
        simpleItem(ModItems.RUBY_DUST);
        simpleItem(ModItems.RUBY_GEAR);
        simpleItem(ModItems.RUBY_PLATE);
        simpleItem(ModItems.RUBY_ROD);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_COIN);
        simpleItem(ModItems.SAPPHIRE_DUST);
        simpleItem(ModItems.SAPPHIRE_GEAR);
        simpleItem(ModItems.SAPPHIRE_PLATE);
        simpleItem(ModItems.SAPPHIRE_ROD);
        simpleItem(ModItems.SIGNALUM_COIN);
        simpleItem(ModItems.SIGNALUM_DUST);
        simpleItem(ModItems.SIGNALUM_GEAR);
        simpleItem(ModItems.SIGNALUM_INGOT);
        simpleItem(ModItems.SIGNALUM_NUGGET);
        simpleItem(ModItems.SIGNALUM_PLATE);
        simpleItem(ModItems.SIGNALUM_ROD);
        simpleItem(ModItems.SILVER_COIN);
        simpleItem(ModItems.SILVER_DUST);
        simpleItem(ModItems.SILVER_GEAR);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.SILVER_PLATE);
        simpleItem(ModItems.SILVER_ROD);
        simpleItem(ModItems.STEEL_COIN);
        simpleItem(ModItems.STEEL_DUST);
        simpleItem(ModItems.STEEL_GEAR);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.STEEL_NUGGET);
        simpleItem(ModItems.STEEL_PLATE);
        simpleItem(ModItems.STEEL_ROD);
        simpleItem(ModItems.TIN_COIN);
        simpleItem(ModItems.TIN_DUST);
        simpleItem(ModItems.TIN_GEAR);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.TIN_NUGGET);
        simpleItem(ModItems.TIN_PLATE);
        simpleItem(ModItems.TIN_ROD);
        simpleItem(ModItems.URANIUM_COIN);
        simpleItem(ModItems.URANIUM_DUST);
        simpleItem(ModItems.URANIUM_GEAR);
        simpleItem(ModItems.URANIUM_INGOT);
        simpleItem(ModItems.URANIUM_NUGGET);
        simpleItem(ModItems.URANIUM_PLATE);
        simpleItem(ModItems.URANIUM_ROD);
        simpleItem(ModItems.ZINC_DUST);
        simpleItem(ModItems.ZINC_COIN);
        simpleItem(ModItems.ZINC_GEAR);
        simpleItem(ModItems.ZINC_INGOT);
        simpleItem(ModItems.ZINC_PLATE);
        simpleItem(ModItems.ZINC_NUGGET);
        simpleItem(ModItems.ZINC_ROD);
    }

    public ItemModelBuilder simpleItem(Item item) {
        ResourceLocation itemKey = BuiltInRegistries.ITEM.getKey(item);
        return withExistingParent(itemKey.getPath(),
                ResourceLocation.fromNamespaceAndPath("item", "generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, "item/" + itemKey.getPath()));
    }

    public ItemModelBuilder handheldItem(Item item) {
        ResourceLocation itemKey = BuiltInRegistries.ITEM.getKey(item);
        return withExistingParent(itemKey.getPath(),
                ResourceLocation.fromNamespaceAndPath("item", "handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, "item/" + itemKey.getPath()));
    }

    @Override
    public ItemModelBuilder simpleBlockItem(ResourceLocation item) {
        return withExistingParent(item.getPath(),
                ResourceLocation.fromNamespaceAndPath("item", "generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, "item/" + item.getPath()));
    }

    public ItemModelBuilder simpleBlockItemBlockTexture(ResourceLocation item) {
        return withExistingParent(item.getPath(),
                ResourceLocation.fromNamespaceAndPath("item", "generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, "block/" + item.getPath()));
    }

    public void evenSimplerBlockItem(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        this.withExistingParent(com.furtabs.asylumresources.AsylumRes.MOD_ID + ":" + blockKey.getPath(),
                modLoc("block/" + blockKey.getPath()));
    }
}

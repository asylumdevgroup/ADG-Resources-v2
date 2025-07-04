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
        simpleItem(ModItems.ALUMINUM_COIN.get());
        simpleItem(ModItems.ALUMINUM_DUST.get());
        simpleItem(ModItems.ALUMINUM_GEAR.get());
        simpleItem(ModItems.ALUMINUM_INGOT.get());
        simpleItem(ModItems.ALUMINUM_NUGGET.get());
        simpleItem(ModItems.ALUMINUM_PLATE.get());
        simpleItem(ModItems.ALUMINUM_ROD.get());
        simpleItem(ModItems.AMETHYST_DUST.get());
        simpleItem(ModItems.ANDESITE_ALLOY_COIN.get());
        simpleItem(ModItems.ANDESITE_ALLOY_DUST.get());
        simpleItem(ModItems.ANDESITE_ALLOY_GEAR.get());
        simpleItem(ModItems.ANDESITE_ALLOY_INGOT.get());
        simpleItem(ModItems.ANDESITE_ALLOY_NUGGET.get());
        simpleItem(ModItems.ANDESITE_ALLOY_PLATE.get());
        simpleItem(ModItems.ANDESITE_ALLOY_ROD.get());
        simpleItem(ModItems.APATITE.get());
        simpleItem(ModItems.APATITE_COIN.get());
        simpleItem(ModItems.APATITE_DUST.get());
        simpleItem(ModItems.APATITE_PLATE.get());
        simpleItem(ModItems.APATITE_ROD.get());
        simpleItem(ModItems.BRASS_COIN.get());
        simpleItem(ModItems.BRASS_DUST.get());
        simpleItem(ModItems.BRASS_GEAR.get());
        simpleItem(ModItems.BRASS_INGOT.get());
        simpleItem(ModItems.BRASS_NUGGET.get());
        simpleItem(ModItems.BRASS_PLATE.get());
        simpleItem(ModItems.BRASS_ROD.get());
        simpleItem(ModItems.BRONZE_COIN.get());
        simpleItem(ModItems.BRONZE_DUST.get());
        simpleItem(ModItems.BRONZE_GEAR.get());
        simpleItem(ModItems.BRONZE_INGOT.get());
        simpleItem(ModItems.BRONZE_NUGGET.get());
        simpleItem(ModItems.BRONZE_PLATE.get());
        simpleItem(ModItems.BRONZE_ROD.get());
        simpleItem(ModItems.CALCITE_DUST.get());
        simpleItem(ModItems.CHARCOAL_DUST.get());
        simpleItem(ModItems.CINNABAR.get());
        simpleItem(ModItems.CINNABAR_COIN.get());
        simpleItem(ModItems.CINNABAR_DUST.get());
        simpleItem(ModItems.CINNABAR_PLATE.get());
        simpleItem(ModItems.CINNABAR_ROD.get());
        simpleItem(ModItems.COAL_DUST.get());
        simpleItem(ModItems.CONSTANTAN_COIN.get());
        simpleItem(ModItems.CONSTANTAN_DUST.get());
        simpleItem(ModItems.CONSTANTAN_GEAR.get());
        simpleItem(ModItems.CONSTANTAN_INGOT.get());
        simpleItem(ModItems.CONSTANTAN_NUGGET.get());
        simpleItem(ModItems.CONSTANTAN_PLATE.get());
        simpleItem(ModItems.CONSTANTAN_ROD.get());
        simpleItem(ModItems.COPPER_COIN.get());
        simpleItem(ModItems.COPPER_DUST.get());
        simpleItem(ModItems.COPPER_GEAR.get());
        simpleItem(ModItems.COPPER_NUGGET.get());
        simpleItem(ModItems.COPPER_PLATE.get());
        simpleItem(ModItems.COPPER_ROD.get());
        simpleItem(ModItems.DIAMOND_COIN.get());
        simpleItem(ModItems.DIAMOND_DUST.get());
        simpleItem(ModItems.DIAMOND_GEAR.get());
        simpleItem(ModItems.DIAMOND_PLATE.get());
        simpleItem(ModItems.ELECTRUM_COIN.get());
        simpleItem(ModItems.ELECTRUM_DUST.get());
        simpleItem(ModItems.ELECTRUM_GEAR.get());
        simpleItem(ModItems.ELECTRUM_INGOT.get());
        simpleItem(ModItems.ELECTRUM_NUGGET.get());
        simpleItem(ModItems.ELECTRUM_PLATE.get());
        simpleItem(ModItems.ELECTRUM_ROD.get());
        simpleItem(ModItems.EMERALD_COIN.get());
        simpleItem(ModItems.EMERALD_DUST.get());
        simpleItem(ModItems.EMERALD_GEAR.get());
        simpleItem(ModItems.EMERALD_PLATE.get());
        simpleItem(ModItems.ENDER_PEARL_DUST.get());
        simpleItem(ModItems.END_STONE_DUST.get());
        simpleItem(ModItems.ENDERIUM_COIN.get());
        simpleItem(ModItems.ENDERIUM_DUST.get());
        simpleItem(ModItems.ENDERIUM_GEAR.get());
        simpleItem(ModItems.ENDERIUM_INGOT.get());
        simpleItem(ModItems.ENDERIUM_NUGGET.get());
        simpleItem(ModItems.ENDERIUM_PLATE.get());
        simpleItem(ModItems.ENDERIUM_ROD.get());
        simpleItem(ModItems.ENRICHED_URANIUM.get());
        simpleItem(ModItems.ENRICHED_URANIUM_DUST.get());
        simpleItem(ModItems.GOLD_COIN.get());
        simpleItem(ModItems.GOLD_DUST.get());
        simpleItem(ModItems.GOLD_GEAR.get());
        simpleItem(ModItems.GOLD_PLATE.get());
        simpleItem(ModItems.GOLD_ROD.get());
        simpleItem(ModItems.GRAPHITE_DUST.get());
        simpleItem(ModItems.GRAPHITE_INGOT.get());
        simpleItem(ModItems.GRAPHITE_PLATE.get());
        simpleItem(ModItems.GRAPHITE_ROD.get());
        simpleItem(ModItems.INVAR_COIN.get());
        simpleItem(ModItems.INVAR_DUST.get());
        simpleItem(ModItems.INVAR_GEAR.get());
        simpleItem(ModItems.INVAR_INGOT.get());
        simpleItem(ModItems.INVAR_NUGGET.get());
        simpleItem(ModItems.INVAR_PLATE.get());
        simpleItem(ModItems.INVAR_ROD.get());
        simpleItem(ModItems.IRON_COMPRESSED_COIN.get());
        simpleItem(ModItems.IRON_COMPRESSED_DUST.get());
        simpleItem(ModItems.IRON_COMPRESSED_GEAR.get());
        simpleItem(ModItems.IRON_COMPRESSED_INGOT.get());
        simpleItem(ModItems.IRON_COMPRESSED_NUGGET.get());
        simpleItem(ModItems.IRON_COMPRESSED_PLATE.get());
        simpleItem(ModItems.IRON_COMPRESSED_ROD.get());
        simpleItem(ModItems.IRON_COIN.get());
        simpleItem(ModItems.IRON_DUST.get());
        simpleItem(ModItems.IRON_GEAR.get());
        simpleItem(ModItems.IRON_PLATE.get());
        simpleItem(ModItems.IRON_ROD.get());
        simpleItem(ModItems.PLATINUM_INGOT.get());
        simpleItem(ModItems.LAPIS_LAZULI_COIN.get());
        simpleItem(ModItems.LAPIS_LAZULI_DUST.get());
        simpleItem(ModItems.LAPIS_LAZULI_GEAR.get());
        simpleItem(ModItems.LAPIS_LAZULI_PLATE.get());
        simpleItem(ModItems.LEAD_COIN.get());
        simpleItem(ModItems.LEAD_DUST.get());
        simpleItem(ModItems.LEAD_GEAR.get());
        simpleItem(ModItems.LEAD_INGOT.get());
        simpleItem(ModItems.LEAD_NUGGET.get());
        simpleItem(ModItems.LEAD_PLATE.get());
        simpleItem(ModItems.LEAD_ROD.get());
        simpleItem(ModItems.LUMIUM_COIN.get());
        simpleItem(ModItems.LUMIUM_DUST.get());
        simpleItem(ModItems.LUMIUM_GEAR.get());
        simpleItem(ModItems.LUMIUM_INGOT.get());
        simpleItem(ModItems.LUMIUM_NUGGET.get());
        simpleItem(ModItems.LUMIUM_PLATE.get());
        simpleItem(ModItems.LUMIUM_ROD.get());
        simpleItem(ModItems.NETHERRACK_DUST.get());
        simpleItem(ModItems.NETHERITE_COIN.get());
        simpleItem(ModItems.NETHERITE_DUST.get());
        simpleItem(ModItems.NETHERITE_GEAR.get());
        simpleItem(ModItems.NETHERITE_NUGGET.get());
        simpleItem(ModItems.NETHERITE_PLATE.get());
        simpleItem(ModItems.NETHERITE_ROD.get());
        simpleItem(ModItems.NICKEL_COIN.get());
        simpleItem(ModItems.NICKEL_DUST.get());
        simpleItem(ModItems.NICKEL_GEAR.get());
        simpleItem(ModItems.NICKEL_INGOT.get());
        simpleItem(ModItems.NICKEL_NUGGET.get());
        simpleItem(ModItems.NICKEL_PLATE.get());
        simpleItem(ModItems.NICKEL_ROD.get());
        simpleItem(ModItems.OBSIDIAN_DUST.get());
        simpleItem(ModItems.OSMIUM_COIN.get());
        simpleItem(ModItems.OSMIUM_DUST.get());
        simpleItem(ModItems.OSMIUM_GEAR.get());
        simpleItem(ModItems.OSMIUM_INGOT.get());
        simpleItem(ModItems.OSMIUM_NUGGET.get());
        simpleItem(ModItems.OSMIUM_PLATE.get());
        simpleItem(ModItems.OSMIUM_ROD.get());
        simpleItem(ModItems.PLASTIC_PLATE.get());
        simpleItem(ModItems.PLASTIC_ROD.get());
        simpleItem(ModItems.PLATINUM_COIN.get());
        simpleItem(ModItems.PLATINUM_DUST.get());
        simpleItem(ModItems.PLATINUM_GEAR.get());
        simpleItem(ModItems.PLATINUM_INGOT.get());
        simpleItem(ModItems.PLATINUM_NUGGET.get());
        simpleItem(ModItems.PLATINUM_PLATE.get());
        simpleItem(ModItems.PLATINUM_ROD.get());
        simpleItem(ModItems.POLISHED_APATITE.get());
        simpleItem(ModItems.POLISHED_CINNABAR.get());
        simpleItem(ModItems.POLISHED_DIAMOND.get());
        simpleItem(ModItems.POLISHED_EMERALD.get());
        simpleItem(ModItems.POLISHED_QUARTZ.get());
        simpleItem(ModItems.POLISHED_LAPIS_LAZULI.get());
        simpleItem(ModItems.POLISHED_RUBY.get());
        simpleItem(ModItems.POLISHED_SAPPHIRE.get());
        simpleItem(ModItems.CRYING_OBSIDIAN_DUST.get());
        simpleItem(ModItems.PRISMARINE_DUST.get());
        simpleItem(ModItems.QUARTZ_COIN.get());
        simpleItem(ModItems.QUARTZ_DUST.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_COIN.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_DUST.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_GEAR.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_INGOT.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_NUGGET.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_PLATE.get());
        simpleItem(ModItems.QUARTZ_ENRICHED_IRON_ROD.get());
        simpleItem(ModItems.QUARTZ_GEAR.get());
        simpleItem(ModItems.QUARTZ_PLATE.get());
        simpleItem(ModItems.QUARTZ_COIN.get());
        simpleItem(ModItems.QUARTZ_DUST.get());
        simpleItem(ModItems.RAW_ALUMINUM.get());
        simpleItem(ModItems.RAW_LEAD.get());
        simpleItem(ModItems.RAW_NICKEL.get());
        simpleItem(ModItems.RAW_OSMIUM.get());
        simpleItem(ModItems.RAW_PLATINUM.get());
        simpleItem(ModItems.RAW_SILVER.get());
        simpleItem(ModItems.RAW_TIN.get());
        simpleItem(ModItems.RAW_URANIUM.get());
        simpleItem(ModItems.RAW_ZINC.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_COIN.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_DUST.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_GEAR.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_INGOT.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_NUGGET.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_PLATE.get());
        simpleItem(ModItems.REFINED_GLOWSTONE_ROD.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_COIN.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_DUST.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_GEAR.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_INGOT.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_NUGGET.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_PLATE.get());
        simpleItem(ModItems.REFINED_OBSIDIAN_ROD.get());
        simpleItem(ModItems.ROSE_GOLD_COIN.get());
        simpleItem(ModItems.ROSE_GOLD_DUST.get());
        simpleItem(ModItems.ROSE_GOLD_GEAR.get());
        simpleItem(ModItems.ROSE_GOLD_INGOT.get());
        simpleItem(ModItems.ROSE_GOLD_NUGGET.get());
        simpleItem(ModItems.ROSE_GOLD_PLATE.get());
        simpleItem(ModItems.ROSE_GOLD_ROD.get());
        simpleItem(ModItems.RUBY.get());
        simpleItem(ModItems.RUBY_COIN.get());
        simpleItem(ModItems.RUBY_DUST.get());
        simpleItem(ModItems.RUBY_GEAR.get());
        simpleItem(ModItems.RUBY_PLATE.get());
        simpleItem(ModItems.RUBY_ROD.get());
        simpleItem(ModItems.SAPPHIRE.get());
        simpleItem(ModItems.SAPPHIRE_COIN.get());
        simpleItem(ModItems.SAPPHIRE_DUST.get());
        simpleItem(ModItems.SAPPHIRE_GEAR.get());
        simpleItem(ModItems.SAPPHIRE_PLATE.get());
        simpleItem(ModItems.SAPPHIRE_ROD.get());
        simpleItem(ModItems.SIGNALUM_COIN.get());
        simpleItem(ModItems.SIGNALUM_DUST.get());
        simpleItem(ModItems.SIGNALUM_GEAR.get());
        simpleItem(ModItems.SIGNALUM_INGOT.get());
        simpleItem(ModItems.SIGNALUM_NUGGET.get());
        simpleItem(ModItems.SIGNALUM_PLATE.get());
        simpleItem(ModItems.SIGNALUM_ROD.get());
        simpleItem(ModItems.SILVER_COIN.get());
        simpleItem(ModItems.SILVER_DUST.get());
        simpleItem(ModItems.SILVER_GEAR.get());
        simpleItem(ModItems.SILVER_INGOT.get());
        simpleItem(ModItems.SILVER_NUGGET.get());
        simpleItem(ModItems.SILVER_PLATE.get());
        simpleItem(ModItems.SILVER_ROD.get());
        simpleItem(ModItems.STEEL_COIN.get());
        simpleItem(ModItems.STEEL_DUST.get());
        simpleItem(ModItems.STEEL_GEAR.get());
        simpleItem(ModItems.STEEL_INGOT.get());
        simpleItem(ModItems.STEEL_NUGGET.get());
        simpleItem(ModItems.STEEL_PLATE.get());
        simpleItem(ModItems.STEEL_ROD.get());
        simpleItem(ModItems.TIN_COIN.get());
        simpleItem(ModItems.TIN_DUST.get());
        simpleItem(ModItems.TIN_GEAR.get());
        simpleItem(ModItems.TIN_INGOT.get());
        simpleItem(ModItems.TIN_NUGGET.get());
        simpleItem(ModItems.TIN_PLATE.get());
        simpleItem(ModItems.TIN_ROD.get());
        simpleItem(ModItems.URANIUM_COIN.get());
        simpleItem(ModItems.URANIUM_DUST.get());
        simpleItem(ModItems.URANIUM_GEAR.get());
        simpleItem(ModItems.URANIUM_INGOT.get());
        simpleItem(ModItems.URANIUM_NUGGET.get());
        simpleItem(ModItems.URANIUM_PLATE.get());
        simpleItem(ModItems.URANIUM_ROD.get());
        simpleItem(ModItems.ZINC_DUST.get());
        simpleItem(ModItems.ZINC_COIN.get());
        simpleItem(ModItems.ZINC_GEAR.get());
        simpleItem(ModItems.ZINC_INGOT.get());
        simpleItem(ModItems.ZINC_PLATE.get());
        simpleItem(ModItems.ZINC_NUGGET.get());
        simpleItem(ModItems.ZINC_ROD.get());
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

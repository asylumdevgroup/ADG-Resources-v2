package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.item.ModItems;
import com.furtabs.asylumresources.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, com.furtabs.asylumresources.AsylumRes.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.COINS)
                .add(
                        ModItems.ALUMINUM_COIN.get(),
                        ModItems.PLATINUM_COIN.get(),
                        ModItems.SILVER_COIN.get(),
                        ModItems.NICKEL_COIN.get(),
                        ModItems.URANIUM_COIN.get(),
                        ModItems.LEAD_COIN.get(),
                        ModItems.OSMIUM_COIN.get(),
                        ModItems.TIN_COIN.get(),
                        ModItems.ZINC_COIN.get(),
                        ModItems.IRON_COIN.get(),
                        ModItems.COPPER_COIN.get(),
                        ModItems.GOLD_COIN.get(),
                        ModItems.NETHERITE_COIN.get(),
                        ModItems.RUBY_COIN.get(),
                        ModItems.SAPPHIRE_COIN.get(),
                        ModItems.APATITE_COIN.get(),
                        ModItems.CINNABAR_COIN.get(),
                        ModItems.DIAMOND_COIN.get(),
                        ModItems.EMERALD_COIN.get(),
                        ModItems.LAPIS_LAZULI_COIN.get(),
                        ModItems.QUARTZ_COIN.get(),
                        ModItems.BRONZE_COIN.get(),
                        ModItems.CONSTANTAN_COIN.get(),
                        ModItems.INVAR_COIN.get(),
                        ModItems.SIGNALUM_COIN.get(),
                        ModItems.REFINED_OBSIDIAN_COIN.get(),
                        ModItems.REFINED_GLOWSTONE_COIN.get(),
                        ModItems.BRASS_COIN.get(),
                        ModItems.ELECTRUM_COIN.get(),
                        ModItems.ENDERIUM_COIN.get(),
                        ModItems.STEEL_COIN.get(),
                        ModItems.ANDESITE_ALLOY_COIN.get(),
                        ModItems.LUMIUM_COIN.get(),
                        ModItems.ROSE_GOLD_COIN.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_COIN.get(),
                        ModItems.IRON_COMPRESSED_COIN.get());

        this.tag(ModTags.Items.DUSTS)
                .add(
                        ModItems.ANDESITE_ALLOY_DUST.get(),
                        ModItems.AMETHYST_DUST.get(),
                        ModItems.ALUMINUM_DUST.get(),
                        ModItems.APATITE_DUST.get(),
                        ModItems.BRASS_DUST.get(),
                        ModItems.BRONZE_DUST.get(),
                        ModItems.CALCITE_DUST.get(),
                        ModItems.CHARCOAL_DUST.get(),
                        ModItems.CINNABAR_DUST.get(),
                        ModItems.COAL_DUST.get(),
                        ModItems.CONSTANTAN_DUST.get(),
                        ModItems.COPPER_DUST.get(),
                        ModItems.DIAMOND_DUST.get(),
                        ModItems.ELECTRUM_DUST.get(),
                        ModItems.EMERALD_DUST.get(),
                        ModItems.ENDER_PEARL_DUST.get(),
                        ModItems.ENDERIUM_DUST.get(),
                        ModItems.GOLD_DUST.get(),
                        ModItems.GRAPHITE_DUST.get(),
                        ModItems.INVAR_DUST.get(),
                        ModItems.IRON_DUST.get(),
                        ModItems.LAPIS_LAZULI_DUST.get(),
                        ModItems.LEAD_DUST.get(),
                        ModItems.LUMIUM_DUST.get(),
                        ModItems.NETHERRACK_DUST.get(),
                        ModItems.NETHERITE_DUST.get(),
                        ModItems.NICKEL_DUST.get(),
                        ModItems.OBSIDIAN_DUST.get(),
                        ModItems.SIGNALUM_DUST.get(),
                        ModItems.OSMIUM_DUST.get(),
                        ModItems.PLATINUM_DUST.get(),
                        ModItems.PRISMARINE_DUST.get(),
                        ModItems.QUARTZ_DUST.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_DUST.get(),
                        ModItems.REFINED_GLOWSTONE_DUST.get(),
                        ModItems.REFINED_OBSIDIAN_DUST.get(),
                        ModItems.ROSE_GOLD_DUST.get(),
                        ModItems.RUBY_DUST.get(),
                        ModItems.SAPPHIRE_DUST.get(),
                        ModItems.SILVER_DUST.get(),
                        ModItems.STEEL_DUST.get(),
                        ModItems.TIN_DUST.get(),
                        ModItems.URANIUM_DUST.get(),
                        ModItems.ZINC_DUST.get());

        this.tag(ModTags.Items.ENRICHED_DUSTS)
                .add(
                        ModItems.ENRICHED_URANIUM_DUST.get());

        this.tag(ModTags.Items.ENRICHED_MATERIALS)
                .add(
                        ModItems.ENRICHED_URANIUM.get());

        this.tag(ModTags.Items.POLISHED_GEMS)
                .add(
                        ModItems.POLISHED_RUBY.get(),
                        ModItems.POLISHED_SAPPHIRE.get(),
                        ModItems.POLISHED_APATITE.get(),
                        ModItems.POLISHED_CINNABAR.get(),
                        ModItems.POLISHED_DIAMOND.get(),
                        ModItems.POLISHED_EMERALD.get(),
                        ModItems.POLISHED_LAPIS_LAZULI.get(),
                        ModItems.POLISHED_QUARTZ.get());

        this.tag(ModTags.Items.RODS)
                .add(
                        ModItems.ANDESITE_ALLOY_ROD.get(),
                        ModItems.ALUMINUM_ROD.get(),
                        ModItems.BRASS_ROD.get(),
                        ModItems.BRONZE_ROD.get(),
                        ModItems.CINNABAR_ROD.get(),
                        ModItems.CONSTANTAN_ROD.get(),
                        ModItems.COPPER_ROD.get(),
                        ModItems.ELECTRUM_ROD.get(),
                        ModItems.ENDERIUM_ROD.get(),
                        ModItems.GOLD_ROD.get(),
                        ModItems.GRAPHITE_ROD.get(),
                        ModItems.INVAR_ROD.get(),
                        ModItems.IRON_ROD.get(),
                        ModItems.LEAD_ROD.get(),
                        ModItems.LUMIUM_ROD.get(),
                        ModItems.NETHERITE_ROD.get(),
                        ModItems.NICKEL_ROD.get(),
                        ModItems.SIGNALUM_ROD.get(),
                        ModItems.OSMIUM_ROD.get(),
                        ModItems.PLASTIC_ROD.get(),
                        ModItems.PLATINUM_ROD.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_ROD.get(),
                        ModItems.REFINED_GLOWSTONE_ROD.get(),
                        ModItems.REFINED_OBSIDIAN_ROD.get(),
                        ModItems.ROSE_GOLD_ROD.get(),
                        ModItems.RUBY_ROD.get(),
                        ModItems.SAPPHIRE_ROD.get(),
                        ModItems.SILVER_ROD.get(),
                        ModItems.STEEL_ROD.get(),
                        ModItems.TIN_ROD.get(),
                        ModItems.URANIUM_ROD.get(),
                        ModItems.ZINC_ROD.get());

        this.tag(ModTags.Items.PLATES)
                .add(
                        ModItems.ANDESITE_ALLOY_PLATE.get(),
                        ModItems.APATITE_PLATE.get(),
                        ModItems.BRASS_PLATE.get(),
                        ModItems.BRONZE_PLATE.get(),
                        ModItems.CINNABAR_PLATE.get(),
                        ModItems.CONSTANTAN_PLATE.get(),
                        ModItems.COPPER_PLATE.get(),
                        ModItems.DIAMOND_PLATE.get(),
                        ModItems.ELECTRUM_PLATE.get(),
                        ModItems.EMERALD_PLATE.get(),
                        ModItems.ENDERIUM_PLATE.get(),
                        ModItems.GOLD_PLATE.get(),
                        ModItems.GRAPHITE_PLATE.get(),
                        ModItems.INVAR_PLATE.get(),
                        ModItems.IRON_PLATE.get(),
                        ModItems.LAPIS_LAZULI_PLATE.get(),
                        ModItems.LEAD_PLATE.get(),
                        ModItems.LUMIUM_PLATE.get(),
                        ModItems.NETHERITE_PLATE.get(),
                        ModItems.NICKEL_PLATE.get(),
                        ModItems.SIGNALUM_PLATE.get(),
                        ModItems.OSMIUM_PLATE.get(),
                        ModItems.PLASTIC_PLATE.get(),
                        ModItems.PLATINUM_PLATE.get(),
                        ModItems.QUARTZ_PLATE.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_PLATE.get(),
                        ModItems.REFINED_GLOWSTONE_PLATE.get(),
                        ModItems.REFINED_OBSIDIAN_PLATE.get(),
                        ModItems.ROSE_GOLD_PLATE.get(),
                        ModItems.RUBY_PLATE.get(),
                        ModItems.SAPPHIRE_PLATE.get(),
                        ModItems.SILVER_PLATE.get(),
                        ModItems.STEEL_PLATE.get(),
                        ModItems.TIN_PLATE.get(),
                        ModItems.URANIUM_PLATE.get(),
                        ModItems.ZINC_PLATE.get());

        this.tag(ModTags.Items.GEARS)
                .add(
                        ModItems.ANDESITE_ALLOY_GEAR.get(),
                        ModItems.ALUMINUM_GEAR.get(),
                        ModItems.BRASS_GEAR.get(),
                        ModItems.BRONZE_GEAR.get(),
                        ModItems.CONSTANTAN_GEAR.get(),
                        ModItems.COPPER_GEAR.get(),
                        ModItems.DIAMOND_GEAR.get(),
                        ModItems.ELECTRUM_GEAR.get(),
                        ModItems.EMERALD_GEAR.get(),
                        ModItems.ENDERIUM_GEAR.get(),
                        ModItems.GOLD_GEAR.get(),
                        ModItems.INVAR_GEAR.get(),
                        ModItems.IRON_GEAR.get(),
                        ModItems.LAPIS_LAZULI_GEAR.get(),
                        ModItems.LEAD_GEAR.get(),
                        ModItems.LUMIUM_GEAR.get(),
                        ModItems.NETHERITE_GEAR.get(),
                        ModItems.NICKEL_GEAR.get(),
                        ModItems.SIGNALUM_GEAR.get(),
                        ModItems.OSMIUM_GEAR.get(),
                        ModItems.PLATINUM_GEAR.get(),
                        ModItems.QUARTZ_GEAR.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_GEAR.get(),
                        ModItems.REFINED_OBSIDIAN_GEAR.get(),
                        ModItems.REFINED_GLOWSTONE_GEAR.get(),
                        ModItems.ROSE_GOLD_GEAR.get(),
                        ModItems.RUBY_GEAR.get(),
                        ModItems.SAPPHIRE_GEAR.get(),
                        ModItems.SILVER_GEAR.get(),
                        ModItems.STEEL_GEAR.get(),
                        ModItems.TIN_GEAR.get(),
                        ModItems.URANIUM_GEAR.get(),
                        ModItems.ZINC_GEAR.get());

        this.tag(ModTags.Items.GEMS)
                .add(
                        ModItems.APATITE.get(),
                        ModItems.CINNABAR.get(),
                        ModItems.RUBY.get(),
                        ModItems.SAPPHIRE.get());

        this.tag(ModTags.Items.NUGGETS)
                .add(
                        ModItems.ANDESITE_ALLOY_NUGGET.get(),
                        ModItems.ALUMINUM_NUGGET.get(),
                        ModItems.BRASS_NUGGET.get(),
                        ModItems.BRONZE_NUGGET.get(),
                        ModItems.CONSTANTAN_NUGGET.get(),
                        ModItems.ELECTRUM_NUGGET.get(),
                        ModItems.ENDERIUM_NUGGET.get(),
                        ModItems.INVAR_NUGGET.get(),
                        ModItems.LEAD_NUGGET.get(),
                        ModItems.LUMIUM_NUGGET.get(),
                        ModItems.NICKEL_NUGGET.get(),
                        ModItems.SIGNALUM_NUGGET.get(),
                        ModItems.OSMIUM_NUGGET.get(),
                        ModItems.PLATINUM_NUGGET.get(),
                        ModItems.QUARTZ_ENRICHED_IRON_NUGGET.get(),
                        ModItems.REFINED_GLOWSTONE_INGOT.get(),
                        ModItems.REFINED_OBSIDIAN_NUGGET.get(),
                        ModItems.ROSE_GOLD_NUGGET.get(),
                        ModItems.SILVER_NUGGET.get(),
                        ModItems.STEEL_NUGGET.get(),
                        ModItems.TIN_NUGGET.get(),
                        ModItems.URANIUM_NUGGET.get(),
                        ModItems.ZINC_NUGGET.get());

        this.tag(ModTags.Items.INGOTS)
                .add(
                        ModItems.ALUMINUM_INGOT.get(),
                        ModItems.ANDESITE_ALLOY_INGOT.get(),
                        ModItems.BRASS_INGOT.get(),
                        ModItems.BRONZE_INGOT.get(),
                        ModItems.CONSTANTAN_INGOT.get(),
                        ModItems.ELECTRUM_INGOT.get(),
                        ModItems.ENDERIUM_INGOT.get(),
                        ModItems.GRAPHITE_INGOT.get(),
                        ModItems.INVAR_INGOT.get(),
                        ModItems.IRON_COMPRESSED_INGOT.get(),
                        ModItems.LEAD_INGOT.get(),
                        ModItems.LUMIUM_INGOT.get(),
                        ModItems.NICKEL_INGOT.get(),
                        ModItems.OSMIUM_INGOT.get(),
                        ModItems.PLATINUM_INGOT.get(),
                        ModItems.REFINED_GLOWSTONE_INGOT.get(),
                        ModItems.REFINED_OBSIDIAN_INGOT.get(),
                        ModItems.ROSE_GOLD_INGOT.get(),
                        ModItems.SIGNALUM_INGOT.get(),
                        ModItems.SILVER_INGOT.get(),
                        ModItems.STEEL_INGOT.get(),
                        ModItems.TIN_INGOT.get(),
                        ModItems.ZINC_INGOT.get());

        this.tag(ModTags.Items.RAW_MATERIALS)
                .add(
                        ModItems.RAW_ALUMINUM.get(),
                        ModItems.RAW_LEAD.get(),
                        ModItems.RAW_NICKEL.get(),
                        ModItems.RAW_OSMIUM.get(),
                        ModItems.RAW_PLATINUM.get(),
                        ModItems.RAW_SILVER.get(),
                        ModItems.RAW_TIN.get(),
                        ModItems.RAW_URANIUM.get(),
                        ModItems.RAW_ZINC.get());

        // Ensure neoforge:hammers exists (empty is fine) so cross-namespace mirror doesn't fail
        this.tag(ModTags.Items.HAMMERS);

        // Mirror NeoForge tags into common `c:` tags for cross-loader compatibility
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.HAMMERS)
                .addTag(ModTags.Items.HAMMERS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.COINS)
                .addTag(ModTags.Items.COINS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.DUSTS)
                .addTag(ModTags.Items.DUSTS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.ENRICHED_DUSTS)
                .addTag(ModTags.Items.ENRICHED_DUSTS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.ENRICHED_MATERIALS)
                .addTag(ModTags.Items.ENRICHED_MATERIALS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.POLISHED_GEMS)
                .addTag(ModTags.Items.POLISHED_GEMS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.RODS)
                .addTag(ModTags.Items.RODS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.PLATES)
                .addTag(ModTags.Items.PLATES);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.GEARS)
                .addTag(ModTags.Items.GEARS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.GEMS)
                .addTag(ModTags.Items.GEMS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.NUGGETS)
                .addTag(ModTags.Items.NUGGETS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.INGOTS)
                .addTag(ModTags.Items.INGOTS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CItems.RAW_MATERIALS)
                .addTag(ModTags.Items.RAW_MATERIALS);
    }
}

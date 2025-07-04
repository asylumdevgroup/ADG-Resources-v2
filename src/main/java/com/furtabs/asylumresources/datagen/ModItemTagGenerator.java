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
                        ModItems.ALUMINUM_COIN,
                        ModItems.PLATINUM_COIN,
                        ModItems.SILVER_COIN,
                        ModItems.NICKEL_COIN,
                        ModItems.URANIUM_COIN,
                        ModItems.LEAD_COIN,
                        ModItems.OSMIUM_COIN,
                        ModItems.TIN_COIN,
                        ModItems.ZINC_COIN,
                        ModItems.IRON_COIN,
                        ModItems.COPPER_COIN,
                        ModItems.GOLD_COIN,
                        ModItems.NETHERITE_COIN,
                        ModItems.RUBY_COIN,
                        ModItems.SAPPHIRE_COIN,
                        ModItems.APATITE_COIN,
                        ModItems.CINNABAR_COIN,
                        ModItems.DIAMOND_COIN,
                        ModItems.EMERALD_COIN,
                        ModItems.LAPIS_LAZULI_COIN,
                        ModItems.QUARTZ_COIN,
                        ModItems.BRONZE_COIN,
                        ModItems.CONSTANTAN_COIN,
                        ModItems.INVAR_COIN,
                        ModItems.SIGNALUM_COIN,
                        ModItems.REFINED_OBSIDIAN_COIN,
                        ModItems.REFINED_GLOWSTONE_COIN,
                        ModItems.BRASS_COIN,
                        ModItems.ELECTRUM_COIN,
                        ModItems.ENDERIUM_COIN,
                        ModItems.STEEL_COIN,
                        ModItems.ANDESITE_ALLOY_COIN,
                        ModItems.LUMIUM_COIN,
                        ModItems.ROSE_GOLD_COIN,
                        ModItems.QUARTZ_ENRICHED_IRON_COIN,
                        ModItems.IRON_COMPRESSED_COIN);

        this.tag(ModTags.Items.DUSTS)
                .add(
                        ModItems.ANDESITE_ALLOY_DUST,
                        ModItems.AMETHYST_DUST,
                        ModItems.ALUMINUM_DUST,
                        ModItems.APATITE_DUST,
                        ModItems.BRASS_DUST,
                        ModItems.BRONZE_DUST,
                        ModItems.CALCITE_DUST,
                        ModItems.CHARCOAL_DUST,
                        ModItems.CINNABAR_DUST,
                        ModItems.COAL_DUST,
                        ModItems.CONSTANTAN_DUST,
                        ModItems.COPPER_DUST,
                        ModItems.DIAMOND_DUST,
                        ModItems.ELECTRUM_DUST,
                        ModItems.EMERALD_DUST,
                        ModItems.ENDER_PEARL_DUST,
                        ModItems.ENDERIUM_DUST,
                        ModItems.GOLD_DUST,
                        ModItems.GRAPHITE_DUST,
                        ModItems.INVAR_DUST,
                        ModItems.IRON_DUST,
                        ModItems.LAPIS_LAZULI_DUST,
                        ModItems.LEAD_DUST,
                        ModItems.LUMIUM_DUST,
                        ModItems.NETHERRACK_DUST,
                        ModItems.NETHERITE_DUST,
                        ModItems.NICKEL_DUST,
                        ModItems.OBSIDIAN_DUST,
                        ModItems.SIGNALUM_DUST,
                        ModItems.OSMIUM_DUST,
                        ModItems.PLATINUM_DUST,
                        ModItems.PRISMARINE_DUST,
                        ModItems.QUARTZ_DUST,
                        ModItems.QUARTZ_ENRICHED_IRON_DUST,
                        ModItems.REFINED_GLOWSTONE_DUST,
                        ModItems.REFINED_OBSIDIAN_DUST,
                        ModItems.ROSE_GOLD_DUST,
                        ModItems.RUBY_DUST,
                        ModItems.SAPPHIRE_DUST,
                        ModItems.SILVER_DUST,
                        ModItems.STEEL_DUST,
                        ModItems.TIN_DUST,
                        ModItems.URANIUM_DUST,
                        ModItems.ZINC_DUST);

        this.tag(ModTags.Items.ENRICHED_DUSTS)
                .add(
                        ModItems.ENRICHED_URANIUM_DUST);

        this.tag(ModTags.Items.ENRICHED_MATERIALS)
                .add(
                        ModItems.ENRICHED_URANIUM);

        this.tag(ModTags.Items.POLISHED_GEMS)
                .add(
                        ModItems.POLISHED_RUBY,
                        ModItems.POLISHED_SAPPHIRE,
                        ModItems.POLISHED_APATITE,
                        ModItems.POLISHED_CINNABAR,
                        ModItems.POLISHED_DIAMOND,
                        ModItems.POLISHED_EMERALD,
                        ModItems.POLISHED_LAPIS_LAZULI,
                        ModItems.POLISHED_QUARTZ);

        this.tag(ModTags.Items.RODS)
                .add(
                        ModItems.ANDESITE_ALLOY_ROD,
                        ModItems.ALUMINUM_ROD,
                        ModItems.BRASS_ROD,
                        ModItems.BRONZE_ROD,
                        ModItems.CINNABAR_ROD,
                        ModItems.CONSTANTAN_ROD,
                        ModItems.COPPER_ROD,
                        ModItems.ELECTRUM_ROD,
                        ModItems.ENDERIUM_ROD,
                        ModItems.GOLD_ROD,
                        ModItems.GRAPHITE_ROD,
                        ModItems.INVAR_ROD,
                        ModItems.IRON_ROD,
                        ModItems.LEAD_ROD,
                        ModItems.LUMIUM_ROD,
                        ModItems.NETHERITE_ROD,
                        ModItems.NICKEL_ROD,
                        ModItems.SIGNALUM_ROD,
                        ModItems.OSMIUM_ROD,
                        ModItems.PLASTIC_ROD,
                        ModItems.PLATINUM_ROD,
                        ModItems.QUARTZ_ENRICHED_IRON_ROD,
                        ModItems.REFINED_GLOWSTONE_ROD,
                        ModItems.REFINED_OBSIDIAN_ROD,
                        ModItems.ROSE_GOLD_ROD,
                        ModItems.RUBY_ROD,
                        ModItems.SAPPHIRE_ROD,
                        ModItems.SILVER_ROD,
                        ModItems.STEEL_ROD,
                        ModItems.TIN_ROD,
                        ModItems.URANIUM_ROD,
                        ModItems.ZINC_ROD);

        this.tag(ModTags.Items.PLATES)
                .add(
                        ModItems.ANDESITE_ALLOY_PLATE,
                        ModItems.APATITE_PLATE,
                        ModItems.BRASS_PLATE,
                        ModItems.BRONZE_PLATE,
                        ModItems.CINNABAR_PLATE,
                        ModItems.CONSTANTAN_PLATE,
                        ModItems.COPPER_PLATE,
                        ModItems.DIAMOND_PLATE,
                        ModItems.ELECTRUM_PLATE,
                        ModItems.EMERALD_PLATE,
                        ModItems.ENDERIUM_PLATE,
                        ModItems.GOLD_PLATE,
                        ModItems.GRAPHITE_PLATE,
                        ModItems.INVAR_PLATE,
                        ModItems.IRON_PLATE,
                        ModItems.LAPIS_LAZULI_PLATE,
                        ModItems.LEAD_PLATE,
                        ModItems.LUMIUM_PLATE,
                        ModItems.NETHERITE_PLATE,
                        ModItems.NICKEL_PLATE,
                        ModItems.SIGNALUM_PLATE,
                        ModItems.OSMIUM_PLATE,
                        ModItems.PLASTIC_PLATE,
                        ModItems.PLATINUM_PLATE,
                        ModItems.QUARTZ_PLATE,
                        ModItems.QUARTZ_ENRICHED_IRON_PLATE,
                        ModItems.REFINED_GLOWSTONE_PLATE,
                        ModItems.REFINED_OBSIDIAN_PLATE,
                        ModItems.ROSE_GOLD_PLATE,
                        ModItems.RUBY_PLATE,
                        ModItems.SAPPHIRE_PLATE,
                        ModItems.SILVER_PLATE,
                        ModItems.STEEL_PLATE,
                        ModItems.TIN_PLATE,
                        ModItems.URANIUM_PLATE,
                        ModItems.ZINC_PLATE);

        this.tag(ModTags.Items.GEARS)
                .add(
                        ModItems.ANDESITE_ALLOY_GEAR,
                        ModItems.ALUMINUM_GEAR,
                        ModItems.BRASS_GEAR,
                        ModItems.BRONZE_GEAR,
                        ModItems.CONSTANTAN_GEAR,
                        ModItems.COPPER_GEAR,
                        ModItems.DIAMOND_GEAR,
                        ModItems.ELECTRUM_GEAR,
                        ModItems.EMERALD_GEAR,
                        ModItems.ENDERIUM_GEAR,
                        ModItems.GOLD_GEAR,
                        ModItems.INVAR_GEAR,
                        ModItems.IRON_GEAR,
                        ModItems.LAPIS_LAZULI_GEAR,
                        ModItems.LEAD_GEAR,
                        ModItems.LUMIUM_GEAR,
                        ModItems.NETHERITE_GEAR,
                        ModItems.NICKEL_GEAR,
                        ModItems.SIGNALUM_GEAR,
                        ModItems.OSMIUM_GEAR,
                        ModItems.PLATINUM_GEAR,
                        ModItems.QUARTZ_GEAR,
                        ModItems.QUARTZ_ENRICHED_IRON_GEAR,
                        ModItems.REFINED_OBSIDIAN_GEAR,
                        ModItems.REFINED_GLOWSTONE_GEAR,
                        ModItems.ROSE_GOLD_GEAR,
                        ModItems.RUBY_GEAR,
                        ModItems.SAPPHIRE_GEAR,
                        ModItems.SILVER_GEAR,
                        ModItems.STEEL_GEAR,
                        ModItems.TIN_GEAR,
                        ModItems.URANIUM_GEAR,
                        ModItems.ZINC_GEAR);

        this.tag(ModTags.Items.GEMS)
                .add(
                        ModItems.APATITE,
                        ModItems.CINNABAR,
                        ModItems.RUBY,
                        ModItems.SAPPHIRE);

        this.tag(ModTags.Items.NUGGETS)
                .add(
                        ModItems.ANDESITE_ALLOY_NUGGET,
                        ModItems.ALUMINUM_NUGGET,
                        ModItems.BRASS_NUGGET,
                        ModItems.BRONZE_NUGGET,
                        ModItems.CONSTANTAN_NUGGET,
                        ModItems.ELECTRUM_NUGGET,
                        ModItems.ENDERIUM_NUGGET,
                        ModItems.INVAR_NUGGET,
                        ModItems.LEAD_NUGGET,
                        ModItems.LUMIUM_NUGGET,
                        ModItems.NICKEL_NUGGET,
                        ModItems.SIGNALUM_NUGGET,
                        ModItems.OSMIUM_NUGGET,
                        ModItems.PLATINUM_NUGGET,
                        ModItems.QUARTZ_ENRICHED_IRON_NUGGET,
                        ModItems.REFINED_GLOWSTONE_INGOT,
                        ModItems.REFINED_OBSIDIAN_NUGGET,
                        ModItems.ROSE_GOLD_NUGGET,
                        ModItems.SILVER_NUGGET,
                        ModItems.STEEL_NUGGET,
                        ModItems.TIN_NUGGET,
                        ModItems.URANIUM_NUGGET,
                        ModItems.ZINC_NUGGET);

        this.tag(ModTags.Items.INGOTS)
                .add(
                        ModItems.ALUMINUM_INGOT,
                        ModItems.ANDESITE_ALLOY_INGOT,
                        ModItems.BRASS_INGOT,
                        ModItems.BRONZE_INGOT,
                        ModItems.CONSTANTAN_INGOT,
                        ModItems.ELECTRUM_INGOT,
                        ModItems.ENDERIUM_INGOT,
                        ModItems.GRAPHITE_INGOT,
                        ModItems.INVAR_INGOT,
                        ModItems.IRON_COMPRESSED_INGOT,
                        ModItems.LEAD_INGOT,
                        ModItems.LUMIUM_INGOT,
                        ModItems.NICKEL_INGOT,
                        ModItems.OSMIUM_INGOT,
                        ModItems.PLATINUM_INGOT,
                        ModItems.REFINED_GLOWSTONE_INGOT,
                        ModItems.REFINED_OBSIDIAN_INGOT,
                        ModItems.ROSE_GOLD_INGOT,
                        ModItems.SIGNALUM_INGOT,
                        ModItems.SILVER_INGOT,
                        ModItems.STEEL_INGOT,
                        ModItems.TIN_INGOT,
                        ModItems.ZINC_INGOT);

        this.tag(ModTags.Items.RAW_MATERIALS)
                .add(
                        ModItems.RAW_ALUMINUM,
                        ModItems.RAW_LEAD,
                        ModItems.RAW_NICKEL,
                        ModItems.RAW_OSMIUM,
                        ModItems.RAW_PLATINUM,
                        ModItems.RAW_SILVER,
                        ModItems.RAW_TIN,
                        ModItems.RAW_URANIUM,
                        ModItems.RAW_ZINC);
    }
}

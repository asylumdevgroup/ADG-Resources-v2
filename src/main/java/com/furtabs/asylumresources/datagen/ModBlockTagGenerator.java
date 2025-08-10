package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.block.ModBlocks;
import com.furtabs.asylumresources.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper ){
        super(output, lookupProvider, com.furtabs.asylumresources.AsylumRes.MOD_ID, existingFileHelper);
    }

    private static TagKey<Block> tag(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, name));
    }

    public static final TagKey<Block> MINEABLE_WITH_HAMMER = tag("mineable/hammer");

    @Override
    protected void addTags(HolderLookup.Provider pProvider ){
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.ANDESITE_ALLOY_BLOCK.get(),
                        ModBlocks.APATITE_BLOCK.get(),
                        ModBlocks.APATITE_ORE.get(),
                        ModBlocks.BRASS_BLOCK.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.CINNABAR_BLOCK.get(),
                        ModBlocks.CINNABAR_ORE.get(),
                        ModBlocks.CONSTANTAN_BLOCK.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_APATITE_ORE.get(),
                        ModBlocks.DEEPSLATE_CINNABAR_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_URANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ZINC_ORE.get(),
                        ModBlocks.ELECTRUM_BLOCK.get(),
                        ModBlocks.ENDERIUM_BLOCK.get(),
                        ModBlocks.GRAPHITE_BLOCK.get(),
                        ModBlocks.IRON_COMPRESSED_BLOCK.get(),
                        ModBlocks.INVAR_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.LUMIUM_BLOCK.get(),
                        ModBlocks.NICKEL_BLOCK.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.OSMIUM_BLOCK.get(),
                        ModBlocks.OSMIUM_ORE.get(),
                        ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                        ModBlocks.RAW_LEAD_BLOCK.get(),
                        ModBlocks.RAW_NICKEL_BLOCK.get(),
                        ModBlocks.RAW_OSMIUM_BLOCK.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.RAW_URANIUM_BLOCK.get(),
                        ModBlocks.RAW_ZINC_BLOCK.get(),
                        ModBlocks.REFINED_GLOWSTONE_BLOCK.get(),
                        ModBlocks.REFINED_OBSIDIAN_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.SIGNALUM_BLOCK.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.URANIUM_BLOCK.get(),
                        ModBlocks.URANIUM_ORE.get(),
                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.ZINC_ORE.get());

        this.tag(MINEABLE_WITH_HAMMER)
                .add(ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.ANDESITE_ALLOY_BLOCK.get(),
                        ModBlocks.APATITE_BLOCK.get(),
                        ModBlocks.APATITE_ORE.get(),
                        ModBlocks.BRASS_BLOCK.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.CINNABAR_BLOCK.get(),
                        ModBlocks.CINNABAR_ORE.get(),
                        ModBlocks.CONSTANTAN_BLOCK.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_APATITE_ORE.get(),
                        ModBlocks.DEEPSLATE_CINNABAR_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_URANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ZINC_ORE.get(),
                        ModBlocks.ELECTRUM_BLOCK.get(),
                        ModBlocks.ENDERIUM_BLOCK.get(),
                        ModBlocks.GRAPHITE_BLOCK.get(),
                        ModBlocks.IRON_COMPRESSED_BLOCK.get(),
                        ModBlocks.INVAR_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.LUMIUM_BLOCK.get(),
                        ModBlocks.NICKEL_BLOCK.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.OSMIUM_BLOCK.get(),
                        ModBlocks.OSMIUM_ORE.get(),
                        ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                        ModBlocks.RAW_LEAD_BLOCK.get(),
                        ModBlocks.RAW_NICKEL_BLOCK.get(),
                        ModBlocks.RAW_OSMIUM_BLOCK.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.RAW_URANIUM_BLOCK.get(),
                        ModBlocks.RAW_ZINC_BLOCK.get(),
                        ModBlocks.REFINED_GLOWSTONE_BLOCK.get(),
                        ModBlocks.REFINED_OBSIDIAN_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.SIGNALUM_BLOCK.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.URANIUM_BLOCK.get(),
                        ModBlocks.URANIUM_ORE.get(),
                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.ZINC_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ZINC_ORE.get(),
                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.RAW_ZINC_BLOCK.get(),
                        ModBlocks.DEEPSLATE_ZINC_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.RAW_LEAD_BLOCK.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.APATITE_BLOCK.get(),
                        ModBlocks.APATITE_ORE.get(),
                        ModBlocks.DEEPSLATE_APATITE_ORE.get(),
                        ModBlocks.CINNABAR_ORE.get(),
                        ModBlocks.CINNABAR_BLOCK.get(),
                        ModBlocks.DEEPSLATE_CINNABAR_ORE.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.BRASS_BLOCK.get(),
                        ModBlocks.ELECTRUM_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.ANDESITE_ALLOY_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.GRAPHITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NICKEL_BLOCK.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.RAW_NICKEL_BLOCK.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.URANIUM_ORE.get(),
                        ModBlocks.URANIUM_BLOCK.get(),
                        ModBlocks.RAW_URANIUM_BLOCK.get(),
                        ModBlocks.DEEPSLATE_URANIUM_ORE.get(),
                        // Osmium now requires diamond tools
                        ModBlocks.OSMIUM_BLOCK.get(),
                        ModBlocks.OSMIUM_ORE.get(),
                        ModBlocks.RAW_OSMIUM_BLOCK.get(),
                        ModBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                        ModBlocks.CONSTANTAN_BLOCK.get(),
                        ModBlocks.IRON_COMPRESSED_BLOCK.get(),
                        ModBlocks.INVAR_BLOCK.get(),
                        ModBlocks.SIGNALUM_BLOCK.get(),
                        ModBlocks.ENDERIUM_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILVER_ORE.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.REFINED_OBSIDIAN_BLOCK.get());

        this.tag(ModTags.Blocks.STORAGE_BLOCKS)
                .add(
                        ModBlocks.ANDESITE_ALLOY_BLOCK.get(),
                        ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.APATITE_BLOCK.get(),
                        ModBlocks.BRASS_BLOCK.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.CINNABAR_BLOCK.get(),
                        ModBlocks.CONSTANTAN_BLOCK.get(),
                        ModBlocks.ELECTRUM_BLOCK.get(),
                        ModBlocks.ENDERIUM_BLOCK.get(),
                        ModBlocks.GRAPHITE_BLOCK.get(),
                        ModBlocks.INVAR_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.LUMIUM_BLOCK.get(),
                        ModBlocks.NICKEL_BLOCK.get(),
                        ModBlocks.SIGNALUM_BLOCK.get(),
                        ModBlocks.OSMIUM_BLOCK.get(),
                        ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK.get(),
                        ModBlocks.REFINED_GLOWSTONE_BLOCK.get(),
                        ModBlocks.REFINED_OBSIDIAN_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.URANIUM_BLOCK.get(),
                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                        ModBlocks.RAW_LEAD_BLOCK.get(),
                        ModBlocks.RAW_NICKEL_BLOCK.get(),
                        ModBlocks.RAW_OSMIUM_BLOCK.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.RAW_URANIUM_BLOCK.get(),
                        ModBlocks.RAW_ZINC_BLOCK.get());

        this.tag(ModTags.Blocks.ORES)
                .add(
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.APATITE_ORE.get(),
                        ModBlocks.DEEPSLATE_APATITE_ORE.get(),
                        ModBlocks.CINNABAR_ORE.get(),
                        ModBlocks.DEEPSLATE_CINNABAR_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.OSMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.URANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_URANIUM_ORE.get(),
                        ModBlocks.ZINC_ORE.get(),
                        ModBlocks.DEEPSLATE_ZINC_ORE.get());

        // Mirror NeoForge block tags into common `c:` tags for cross-loader compatibility
        this.tag(com.furtabs.asylumresources.util.ModTags.CBlocks.STORAGE_BLOCKS)
                .addTag(ModTags.Blocks.STORAGE_BLOCKS);
        this.tag(com.furtabs.asylumresources.util.ModTags.CBlocks.ORES)
                .addTag(ModTags.Blocks.ORES);
    }
}

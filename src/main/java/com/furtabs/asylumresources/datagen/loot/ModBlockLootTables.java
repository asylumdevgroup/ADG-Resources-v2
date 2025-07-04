package com.furtabs.asylumresources.datagen.loot;

import com.furtabs.asylumresources.block.ModBlocks;
import com.furtabs.asylumresources.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    private final HolderLookup.Provider provider;

    public ModBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
        this.provider = provider;
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.ANDESITE_ALLOY_BLOCK.get());
        this.dropSelf(ModBlocks.APATITE_BLOCK.get());
        this.dropSelf(ModBlocks.BRASS_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.CINNABAR_BLOCK.get());
        this.dropSelf(ModBlocks.CONSTANTAN_BLOCK.get());
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.GRAPHITE_BLOCK.get());
        this.dropSelf(ModBlocks.IRON_COMPRESSED_BLOCK.get());
        this.dropSelf(ModBlocks.INVAR_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LUMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NICKEL_BLOCK.get());
        this.dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_NICKEL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_OBSIDIAN_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_GLOWSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_ORE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_ORE.get());
        this.dropSelf(ModBlocks.SIGNALUM_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_ORE.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_ORE.get());
        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.URANIUM_ORE.get());
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.ZINC_ORE.get());

        this.add(ModBlocks.ALUMINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.add(ModBlocks.APATITE_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.APATITE_ORE.get(), ModItems.APATITE.get()));

        this.add(ModBlocks.CINNABAR_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.CINNABAR_ORE.get(), ModItems.CINNABAR.get()));

        this.add(ModBlocks.DEEPSLATE_APATITE_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_APATITE_ORE.get(), ModItems.APATITE.get()));

        this.add(ModBlocks.DEEPSLATE_CINNABAR_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_CINNABAR_ORE.get(), ModItems.CINNABAR.get()));

        this.add(ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));

        this.add(ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE.get(), ModItems.RAW_NICKEL.get()));

        this.add(ModBlocks.DEEPSLATE_OSMIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get()));

        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));

        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));

        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));

        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.DEEPSLATE_URANIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModItems.RAW_URANIUM.get()));

        this.add(ModBlocks.DEEPSLATE_ZINC_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));

        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));

        this.add(ModBlocks.NICKEL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NICKEL_ORE.get(), ModItems.RAW_NICKEL.get()));

        this.add(ModBlocks.OSMIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get()));

        this.add(ModBlocks.PLATINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));

        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));

        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createGemLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.add(ModBlocks.TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.URANIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.URANIUM_ORE.get(), ModItems.RAW_URANIUM.get()));

        this.add(ModBlocks.ZINC_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(
                                    this.provider.lookup(net.minecraft.core.registries.Registries.ENCHANTMENT)
                                        .orElseThrow()
                                        .getOrThrow(Enchantments.FORTUNE)
                                ))));
    }

    protected LootTable.Builder createGemLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(
                                    this.provider.lookup(net.minecraft.core.registries.Registries.ENCHANTMENT)
                                        .orElseThrow()
                                        .getOrThrow(Enchantments.FORTUNE)
                                ))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return java.util.List.of(
            ModBlocks.ALUMINUM_BLOCK.get(),
            ModBlocks.ANDESITE_ALLOY_BLOCK.get(),
            ModBlocks.APATITE_BLOCK.get(),
            ModBlocks.BRASS_BLOCK.get(),
            ModBlocks.BRONZE_BLOCK.get(),
            ModBlocks.CINNABAR_BLOCK.get(),
            ModBlocks.CONSTANTAN_BLOCK.get(),
            ModBlocks.ELECTRUM_BLOCK.get(),
            ModBlocks.ENDERIUM_BLOCK.get(),
            ModBlocks.GRAPHITE_BLOCK.get(),
            ModBlocks.IRON_COMPRESSED_BLOCK.get(),
            ModBlocks.INVAR_BLOCK.get(),
            ModBlocks.LEAD_BLOCK.get(),
            ModBlocks.LUMIUM_BLOCK.get(),
            ModBlocks.NICKEL_BLOCK.get(),
            ModBlocks.OSMIUM_BLOCK.get(),
            ModBlocks.PLATINUM_BLOCK.get(),
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
            ModBlocks.REFINED_OBSIDIAN_BLOCK.get(),
            ModBlocks.REFINED_GLOWSTONE_BLOCK.get(),
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
            ModBlocks.ZINC_ORE.get(),
            ModBlocks.ALUMINUM_ORE.get(),
            ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
            ModBlocks.APATITE_ORE.get(),
            ModBlocks.CINNABAR_ORE.get(),
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
            ModBlocks.LEAD_ORE.get(),
            ModBlocks.NICKEL_ORE.get(),
            ModBlocks.OSMIUM_ORE.get(),
            ModBlocks.PLATINUM_ORE.get(),
            ModBlocks.SILVER_ORE.get(),
            ModBlocks.TIN_ORE.get(),
            ModBlocks.URANIUM_ORE.get(),
            ModBlocks.ZINC_ORE.get()
        );
    }
}

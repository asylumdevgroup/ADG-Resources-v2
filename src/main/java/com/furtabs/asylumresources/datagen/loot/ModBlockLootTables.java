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

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    private final HolderLookup.Provider provider;

    public ModBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
        this.provider = provider;
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK);
        this.dropSelf(ModBlocks.ANDESITE_ALLOY_BLOCK);
        this.dropSelf(ModBlocks.APATITE_BLOCK);
        this.dropSelf(ModBlocks.BRASS_BLOCK);
        this.dropSelf(ModBlocks.BRONZE_BLOCK);
        this.dropSelf(ModBlocks.CINNABAR_BLOCK);
        this.dropSelf(ModBlocks.CONSTANTAN_BLOCK);
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK);
        this.dropSelf(ModBlocks.ENDERIUM_BLOCK);
        this.dropSelf(ModBlocks.GRAPHITE_BLOCK);
        this.dropSelf(ModBlocks.IRON_COMPRESSED_BLOCK);
        this.dropSelf(ModBlocks.INVAR_BLOCK);
        this.dropSelf(ModBlocks.LEAD_BLOCK);
        this.dropSelf(ModBlocks.LUMIUM_BLOCK);
        this.dropSelf(ModBlocks.NICKEL_BLOCK);
        this.dropSelf(ModBlocks.OSMIUM_BLOCK);
        this.dropSelf(ModBlocks.PLATINUM_BLOCK);
        this.dropSelf(ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK);
        this.dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK);
        this.dropSelf(ModBlocks.RAW_NICKEL_BLOCK);
        this.dropSelf(ModBlocks.RAW_OSMIUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK);
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.REFINED_OBSIDIAN_BLOCK);
        this.dropSelf(ModBlocks.REFINED_GLOWSTONE_BLOCK);
        this.dropSelf(ModBlocks.ROSE_GOLD_BLOCK);
        this.dropSelf(ModBlocks.RUBY_BLOCK);
        this.dropSelf(ModBlocks.RUBY_ORE);
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        this.dropSelf(ModBlocks.SAPPHIRE_ORE);
        this.dropSelf(ModBlocks.SIGNALUM_BLOCK);
        this.dropSelf(ModBlocks.SILVER_BLOCK);
        this.dropSelf(ModBlocks.SILVER_ORE);
        this.dropSelf(ModBlocks.STEEL_BLOCK);
        this.dropSelf(ModBlocks.TIN_BLOCK);
        this.dropSelf(ModBlocks.TIN_ORE);
        this.dropSelf(ModBlocks.URANIUM_BLOCK);
        this.dropSelf(ModBlocks.URANIUM_ORE);
        this.dropSelf(ModBlocks.ZINC_BLOCK);
        this.dropSelf(ModBlocks.ZINC_ORE);

        this.add(ModBlocks.ALUMINUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.ALUMINUM_ORE, ModItems.RAW_ALUMINUM));

        this.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ALUMINUM_ORE, ModItems.RAW_ALUMINUM));

        this.add(ModBlocks.APATITE_ORE,
                block -> createGemLikeOreDrops(ModBlocks.APATITE_ORE, ModItems.APATITE));

        this.add(ModBlocks.CINNABAR_ORE,
                block -> createGemLikeOreDrops(ModBlocks.CINNABAR_ORE, ModItems.CINNABAR));

        this.add(ModBlocks.DEEPSLATE_APATITE_ORE,
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_APATITE_ORE, ModItems.APATITE));

        this.add(ModBlocks.DEEPSLATE_CINNABAR_ORE,
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_CINNABAR_ORE, ModItems.CINNABAR));

        this.add(ModBlocks.DEEPSLATE_LEAD_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD));

        this.add(ModBlocks.DEEPSLATE_NICKEL_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE, ModItems.RAW_NICKEL));

        this.add(ModBlocks.DEEPSLATE_OSMIUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_OSMIUM_ORE, ModItems.RAW_OSMIUM));

        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));

        this.add(ModBlocks.DEEPSLATE_RUBY_ORE,
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));

        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                block -> createGemLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));

        this.add(ModBlocks.DEEPSLATE_SILVER_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));

        this.add(ModBlocks.DEEPSLATE_TIN_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));

        this.add(ModBlocks.DEEPSLATE_URANIUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.RAW_URANIUM));

        this.add(ModBlocks.DEEPSLATE_ZINC_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ZINC_ORE, ModItems.RAW_ZINC));

        this.add(ModBlocks.LEAD_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));

        this.add(ModBlocks.NICKEL_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));

        this.add(ModBlocks.OSMIUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.OSMIUM_ORE, ModItems.RAW_OSMIUM));

        this.add(ModBlocks.PLATINUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));

        this.add(ModBlocks.RUBY_ORE,
                block -> createGemLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));

        this.add(ModBlocks.SAPPHIRE_ORE,
                block -> createGemLikeOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));

        this.add(ModBlocks.SILVER_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));

        this.add(ModBlocks.TIN_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));

        this.add(ModBlocks.URANIUM_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.URANIUM_ORE, ModItems.RAW_URANIUM));

        this.add(ModBlocks.ZINC_ORE,
                block -> createCopperLikeOreDrops(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC));

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
            ModBlocks.ALUMINUM_BLOCK,
            ModBlocks.ANDESITE_ALLOY_BLOCK,
            ModBlocks.APATITE_BLOCK,
            ModBlocks.BRASS_BLOCK,
            ModBlocks.BRONZE_BLOCK,
            ModBlocks.CINNABAR_BLOCK,
            ModBlocks.CONSTANTAN_BLOCK,
            ModBlocks.ELECTRUM_BLOCK,
            ModBlocks.ENDERIUM_BLOCK,
            ModBlocks.GRAPHITE_BLOCK,
            ModBlocks.IRON_COMPRESSED_BLOCK,
            ModBlocks.INVAR_BLOCK,
            ModBlocks.LEAD_BLOCK,
            ModBlocks.LUMIUM_BLOCK,
            ModBlocks.NICKEL_BLOCK,
            ModBlocks.OSMIUM_BLOCK,
            ModBlocks.PLATINUM_BLOCK,
            ModBlocks.QUARTZ_ENRICHED_IRON_BLOCK,
            ModBlocks.RAW_ALUMINUM_BLOCK,
            ModBlocks.RAW_LEAD_BLOCK,
            ModBlocks.RAW_NICKEL_BLOCK,
            ModBlocks.RAW_OSMIUM_BLOCK,
            ModBlocks.RAW_PLATINUM_BLOCK,
            ModBlocks.RAW_SILVER_BLOCK,
            ModBlocks.RAW_TIN_BLOCK,
            ModBlocks.RAW_URANIUM_BLOCK,
            ModBlocks.RAW_ZINC_BLOCK,
            ModBlocks.REFINED_OBSIDIAN_BLOCK,
            ModBlocks.REFINED_GLOWSTONE_BLOCK,
            ModBlocks.ROSE_GOLD_BLOCK,
            ModBlocks.RUBY_BLOCK,
            ModBlocks.RUBY_ORE,
            ModBlocks.SAPPHIRE_BLOCK,
            ModBlocks.SAPPHIRE_ORE,
            ModBlocks.SIGNALUM_BLOCK,
            ModBlocks.SILVER_BLOCK,
            ModBlocks.SILVER_ORE,
            ModBlocks.STEEL_BLOCK,
            ModBlocks.TIN_BLOCK,
            ModBlocks.TIN_ORE,
            ModBlocks.URANIUM_BLOCK,
            ModBlocks.URANIUM_ORE,
            ModBlocks.ZINC_BLOCK,
            ModBlocks.ZINC_ORE,
            ModBlocks.ALUMINUM_ORE,
            ModBlocks.DEEPSLATE_ALUMINUM_ORE,
            ModBlocks.APATITE_ORE,
            ModBlocks.CINNABAR_ORE,
            ModBlocks.DEEPSLATE_APATITE_ORE,
            ModBlocks.DEEPSLATE_CINNABAR_ORE,
            ModBlocks.DEEPSLATE_LEAD_ORE,
            ModBlocks.DEEPSLATE_NICKEL_ORE,
            ModBlocks.DEEPSLATE_OSMIUM_ORE,
            ModBlocks.DEEPSLATE_PLATINUM_ORE,
            ModBlocks.DEEPSLATE_RUBY_ORE,
            ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
            ModBlocks.DEEPSLATE_SILVER_ORE,
            ModBlocks.DEEPSLATE_TIN_ORE,
            ModBlocks.DEEPSLATE_URANIUM_ORE,
            ModBlocks.DEEPSLATE_ZINC_ORE,
            ModBlocks.LEAD_ORE,
            ModBlocks.NICKEL_ORE,
            ModBlocks.OSMIUM_ORE,
            ModBlocks.PLATINUM_ORE,
            ModBlocks.SILVER_ORE,
            ModBlocks.TIN_ORE,
            ModBlocks.URANIUM_ORE,
            ModBlocks.ZINC_ORE
        );
    }
}

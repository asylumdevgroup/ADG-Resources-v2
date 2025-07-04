package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.block.ModBlocks;
import com.furtabs.asylumresources.item.ModItems;
import com.furtabs.asylumresources.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    //SMELTABLES

    private static final List<ItemLike> ALUMINUM_DUST = List.of(ModItems.ALUMINUM_DUST.get());
    private static final List<ItemLike> ANDESITE_ALLOY_DUST = List.of(ModItems.ANDESITE_ALLOY_DUST.get());
    private static final List<ItemLike> BRASS_DUST = List.of(ModItems.BRASS_DUST.get());
    private static final List<ItemLike> BRONZE_DUST = List.of(ModItems.BRONZE_DUST.get());
    private static final List<ItemLike> CONSTANTAN_DUST = List.of(ModItems.CONSTANTAN_DUST.get());
    private static final List<ItemLike> ELECTRUM_DUST = List.of(ModItems.ELECTRUM_DUST.get());
    private static final List<ItemLike> ENDERIUM_DUST = List.of(ModItems.ENDERIUM_DUST.get());
    private static final List<ItemLike> GRAPHITE_DUST = List.of(ModItems.GRAPHITE_DUST.get());
    private static final List<ItemLike> INVAR_DUST = List.of(ModItems.INVAR_DUST.get());
    private static final List<ItemLike> IRON_COMPRESSED_DUST = List.of(ModItems.IRON_COMPRESSED_DUST.get());
    private static final List<ItemLike> LEAD_DUST = List.of(ModItems.LEAD_DUST.get());
    private static final List<ItemLike> LUMIUM_DUST = List.of(ModItems.LUMIUM_DUST.get());
    private static final List<ItemLike> NICKEL_DUST = List.of(ModItems.NICKEL_DUST.get());
    private static final List<ItemLike> OSMIUM_DUST = List.of(ModItems.OSMIUM_DUST.get());
    private static final List<ItemLike> PLATINUM_DUST = List.of(ModItems.PLATINUM_DUST.get());
    private static final List<ItemLike> QUARTZ_ENRICHED_IRON_DUST = List.of(ModItems.QUARTZ_ENRICHED_IRON_DUST.get());
    private static final List<ItemLike> REFINED_GLOWSTONE_DUST = List.of(ModItems.REFINED_GLOWSTONE_DUST.get());
    private static final List<ItemLike> REFINED_OBSIDIAN_DUST = List.of(ModItems.REFINED_OBSIDIAN_DUST.get());
    private static final List<ItemLike> ROSE_GOLD_DUST = List.of(ModItems.ROSE_GOLD_DUST.get());
    private static final List<ItemLike> SIGNALUM_DUST = List.of(ModItems.SIGNALUM_DUST.get());
    private static final List<ItemLike> SILVER_DUST = List.of(ModItems.SILVER_DUST.get());
    private static final List<ItemLike> STEEL_DUST = List.of(ModItems.STEEL_DUST.get());
    private static final List<ItemLike> TIN_DUST = List.of(ModItems.TIN_DUST.get());
    private static final List<ItemLike> URANIUM_DUST = List.of(ModItems.URANIUM_DUST.get());
    private static final List<ItemLike> ZINC_DUST = List.of(ModItems.ZINC_DUST.get());

    public ModRecipeProvider(PackOutput pOutput, java.util.concurrent.CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        //BLOCKS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINUM_BLOCK.get())
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_aluminum_ingot", has(ModItems.ALUMINUM_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ANDESITE_ALLOY_BLOCK.get())
                .define('A', ModItems.ANDESITE_ALLOY_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_andesite_alloy_ingot", has(ModItems.ANDESITE_ALLOY_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.APATITE_BLOCK.get())
                .define('A', ModItems.APATITE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_apatite", has(ModItems.APATITE.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRASS_BLOCK.get())
                .define('A', ModItems.BRASS_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_brass_ingot", has(ModItems.BRASS_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get())
                .define('A', ModItems.BRONZE_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CINNABAR_BLOCK.get())
                .define('A', ModItems.CINNABAR.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_cinnabar", has(ModItems.CINNABAR.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONSTANTAN_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CONSTANTAN_INGOT.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTRUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ENDERIUM_INGOT.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAPHITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.GRAPHITE_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INVAR_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.INVAR_INGOT.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRON_COMPRESSED_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.IRON_COMPRESSED_INGOT.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LEAD_INGOT.get())
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUMIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LUMIUM_INGOT.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.NICKEL_INGOT.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OSMIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_GLOWSTONE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.REFINED_GLOWSTONE_INGOT.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_OBSIDIAN_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.REFINED_OBSIDIAN_INGOT.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SIGNALUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SIGNALUM_INGOT.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.URANIUM_INGOT.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_INGOT.get()).build()))
                .save(output);

        //GEARS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ALUMINUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ANDESITE_ALLOY_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.BRASS_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRASS_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.BRONZE_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.CONSTANTAN_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.COPPER_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.DIAMOND)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ELECTRUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.EMERALD)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERIUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ENDERIUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.GOLD_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.INVAR_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.IRON_COMPRESSED_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.IRON_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LAPIS_LAZULI_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.LAPIS_LAZULI)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.LEAD_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUMIUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.LUMIUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.NETHERITE_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.NICKEL_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.OSMIUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.PLATINUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.QUARTZ_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.QUARTZ)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_quartz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.QUARTZ).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.REFINED_GLOWSTONE_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.REFINED_OBSIDIAN_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ROSE_GOLD_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.RUBY.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.SAPPHIRE.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SIGNALUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.SIGNALUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.SILVER_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.STEEL_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.TIN_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.URANIUM_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_GEAR.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.ZINC_INGOT.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_INGOT.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(output);

        //INGOTS FROM NUGGETS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALUMINUM_NUGGET.get())
                .unlockedBy("has_aluminum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ANDESITE_ALLOY_NUGGET.get())
                .unlockedBy("has_andesite_alloy_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BRONZE_NUGGET.get())
                .unlockedBy("has_brass_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BRONZE_NUGGET.get())
                .unlockedBy("has_bronze_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CONSTANTAN_NUGGET.get())
                .unlockedBy("has_constantan_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.COPPER_NUGGET.get())
                .unlockedBy("has_copper_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.COPPER_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ELECTRUM_NUGGET.get())
                .unlockedBy("has_electrum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ENDERIUM_NUGGET.get())
                .unlockedBy("has_enderium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.INVAR_NUGGET.get())
                .unlockedBy("has_invar_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.IRON_COMPRESSED_NUGGET.get())
                .unlockedBy("has_iron_compressed_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LEAD_NUGGET.get())
                .unlockedBy("has_lead_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUMIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LUMIUM_NUGGET.get())
                .unlockedBy("has_lumium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHERITE_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.NETHERITE_NUGGET.get())
                .unlockedBy("has_netherite_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NETHERITE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.NICKEL_NUGGET.get())
                .unlockedBy("has_nickel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OSMIUM_NUGGET.get())
                .unlockedBy("has_osmium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PLATINUM_NUGGET.get())
                .unlockedBy("has_platinum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.REFINED_GLOWSTONE_NUGGET.get())
                .unlockedBy("has_refined_glowstone_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.REFINED_OBSIDIAN_NUGGET.get())
                .unlockedBy("has_refined_obsidian_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_GOLD_NUGGET.get())
                .unlockedBy("has_rose_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SIGNALUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SIGNALUM_NUGGET.get())
                .unlockedBy("has_signalum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_NUGGET.get())
                .unlockedBy("has_silver_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_steel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TIN_NUGGET.get())
                .unlockedBy("has_tin_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.URANIUM_NUGGET.get())
                .unlockedBy("has_uranium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ZINC_NUGGET.get())
                .unlockedBy("has_zinc_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_NUGGET.get()).build()))
                .save(output);

        //RODS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ANDESITE_ALLOY_INGOT.get())
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.APATITE_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.APATITE.get())
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.APATITE.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.BRASS_INGOT.get())
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRASS_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CINNABAR_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.CINNABAR.get())
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CINNABAR.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.CONSTANTAN_INGOT.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERIUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ENDERIUM_INGOT.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GRAPHITE_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.GRAPHITE_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.INVAR_INGOT.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.IRON_COMPRESSED_INGOT.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.LEAD_INGOT.get())
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUMIUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.LUMIUM_INGOT.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.NICKEL_INGOT.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLASTIC_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.PLASTIC_PLATE.get())
                .unlockedBy("has_plastic_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLASTIC_PLATE.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.REFINED_GLOWSTONE_INGOT.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.REFINED_OBSIDIAN_INGOT.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SIGNALUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.SIGNALUM_INGOT.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.URANIUM_INGOT.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_INGOT.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_ROD.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_INGOT.get()).build()))
                .save(output);

        //COINS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ALUMINUM_NUGGET.get())
                .unlockedBy("has_aluminum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ANDESITE_ALLOY_NUGGET.get())
                .unlockedBy("has_andesite_alloy_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.BRASS_NUGGET.get())
                .unlockedBy("has_brass_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRASS_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.BRONZE_NUGGET.get())
                .unlockedBy("has_bronze_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.CONSTANTAN_NUGGET.get())
                .unlockedBy("has_constantan_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.COPPER_NUGGET.get())
                .unlockedBy("has_copper_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.COPPER_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ELECTRUM_NUGGET.get())
                .unlockedBy("has_electrum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERIUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ENDERIUM_NUGGET.get())
                .unlockedBy("has_enderium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', Items.GOLD_NUGGET)
                .unlockedBy("has_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_NUGGET).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.INVAR_NUGGET.get())
                .unlockedBy("has_invar_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.IRON_COMPRESSED_NUGGET.get())
                .unlockedBy("has_iron_compressed_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.LEAD_NUGGET.get())
                .unlockedBy("has_lead_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUMIUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.LUMIUM_NUGGET.get())
                .unlockedBy("has_lumium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.NETHERITE_NUGGET.get())
                .unlockedBy("has_netherite_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NETHERITE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.NICKEL_NUGGET.get())
                .unlockedBy("has_nickel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.OSMIUM_NUGGET.get())
                .unlockedBy("has_osmium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.PLATINUM_NUGGET.get())
                .unlockedBy("has_platinum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.REFINED_GLOWSTONE_NUGGET.get())
                .unlockedBy("has_refined_glowstone_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.REFINED_OBSIDIAN_NUGGET.get())
                .unlockedBy("has_refined_obsidian_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ROSE_GOLD_NUGGET.get())
                .unlockedBy("has_rose_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SIGNALUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.SIGNALUM_NUGGET.get())
                .unlockedBy("has_signalum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.SILVER_NUGGET.get())
                .unlockedBy("has_silver_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_steel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.TIN_NUGGET.get())
                .unlockedBy("has_tin_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.URANIUM_NUGGET.get())
                .unlockedBy("has_uranium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_NUGGET.get()).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_COIN.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ZINC_NUGGET.get())
                .unlockedBy("has_zinc_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_NUGGET.get()).build()))
                .save(output);

        //INGOTS FROM BLOCK

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINUM_BLOCK.get())
                .unlockedBy("has_aluminum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ALUMINUM_BLOCK.get()).build()))
                .save(output, "asylumresources:aluminum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_INGOT.get(), 9)
                .requires(ModBlocks.ANDESITE_ALLOY_BLOCK.get())
                .unlockedBy("has_andesite_alloy_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ANDESITE_ALLOY_BLOCK.get()).build()))
                .save(output, "asylumresources:andesite_alloy_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.APATITE.get(), 9)
                .requires(ModBlocks.APATITE_BLOCK.get())
                .unlockedBy("has_apatite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.APATITE_BLOCK.get()).build()))
                .save(output, "asylumresources:apatite_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRASS_INGOT.get(), 9)
                .requires(ModBlocks.BRASS_BLOCK.get())
                .unlockedBy("has_brass_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BRASS_BLOCK.get()).build()))
                .save(output, "asylumresources:brass_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK.get())
                .unlockedBy("has_bronze_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BRONZE_BLOCK.get()).build()))
                .save(output, "asylumresources:bronze_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNABAR.get(), 9)
                .requires(ModBlocks.CINNABAR_BLOCK.get())
                .unlockedBy("has_cinnabar_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CINNABAR_BLOCK.get()).build()))
                .save(output, "asylumresources:cinnabar_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CONSTANTAN_INGOT.get(), 9)
                .requires(ModBlocks.CONSTANTAN_BLOCK.get())
                .unlockedBy("has_constantan_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CONSTANTAN_BLOCK.get()).build()))
                .save(output, "asylumresources:constantan_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTRUM_INGOT.get(), 9)
                .requires(ModBlocks.ELECTRUM_BLOCK.get())
                .unlockedBy("has_electrum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ELECTRUM_BLOCK.get()).build()))
                .save(output, "asylumresources:electrum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT.get(), 9)
                .requires(ModBlocks.ENDERIUM_BLOCK.get())
                .unlockedBy("has_enderium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ENDERIUM_BLOCK.get()).build()))
                .save(output, "asylumresources:enderium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INVAR_INGOT.get(), 9)
                .requires(ModBlocks.INVAR_BLOCK.get())
                .unlockedBy("has_invar_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.INVAR_BLOCK.get()).build()))
                .save(output, "asylumresources:invar_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_INGOT.get(), 9)
                .requires(ModBlocks.IRON_COMPRESSED_BLOCK.get())
                .unlockedBy("has_iron_compressed_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.IRON_COMPRESSED_BLOCK.get()).build()))
                .save(output, "asylumresources:iron_compressed_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy("has_lead_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LEAD_BLOCK.get()).build()))
                .save(output, "asylumresources:lead_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUMIUM_INGOT.get(), 9)
                .requires(ModBlocks.LUMIUM_BLOCK.get())
                .unlockedBy("has_lumium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LUMIUM_BLOCK.get()).build()))
                .save(output, "asylumresources:lumium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9)
                .requires(ModBlocks.NICKEL_BLOCK.get())
                .unlockedBy("has_nickel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.NICKEL_BLOCK.get()).build()))
                .save(output, "asylumresources:nickel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 9)
                .requires(ModBlocks.OSMIUM_BLOCK.get())
                .unlockedBy("has_osmium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.OSMIUM_BLOCK.get()).build()))
                .save(output, "asylumresources:osmium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy("has_platinum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PLATINUM_BLOCK.get()).build()))
                .save(output, "asylumresources:platinum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_INGOT.get(), 9)
                .requires(ModBlocks.REFINED_GLOWSTONE_BLOCK.get())
                .unlockedBy("has_refined_glowstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.REFINED_GLOWSTONE_BLOCK.get()).build()))
                .save(output, "asylumresources:refined_glowstone_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_INGOT.get(), 9)
                .requires(ModBlocks.REFINED_OBSIDIAN_BLOCK.get())
                .unlockedBy("has_refined_obsidian_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.REFINED_OBSIDIAN_BLOCK.get()).build()))
                .save(output, "asylumresources:refined_obsidian_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK.get())
                .unlockedBy("has_rose_gold_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ROSE_GOLD_BLOCK.get()).build()))
                .save(output, "asylumresources:rose_gold_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBY_BLOCK.get()).build()))
                .save(output, "asylumresources:ruby_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SAPPHIRE_BLOCK.get()).build()))
                .save(output, "asylumresources:sapphire_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SIGNALUM_INGOT.get(), 9)
                .requires(ModBlocks.SIGNALUM_BLOCK.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SIGNALUM_BLOCK.get()).build()))
                .save(output, "asylumresources:signalum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SILVER_BLOCK.get()).build()))
                .save(output, "asylumresources:silver_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.STEEL_BLOCK.get()).build()))
                .save(output, "asylumresources:steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TIN_BLOCK.get()).build()))
                .save(output, "asylumresources:tin_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 9)
                .requires(ModBlocks.URANIUM_BLOCK.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.URANIUM_BLOCK.get()).build()))
                .save(output, "asylumresources:uranium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9)
                .requires(ModBlocks.ZINC_BLOCK.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ZINC_BLOCK.get()).build()))
                .save(output, "asylumresources:zinc_ingot_from_block");

        //NUGGETS

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINUM_INGOT.get())
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_NUGGET.get(), 9)
                .requires(ModItems.ANDESITE_ALLOY_INGOT.get())
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRASS_NUGGET.get(), 9)
                .requires(ModItems.BRASS_INGOT.get())
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRASS_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_NUGGET.get(), 9)
                .requires(ModItems.BRONZE_INGOT.get())
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CONSTANTAN_NUGGET.get(), 9)
                .requires(ModItems.CONSTANTAN_INGOT.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(), 9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTRUM_NUGGET.get(), 9)
                .requires(ModItems.ELECTRUM_INGOT.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERIUM_NUGGET.get(), 9)
                .requires(ModItems.ENDERIUM_INGOT.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INVAR_NUGGET.get(), 9)
                .requires(ModItems.INVAR_INGOT.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INVAR_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_NUGGET.get(), 9)
                .requires(ModItems.IRON_COMPRESSED_INGOT.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_NUGGET.get(), 9)
                .requires(ModItems.LEAD_INGOT.get())
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUMIUM_NUGGET.get(), 9)
                .requires(ModItems.LUMIUM_INGOT.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET.get(), 9)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_NUGGET.get(), 9)
                .requires(ModItems.NICKEL_INGOT.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_NUGGET.get(), 9)
                .requires(ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get(), 9)
                .requires(ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_NUGGET.get(), 9)
                .requires(ModItems.REFINED_GLOWSTONE_INGOT.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_NUGGET.get(), 9)
                .requires(ModItems.REFINED_OBSIDIAN_INGOT.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SIGNALUM_NUGGET.get(), 9)
                .requires(ModItems.SIGNALUM_INGOT.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9)
                .requires(ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_NUGGET.get(), 9)
                .requires(ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                .requires(ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_NUGGET.get(), 9)
                .requires(ModItems.URANIUM_INGOT.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_INGOT.get()).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_NUGGET.get(), 9)
                .requires(ModItems.ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_INGOT.get()).build()))
                .save(output);

        //PLATES

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_PLATE.get(), 1)
                .requires(ModItems.ALUMINUM_INGOT.get(), 2)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_PLATE.get(), 1)
                .requires(ModItems.ANDESITE_ALLOY_INGOT.get(), 2)
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ANDESITE_ALLOY_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.APATITE_PLATE.get(), 1)
                .requires(ModItems.APATITE.get(), 2)
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.APATITE.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRASS_PLATE.get(), 1)
                .requires(ModItems.BRASS_INGOT.get(), 2)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRASS_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_PLATE.get(), 1)
                .requires(ModItems.BRONZE_INGOT.get(), 2)
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BRONZE_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CONSTANTAN_PLATE.get(), 1)
                .requires(ModItems.CONSTANTAN_INGOT.get(), 2)
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CONSTANTAN_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_PLATE.get(), 1)
                .requires(Items.COPPER_INGOT, 2)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNABAR_PLATE.get(), 1)
                .requires(ModItems.CINNABAR.get(), 2)
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CINNABAR.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_PLATE.get(), 1)
                .requires(Items.DIAMOND, 2)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTRUM_PLATE.get(), 1)
                .requires(ModItems.ELECTRUM_INGOT.get(), 2)
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ELECTRUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERIUM_PLATE.get(), 1)
                .requires(ModItems.ENDERIUM_INGOT.get(), 2)
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENDERIUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GOLD_PLATE.get(), 1)
                .requires(Items.GOLD_INGOT, 2)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GRAPHITE_PLATE.get(), 1)
                .requires(ModItems.GRAPHITE_INGOT.get(), 2)
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.GRAPHITE_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_PLATE.get(), 1)
                .requires(Items.IRON_INGOT, 2)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_COMPRESSED_PLATE.get(), 1)
                .requires(ModItems.IRON_COMPRESSED_INGOT.get(), 2)
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_COMPRESSED_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LAPIS_LAZULI_PLATE.get(), 1)
                .requires(Items.LAPIS_LAZULI, 2)
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_PLATE.get(), 1)
                .requires(ModItems.LEAD_INGOT.get(), 2)
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUMIUM_PLATE.get(), 1)
                .requires(ModItems.LUMIUM_INGOT.get(), 2)
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LUMIUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NETHERITE_PLATE.get(), 1)
                .requires(Items.NETHERITE_INGOT, 2)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_PLATE.get(), 1)
                .requires(ModItems.NICKEL_INGOT.get(), 2)
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_PLATE.get(), 1)
                .requires(ModItems.OSMIUM_INGOT.get(), 2)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OSMIUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_PLATE.get(), 1)
                .requires(ModItems.PLATINUM_INGOT.get(), 2)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PLATINUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.QUARTZ_PLATE.get(), 1)
                .requires(Items.QUARTZ, 2)
                .unlockedBy("has_quartz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.QUARTZ).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.QUARTZ_ENRICHED_IRON_PLATE.get(), 1)
                .requires(ModItems.QUARTZ_ENRICHED_IRON_INGOT.get(), 2)
                .unlockedBy("has_quartz_enriched_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.QUARTZ_ENRICHED_IRON_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_PLATE.get(), 1)
                .requires(ModItems.REFINED_GLOWSTONE_INGOT.get(), 2)
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_GLOWSTONE_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_PLATE.get(), 1)
                .requires(ModItems.REFINED_OBSIDIAN_INGOT.get(), 2)
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.REFINED_OBSIDIAN_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_PLATE.get(), 1)
                .requires(ModItems.ROSE_GOLD_INGOT.get(), 2)
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ROSE_GOLD_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY_PLATE.get(), 1)
                .requires(ModItems.RUBY.get(), 2)
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_PLATE.get(), 1)
                .requires(ModItems.SAPPHIRE.get(), 2)
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SIGNALUM_PLATE.get(), 1)
                .requires(ModItems.SIGNALUM_INGOT.get(), 2)
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SIGNALUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_PLATE.get(), 1)
                .requires(ModItems.SILVER_INGOT.get(), 2)
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SILVER_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_PLATE.get(), 1)
                .requires(ModItems.STEEL_INGOT.get(), 2)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_PLATE.get(), 1)
                .requires(ModItems.TIN_INGOT.get(), 2)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_PLATE.get(), 1)
                .requires(ModItems.URANIUM_INGOT.get(), 2)
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.URANIUM_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_PLATE.get(), 1)
                .requires(ModItems.ZINC_INGOT.get(), 2)
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZINC_INGOT.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(output);

        //RAW THINGS

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_ALUMINUM.get(),RecipeCategory.MISC, ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                "asylumresources:raw_aluminum", "aluminum", "asylumresources:raw_aluminum_block", "aluminum");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_LEAD.get(),RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK.get(),
                "asylumresources:raw_lead", "lead", "asylumresources:raw_lead_block", "lead");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_NICKEL.get(),RecipeCategory.MISC, ModBlocks.RAW_NICKEL_BLOCK.get(),
                "asylumresources:raw_nickel", "nickel", "asylumresources:raw_nickel_block", "nickel");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_OSMIUM.get(),RecipeCategory.MISC, ModBlocks.RAW_OSMIUM_BLOCK.get(),
                "asylumresources:raw_osmium", "osmium", "asylumresources:raw_osmium_block", "osmium");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(),RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get(),
                "asylumresources:raw_platinum", "platinum", "asylumresources:raw_platinum_block", "platinum");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_SILVER.get(),RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get(),
                "asylumresources:raw_silver", "silver", "asylumresources:raw_silver_block", "silver");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_TIN.get(),RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get(),
                "asylumresources:raw_tin", "tin", "asylumresources:raw_tin_block", "tin");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_URANIUM.get(),RecipeCategory.MISC, ModBlocks.RAW_URANIUM_BLOCK.get(),
                "asylumresources:raw_uranium", "uranium", "asylumresources:raw_uranium_block", "uranium");

        nineBlockStorageRecipes(output,RecipeCategory.MISC, ModItems.RAW_ZINC.get(),RecipeCategory.MISC, ModBlocks.RAW_ZINC_BLOCK.get(),
                "asylumresources:raw_zinc", "zinc", "asylumresources:raw_zinc_block", "zinc");

        //SMELTING AND BLASTING DUSTS

        oreSmelting(output, ALUMINUM_DUST, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "aluminum");
        oreBlasting(output, ALUMINUM_DUST, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 0.7f, 100, "aluminum");

        oreSmelting(output, ANDESITE_ALLOY_DUST, RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_INGOT.get(), 0.7f, 200, "andesite_alloy");
        oreBlasting(output, ANDESITE_ALLOY_DUST, RecipeCategory.MISC, ModItems.ANDESITE_ALLOY_INGOT.get(), 0.7f, 100, "andesite_alloy");

        oreSmelting(output, BRASS_DUST, RecipeCategory.MISC, ModItems.BRASS_INGOT.get(), 0.7f, 200, "brass");
        oreBlasting(output, BRASS_DUST, RecipeCategory.MISC, ModItems.BRASS_INGOT.get(), 0.7f, 100, "brass");

        oreSmelting(output, BRONZE_DUST, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 200, "bronze");
        oreBlasting(output, BRONZE_DUST, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 100, "bronze");

        oreSmelting(output, CONSTANTAN_DUST, RecipeCategory.MISC, ModItems.CONSTANTAN_INGOT.get(), 0.7f, 200, "constantan");
        oreBlasting(output, CONSTANTAN_DUST, RecipeCategory.MISC, ModItems.CONSTANTAN_INGOT.get(), 0.7f, 100, "constantan");

        oreSmelting(output, ELECTRUM_DUST, RecipeCategory.MISC, ModItems.ELECTRUM_DUST.get(), 0.7f, 200, "electrum");
        oreBlasting(output, ELECTRUM_DUST, RecipeCategory.MISC, ModItems.ELECTRUM_DUST.get(), 0.7f, 100, "electrum");

        oreSmelting(output, ENDERIUM_DUST, RecipeCategory.MISC, ModItems.ENDERIUM_INGOT.get(), 0.7f, 200, "enderium");
        oreBlasting(output, ENDERIUM_DUST, RecipeCategory.MISC, ModItems.ENDERIUM_INGOT.get(), 0.7f, 100, "enderium");

        oreSmelting(output, GRAPHITE_DUST, RecipeCategory.MISC, ModItems.GRAPHITE_INGOT.get(), 0.7f, 200, "graphite");
        oreBlasting(output, GRAPHITE_DUST, RecipeCategory.MISC, ModItems.GRAPHITE_INGOT.get(), 0.7f, 100, "graphite");

        oreSmelting(output, INVAR_DUST, RecipeCategory.MISC, ModItems.INVAR_INGOT.get(), 0.7f, 200, "invar");
        oreBlasting(output, INVAR_DUST, RecipeCategory.MISC, ModItems.INVAR_INGOT.get(), 0.7f, 100, "invar");

        oreSmelting(output, IRON_COMPRESSED_DUST, RecipeCategory.MISC, ModItems.IRON_COMPRESSED_INGOT.get(), 0.7f, 200, "iron_compressed");
        oreBlasting(output, IRON_COMPRESSED_DUST, RecipeCategory.MISC, ModItems.IRON_COMPRESSED_INGOT.get(), 0.7f, 100, "iron_compressed");

        oreSmelting(output, LEAD_DUST, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.7f, 200, "lead");
        oreBlasting(output, LEAD_DUST, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.7f, 100, "lead");

        oreSmelting(output, LUMIUM_DUST, RecipeCategory.MISC, ModItems.LUMIUM_INGOT.get(), 0.7f, 200, "lumium");
        oreBlasting(output, LUMIUM_DUST, RecipeCategory.MISC, ModItems.LUMIUM_INGOT.get(), 0.7f, 100, "lumium");

        oreSmelting(output, NICKEL_DUST, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.7f, 200, "nickel");
        oreBlasting(output, NICKEL_DUST, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.7f, 100, "nickel");

        oreSmelting(output, OSMIUM_DUST, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.7f, 200, "osmium");
        oreBlasting(output, OSMIUM_DUST, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.7f, 100, "osmium");

        oreSmelting(output, PLATINUM_DUST, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.7f, 200, "platinum");
        oreBlasting(output, PLATINUM_DUST, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.7f, 100, "platinum");

        oreSmelting(output, QUARTZ_ENRICHED_IRON_DUST, RecipeCategory.MISC, ModItems.QUARTZ_ENRICHED_IRON_INGOT.get(), 0.7f, 200, "quartz_enriched_iron");
        oreBlasting(output, QUARTZ_ENRICHED_IRON_DUST, RecipeCategory.MISC, ModItems.QUARTZ_ENRICHED_IRON_INGOT.get(), 0.7f, 100, "quartz_enriched_iron");

        oreSmelting(output, REFINED_GLOWSTONE_DUST, RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_INGOT.get(), 0.7f, 200, "refined_glowstone");
        oreBlasting(output, REFINED_GLOWSTONE_DUST, RecipeCategory.MISC, ModItems.REFINED_GLOWSTONE_INGOT.get(), 0.7f, 100, "refined_glowstone");

        oreSmelting(output, REFINED_OBSIDIAN_DUST, RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_INGOT.get(), 0.7f, 200, "refined_obsidian");
        oreBlasting(output, REFINED_OBSIDIAN_DUST, RecipeCategory.MISC, ModItems.REFINED_OBSIDIAN_INGOT.get(), 0.7f, 100, "refined_obsidian");

        oreSmelting(output, ROSE_GOLD_DUST, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.7f, 200, "rose_gold");
        oreBlasting(output, ROSE_GOLD_DUST, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.7f, 100, "rose_gold");

        oreSmelting(output, SIGNALUM_DUST, RecipeCategory.MISC, ModItems.SIGNALUM_INGOT.get(), 0.7f, 200, "signalum");
        oreBlasting(output, SIGNALUM_DUST, RecipeCategory.MISC, ModItems.SIGNALUM_INGOT.get(), 0.7f, 100, "signalum");

        oreSmelting(output, SILVER_DUST, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.7f, 200, "silver");
        oreBlasting(output, SILVER_DUST, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.7f, 100, "silver");

        oreSmelting(output, STEEL_DUST, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 200, "steel");
        oreBlasting(output, STEEL_DUST, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 100, "steel");

        oreSmelting(output, TIN_DUST, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 200, "tin");
        oreBlasting(output, TIN_DUST, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 100, "tin");

        oreSmelting(output, URANIUM_DUST, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.7f, 200, "uranium");
        oreBlasting(output, URANIUM_DUST, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.7f, 100, "uranium");

        oreSmelting(output, ZINC_DUST, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.7f, 200, "zinc");
        oreBlasting(output, ZINC_DUST, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.7f, 100, "zinc");

    }

    protected static void oreSmelting(RecipeOutput output, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(output, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput output, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(output, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(RecipeOutput output, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                     float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemLike : pIngredients) {
            if (pSerializer == RecipeSerializer.SMELTING_RECIPE) {
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime)
                    .group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(output, com.furtabs.asylumresources.AsylumRes.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemLike));
            } else if (pSerializer == RecipeSerializer.BLASTING_RECIPE) {
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime)
                    .group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(output, com.furtabs.asylumresources.AsylumRes.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemLike));
            }
        }
    }
}

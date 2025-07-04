package com.furtabs.asylumresources.item;

import com.furtabs.asylumresources.AsylumRes;
import com.furtabs.asylumresources.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AsylumRes.MOD_ID);

    public static final Supplier<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_COIN = ITEMS.register("platinum_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLATINUM_ROD = ITEMS.register("platinum_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_PLATE = ITEMS.register("silver_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_COIN = ITEMS.register("silver_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_ROD = ITEMS.register("silver_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_PLATE = ITEMS.register("nickel_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_DUST = ITEMS.register("nickel_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_COIN = ITEMS.register("nickel_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NICKEL_ROD = ITEMS.register("nickel_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_DUST = ITEMS.register("uranium_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_COIN = ITEMS.register("uranium_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> URANIUM_ROD = ITEMS.register("uranium_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_COIN = ITEMS.register("aluminum_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_PLATE = ITEMS.register("lead_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_GEAR = ITEMS.register("lead_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_COIN = ITEMS.register("lead_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LEAD_ROD = ITEMS.register("lead_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_PLATE = ITEMS.register("ruby_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_GEAR = ITEMS.register("ruby_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_DUST = ITEMS.register("ruby_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_COIN = ITEMS.register("ruby_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_ROD = ITEMS.register("ruby_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_RUBY = ITEMS.register("polished_ruby", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENRICHED_URANIUM = ITEMS.register("enriched_uranium", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENRICHED_URANIUM_DUST = ITEMS.register("enriched_uranium_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_PLATE = ITEMS.register("sapphire_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_GEAR = ITEMS.register("sapphire_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_COIN = ITEMS.register("sapphire_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_ROD = ITEMS.register("sapphire_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_SAPPHIRE = ITEMS.register("polished_sapphire", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_PLATE = ITEMS.register("osmium_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_DUST = ITEMS.register("osmium_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_COIN = ITEMS.register("osmium_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OSMIUM_ROD = ITEMS.register("osmium_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_COIN = ITEMS.register("tin_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TIN_ROD = ITEMS.register("tin_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_PLATE = ITEMS.register("zinc_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_GEAR = ITEMS.register("zinc_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_COIN = ITEMS.register("zinc_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ZINC_ROD = ITEMS.register("zinc_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_GEAR = ITEMS.register("iron_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COIN = ITEMS.register("iron_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_ROD = ITEMS.register("iron_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_PLATE = ITEMS.register("copper_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_GEAR = ITEMS.register("copper_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_COIN = ITEMS.register("copper_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COPPER_ROD = ITEMS.register("copper_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOLD_GEAR = ITEMS.register("gold_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOLD_ROD = ITEMS.register("gold_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_GEAR = ITEMS.register("netherite_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_DUST = ITEMS.register("netherite_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_COIN = ITEMS.register("netherite_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_ROD = ITEMS.register("netherite_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> APATITE = ITEMS.register("apatite", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> APATITE_PLATE = ITEMS.register("apatite_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> APATITE_DUST = ITEMS.register("apatite_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> APATITE_COIN = ITEMS.register("apatite_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> APATITE_ROD = ITEMS.register("apatite_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_APATITE = ITEMS.register("polished_apatite", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CINNABAR = ITEMS.register("cinnabar", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CINNABAR_PLATE = ITEMS.register("cinnabar_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CINNABAR_COIN = ITEMS.register("cinnabar_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CINNABAR_ROD = ITEMS.register("cinnabar_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_CINNABAR = ITEMS.register("polished_cinnabar", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> DIAMOND_COIN = ITEMS.register("diamond_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_DIAMOND = ITEMS.register("polished_diamond", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> EMERALD_PLATE = ITEMS.register("emerald_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> EMERALD_GEAR = ITEMS.register("emerald_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> EMERALD_DUST = ITEMS.register("emerald_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> EMERALD_COIN = ITEMS.register("emerald_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_EMERALD = ITEMS.register("polished_emerald", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LAPIS_LAZULI_PLATE = ITEMS.register("lapis_lazuli_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LAPIS_LAZULI_GEAR = ITEMS.register("lapis_lazuli_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LAPIS_LAZULI_DUST = ITEMS.register("lapis_lazuli_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LAPIS_LAZULI_COIN = ITEMS.register("lapis_lazuli_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_LAPIS_LAZULI = ITEMS.register("polished_lapis_lazuli", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_PLATE = ITEMS.register("quartz_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_GEAR = ITEMS.register("quartz_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_COIN = ITEMS.register("quartz_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_COIN = ITEMS.register("bronze_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_ROD = ITEMS.register("bronze_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_INGOT = ITEMS.register("constantan_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_NUGGET = ITEMS.register("constantan_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_PLATE = ITEMS.register("constantan_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_GEAR = ITEMS.register("constantan_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_DUST = ITEMS.register("constantan_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_COIN = ITEMS.register("constantan_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CONSTANTAN_ROD = ITEMS.register("constantan_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_PLATE = ITEMS.register("invar_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_GEAR = ITEMS.register("invar_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_DUST = ITEMS.register("invar_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_COIN = ITEMS.register("invar_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> INVAR_ROD = ITEMS.register("invar_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_PLATE = ITEMS.register("signalum_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_GEAR = ITEMS.register("signalum_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_COIN = ITEMS.register("signalum_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SIGNALUM_ROD = ITEMS.register("signalum_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_INGOT = ITEMS.register("refined_obsidian_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_NUGGET = ITEMS.register("refined_obsidian_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_PLATE = ITEMS.register("refined_obsidian_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_GEAR = ITEMS.register("refined_obsidian_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_DUST = ITEMS.register("refined_obsidian_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_COIN = ITEMS.register("refined_obsidian_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_OBSIDIAN_ROD = ITEMS.register("refined_obsidian_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_INGOT = ITEMS.register("refined_glowstone_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_NUGGET = ITEMS.register("refined_glowstone_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_PLATE = ITEMS.register("refined_glowstone_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_GEAR = ITEMS.register("refined_glowstone_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_DUST = ITEMS.register("refined_glowstone_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_COIN = ITEMS.register("refined_glowstone_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> REFINED_GLOWSTONE_ROD = ITEMS.register("refined_glowstone_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_PLATE = ITEMS.register("brass_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_GEAR = ITEMS.register("brass_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_DUST = ITEMS.register("brass_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_COIN = ITEMS.register("brass_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRASS_ROD = ITEMS.register("brass_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_COIN = ITEMS.register("electrum_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELECTRUM_ROD = ITEMS.register("electrum_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_PLATE = ITEMS.register("enderium_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_GEAR = ITEMS.register("enderium_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_COIN = ITEMS.register("enderium_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDERIUM_ROD = ITEMS.register("enderium_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_DUST = ITEMS.register("steel_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_COIN = ITEMS.register("steel_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_ROD = ITEMS.register("steel_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_INGOT = ITEMS.register("andesite_alloy_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_NUGGET = ITEMS.register("andesite_alloy_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_PLATE = ITEMS.register("andesite_alloy_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_GEAR = ITEMS.register("andesite_alloy_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_DUST = ITEMS.register("andesite_alloy_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_COIN = ITEMS.register("andesite_alloy_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ANDESITE_ALLOY_ROD = ITEMS.register("andesite_alloy_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_PLATE = ITEMS.register("lumium_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_GEAR = ITEMS.register("lumium_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_DUST = ITEMS.register("lumium_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_COIN = ITEMS.register("lumium_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> LUMIUM_ROD = ITEMS.register("lumium_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_PLATE = ITEMS.register("rose_gold_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_GEAR = ITEMS.register("rose_gold_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_DUST = ITEMS.register("rose_gold_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_COIN = ITEMS.register("rose_gold_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ROSE_GOLD_ROD = ITEMS.register("rose_gold_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_INGOT = ITEMS.register("iron_compressed_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_NUGGET = ITEMS.register("iron_compressed_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_PLATE = ITEMS.register("iron_compressed_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_GEAR = ITEMS.register("iron_compressed_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_DUST = ITEMS.register("iron_compressed_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_COIN = ITEMS.register("iron_compressed_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> IRON_COMPRESSED_ROD = ITEMS.register("iron_compressed_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GRAPHITE_PLATE = ITEMS.register("graphite_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GRAPHITE_ROD = ITEMS.register("graphite_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLASTIC_PLATE = ITEMS.register("plastic_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PLASTIC_ROD = ITEMS.register("plastic_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_INGOT = ITEMS.register("quartz_enriched_iron_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_NUGGET = ITEMS.register("quartz_enriched_iron_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_PLATE = ITEMS.register("quartz_enriched_iron_plate", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_GEAR = ITEMS.register("quartz_enriched_iron_gear", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_DUST = ITEMS.register("quartz_enriched_iron_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_COIN = ITEMS.register("quartz_enriched_iron_coin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> QUARTZ_ENRICHED_IRON_ROD = ITEMS.register("quartz_enriched_iron_rod", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> OBSIDIAN_DUST = ITEMS.register("obsidian_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CRYING_OBSIDIAN_DUST = ITEMS.register("crying_obsidian_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CALCITE_DUST = ITEMS.register("calcite_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PRISMARINE_DUST = ITEMS.register("prismarine_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ENDER_PEARL_DUST = ITEMS.register("ender_pearl_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> END_STONE_DUST = ITEMS.register("end_stone_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERRACK_DUST = ITEMS.register("netherrack_dust", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", () -> new Item(new Item.Properties()));

    public static void registerBlockItems() {
        ModBlocks.BLOCKS.getEntries().forEach(entry -> {
            String name = entry.getId().getPath();
            ITEMS.register(name, () -> new BlockItem(entry.get(), new Item.Properties()));
        });
    }
}
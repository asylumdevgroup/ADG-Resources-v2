package com.furtabs.asylumresources.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> STORAGE_BLOCKS = forgeTag("storage_blocks");
        public static final TagKey<Block> ORES = forgeTag("ores");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HAMMERS = forgeTag("hammers");
        public static final TagKey<Item> COINS = forgeTag("coins");
        public static final TagKey<Item> DUSTS = forgeTag("dusts");
        public static final TagKey<Item> ENRICHED_DUSTS = forgeTag("enriched_dusts");
        public static final TagKey<Item> ENRICHED_MATERIALS = forgeTag("enriched_materials");
        public static final TagKey<Item> POLISHED_GEMS = forgeTag("polished_gems");
        public static final TagKey<Item> RODS = forgeTag("rods");
        public static final TagKey<Item> PLATES = forgeTag("plates");
        public static final TagKey<Item> GEARS = forgeTag("gears");
        public static final TagKey<Item> GEMS = forgeTag("gems");
        public static final TagKey<Item> NUGGETS = forgeTag("nuggets");
        public static final TagKey<Item> INGOTS = forgeTag("ingots");
        public static final TagKey<Item> RAW_MATERIALS = forgeTag("raw_materials");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", name));
        }
    }

    // Common cross-loader tags under the `c` namespace
    public static class CBlocks {
        public static final TagKey<Block> STORAGE_BLOCKS = commonTag("storage_blocks");
        public static final TagKey<Block> ORES = commonTag("ores");

        private static TagKey<Block> commonTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class CItems {
        public static final TagKey<Item> HAMMERS = commonTag("hammers");
        public static final TagKey<Item> COINS = commonTag("coins");
        public static final TagKey<Item> DUSTS = commonTag("dusts");
        public static final TagKey<Item> ENRICHED_DUSTS = commonTag("enriched_dusts");
        public static final TagKey<Item> ENRICHED_MATERIALS = commonTag("enriched_materials");
        public static final TagKey<Item> POLISHED_GEMS = commonTag("polished_gems");
        public static final TagKey<Item> RODS = commonTag("rods");
        public static final TagKey<Item> PLATES = commonTag("plates");
        public static final TagKey<Item> GEARS = commonTag("gears");
        public static final TagKey<Item> GEMS = commonTag("gems");
        public static final TagKey<Item> NUGGETS = commonTag("nuggets");
        public static final TagKey<Item> INGOTS = commonTag("ingots");
        public static final TagKey<Item> RAW_MATERIALS = commonTag("raw_materials");

        private static TagKey<Item> commonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}

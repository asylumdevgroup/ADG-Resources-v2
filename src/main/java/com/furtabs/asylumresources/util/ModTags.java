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
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("forge", name));
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
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", name));
        }
    }
}

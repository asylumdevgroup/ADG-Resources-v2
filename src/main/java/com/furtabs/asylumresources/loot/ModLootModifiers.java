package com.furtabs.asylumresources.loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModLootModifiers {
    public static final ResourceLocation ADD_ITEM = ResourceLocation.fromNamespaceAndPath(com.furtabs.asylumresources.AsylumRes.MOD_ID, "add_item");
    public static MapCodec<? extends IGlobalLootModifier> ADD_ITEM_CODEC;

    public static void registerLootModifiers() {
        ADD_ITEM_CODEC = com.furtabs.asylumresources.loot.AddItemModifier.CODEC;
        net.minecraft.core.Registry.register(
            net.neoforged.neoforge.registries.NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS,
            ADD_ITEM,
            ADD_ITEM_CODEC
        );
    }
}

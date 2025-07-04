package com.furtabs.asylumresources.item;

import com.furtabs.asylumresources.AsylumRes;
import com.furtabs.asylumresources.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AsylumRes.MOD_ID);

    public static final Supplier<CreativeModeTab> ASYLUM_TAB = TABS.register("asylumresources_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT.get()))
                    .title(Component.translatable("itemGroup.asylumresources_tab"))
                    .displayItems((params, output) -> {
                        ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModBlocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get().asItem()));
                    })
                    .build()
    );
}
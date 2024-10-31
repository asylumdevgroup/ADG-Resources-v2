package com.endangerednayla.asylumresources.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, com.endangerednayla.asylumresources.AsylumRes.MOD_ID);
    }

    @Override
    protected void start() {

    }
}

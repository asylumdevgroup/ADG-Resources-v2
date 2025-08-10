package com.furtabs.asylumresources.datagen;

import com.furtabs.asylumresources.AsylumRes;
import com.furtabs.asylumresources.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AsylumRes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Generate simple cube-all block models + blockstates and corresponding block item models
        ModBlocks.BLOCKS.getEntries().forEach(entry -> {
            Block block = entry.get();
            simpleBlockWithItem(block, cubeAll(block));
        });
    }
}

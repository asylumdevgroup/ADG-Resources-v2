package com.endangerednayla.asylumresources.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;
@JeiPlugin
public class JEIEvolvedResourcesPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(com.endangerednayla.asylumresources.AsylumRes.MOD_ID, "jei_plugin");
    }
}

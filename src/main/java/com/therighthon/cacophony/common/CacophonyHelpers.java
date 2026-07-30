package com.therighthon.cacophony.common;

import com.therighthon.cacophony.Cacophony;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.plant.Plant;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.KoppenClimateClassification;
import net.dries007.tfc.world.biome.BiomeExtension;
import net.dries007.tfc.world.biome.TFCBiomes;
import net.dries007.tfc.world.layer.TFCLayers;

import static net.dries007.tfc.util.Helpers.*;

public class CacophonyHelpers
{
    /**
     * @return A {@link ResourceLocation} with the {@code tfc} namespace.
     */
    public static ResourceLocation identifier(String name)
    {
        return resourceLocation(Cacophony.MOD_ID, name);
    }
}

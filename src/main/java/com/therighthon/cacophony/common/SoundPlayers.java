package com.therighthon.cacophony.common;

import com.therighthon.cacophony.common.ranges.FreshWaterEmergentRanges;
import com.therighthon.cacophony.common.ranges.GrassRanges;
import com.therighthon.cacophony.common.ranges.LeavesRanges;
import com.therighthon.cacophony.common.ranges.RegistryRange;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.Climate;
import net.dries007.tfc.util.climate.KoppenClimateClassification;
import net.dries007.tfc.util.tracker.WeatherHelpers;

public class SoundPlayers
{
    public static void playPlantSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        if (random.nextInt(100) == 0)
        {
            float wind = Climate.get(level).getWind(level, pos).lengthSquared();
            if (wind > 1.0f)
            {
                // TODO: play some appropriate wind noises
            }
        }
        else
        {
            // If no wind sound, check blocks
            final Block block = state.getBlock();
            final RegistryRange[] ranges;
            if ((Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_EMERGENT_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_FLOATING_PLANTS)))
            {
                ranges = FreshWaterEmergentRanges.values();
            }
            else if (Helpers.isBlock(block, CacophonyTags.Blocks.TALL_GRASS))
            {
                ranges = GrassRanges.values();
            }
            else if ((Helpers.isBlock(block, CacophonyTags.Blocks.SALTY_EMERGENT_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.SALTY_FLOATING_PLANTS)))
            {
                // TODO: Saltwater Species
                ranges = FreshWaterEmergentRanges.values();
            }
            else
            {
                return;
            }

            final DayTime dayTime = DayTime.getFuzzyDaytime(pos.getZ(), random);

            if (random.nextInt(dayTime.getSoundRarity()) == 0)
            {
                final SoundEvent sound = getValidSound(level, pos, random, dayTime, ranges);
                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }
        }
    }

    public static void playLeafSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        if (random.nextInt(100) == 0)
        {
            float wind = Climate.get(level).getWind(level, pos).lengthSquared();
            if (wind > 1.0f)
            {
                // TODO: play some appropriate wind noises
            }
        }
        else
        {
            // If no wind sound, check daytime
            final DayTime time = DayTime.getFuzzyDaytime(pos.getZ(), random);

            if (random.nextInt(time.getSoundRarity()) == 0)
            {
                final SoundEvent sound = getValidSound(level, pos, random, time, LeavesRanges.values());

                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }
        }
    }

    @Nullable
    public static SoundEvent getValidSound(Level level, BlockPos pos, RandomSource random, DayTime time, RegistryRange[] array)
    {
        ArrayList<RegistryRange> possibleSounds = new ArrayList<>(List.of());

        // Check time first since we already have that value
        for (RegistryRange species : array)
        {
            if (species.validDayTimes().contains(time))
            {
                // Check elevation
                if (pos.getY() > species.getMinElevation() && pos.getY() < species.getMaxElevation())
                {
                    // Check time of year
                    final float timeOfYear = Calendars.CLIENT.getCalendarFractionOfYear();
                    final float start = species.startYearFraction();
                    final float end = species.endYearFraction();
                    if ((timeOfYear > start && timeOfYear < end) || (start > end && (timeOfYear < end || timeOfYear < start)))
                    {
                        // Check current weather
                        Biome.Precipitation precipitation = WeatherHelpers.getPrecipitationAt(level, pos, Biome.Precipitation.NONE);

                        if (species.validWeathers().contains(precipitation))
                        {
                            // Finally, check climate
                            final float rain = ClimateRenderCache.INSTANCE.getAverageRainfall();
                            final float temp = ClimateRenderCache.INSTANCE.getAverageTemperature();
                            final float var = ClimateRenderCache.INSTANCE.getRainVariance();
                            final KoppenClimateClassification koppen = KoppenClimateClassification.classify(temp, rain, var, SolarCalculator.getInNorthernHemisphere(pos, level));

                            boolean isValid;
                            for (KoppenClimateClassification k : species.validClimates())
                            {
                                isValid = k.equals(koppen);
                                if (isValid)
                                {
                                    possibleSounds.add(species);
                                }
                            }
                        }
                    }
                }
            }
        }

        if (possibleSounds.isEmpty()) return null;

        final RegistryRange species = possibleSounds.get(random.nextInt(possibleSounds.size()));

        if (random.nextInt(species.getChance()) == 0)
        {
            return species.sound();
        }

        return null;
    }
}

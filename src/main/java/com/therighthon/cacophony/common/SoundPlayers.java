package com.therighthon.cacophony.common;

import com.therighthon.cacophony.common.ranges.FreshWaterEmergentRanges;
import com.therighthon.cacophony.common.ranges.GrassRanges;
import com.therighthon.cacophony.common.ranges.LeavesRanges;
import com.therighthon.cacophony.common.ranges.RegistryRange;
import com.therighthon.cacophony.common.ranges.SaltMarshRanges;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.Climate;
import net.dries007.tfc.util.climate.KoppenClimateClassification;
import net.dries007.tfc.util.tracker.WeatherHelpers;

public class SoundPlayers
{
    public static float WIND_NOISE_THRESHOLD = 0.07f;
    public static float STRONG_WIND_NOISE_THRESHOLD = 0.6f;

    public static void playPlantSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        final float windSq = Climate.get(level).getWind(level, pos).lengthSquared();
        final int rInt = random.nextInt(20);
        if (rInt == 0 && windSq > 0.06)
        {
            final Block windBlock = state.getBlock();
            if ((Helpers.isBlock(windBlock, CacophonyTags.Blocks.FRESH_EMERGENT_PLANTS) || Helpers.isBlock(windBlock, TFCTags.Blocks.HALOPHYTE)) || Helpers.isBlock(windBlock, CacophonyTags.Blocks.TALL_GRASS))
            {
                if (Climate.get(level).getWind(level, pos).lengthSquared() > STRONG_WIND_NOISE_THRESHOLD && random.nextInt(2) == 0)
                {
                    playLocalSound(level, pos, Sounds.WIND_IN_GRASS_STRONG.get(), Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f), Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.8f, 1.2f), false);
                }
                else
                {
                    playLocalSound(level, pos, Sounds.WIND_IN_GRASS.get(), Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f), Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.8f, 1.2f), false);
                }
            }
        }
        else
        {
            // If no wind sound, check blocks
            final Block block = state.getBlock();
            final RegistryRange[] ranges;
            if (rInt < 5 && (Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_EMERGENT_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_FLOATING_PLANTS)))
            {
                ranges = FreshWaterEmergentRanges.values();
            }
            else if ((Helpers.isBlock(block, CacophonyTags.Blocks.TALL_GRASS) || Helpers.isBlock(block, CacophonyTags.Blocks.DRY_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.CACTI)))
            {
                ranges = GrassRanges.values();
            }
            else if (rInt < 5 && (Helpers.isBlock(block, TFCTags.Blocks.HALOPHYTE)))
            {
                // Not using salty floating plants as those are also on beaches
                ranges = SaltMarshRanges.values();
            }
            else
            {
                return;
            }

            final DayTime dayTime = DayTime.getFuzzyDaytime(pos.getZ(), random);

            if (dayTime.shouldPlayRandomSound(random))
            {
                final SoundEvent sound = getValidSound(level, pos, random, dayTime, ranges);
                if (sound != null)
                {
                    playLocalSound(level, pos, sound);
                }
            }
        }
    }

    public static void playLeafSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        final float windSq = Climate.get(level).getWind(level, pos).lengthSquared();
        if (random.nextInt(20) == 0 && windSq > WIND_NOISE_THRESHOLD)
        {
            if (Climate.get(level).getWind(level, pos).lengthSquared() > STRONG_WIND_NOISE_THRESHOLD && random.nextInt(2) == 0)
            {
                playLocalSound(level, pos, Sounds.LEAVES_IN_WIND_STRONG.get(), Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f), Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.8f, 1.2f), false);
            }
            else
            {
                playLocalSound(level, pos, Sounds.LEAVES_IN_WIND.get(), Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f), Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.8f, 1.2f), false);
            }
        }
        else
        {
            // If no wind sound, check daytime
            final DayTime time = DayTime.getFuzzyDaytime(pos.getZ(), random);

            if (time.shouldPlayRandomSound(random))
            {
                final SoundEvent sound = getValidSound(level, pos, random, time, LeavesRanges.values());

                if (sound != null)
                {
                    playLocalSound(level, pos, sound);
                }
            }
        }
    }

    public static void playSoundFromRange(BlockState state, Level level, BlockPos pos, RandomSource random, RegistryRange[] range)
    {
        // check daytime
        final DayTime time = DayTime.getFuzzyDaytime(pos.getZ(), random);

        if (time.shouldPlayRandomSound(random))
        {
            final SoundEvent sound = getValidSound(level, pos, random, time, range);

            if (sound != null)
            {
                playLocalSound(level, pos, sound);
            }
        }
    }

    @Nullable
    public static SoundEvent getValidSound(Level level, BlockPos pos, RandomSource random, DayTime time, RegistryRange[] array)
    {
        ArrayList<RegistryRange> possibleSounds = new ArrayList<>(List.of());
        final long ticks = Calendars.CLIENT.getTicks();

        // Check time first since we already have that value
        for (RegistryRange species : array)
        {
            if (species.validDayTimes().contains(time))
            {
                // Check elevation
                if (pos.getY() > species.getMinElevation() && pos.getY() < species.getMaxElevation())
                {
                    if (species.isValidBiome(level.getBiome(pos)))
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

                                for (KoppenClimateClassification k : species.validClimates())
                                {
                                    if (k.equals(koppen))
                                    {
                                        // Pack the list with multiple copies of animals with higher weighs right now
                                        final int weight = species.getNoisyWeight(ticks);
                                        for (int i = 0; i < weight; i++)
                                        {
                                            possibleSounds.add(species);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (possibleSounds.isEmpty())
           return null;

        final RegistryRange species = possibleSounds.get(random.nextInt(possibleSounds.size()));

        if (species.shouldRandomlyCall(random))
        {
            return species.sound();
        }

        return null;
    }

    public static void playLocalSound(Level level, BlockPos pos, SoundEvent sound)
    {
        playLocalSound(level, pos, sound, 1f, 1f, false);
    }
    public static void playLocalSound(Level level, BlockPos pos, SoundEvent sound, float volume, float pitch, boolean distanceDelay)
    {
        // TODO: Config value to scale volume
        level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, volume, pitch, distanceDelay);
    }
}

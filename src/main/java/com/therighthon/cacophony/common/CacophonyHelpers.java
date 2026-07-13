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
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.KoppenClimateClassification;

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

    @Nullable
    public static SoundEvent getValidSound(Level level, BlockPos pos, RandomSource random, DayTime time, RegistrySpecies[] array)
    {
        final RegistrySpecies species = array[random.nextInt(array.length)];

        // Check time first since we already have that value
        if (species.validDayTimes().contains(time))
        {
            final float timeOfYear = Calendars.CLIENT.getCalendarFractionOfYear();
            final float start = species.startYearFraction();
            final float end = species.endYearFraction();
            // Check time of year
            if ((timeOfYear > start && timeOfYear < end) || (start > end && (timeOfYear < end || timeOfYear < start)))
            {
                // Finally, check climate
                final float rain = ClimateRenderCache.INSTANCE.getAverageRainfall();
                final float temp = ClimateRenderCache.INSTANCE.getAverageTemperature();
                final float var = ClimateRenderCache.INSTANCE.getRainVariance();
                final KoppenClimateClassification koppen = KoppenClimateClassification.classify(temp, rain, var, SolarCalculator.getInNorthernHemisphere(pos, level));

                boolean isValid = false;
                for (KoppenClasses k : species.validClimates())
                {
                    isValid = k.getClassification().equals(koppen);
                    if (isValid) break;
                }

                if (isValid)
                {
                    return species.sound();
                }
            }
        }
        return null;
    }
}

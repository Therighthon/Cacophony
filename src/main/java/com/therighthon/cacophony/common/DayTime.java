package com.therighthon.cacophony.common;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.util.calendar.Calendars;

public enum DayTime
{
    DAWN(10, 5, 4, 4),
    DAY(16, 6, 6, 5),
    DUSK(10, 4, 3, 3),
    DARK(24, 10, 8, 10);

    private final int soundRarityLeaves, soundRarityGrasses, soundRarityFreshwater, soundRaritySaltwater;

    DayTime(int soundRarityLeaves, int soundRarityGrasses, int soundRarityFreshwater, int soundRaritySaltwater)
    {
        this.soundRarityLeaves = soundRarityLeaves;
        this.soundRarityGrasses = soundRarityGrasses;
        this.soundRarityFreshwater = soundRarityFreshwater;
        this.soundRaritySaltwater = soundRaritySaltwater;
    }

    public static DayTime getDayTimeFromTicks(int z)
    {
        final int dayTime = SolarCalculator.getSunBasedDayTime(z, ClimateRenderCache.INSTANCE.getHemisphereScale(), Calendars.CLIENT.getCalendarFractionOfYear(), Calendars.CLIENT.getCalendarFractionOfDay());
        if (dayTime > 22_000 || dayTime < 2_000)
        {
            return DayTime.DAWN;
        }
        else if (dayTime > 14_000)
        {
            return DayTime.DARK;
        }
        else if (dayTime > 10_000)
        {
            return DayTime.DUSK;
        }
        else
        {
            return DayTime.DAY;
        }
    }


    public int getSoundRarityFreshwater()
    {
        return soundRarityFreshwater;
    }

    public int getSoundRaritySaltwater()
    {
        return soundRaritySaltwater;
    }

    public int getSoundRarityGrasses()
    {
        return soundRarityGrasses;
    }

    public int getSoundRarityLeaves()
    {
        return soundRarityLeaves;
    }
}

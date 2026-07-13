package com.therighthon.cacophony.common;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.util.calendar.Calendars;

public enum DayTime
{
    DAWN(250, 200, 150, 150),
    DAY(500, 200, 200, 200),
    DUSK(300, 150, 100, 100),
    DARK(1000, 400, 400, 400);

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
        if (dayTime > 23_500 || dayTime < 1_500)
        {
            return DayTime.DAWN;
        }
        else if (dayTime > 13_000)
        {
            return DayTime.DARK;
        }
        else if (dayTime > 11_000)
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

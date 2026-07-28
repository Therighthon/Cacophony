package com.therighthon.cacophony.common;

import com.therighthon.cacophony.CacophonyConfig;
import net.minecraft.util.RandomSource;

import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.util.calendar.Calendars;

public enum DayTime
{
    DAWN(6),
    DAY(8),
    DUSK(5),
    DARK(12);

    private final int defaultSoundRarity;

    DayTime(int soundRarity)
    {
        this.defaultSoundRarity = soundRarity;
    }

    public static DayTime getFuzzyDaytime(int z, RandomSource random)
    {
        int dayTime = SolarCalculator.getSunBasedDayTime(z, ClimateRenderCache.INSTANCE.getHemisphereScale(), Calendars.CLIENT.getCalendarFractionOfYear(), Calendars.CLIENT.getCalendarFractionOfDay());
        dayTime = (dayTime + random.nextInt(1000) - 500);
        if (dayTime > 24_000)
        {
            dayTime = dayTime - 24_000;
        }
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

    public int getDefaultSoundRarity()
    {
        return this.defaultSoundRarity;
    }

    public boolean shouldPlaySound(RandomSource random)
    {
        int val = CacophonyConfig.CLIENT.dayTimeSoundRarities.getOrDefault(this, this::getDefaultSoundRarity).get();
        if (val == 0)
        {
            return false;
        }
        else
        {
            return random.nextInt(val) == 0;
        }
    }
}

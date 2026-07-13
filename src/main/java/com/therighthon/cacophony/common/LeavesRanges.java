package com.therighthon.cacophony.common;

import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum LeavesRanges implements RegistryRange
{
    RAVEN_WINTER(Sounds.RAVEN.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0, 1, 60, 200),
    RAVEN_SUMMER(Sounds.RAVEN.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0, 1, 60, 200),
    RESPLENDENT_QUETZAL(Sounds.RESPLENDENT_QUETZAL.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CFA), 0, 1, 80, 250);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation;

    LeavesRanges(SoundEvent sound, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.times = times;
        this.weathers = weathers;
        this.climates = climates;
        this.startYearFraction = startYearFraction;
        this.endYearFraction = endYearFraction;
        this.minElevation = minElevation;
        this.maxElevation = maxElevation;
    }

    @Override
    public List<KoppenClimateClassification> validClimates()
    {
        return climates;
    }

    @Override
    public List<DayTime> validDayTimes()
    {
        return times;
    }

    @Override
    public List<Biome.Precipitation> validWeathers()
    {
        return weathers;
    }

    @Override
    public SoundEvent sound()
    {
        return sound;
    }

    @Override
    public float startYearFraction()
    {
        return startYearFraction;
    }

    @Override
    public float endYearFraction()
    {
        return endYearFraction;
    }

    @Override
    public int getMinElevation()
    {
        return minElevation;
    }

    @Override
    public int getMaxElevation()
    {
        return maxElevation;
    }

    @Override
    public String getSerializedName()
    {
        return serializedName;
    }
}

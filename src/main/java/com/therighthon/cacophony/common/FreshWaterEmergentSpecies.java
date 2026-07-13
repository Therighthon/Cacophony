package com.therighthon.cacophony.common;

import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;

public enum FreshWaterEmergentSpecies implements RegistrySpecies
{
    REDWING_BLACKBIRD(Sounds.REDWINGED_BLACKBIRD.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(KoppenClasses.CWA, KoppenClasses.CWB, KoppenClasses.CWC, KoppenClasses.CFA, KoppenClasses.CFB, KoppenClasses.CFC, KoppenClasses.CSA, KoppenClasses.CSB, KoppenClasses.CSC), 0, 4, 0, 1),
    REDWING_BLACKBIRD_SUMMER(Sounds.REDWINGED_BLACKBIRD.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(KoppenClasses.DWA, KoppenClasses.DWB, KoppenClasses.DWC, KoppenClasses.DWD, KoppenClasses.DSA, KoppenClasses.DSB, KoppenClasses.DSC, KoppenClasses.DSD, KoppenClasses.DFA, KoppenClasses.DFB, KoppenClasses.DFC, KoppenClasses.DFD), 0, 4, 0, 1);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<KoppenClasses> climates;
    final int minForest, maxForest;
    final float startYearFraction, endYearFraction;

    FreshWaterEmergentSpecies(SoundEvent sound, List<DayTime> times, List<KoppenClasses> climates, int minForest, int maxForest, float startYearFraction, float endYearFraction)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.times = times;
        this.climates = climates;
        this.minForest = minForest;
        this.maxForest = maxForest;
        this.startYearFraction = startYearFraction;
        this.endYearFraction = endYearFraction;
    }

    @Override
    public List<KoppenClasses> validClimates()
    {
        return climates;
    }

    @Override
    public List<DayTime> validDayTimes()
    {
        return times;
    }

    @Override
    public SoundEvent sound()
    {
        return sound;
    }

    @Override
    public int minForest()
    {
        return minForest;
    }

    @Override
    public int maxForest()
    {
        return maxForest;
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
    public String getSerializedName()
    {
        return serializedName;
    }
}

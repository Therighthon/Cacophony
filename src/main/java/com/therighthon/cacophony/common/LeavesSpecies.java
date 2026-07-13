package com.therighthon.cacophony.common;

import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum LeavesSpecies implements RegistrySpecies
{
    RAVEN_WINTER(Sounds.RAVEN.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0, 1),
    RAVEN_SUMMER(Sounds.RAVEN.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0, 1),
    RESPLENDENT_QUETZAL(Sounds.RESPLENDENT_QUETZAL.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(KoppenClimateClassification.AF), 0, 1);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;

    LeavesSpecies(SoundEvent sound, List<DayTime> times, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.times = times;
        this.climates = climates;
        this.startYearFraction = startYearFraction;
        this.endYearFraction = endYearFraction;
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
    public String getSerializedName()
    {
        return serializedName;
    }
}

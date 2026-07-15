package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Sounds;
import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum LeavesRanges implements RegistryRange
{
    RAVEN(Sounds.RAVEN.get(), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.CFC, KoppenClimateClassification.CSC, KoppenClimateClassification.CSB), 0.75f, 0.25f, 60, 200),
    RESPLENDENT_QUETZAL(Sounds.RESPLENDENT_QUETZAL.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CWA), 0f, 1f, 90, 320),
    RAINFOREST_ROCKET_FROG(Sounds.RAINFOREST_ROCKET_FROG.get(), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    STRAWBERRY_POISON_FROG(Sounds.STRAWBERRY_POISON_FROG.get(), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 100),
    HIMALAYA_FOAM_NEST_FROG(Sounds.HIMALAYA_FOAM_NEST_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.75f, 130, 320),
    WHITE_CHEEKED_BARBET(Sounds.WHITE_CHEEKED_BARBET.get(), List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.916666666666667f, 0.416666666666667f, 100, 300),
    MALABAR_GLIDING_FROG(Sounds.MALABAR_GLIDING_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.25f, 0.75f, 100, 320),
    STUMPFFIA_MEGSONI(Sounds.STUMPFFIA_MEGSONI.get(), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    COPES_GRAY_TREE_FROG(Sounds.COPES_GRAY_TREE_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.333333333333333f, 0.666666666666667f, 60, 200),
    BRILLIANT_THIGHED_POISON_FROG(Sounds.BRILLIANT_THIGHED_POISON_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    STEPHENS_ROCKET_FROG(Sounds.STEPHENS_ROCKET_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 320),
    HOLTS_ROBBER_FROG(Sounds.HOLTS_ROBBER_FROG.get(), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CFA), 0f, 1f, 110, 320),
    AMAZON_TOAD(Sounds.AMAZON_TOAD.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    PEBAS_STUBFOOT_TOAD(Sounds.PEBAS_STUBFOOT_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    GRANULAR_TOAD(Sounds.GRANULAR_TOAD.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    BLACKSMITH_FROG(Sounds.BLACKSMITH_FROG.get(), List.of(DayTime.DARK, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 80, 300);
    
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

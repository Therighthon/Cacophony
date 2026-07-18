package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Sounds;
import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum GrassRanges implements RegistryRange
{
    WESTERN_MEADOWLARK_WINTER(Sounds.WESTERN_MEADOWLARK.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFC, KoppenClimateClassification.CFB), 0.75f, 0.25f, 60, 200),
    WESTERN_MEADOWLARK_SUMMER(Sounds.WESTERN_MEADOWLARK.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.25f, 0.75f, 60, 200),
    TWO_COLORED_OVAL_FROG(Sounds.TWO_COLORED_OVAL_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0f, 1f, 60, 200),
    SLENDER_HEATH_KATYDID(Sounds.SLENDER_HEATH_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.BSH, KoppenClimateClassification.BWH), 0.166666666666667f, 0.833333333333333f, 60, 320),
    MEDITERRANEAN_KATYDID(Sounds.MEDITERRANEAN_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB), 0.166666666666667f, 0.833333333333333f, 60, 320),
    BLACK_LEGGED_MEADOW_KATYDID(Sounds.BLACK_LEGGED_MEADOW_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.166666666666667f, 0.833333333333333f, 60, 320),
    SPOTTED_MEADOW_KATYDID(Sounds.SPOTTED_MEADOW_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.DWA), 0.166666666666667f, 0.833333333333333f, 60, 320),
    EURASIAN_MEADOW_KATYDID(Sounds.EURASIAN_MEADOW_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.166666666666667f, 0.833333333333333f, 60, 320),
    STRAIGHT_LANCED_KATYDID(Sounds.STRAIGHT_LANCED_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSK, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA), 0.166666666666667f, 0.833333333333333f, 60, 320),
    AFRICAN_MEADOW_KATYDID(Sounds.AFRICAN_MEADOW_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.BWK), 0.166666666666667f, 0.833333333333333f, 60, 320),
    DRUMMING_KATYDID(Sounds.DRUMMING_KATYDID.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.166666666666667f, 0.833333333333333f, 60, 320),
    BROAD_WINGED_BUSH_KATYDID(Sounds.BROAD_WINGED_BUSH_KATYDID.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFC, KoppenClimateClassification.DFB), 0.166666666666667f, 0.833333333333333f, 60, 320),
    CARIBBEAN_MEADOW_KATYDID(Sounds.CARIBBEAN_MEADOW_KATYDID.get(), 3, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.166666666666667f, 0.833333333333333f, 60, 320),
    LEAF_LADYBIRD_CRICKET(Sounds.LEAF_LADYBIRD_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.166666666666667f, 0.833333333333333f, 60, 320),
    TWO_SPOTTED_CLICKET(Sounds.TWO_SPOTTED_CLICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BWK), 0.166666666666667f, 0.833333333333333f, 60, 320),
    STEPPE_CRICKET(Sounds.STEPPE_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSK, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0.166666666666667f, 0.833333333333333f, 60, 320),
    MONGOLIAN_CRICKET(Sounds.MONGOLIAN_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSK, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.BWK), 0.166666666666667f, 0.833333333333333f, 60, 320),
    COMMON_GREEN_GRASSHOPPER(Sounds.COMMON_GREEN_GRASSHOPPER.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFB, KoppenClimateClassification.DFA, KoppenClimateClassification.CFC), 0.166666666666667f, 0.833333333333333f, 60, 320),
    INDOMALAYAN_FIELD_CRICKET(Sounds.INDOMALAYAN_FIELD_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AF), 0.25f, 0.666666666666667f, 60, 320),
    SUMATRAN_BROWN_CRICKET(Sounds.SUMATRAN_BROWN_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 320),
    FIELD_CRICKET(Sounds.FIELD_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA), 0.166666666666667f, 0.833333333333333f, 60, 320),
    OCEANIC_FIELD_CRICKET(Sounds.OCEANIC_FIELD_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0.166666666666667f, 0.833333333333333f, 60, 320),
    BROWN_SPOTTED_BUSH_CRICKET(Sounds.BROWN_SPOTTED_BUSH_CRICKET.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.166666666666667f, 0.833333333333333f, 60, 320);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation, chance;

    GrassRanges(SoundEvent sound, int chance, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.chance = chance;
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
    public int getChance()
    {
        return chance;
    }

    @Override
    public String getSerializedName()
    {
        return serializedName;
    }
}

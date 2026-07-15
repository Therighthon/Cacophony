package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Sounds;
import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum FreshWaterEmergentRanges implements RegistryRange
{
    REDWINGED_BLACKBIRD_WINTER(Sounds.REDWINGED_BLACKBIRD.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFA), 0.75f, 0.25f, 60, 200),
    REDWINGED_BLACKBIRD_SUMMER(Sounds.REDWINGED_BLACKBIRD.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.25f, 0.75f, 60, 200),
    PACIFIC_TREE_FROG(Sounds.PACIFIC_TREE_FROG.get(), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.25f, 0.75f, 60, 200),
    SPADEFOOT_TOAD(Sounds.SPADEFOOT_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.166666666666667f, 0.833333333333333f, 60, 200),
    SAHARA_FROG(Sounds.SAHARA_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0f, 1f, 60, 200),
    STRIPED_ROCKET_FROG(Sounds.STRIPED_ROCKET_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    BRAZILIAN_TORRENT_FROG(Sounds.BRAZILIAN_TORRENT_FROG.get(), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA), 0f, 1f, 80, 300),
    BRAZILIAN_TORRENT_FROG_BREEDING(Sounds.BRAZILIAN_TORRENT_FROG.get(), List.of(DayTime.DARK, DayTime.DUSK, DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA), 0.25f, 0.75f, 80, 300),
    PURPLE_FROG(Sounds.PURPLE_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 70, 300),
    MARSH_FROG(Sounds.MARSH_FROG.get(), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFB, KoppenClimateClassification.CFA, KoppenClimateClassification.CSA, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.166666666666667f, 0.75f, 60, 300),
    BANDED_BULLFROG(Sounds.BANDED_BULLFROG.get(), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.AM, KoppenClimateClassification.CWC), 0.25f, 0.833333333333333f, 60, 100),
    BANDED_BULLFROG_AF(Sounds.BANDED_BULLFROG.get(), List.of(DayTime.DUSK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 100),
    CENTRAL_COAST_STUBFOOT_TOAD(Sounds.CENTRAL_COAST_STUBFOOT_TOAD.get(), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 120),
    NORTHERN_CRICKET_FROG(Sounds.NORTHERN_CRICKET_FROG.get(), List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.0833333333333333f, 0.833333333333333f, 60, 150),
    ANKARAFA_SKELETON_FROG(Sounds.ANKARAFA_SKELETON_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    PALAU_FROG(Sounds.PALAU_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CSA, KoppenClimateClassification.CFA), 0f, 1f, 60, 200),
    EDIBLE_FROG(Sounds.EDIBLE_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.25f, 0.75f, 60, 200),
    MOTORBIKE_FROG(Sounds.MOTORBIKE_FROG.get(), List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.0833333333333333f, 0.666666666666667f, 60, 80),
    EUROPEAN_TREE_FROG(Sounds.EUROPEAN_TREE_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.25f, 0.75f, 60, 200),
    BOREAL_DIGGING_FROG(Sounds.BOREAL_DIGGING_FROG.get(), List.of(DayTime.DAY, DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.25f, 0.75f, 60, 200),
    DYBOWSKIS_FROG(Sounds.DYBOWSKIS_FROG.get(), List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0.166666666666667f, 0.75f, 60, 200),
    WOOD_FROG(Sounds.WOOD_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET), 0.25f, 0.666666666666667f, 60, 200),
    TALYSH_TOAD(Sounds.TALYSH_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BSK), 0f, 1f, 60, 200),
    OLIVE_TOAD(Sounds.OLIVE_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    CENTRAL_ASIAN_TOAD_COLD(Sounds.CENTRAL_ASIAN_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.25f, 0.75f, 75, 200),
    CENTRAL_ASIAN_TOAD_HOT(Sounds.CENTRAL_ASIAN_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0f, 1f, 75, 200),
    SPECTACLED_TOAD(Sounds.SPECTACLED_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AM, KoppenClimateClassification.AS, KoppenClimateClassification.CFA, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFB), 0f, 1f, 60, 180),
    HAINAN_TOAD(Sounds.HAINAN_TOAD.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CFA, KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 75, 320),
    TENGCHONG_LEAF_LITTER_TOAD(Sounds.TENGCHONG_LEAF_LITTER_TOAD.get(), List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0f, 1f, 85, 320),
    PAINTED_CHORUS_FROG(Sounds.PAINTED_CHORUS_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 320),
    DARK_SPOTTED_FROG(Sounds.DARK_SPOTTED_FROG.get(), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.CWC, KoppenClimateClassification.DWB), 0.25f, 0.833333333333333f, 60, 320),
    FIRE_BELLIED_TOAD(Sounds.FIRE_BELLIED_TOAD.get(), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWA), 0.166666666666667f, 0.75f, 60, 200),
    CASCADES_FROG(Sounds.CASCADES_FROG.get(), List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.25f, 0.75f, 75, 320),
    CANE_TOAD(Sounds.CANE_TOAD.get(), List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AF, KoppenClimateClassification.CFA, KoppenClimateClassification.BSH), 0f, 1f, 60, 200);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation;

    FreshWaterEmergentRanges(SoundEvent sound, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
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

package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.CacophonyConfig;
import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Noise1D;
import com.therighthon.cacophony.common.Sounds;
import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum SaltMarshRanges implements RegistryRange
{
    REDWINGED_BLACKBIRD_WINTER(Sounds.REDWINGED_BLACKBIRD.get(), 6, new Noise1D(42000, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFA), 0.75f, 0.25f, 60, 200),
    REDWINGED_BLACKBIRD_SUMMER(Sounds.REDWINGED_BLACKBIRD.get(), 6, new Noise1D(42001, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.25f, 0.75f, 60, 200),
    STRIOLATED_BUNTING(Sounds.STRIOLATED_BUNTING.get(), 5, new Noise1D(42034, 10, 300), List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    MARSH_WREN_WINTER(Sounds.MARSH_WREN.get(), 5, new Noise1D(42035, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.BSK, KoppenClimateClassification.BWK), 0.833333333333333f, 0.333333333333333f, 60, 200),
    MARSH_WREN_SUMMER(Sounds.MARSH_WREN.get(), 5, new Noise1D(42036, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.BWH, KoppenClimateClassification.BWK), 0.333333333333333f, 0.833333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_SUMMER(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 5, new Noise1D(42037, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.416666666666667f, 0.666666666666667f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_AUTUMN(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 5, new Noise1D(42038, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.666666666666667f, 0.833333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_WINTER(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 5, new Noise1D(42039, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_SPRING(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 5, new Noise1D(42040, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.166666666666667f, 0.333333333333333f, 60, 200),
    COLLARED_KINGFISHER(Sounds.COLLARED_KINGFISHER.get(), 5, new Noise1D(42041, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    SPOTTED_TOWHEE_SUMMER(Sounds.SPOTTED_TOWHEE.get(), 5, new Noise1D(42042, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.25f, 0.666666666666667f, 60, 200),
    SPOTTED_TOWHEE_WINTER(Sounds.SPOTTED_TOWHEE.get(), 5, new Noise1D(42043, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSB, KoppenClimateClassification.CSA, KoppenClimateClassification.BSH), 0.666666666666667f, 0.25f, 60, 200),
    CANADA_WARBLER_SUMMER(Sounds.CANADA_WARBLER.get(), 5, new Noise1D(42049, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.416666666666667f, 0.666666666666667f, 60, 300),
    CANADA_WARBLER_AUTUMN(Sounds.CANADA_WARBLER.get(), 5, new Noise1D(42050, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.666666666666667f, 0.833333333333333f, 60, 300),
    CANADA_WARBLER_WINTER(Sounds.CANADA_WARBLER.get(), 5, new Noise1D(42051, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 300),
    CANADA_WARBLER_SPRING(Sounds.CANADA_WARBLER.get(), 5, new Noise1D(42052, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.166666666666667f, 0.333333333333333f, 60, 300),
    ORIENTAL_REED_WARBLER_SUMMER(Sounds.ORIENTAL_REED_WARBLER.get(), 5, new Noise1D(42053, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.416666666666667f, 0.666666666666667f, 60, 200),
    ORIENTAL_REED_WARBLER_AUTUMN(Sounds.ORIENTAL_REED_WARBLER.get(), 5, new Noise1D(42054, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.666666666666667f, 0.833333333333333f, 60, 200),
    ORIENTAL_REED_WARBLER_WINTER(Sounds.ORIENTAL_REED_WARBLER.get(), 5, new Noise1D(42055, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200),
    ORIENTAL_REED_WARBLER_SPRING(Sounds.ORIENTAL_REED_WARBLER.get(), 5, new Noise1D(42056, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.166666666666667f, 0.333333333333333f, 60, 200),
    ORIENTAL_SKYLARK_RESIDENT(Sounds.ORIENTAL_SKYLARK.get(), 5, new Noise1D(42057, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 150),
    ORIENTAL_SKYLARK_BREEDING(Sounds.ORIENTAL_SKYLARK.get(), 5, new Noise1D(42058, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET), 0.416666666666667f, 0.666666666666667f, 120, 320),
    LOUISIANA_WATERTHRUSH_SUMMER(Sounds.LOUISIANA_WATERTHRUSH.get(), 5, new Noise1D(42061, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200),
    LOUISIANA_WATERTHRUSH_WINTER(Sounds.LOUISIANA_WATERTHRUSH.get(), 5, new Noise1D(42062, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.25f, 60, 200),
    SCRUB_BLACKBIRD(Sounds.SCRUB_BLACKBIRD.get(), 5, new Noise1D(42063, 10, 300), List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    NORTHERN_WATERTHRUSH_SUMMER(Sounds.NORTHERN_WATERTHRUSH.get(), 5, new Noise1D(42064, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 60, 200),
    NORTHERN_WATERTHRUSH_AUTUMN(Sounds.NORTHERN_WATERTHRUSH.get(), 5, new Noise1D(42065, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0.666666666666667f, 0.833333333333333f, 60, 200),
    NORTHERN_WATERTHRUSH_WINTER(Sounds.NORTHERN_WATERTHRUSH.get(), 5, new Noise1D(42066, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW), 0.833333333333333f, 0.333333333333333f, 60, 200),
    NORTHERN_WATERTHRUSH_SPRING(Sounds.NORTHERN_WATERTHRUSH.get(), 5, new Noise1D(42067, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0.166666666666667f, 0.333333333333333f, 60, 200);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation, chance;
    final Noise1D weight;

    SaltMarshRanges(SoundEvent sound, int chance, Noise1D weight, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.chance = chance;
        this.weight = weight;
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
    public boolean shouldRandomlyCall(RandomSource random)
    {
        int val = CacophonyConfig.CLIENT.saltmarshSoundRarities.getOrDefault(this, this::defaultRarity).get();
        if (val == 0) return false;
        return random.nextInt(val) == 0;
    }

    @Override
    public int defaultRarity()
    {
        return chance;
    }

    @Override
    public int getNoisyWeight(long ticks)
    {
        return this.weight.noise(ticks);
    }

    @Override
    public String getSerializedName()
    {
        return serializedName;
    }
}

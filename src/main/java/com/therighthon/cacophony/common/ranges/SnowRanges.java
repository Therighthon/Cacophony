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
import net.dries007.tfc.world.chunkdata.ForestType;

public enum SnowRanges implements RegistryRange
{
    SNOW_BUNTING_SUMMER(Sounds.SNOW_BUNTING.get(), 3, new Noise1D(32052, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0.333333333333333f, 0.75f, 60, 200, 0, 4, 24, 0.3f),
    SNOW_BUNTING_WINTER(Sounds.SNOW_BUNTING.get(), 3, new Noise1D(32053, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0.75f, 0.333333333333333f, 60, 200, 0, 4, 24, 0.3f),
    WHITE_WINGED_SNOWFINCH(Sounds.WHITE_WINGED_SNOWFINCH.get(), 3, new Noise1D(32033, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET), 0f, 1f, 120, 320, 0, 4, 24, 0.3f),
    COMMON_STARLING_BREEDING(Sounds.COMMON_STARLING.get(), 3, new Noise1D(32050, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.333333333333333f, 0.666666666666667f, 60, 200, 0, 2, 24, 0.3f),
    COMMON_STARLING_RESIDENT(Sounds.COMMON_STARLING.get(), 3, new Noise1D(32051, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB), 0f, 1f, 60, 200, 0, 2, 24, 0.3f),
    PATAGONIAN_SIERRA_FINCH(Sounds.PATAGONIAN_SIERRA_FINCH.get(), 3, new Noise1D(32038, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSD, KoppenClimateClassification.DWD, KoppenClimateClassification.DFD, KoppenClimateClassification.DWC, KoppenClimateClassification.DSC, KoppenClimateClassification.DFC), 0f, 1f, 110, 320, 0, 3, 24, 0.3f);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction, volumeVariance;
    final int minElevation, maxElevation, chance, minForest, maxForest, minDistance;
    final Noise1D weight;

    SnowRanges(SoundEvent sound, int chance, Noise1D weight, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation, int minForest, int maxForest, int minDistance, float volumeVariance)
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
        this.minForest = minForest;
        this.maxForest = maxForest;
        this.minDistance = minDistance;
        this.volumeVariance = volumeVariance;
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
//        int val = CacophonyConfig.CLIENT.snowSoundRarities.get(this).get();
//        if (val == 0) return false;
//        return random.nextInt(val) == 0;
        return random.nextInt(defaultRarity()) == 0;
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

    @Override
    public boolean isValidForest(ForestType forest)
    {
        final int density = forest.getDensity();
        return density <= maxForest && density >= minForest;
    }

    @Override
    public int getMinDistance()
    {
        return this.minDistance;
    }

    @Override
    public float getVolumeVariance()
    {
        return this.volumeVariance;
    }
}

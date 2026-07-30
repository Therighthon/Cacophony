package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;
import net.dries007.tfc.world.chunkdata.ForestType;

public interface RegistryRange extends StringRepresentable
{
    List<KoppenClimateClassification> validClimates();

    List<DayTime> validDayTimes();

    List<Biome.Precipitation> validWeathers();

    SoundEvent sound();

    float startYearFraction();

    float endYearFraction();

    int getMinElevation();

    int getMaxElevation();

    int defaultRarity();

    public boolean shouldRandomlyCall(RandomSource random);

    int getNoisyWeight(long ticks);

    default boolean isValidBiome(Holder<Biome> biome)
    {
        return true;
    }

    boolean isValidForest(ForestType forest);

    int getMinDistance();

    float getVolumeVariance();
}

package com.therighthon.cacophony.common;

import java.util.List;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

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

}

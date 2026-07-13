package com.therighthon.cacophony.common;

import java.util.List;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.StringRepresentable;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public interface RegistrySpecies extends StringRepresentable
{
    List<KoppenClimateClassification> validClimates();

    List<DayTime> validDayTimes();

    SoundEvent sound();

    float startYearFraction();

    float endYearFraction();

}

package com.therighthon.cacophony.common;

import java.util.List;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.StringRepresentable;

public interface RegistrySpecies extends StringRepresentable
{
    List<KoppenClasses> validClimates();

    List<DayTime> validDayTimes();

    SoundEvent sound();

    int minForest();

    int maxForest();

    float startYearFraction();

    float endYearFraction();

}

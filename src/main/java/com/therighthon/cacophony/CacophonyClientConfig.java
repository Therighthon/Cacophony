package com.therighthon.cacophony;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.ranges.FreshWaterEmergentRanges;
import com.therighthon.cacophony.common.ranges.GrassRanges;
import com.therighthon.cacophony.common.ranges.LeavesRanges;
import com.therighthon.cacophony.common.ranges.SaltMarshRanges;
import com.therighthon.cacophony.common.ranges.ShoreRanges;
import com.therighthon.cacophony.common.ranges.SnowRanges;
import java.util.Map;
import java.util.function.Supplier;

import net.dries007.tfc.config.BaseConfig;
import net.dries007.tfc.config.ConfigBuilder;
import net.dries007.tfc.util.Helpers;

public class CacophonyClientConfig extends BaseConfig
{
    // General
    public final Supplier<Double> ambientSoundsScale;
    public final Supplier<Double> windSoundsScale;
//    public final Map<DayTime, Supplier<Integer>> dayTimeSoundRarities;

    // Individual Species
//    public final Map<FreshWaterEmergentRanges, Supplier<Integer>> freshwaterSoundRarities;
//    public final Map<GrassRanges, Supplier<Integer>> grassSoundRarities;
//    public final Map<LeavesRanges, Supplier<Integer>> leavesSoundRarities;
//    public final Map<SaltMarshRanges, Supplier<Integer>> saltmarshSoundRarities;
//    public final Map<ShoreRanges, Supplier<Integer>> shoreSoundRarities;
//    public final Map<SnowRanges, Supplier<Integer>> snowSoundRarities;


    CacophonyClientConfig(ConfigBuilder builder)
    {
        builder.push("general");

        ambientSoundsScale = builder.comment("Scale all sounds in Cacophony, without affecting ambient sounds added by Vanilla or other mods").define("ambientSoundsScale", 1.0, 0.0, 1.0);
        windSoundsScale = builder.comment("Scale wind sounds in Cacophony, without affecting other ambient sounds").define("windSoundsScale", 1.0, 0.0, 1.0);
//        dayTimeSoundRarities = Helpers.mapOf(DayTime.class, type -> builder.comment("Rarity modifier for sounds at this time of day. 1/n chance of playing. 0 to disable.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));

//        builder.swap("individual");
//
//        freshwaterSoundRarities = Helpers.mapOf(FreshWaterEmergentRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
//        grassSoundRarities = Helpers.mapOf(GrassRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
//        leavesSoundRarities = Helpers.mapOf(LeavesRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
//        saltmarshSoundRarities = Helpers.mapOf(SaltMarshRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
//        shoreSoundRarities = Helpers.mapOf(ShoreRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
//        snowSoundRarities = Helpers.mapOf(SnowRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
//        .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));


        builder.pop();
    }
}

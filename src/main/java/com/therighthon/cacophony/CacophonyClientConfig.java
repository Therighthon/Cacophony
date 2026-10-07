package com.therighthon.cacophony;

import com.therighthon.cacophony.client.DayTime;
import com.therighthon.cacophony.client.Sounds;
import com.therighthon.cacophony.client.ranges.FreshWaterEmergentRanges;
import com.therighthon.cacophony.client.ranges.GrassRanges;
import com.therighthon.cacophony.client.ranges.LeavesRanges;
import com.therighthon.cacophony.client.ranges.SaltMarshRanges;
import com.therighthon.cacophony.client.ranges.ShoreRanges;
import com.therighthon.cacophony.client.ranges.SnowRanges;
import java.util.Map;
import java.util.function.Supplier;

import net.dries007.tfc.util.Helpers;

public class CacophonyClientConfig extends BaseConfig
{
    // General
    public final Supplier<Double> ambientSoundsScale;
    public final Supplier<Double> windSoundsScale;
    public final Map<DayTime, Supplier<Integer>> dayTimeSoundRarities;

    // Individual Species
    public final Map<FreshWaterEmergentRanges, Supplier<Integer>> freshwaterSoundRarities;
    public final Map<GrassRanges, Supplier<Integer>> grassSoundRarities;
    public final Map<LeavesRanges, Supplier<Integer>> leavesSoundRarities;
    public final Map<SaltMarshRanges, Supplier<Integer>> saltmarshSoundRarities;
    public final Map<ShoreRanges, Supplier<Integer>> shoreSoundRarities;
    public final Map<SnowRanges, Supplier<Integer>> snowSoundRarities;

    public final Map<FreshWaterEmergentRanges, Supplier<Integer>> freshwaterSoundVolumes;
    public final Map<GrassRanges, Supplier<Integer>> grassSoundVolumes;
    public final Map<LeavesRanges, Supplier<Integer>> leavesSoundVolumes;
    public final Map<SaltMarshRanges, Supplier<Integer>> saltmarshSoundVolumes;
    public final Map<ShoreRanges, Supplier<Integer>> shoreSoundVolumes;
    public final Map<SnowRanges, Supplier<Integer>> snowSoundVolumes;



    CacophonyClientConfig(ConfigBuilder builder)
    {
        builder.push("general");

        ambientSoundsScale = builder.comment("Scale all sounds in Cacophony, without affecting ambient sounds added by Vanilla or other mods").define("ambientSoundsScale", 0.4, 0.0, 1.0);
        windSoundsScale = builder.comment("Scale wind sounds in Cacophony, without affecting other ambient sounds").define("windSoundsScale", 0.4, 0.0, 1.0);

        dayTimeSoundRarities = Helpers.mapOf(DayTime.class, type -> builder.comment("Rarity modifier for sounds at this time of day. 1/n chance of playing. 0 to disable.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));

        builder.swap("freshwater_rarities");
        freshwaterSoundRarities = Helpers.mapOf(FreshWaterEmergentRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
        builder.swap("freshwater_volumes");
        freshwaterSoundVolumes = Helpers.mapOf(FreshWaterEmergentRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));

        builder.swap("grass_rarities");
        grassSoundRarities = Helpers.mapOf(GrassRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100)); builder.swap("grass_rarities");
        builder.swap("grass_volumes");
        grassSoundVolumes = Helpers.mapOf(GrassRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));


        builder.swap("leaves_rarities");
        leavesSoundRarities = Helpers.mapOf(LeavesRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
        builder.swap("leavesvolumes");
        leavesSoundVolumes = Helpers.mapOf(LeavesRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));

        builder.swap("salt_marsh_rarities");
        saltmarshSoundRarities = Helpers.mapOf(SaltMarshRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
        builder.swap("salt_marsh_volumes");
        saltmarshSoundVolumes = Helpers.mapOf(SaltMarshRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));

        builder.swap("shore_rarities");
        shoreSoundRarities = Helpers.mapOf(ShoreRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
        builder.swap("shore_volumes");
        shoreSoundVolumes = Helpers.mapOf(ShoreRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));

        builder.swap("snow_rarities");
        snowSoundRarities = Helpers.mapOf(SnowRanges.class, type -> builder.comment("Rarity modifier for sounds of this animal. 1/n chance of playing. 0 to disable. Note that seasonal/migratory animals may have multiple entries.".formatted(getUserFriendlyName(type)))
        .define(getConfigName(type, "SoundRarity"), type.defaultRarity(), 0, 100));
        builder.swap("snow_volumes");
        snowSoundVolumes = Helpers.mapOf(SnowRanges.class, type -> builder.comment("Volume modifier for sounds of this animal, as a percentage. 0 to mute.".formatted(getUserFriendlyName(type)))
            .define(getConfigName(type, "SoundVolume"), 33, 0, 100));

        builder.pop();
    }
}

package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Noise1D;
import com.therighthon.cacophony.common.Sounds;
import com.therighthon.cacophony.common.CacophonyTags;
import java.util.List;
import java.util.Locale;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.Tags;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum ShoreRanges implements RegistryRange
{
    GLAUCOUS_WINGED_GULL(Sounds.GLAUCOUS_WINGED_GULL.get(), 2, new Noise1D(17000, 10, 300), List.of(CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, Tags.Biomes.IS_BEACH), List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0f, 1f, 83, 200),
    PIGEOIN_GUILLEMOT(Sounds.PIGEOIN_GUILLEMOT.get(), 5, new Noise1D(17001, 10, 300), List.of(CacophonyTags.Biomes.IS_CLIFFY_SHORE, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 83, 200),
    BONAPARTES_GULL_SUMMER(Sounds.BONAPARTES_GULL.get(), 2, new Noise1D(17002, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 83, 200),
    BONAPARTES_GULL_AUTUMN(Sounds.BONAPARTES_GULL.get(), 2, new Noise1D(17003, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DSA), 0.666666666666667f, 0.833333333333333f, 83, 200),
    BONAPARTES_GULL_WINTER(Sounds.BONAPARTES_GULL.get(), 2, new Noise1D(17004, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.833333333333333f, 0.25f, 83, 200),
    BONAPARTES_GULL_SPRING(Sounds.BONAPARTES_GULL.get(), 2, new Noise1D(17005, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DSA), 0.25f, 0.416666666666667f, 83, 200),
    COMMON_LOON_SUMMER(Sounds.COMMON_LOON.get(), 4, new Noise1D(17006, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.DSD, KoppenClimateClassification.DFD, KoppenClimateClassification.DSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DSA, KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.333333333333333f, 0.666666666666667f, 83, 200),
    COMMON_LOON_AUTUMN(Sounds.COMMON_LOON.get(), 4, new Noise1D(17007, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.666666666666667f, 0.75f, 83, 200),
    COMMON_LOON_SPRING(Sounds.COMMON_LOON.get(), 4, new Noise1D(17008, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.333333333333333f, 83, 200),
    COMMON_LOON_WINTER(Sounds.COMMON_LOON.get(), 4, new Noise1D(17009, 10, 300), List.of(Tags.Biomes.IS_BEACH, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.75f, 0.25f, 83, 200),
    BLACK_OYSTERCATCHER(Sounds.BLACK_OYSTERCATCHER.get(), 2, new Noise1D(17010, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_SALT_MARSH), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.ET, KoppenClimateClassification.CSC, KoppenClimateClassification.CSB, KoppenClimateClassification.CSA), 0f, 1f, 83, 200),
    SEMIPALMATED_PLOVER_SUMMER(Sounds.SEMIPALMATED_PLOVER.get(), 4, new Noise1D(17011, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFD, KoppenClimateClassification.DSD), 0.416666666666667f, 0.666666666666667f, 83, 200),
    SEMIPALMATED_PLOVER_AUTUMN(Sounds.SEMIPALMATED_PLOVER.get(), 4, new Noise1D(17012, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.666666666666667f, 0.833333333333333f, 83, 200),
    SEMIPALMATED_PLOVER_SPRING(Sounds.SEMIPALMATED_PLOVER.get(), 4, new Noise1D(17013, 10, 300), List.of(CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.833333333333333f, 0.25f, 83, 200),
    SEMIPALMATED_PLOVER_WINTER(Sounds.SEMIPALMATED_PLOVER.get(), 4, new Noise1D(17014, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CSA, KoppenClimateClassification.DFA), 0.25f, 0.416666666666667f, 83, 200),
    SHORT_TAILED_SHEARWATER_BREEDING(Sounds.SHORT_TAILED_SHEARWATER.get(), 5, new Noise1D(17015, 10, 300), List.of(CacophonyTags.Biomes.IS_ISOLATED_ISLAND, CacophonyTags.Biomes.IS_CLIFFY_SHORE), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFC), 0.25f, 0.583333333333333f, 83, 200),
    SLATY_BACKED_GULL(Sounds.SLATY_BACKED_GULL.get(), 2, new Noise1D(17016, 10, 300), List.of(Tags.Biomes.IS_BEACH), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0f, 1f, 83, 200),
    NORTHERN_FULMAR_BREEDING(Sounds.NORTHERN_FULMAR.get(), 3, new Noise1D(17017, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0.333333333333333f, 0.75f, 83, 200),
    NORTHERN_FULMAR_RESIDENT(Sounds.NORTHERN_FULMAR.get(), 3, new Noise1D(17018, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.666666666666667f, 0.416666666666667f, 83, 200),
    FORK_TAILED_STORM_PETREL_BREEDING(Sounds.FORK_TAILED_STORM_PETREL.get(), 4, new Noise1D(17019, 10, 300), List.of(CacophonyTags.Biomes.IS_CLIFFY_SHORE, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.416666666666667f, 0.666666666666667f, 83, 200),
    FORK_TAILED_STORM_PETREL_RESIDENT(Sounds.FORK_TAILED_STORM_PETREL.get(), 4, new Noise1D(17020, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFD, KoppenClimateClassification.DFC), 0.666666666666667f, 0.416666666666667f, 83, 200),
    LAYSAN_ALBATROSS(Sounds.LAYSAN_ALBATROSS.get(), 5, new Noise1D(17021, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.BWH, KoppenClimateClassification.BWK, KoppenClimateClassification.BSH, KoppenClimateClassification.BSK, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CFA, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DSA, KoppenClimateClassification.DSD, KoppenClimateClassification.DSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0f, 1f, 83, 200),
    BLACK_TAILED_GULL(Sounds.BLACK_TAILED_GULL.get(), 2, new Noise1D(17022, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0f, 1f, 83, 200),
    POMARINE_JAEGER_SUMMER(Sounds.POMARINE_JAEGER.get(), 3, new Noise1D(17023, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET), 0.5f, 0.666666666666667f, 83, 200),
    POMARINE_JAEGER_AUTUMN(Sounds.POMARINE_JAEGER.get(), 3, new Noise1D(17024, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.666666666666667f, 0.833333333333333f, 83, 200),
    POMARINE_JAEGER_SPRING(Sounds.POMARINE_JAEGER.get(), 3, new Noise1D(17025, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.333333333333333f, 0.5f, 83, 200),
    POMARINE_JAEGER_WINTER(Sounds.POMARINE_JAEGER.get(), 3, new Noise1D(17026, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.BSH, KoppenClimateClassification.BWH), 0.833333333333333f, 0.333333333333333f, 83, 200),
    HARLEQUIN_DUCK(Sounds.HARLEQUIN_DUCK.get(), 2, new Noise1D(17027, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0f, 1f, 83, 200),
    GREY_TAILED_TATTLER_SUMMER(Sounds.GREY_TAILED_TATTLER.get(), 3, new Noise1D(17028, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DWA, KoppenClimateClassification.DWC, KoppenClimateClassification.DWB, KoppenClimateClassification.DWD), 0.333333333333333f, 0.75f, 83, 200),
    GREY_TAILED_TATTLER_AUTUMN(Sounds.GREY_TAILED_TATTLER.get(), 3, new Noise1D(17029, 10, 300), List.of(Tags.Biomes.IS_BEACH, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB), 0.666666666666667f, 0.833333333333333f, 83, 200),
    GREY_TAILED_TATTLER_SPRING(Sounds.GREY_TAILED_TATTLER.get(), 3, new Noise1D(17030, 10, 300), List.of(Tags.Biomes.IS_BEACH, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.166666666666667f, 0.333333333333333f, 83, 200),
    GREY_TAILED_TATTLER_WINTER(Sounds.GREY_TAILED_TATTLER.get(), 3, new Noise1D(17031, 10, 300), List.of(Tags.Biomes.IS_BEACH, Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.25f, 83, 200),
    WHITE_TAILED_TROPICBIRD(Sounds.WHITE_TAILED_TROPICBIRD.get(), 3, new Noise1D(17032, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW), 0f, 1f, 83, 200),
    RED_FOOTED_BOOBY(Sounds.RED_FOOTED_BOOBY.get(), 3, new Noise1D(17033, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0f, 1f, 83, 200),
    WEDGE_TAILED_SHEARWATER(Sounds.WEDGE_TAILED_SHEARWATER.get(), 2, new Noise1D(17034, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.CSA, KoppenClimateClassification.CWA, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CSB, KoppenClimateClassification.CWB), 0f, 1f, 83, 200),
    GREAT_FRIGATEBIRD(Sounds.GREAT_FRIGATEBIRD.get(), 2, new Noise1D(17035, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.CSA, KoppenClimateClassification.CWA, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CSB, KoppenClimateClassification.CWB), 0f, 1f, 83, 200),
    WESTERN_OSPREY_SUMMER(Sounds.WESTERN_OSPREY.get(), 4, new Noise1D(17036, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 83, 200),
    WESTERN_OSPREY_AUTUMN(Sounds.WESTERN_OSPREY.get(), 4, new Noise1D(17037, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.25f, 0.416666666666667f, 83, 200),
    WESTERN_OSPREY_SPRING(Sounds.WESTERN_OSPREY.get(), 4, new Noise1D(17038, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.666666666666667f, 0.833333333333333f, 83, 200),
    WESTERN_OSPREY_WINTER(Sounds.WESTERN_OSPREY.get(), 4, new Noise1D(17039, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_SURFACE_LAKE, Tags.Biomes.IS_RIVER, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CSA, KoppenClimateClassification.CWA, KoppenClimateClassification.CFA, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0.833333333333333f, 0.25f, 83, 200),
    GREAT_BLACK_BACKED_GULL(Sounds.GREAT_BLACK_BACKED_GULL.get(), 2, new Noise1D(17040, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND, Tags.Biomes.IS_SHALLOW_OCEAN), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0f, 1f, 83, 200),
    BLACK_BILLED_KITTIWAKE_SUMMER(Sounds.BLACK_BILLED_KITTIWAKE.get(), 3, new Noise1D(17041, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0.333333333333333f, 0.666666666666667f, 83, 200),
    BLACK_BILLED_KITTIWAKE_AUTUMN(Sounds.BLACK_BILLED_KITTIWAKE.get(), 3, new Noise1D(17042, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, Tags.Biomes.IS_BEACH), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWD, KoppenClimateClassification.DFD, KoppenClimateClassification.DSD, KoppenClimateClassification.DSC, KoppenClimateClassification.DWC), 0.666666666666667f, 0.833333333333333f, 83, 200),
    BLACK_BILLED_KITTIWAKE_SPRING(Sounds.BLACK_BILLED_KITTIWAKE.get(), 3, new Noise1D(17043, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, Tags.Biomes.IS_BEACH), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWD, KoppenClimateClassification.DFD, KoppenClimateClassification.DSD, KoppenClimateClassification.DSC, KoppenClimateClassification.DWC), 0.25f, 0.416666666666667f, 83, 200),
    BLACK_BILLED_KITTIWAKE_WINTER(Sounds.BLACK_BILLED_KITTIWAKE.get(), 3, new Noise1D(17044, 10, 300), List.of(Tags.Biomes.IS_DEEP_OCEAN, Tags.Biomes.IS_SHALLOW_OCEAN, Tags.Biomes.IS_BEACH), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWC, KoppenClimateClassification.CFC, KoppenClimateClassification.CSB, KoppenClimateClassification.CWB, KoppenClimateClassification.CFB, KoppenClimateClassification.CFA, KoppenClimateClassification.CSA, KoppenClimateClassification.CWA, KoppenClimateClassification.BWH, KoppenClimateClassification.BWK, KoppenClimateClassification.BSH, KoppenClimateClassification.BSK), 0.833333333333333f, 0.25f, 83, 200),
    YELLOW_LEGGED_GULL(Sounds.YELLOW_LEGGED_GULL.get(), 2, new Noise1D(17045, 10, 300), List.of(Tags.Biomes.IS_BEACH, CacophonyTags.Biomes.IS_SALT_MARSH, CacophonyTags.Biomes.IS_OCEANIC_MOUNTAINS, CacophonyTags.Biomes.IS_ISOLATED_ISLAND), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0f, 1f, 83, 200);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final List<TagKey<Biome>> biomes;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation, chance;
    final Noise1D weight;

    ShoreRanges(SoundEvent sound, int chance, Noise1D weight, List<TagKey<Biome>> biomes, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.chance = chance;
        this.weight = weight;
        this.biomes = biomes;
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
    public boolean isValidBiome(Holder<Biome> biome)
    {
        boolean ret = false;
        for (TagKey<Biome> tag : this.biomes)
        {
            ret |= biome.is(tag);
        }
        return ret;
    }
}

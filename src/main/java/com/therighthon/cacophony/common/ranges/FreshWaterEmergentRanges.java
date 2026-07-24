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
    REDWINGED_BLACKBIRD_WINTER(Sounds.REDWINGED_BLACKBIRD.get(), 12, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFA), 0.75f, 0.25f, 60, 200),
    REDWINGED_BLACKBIRD_SUMMER(Sounds.REDWINGED_BLACKBIRD.get(), 12, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.25f, 0.75f, 60, 200),
    PACIFIC_TREE_FROG(Sounds.PACIFIC_TREE_FROG.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.25f, 0.75f, 60, 200),
    SPADEFOOT_TOAD(Sounds.SPADEFOOT_TOAD.get(), 2, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.166666666666667f, 0.833333333333333f, 60, 200),
    SAHARA_FROG(Sounds.SAHARA_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0f, 1f, 60, 200),
    STRIPED_ROCKET_FROG(Sounds.STRIPED_ROCKET_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    BRAZILIAN_TORRENT_FROG(Sounds.BRAZILIAN_TORRENT_FROG.get(), 1, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA), 0f, 1f, 80, 300),
    BRAZILIAN_TORRENT_FROG_BREEDING(Sounds.BRAZILIAN_TORRENT_FROG.get(), 1, List.of(DayTime.DARK, DayTime.DUSK, DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA), 0.25f, 0.75f, 80, 300),
    PURPLE_FROG(Sounds.PURPLE_FROG.get(), 2, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 70, 300),
    MARSH_FROG(Sounds.MARSH_FROG.get(), 1, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFB, KoppenClimateClassification.CFA, KoppenClimateClassification.CSA, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.166666666666667f, 0.75f, 60, 300),
    BANDED_BULLFROG(Sounds.BANDED_BULLFROG.get(), 1, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.AM, KoppenClimateClassification.CWC), 0.25f, 0.833333333333333f, 60, 100),
    BANDED_BULLFROG_AF(Sounds.BANDED_BULLFROG.get(), 1, List.of(DayTime.DUSK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 100),
    CENTRAL_COAST_STUBFOOT_TOAD(Sounds.CENTRAL_COAST_STUBFOOT_TOAD.get(), 2, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 120),
    NORTHERN_CRICKET_FROG(Sounds.NORTHERN_CRICKET_FROG.get(), 2, List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.0833333333333333f, 0.833333333333333f, 60, 150),
    ANKARAFA_SKELETON_FROG(Sounds.ANKARAFA_SKELETON_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    PALAU_FROG(Sounds.PALAU_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.CWA, KoppenClimateClassification.CSA, KoppenClimateClassification.CFA), 0f, 1f, 60, 200),
    EDIBLE_FROG(Sounds.EDIBLE_FROG.get(), 1, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.25f, 0.75f, 60, 200),
    MOTORBIKE_FROG(Sounds.MOTORBIKE_FROG.get(), 1, List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.0833333333333333f, 0.666666666666667f, 60, 80),
    EUROPEAN_TREE_FROG(Sounds.EUROPEAN_TREE_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.25f, 0.75f, 60, 200),
    BOREAL_DIGGING_FROG(Sounds.BOREAL_DIGGING_FROG.get(), 1, List.of(DayTime.DAY, DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.25f, 0.75f, 60, 200),
    DYBOWSKIS_FROG(Sounds.DYBOWSKIS_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD), 0.166666666666667f, 0.75f, 60, 200),
    WOOD_FROG(Sounds.WOOD_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET), 0.25f, 0.666666666666667f, 60, 200),
    TALYSH_TOAD(Sounds.TALYSH_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BSK), 0f, 1f, 60, 200),
    OLIVE_TOAD(Sounds.OLIVE_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    CENTRAL_ASIAN_TOAD_COLD(Sounds.CENTRAL_ASIAN_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.25f, 0.75f, 75, 200),
    CENTRAL_ASIAN_TOAD_HOT(Sounds.CENTRAL_ASIAN_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0f, 1f, 75, 200),
    SPECTACLED_TOAD(Sounds.SPECTACLED_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AM, KoppenClimateClassification.AS, KoppenClimateClassification.CFA, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFB), 0f, 1f, 60, 180),
    HAINAN_TOAD(Sounds.HAINAN_TOAD.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CFA, KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 75, 320),
    TENGCHONG_LEAF_LITTER_TOAD(Sounds.TENGCHONG_LEAF_LITTER_TOAD.get(), 1, List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0f, 1f, 85, 320),
    PAINTED_CHORUS_FROG(Sounds.PAINTED_CHORUS_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 320),
    DARK_SPOTTED_FROG(Sounds.DARK_SPOTTED_FROG.get(), 1, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.CWC, KoppenClimateClassification.DWB), 0.25f, 0.833333333333333f, 60, 320),
    FIRE_BELLIED_TOAD(Sounds.FIRE_BELLIED_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWA), 0.166666666666667f, 0.75f, 60, 200),
    CASCADES_FROG(Sounds.CASCADES_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.25f, 0.75f, 75, 320),
    CANE_TOAD(Sounds.CANE_TOAD.get(), 1, List.of(DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AF, KoppenClimateClassification.CFA, KoppenClimateClassification.BSH), 0f, 1f, 60, 200),
    STRIOLATED_BUNTING(Sounds.STRIOLATED_BUNTING.get(), 15, List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    MARSH_WREN_WINTER(Sounds.MARSH_WREN.get(), 15, List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.BSK, KoppenClimateClassification.BWK), 0.833333333333333f, 0.333333333333333f, 60, 200),
    MARSH_WREN_SUMMER(Sounds.MARSH_WREN.get(), 15, List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.BWH, KoppenClimateClassification.BWK), 0.333333333333333f, 0.833333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_SUMMER(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.416666666666667f, 0.666666666666667f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_AUTUMN(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.666666666666667f, 0.833333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_WINTER(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200),
    PALLAS_GRASSHOPPER_WARBLER_SPRING(Sounds.PALLAS_GRASSHOPPER_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.166666666666667f, 0.333333333333333f, 60, 200),
    COLLARED_KINGFISHER(Sounds.COLLARED_KINGFISHER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    SPOTTED_TOWHEE_SUMMER(Sounds.SPOTTED_TOWHEE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.25f, 0.666666666666667f, 60, 200),
    SPOTTED_TOWHEE_WINTER(Sounds.SPOTTED_TOWHEE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSB, KoppenClimateClassification.CSA, KoppenClimateClassification.BSH), 0.666666666666667f, 0.25f, 60, 200),
    COMMON_LOON_SUMMER(Sounds.COMMON_LOON.get(), 15, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.DSD, KoppenClimateClassification.DFD, KoppenClimateClassification.DSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DSA, KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.333333333333333f, 0.666666666666667f, 60, 200),
    COMMON_LOON_AUTUMN(Sounds.COMMON_LOON.get(), 15, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.666666666666667f, 0.75f, 60, 200),
    COMMON_LOON_SPRING(Sounds.COMMON_LOON.get(), 15, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.333333333333333f, 60, 200),
    SPRING_PEEPER(Sounds.SPRING_PEEPER.get(), 4, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.0833333333333333f, 0.5f, 60, 200),
    BOREAL_CHORUS_FROG(Sounds.BOREAL_CHORUS_FROG.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.25f, 0.75f, 60, 200),
    CANADA_WARBLER_SUMMER(Sounds.CANADA_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.416666666666667f, 0.666666666666667f, 60, 300),
    CANADA_WARBLER_AUTUMN(Sounds.CANADA_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.666666666666667f, 0.833333333333333f, 60, 300),
    CANADA_WARBLER_WINTER(Sounds.CANADA_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 300),
    CANADA_WARBLER_SPRING(Sounds.CANADA_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.166666666666667f, 0.333333333333333f, 60, 300),
    ORIENTAL_REED_WARBLER_SUMMER(Sounds.ORIENTAL_REED_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC), 0.416666666666667f, 0.666666666666667f, 60, 200),
    ORIENTAL_REED_WARBLER_AUTUMN(Sounds.ORIENTAL_REED_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.666666666666667f, 0.833333333333333f, 60, 200),
    ORIENTAL_REED_WARBLER_WINTER(Sounds.ORIENTAL_REED_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200),
    ORIENTAL_REED_WARBLER_SPRING(Sounds.ORIENTAL_REED_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.166666666666667f, 0.333333333333333f, 60, 200),
    ORIENTAL_SKYLARK_RESIDENT(Sounds.ORIENTAL_SKYLARK.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 150),
    ORIENTAL_SKYLARK_BREEDING(Sounds.ORIENTAL_SKYLARK.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET), 0.416666666666667f, 0.666666666666667f, 120, 320),
    DJA_RIVER_SCRUB_WARBLER(Sounds.DJA_RIVER_SCRUB_WARBLER.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    BANDED_BANANA_FROG(Sounds.BANDED_BANANA_FROG.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    LOUISIANA_WATERTHRUSH_SUMMER(Sounds.LOUISIANA_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200),
    LOUISIANA_WATERTHRUSH_WINTER(Sounds.LOUISIANA_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.25f, 60, 200),
    SCRUB_BLACKBIRD(Sounds.SCRUB_BLACKBIRD.get(), 15, List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH), 0f, 1f, 60, 200),
    NORTHERN_WATERTHRUSH_SUMMER(Sounds.NORTHERN_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 60, 200),
    NORTHERN_WATERTHRUSH_AUTUMN(Sounds.NORTHERN_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0.666666666666667f, 0.833333333333333f, 60, 200),
    NORTHERN_WATERTHRUSH_WINTER(Sounds.NORTHERN_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW), 0.833333333333333f, 0.333333333333333f, 60, 200),
    NORTHERN_WATERTHRUSH_SPRING(Sounds.NORTHERN_WATERTHRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0.166666666666667f, 0.333333333333333f, 60, 200);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation, chance;

    FreshWaterEmergentRanges(SoundEvent sound, int chance, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
    {
        this.serializedName = name().toLowerCase(Locale.ROOT);
        this.sound = sound;
        this.chance = chance;
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
    public String getSerializedName()
    {
        return serializedName;
    }
}

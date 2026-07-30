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

public enum LeavesRanges implements RegistryRange
{
    RAVEN(Sounds.RAVEN.get(), 3, new Noise1D(69000, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.CFC, KoppenClimateClassification.CSC, KoppenClimateClassification.CSB), 0.75f, 0.25f, 60, 200, 3, 4, 18, 0.8f),
    RESPLENDENT_QUETZAL(Sounds.RESPLENDENT_QUETZAL.get(), 3, new Noise1D(69001, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CWA), 0f, 1f, 90, 320, 0, 5, 18, 0.8f),
    RAINFOREST_ROCKET_FROG(Sounds.RAINFOREST_ROCKET_FROG.get(), 1, new Noise1D(69002, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    STRAWBERRY_POISON_FROG(Sounds.STRAWBERRY_POISON_FROG.get(), 1, new Noise1D(69003, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 100, 0, 5, 6, 0.3f),
    HIMALAYA_FOAM_NEST_FROG(Sounds.HIMALAYA_FOAM_NEST_FROG.get(), 1, new Noise1D(69004, 10, 300), List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.75f, 130, 320, 0, 5, 6, 0.3f),
    WHITE_CHEEKED_BARBET(Sounds.WHITE_CHEEKED_BARBET.get(), 3, new Noise1D(69005, 10, 300), List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.916666666666667f, 0.416666666666667f, 100, 300, 0, 5, 18, 0.8f),
    MALABAR_GLIDING_FROG(Sounds.MALABAR_GLIDING_FROG.get(), 2, new Noise1D(69006, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.25f, 0.75f, 100, 320, 0, 5, 6, 0.3f),
    STUMPFFIA_MEGSONI(Sounds.STUMPFFIA_MEGSONI.get(), 1, new Noise1D(69007, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    COPES_GRAY_TREE_FROG(Sounds.COPES_GRAY_TREE_FROG.get(), 1, new Noise1D(69008, 10, 300), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.333333333333333f, 0.666666666666667f, 60, 200, 0, 5, 6, 0.3f),
    BRILLIANT_THIGHED_POISON_FROG(Sounds.BRILLIANT_THIGHED_POISON_FROG.get(), 1, new Noise1D(69009, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    STEPHENS_ROCKET_FROG(Sounds.STEPHENS_ROCKET_FROG.get(), 1, new Noise1D(69010, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 320, 0, 5, 6, 0.3f),
    HOLTS_ROBBER_FROG(Sounds.HOLTS_ROBBER_FROG.get(), 1, new Noise1D(69011, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CFA), 0f, 1f, 110, 320, 0, 5, 6, 0.3f),
    AMAZON_TOAD(Sounds.AMAZON_TOAD.get(), 1, new Noise1D(69012, 10, 300), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    PEBAS_STUBFOOT_TOAD(Sounds.PEBAS_STUBFOOT_TOAD.get(), 1, new Noise1D(69013, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    GRANULAR_TOAD(Sounds.GRANULAR_TOAD.get(), 2, new Noise1D(69014, 10, 300), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 0, 5, 6, 0.3f),
    BLACKSMITH_FROG(Sounds.BLACKSMITH_FROG.get(), 1, new Noise1D(69015, 10, 300), List.of(DayTime.DARK, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 80, 300, 0, 5, 6, 0.3f),
    GREAT_KISKADEE(Sounds.GREAT_KISKADEE.get(), 3, new Noise1D(69016, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    THRUSH_NIGHTINGALE_SUMMER(Sounds.THRUSH_NIGHTINGALE.get(), 3, new Noise1D(69017, 10, 300), List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.25f, 0.75f, 60, 200, 0, 5, 18, 0.8f),
    THRUSH_NIGHTINGALE_WINTER(Sounds.THRUSH_NIGHTINGALE.get(), 3, new Noise1D(69018, 10, 300), List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH), 0.75f, 0.416666666666667f, 60, 200, 0, 5, 18, 0.8f),
    BLACK_CAPPED_CHICKADEE(Sounds.BLACK_CAPPED_CHICKADEE.get(), 3, new Noise1D(69019, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DSA, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    MOURNING_DOVE_SUMMER(Sounds.MOURNING_DOVE.get(), 3, new Noise1D(69020, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200, 0, 5, 18, 0.8f),
    MOURNING_DOVE_WINTER(Sounds.MOURNING_DOVE.get(), 3, new Noise1D(69021, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.75f, 0.416666666666667f, 60, 200, 0, 5, 18, 0.8f),
    EURASIAN_EAGLE_OWL(Sounds.EURASIAN_EAGLE_OWL.get(), 4, new Noise1D(69022, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    TAWNY_OWL(Sounds.TAWNY_OWL.get(), 4, new Noise1D(69023, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    LONG_EARED_OWL_SUMMER(Sounds.LONG_EARED_OWL.get(), 4, new Noise1D(69024, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200, 0, 5, 18, 0.8f),
    LONG_EARED_OWL_WINTER(Sounds.LONG_EARED_OWL.get(), 4, new Noise1D(69025, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA), 0.75f, 0.416666666666667f, 60, 200, 0, 5, 18, 0.8f),
    SNOWY_OWL_SUMMER(Sounds.SNOWY_OWL.get(), 4, new Noise1D(69026, 10, 300), List.of(DayTime.DARK, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0.25f, 0.75f, 60, 180, 0, 5, 18, 0.8f),
    SNOWY_OWL_WINTER(Sounds.SNOWY_OWL.get(), 4, new Noise1D(69027, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DFD, KoppenClimateClassification.DFC, KoppenClimateClassification.DWD, KoppenClimateClassification.DWC, KoppenClimateClassification.DSD, KoppenClimateClassification.DSC), 0.75f, 0.416666666666667f, 60, 180, 0, 5, 18, 0.8f),
    COMMON_CUCKOO_SUMMER(Sounds.COMMON_CUCKOO.get(), 3, new Noise1D(69028, 10, 300), List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0.25f, 0.75f, 60, 200, 0, 5, 18, 0.8f),
    COMMON_CUCKOO_WINTER(Sounds.COMMON_CUCKOO.get(), 3, new Noise1D(69029, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.416666666666667f, 60, 200, 0, 5, 18, 0.8f),
    BLACK_AND_WHITE_CASQUED_HORNBILL(Sounds.BLACK_AND_WHITE_CASQUED_HORNBILL.get(), 3, new Noise1D(69030, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 100, 0, 5, 18, 0.8f),
    GREEN_BACKED_CAMAROPTERA(Sounds.GREEN_BACKED_CAMAROPTERA.get(), 3, new Noise1D(69031, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.BSH), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    SPOTTED_DOVE(Sounds.SPOTTED_DOVE.get(), 3, new Noise1D(69032, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    ORIENTAL_BAY_OWL(Sounds.ORIENTAL_BAY_OWL.get(), 5, new Noise1D(69033, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    COPPERSMITH_BARBET(Sounds.COPPERSMITH_BARBET.get(), 3, new Noise1D(69034, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AF), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    LARGE_FROGMOUTH(Sounds.LARGE_FROGMOUTH.get(), 3, new Noise1D(69035, 10, 300), List.of(DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    BOLD_STRIPED_TIT_BABBLER(Sounds.BOLD_STRIPED_TIT_BABBLER.get(), 3, new Noise1D(69036, 10, 300), List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 0, 5, 18, 0.8f),
    BLUE_EARED_BARBET(Sounds.BLUE_EARED_BARBET.get(), 3, new Noise1D(69037, 10, 300), List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 320, 1, 2, 18, 0.8f),
    RUFOUS_TAILED_TAILORBIRD(Sounds.RUFOUS_TAILED_TAILORBIRD.get(), 3, new Noise1D(69038, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 2, 4, 18, 0.8f),
    YELLOW_VENTED_BULBUL(Sounds.YELLOW_VENTED_BULBUL.get(), 3, new Noise1D(69039, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 1, 2, 18, 0.8f),
    PLAINTIVE_CUCKOO(Sounds.PLAINTIVE_CUCKOO.get(), 3, new Noise1D(69040, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 0, 3, 18, 0.8f),
    PLAINTIVE_CUCKOO_BREEDING(Sounds.PLAINTIVE_CUCKOO.get(), 3, new Noise1D(69041, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA), 0.333333333333333f, 0.583333333333333f, 60, 200, 0, 3, 18, 0.8f),
    WILSONS_BIRD_OF_PARADISE(Sounds.WILSONS_BIRD_OF_PARADISE.get(), 3, new Noise1D(69042, 10, 300), List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0f, 1f, 90, 250, 4, 4, 18, 0.8f),
    PALM_COCKATOO(Sounds.PALM_COCKATOO.get(), 3, new Noise1D(69043, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.0833333333333333f, 1f, 60, 200, 2, 4, 18, 0.8f),
    BLUE_WINGED_KOOKABURRA(Sounds.BLUE_WINGED_KOOKABURRA.get(), 3, new Noise1D(69044, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    SUPERB_PITTA(Sounds.SUPERB_PITTA.get(), 3, new Noise1D(69045, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    PAPUAN_KING_PARROT(Sounds.PAPUAN_KING_PARROT.get(), 3, new Noise1D(69046, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 100, 240, 2, 4, 18, 0.8f),
    MAGNIFICENT_BIRD_OF_PARADISE(Sounds.MAGNIFICENT_BIRD_OF_PARADISE.get(), 3, new Noise1D(69047, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 90, 290, 2, 4, 18, 0.8f),
    SULPHUR_CRESTED_COCKATOO(Sounds.SULPHUR_CRESTED_COCKATOO.get(), 3, new Noise1D(69048, 10, 300), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.BSH, KoppenClimateClassification.CFA), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    PACIFIC_WREN_SUMMER(Sounds.PACIFIC_WREN.get(), 3, new Noise1D(69049, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.333333333333333f, 0.75f, 60, 200, 3, 4, 18, 0.8f),
    PACIFIC_WREN_WINTER(Sounds.PACIFIC_WREN.get(), 3, new Noise1D(69050, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSK, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB), 0.75f, 0.333333333333333f, 60, 200, 3, 4, 18, 0.8f),
    AMERICAN_ROBIN_SUMMER(Sounds.AMERICAN_ROBIN.get(), 3, new Noise1D(69051, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.333333333333333f, 0.75f, 60, 200, 1, 3, 18, 0.8f),
    AMERICAN_ROBIN_WINTER(Sounds.AMERICAN_ROBIN.get(), 3, new Noise1D(69052, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0.75f, 0.333333333333333f, 60, 200, 1, 3, 18, 0.8f),
    BARRED_OWL(Sounds.BARRED_OWL.get(), 3, new Noise1D(69053, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0f, 1f, 60, 200, 2, 4, 18, 0.8f),
    DARK_EYED_JUNKO_SUMMER(Sounds.DARK_EYED_JUNKO.get(), 3, new Noise1D(69054, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFD, KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA, KoppenClimateClassification.BSK, KoppenClimateClassification.BWK), 0.25f, 0.75f, 60, 200, 1, 4, 18, 0.8f),
    DARK_EYED_JUNKO_WINTER(Sounds.DARK_EYED_JUNKO.get(), 3, new Noise1D(69055, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.75f, 0.25f, 60, 200, 1, 4, 18, 0.8f),
    GREAT_HORNED_OWL(Sounds.GREAT_HORNED_OWL.get(), 3, new Noise1D(69056, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.ET, KoppenClimateClassification.BSH, KoppenClimateClassification.BSK, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    RAGGIANA_BIRD_OF_PARADISE(Sounds.RAGGIANA_BIRD_OF_PARADISE.get(), 3, new Noise1D(69057, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    TROPICAL_MOCKINGBIRD(Sounds.TROPICAL_MOCKINGBIRD.get(), 3, new Noise1D(69058, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    LEWIS_WOODPECKER_SUMMER(Sounds.LEWIS_WOODPECKER.get(), 3, new Noise1D(69059, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.BSK), 0.25f, 0.75f, 60, 200, 3, 4, 18, 0.8f),
    LEWIS_WOODPECKER_WINTER(Sounds.LEWIS_WOODPECKER.get(), 3, new Noise1D(69060, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.BSK), 0.75f, 0.25f, 60, 200, 3, 4, 18, 0.8f),
    YELLOW_BACKED_ORIOLE(Sounds.YELLOW_BACKED_ORIOLE.get(), 5, new Noise1D(69062, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AW), 0f, 1f, 60, 100, 2, 4, 18, 0.8f),
    KEEL_BILLED_TOUCAN(Sounds.KEEL_BILLED_TOUCAN.get(), 5, new Noise1D(69063, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    YELLOW_THROATED_TOUCAN(Sounds.YELLOW_THROATED_TOUCAN.get(), 5, new Noise1D(69064, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 110, 4, 4, 18, 0.8f),
    CRIMSON_BACKED_TANAGER(Sounds.CRIMSON_BACKED_TANAGER.get(), 5, new Noise1D(69065, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    SLATE_COLORED_GROSBEAK(Sounds.SLATE_COLORED_GROSBEAK.get(), 5, new Noise1D(69066, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 150, 2, 4, 18, 0.8f),
    SPECTACLED_OWL(Sounds.SPECTACLED_OWL.get(), 5, new Noise1D(69067, 10, 300), List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 4, 4, 18, 0.8f),
    COLLARED_TROGON(Sounds.COLLARED_TROGON.get(), 8, new Noise1D(69068, 10, 300), List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CWA), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    PALE_BREASTED_THRUSH(Sounds.PALE_BREASTED_THRUSH.get(), 5, new Noise1D(69069, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    MOUNTAIN_WREN(Sounds.MOUNTAIN_WREN.get(), 5, new Noise1D(69070, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0f, 1f, 120, 320, 2, 4, 18, 0.8f),
    GREAT_ANTSHRIKE(Sounds.GREAT_ANTSHRIKE.get(), 5, new Noise1D(69071, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 3, 18, 0.8f),
    RED_LORED_AMAZON(Sounds.RED_LORED_AMAZON.get(), 5, new Noise1D(69072, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 150, 3, 4, 18, 0.8f),
    MONTEZUMA_OROPENDOLA(Sounds.MONTEZUMA_OROPENDOLA.get(), 5, new Noise1D(69073, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200, 2, 4, 18, 0.8f),
    NORTHERN_CARDINAL(Sounds.NORTHERN_CARDINAL.get(), 5, new Noise1D(69074, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 2, 18, 0.8f),
    EASTERN_WOOD_PEWEE_SUMMER(Sounds.EASTERN_WOOD_PEWEE.get(), 5, new Noise1D(69075, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.416666666666667f, 0.666666666666667f, 60, 200, 0, 4, 18, 0.8f),
    EASTERN_WOOD_PEWEE_AUTUMN(Sounds.EASTERN_WOOD_PEWEE.get(), 5, new Noise1D(69076, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.666666666666667f, 0.833333333333333f, 60, 200, 0, 4, 18, 0.8f),
    EASTERN_WOOD_PEWEE_WINTER(Sounds.EASTERN_WOOD_PEWEE.get(), 5, new Noise1D(69077, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200, 0, 4, 18, 0.8f),
    EASTERN_WOOD_PEWEE_SPRING(Sounds.EASTERN_WOOD_PEWEE.get(), 5, new Noise1D(69078, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.166666666666667f, 0.333333333333333f, 60, 200, 0, 4, 18, 0.8f),
    WOOD_THRUSH_SUMMER(Sounds.WOOD_THRUSH.get(), 5, new Noise1D(69079, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.333333333333333f, 0.75f, 60, 200, 2, 3, 18, 0.8f),
    WOOD_THRUSH_WINTER(Sounds.WOOD_THRUSH.get(), 5, new Noise1D(69080, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.333333333333333f, 60, 200, 2, 3, 18, 0.8f),
    AMERICAN_GOLDFINCH_SUMMER(Sounds.AMERICAN_GOLDFINCH.get(), 5, new Noise1D(69081, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.CSC, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200, 2, 3, 18, 0.8f),
    AMERICAN_GOLDFINCH_WINTER(Sounds.AMERICAN_GOLDFINCH.get(), 5, new Noise1D(69082, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.BSH), 0.666666666666667f, 0.333333333333333f, 60, 200, 2, 3, 18, 0.8f),
    FOX_SPARROW_SUMMER(Sounds.FOX_SPARROW.get(), 5, new Noise1D(69083, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 60, 200, 0, 2, 18, 0.8f),
    FOX_SPARROW_AUTUMN(Sounds.FOX_SPARROW.get(), 5, new Noise1D(69084, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.666666666666667f, 0.833333333333333f, 60, 200, 0, 4, 18, 0.8f),
    FOX_SPARROW_WINTER(Sounds.FOX_SPARROW.get(), 5, new Noise1D(69085, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.833333333333333f, 0.333333333333333f, 60, 200, 0, 2, 18, 0.8f),
    FOX_SPARROW_SPRING(Sounds.FOX_SPARROW.get(), 5, new Noise1D(69086, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.166666666666667f, 0.333333333333333f, 60, 200, 0, 4, 18, 0.8f),
    GREAT_TIT(Sounds.GREAT_TIT.get(), 5, new Noise1D(69087, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0f, 1f, 60, 200, 2, 3, 18, 0.8f),
    MEDITERRANEAN_TREE_FROG(Sounds.MEDITERRANEAN_TREE_FROG.get(), 2, new Noise1D(69088, 10, 300), List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.166666666666667f, 0.583333333333333f, 60, 200, 0, 4, 6, 0.3f),
    TWO_BARRED_CROSSBILL(Sounds.TWO_BARRED_CROSSBILL.get(), 5, new Noise1D(69089, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    VARIED_THRUSH_SUMMER(Sounds.VARIED_THRUSH.get(), 5, new Noise1D(69090, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFC), 0.416666666666667f, 0.666666666666667f, 110, 300, 4, 4, 18, 0.8f),
    VARIED_THRUSH_WINTER(Sounds.VARIED_THRUSH.get(), 5, new Noise1D(69091, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA), 0.666666666666667f, 0.416666666666667f, 110, 300, 4, 4, 18, 0.8f),
    CHINESE_TREE_FROG(Sounds.CHINESE_TREE_FROG.get(), 2, new Noise1D(69092, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.666666666666667f, 60, 200, 0, 4, 6, 0.3f),
    MOLTRECHTS_GREEN_TREE_FROG_HIGH(Sounds.MOLTRECHTS_GREEN_TREE_FROG.get(), 3, new Noise1D(69093, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.75f, 60, 200, 2, 4, 6, 0.3f),
    MOLTRECHTS_GREEN_TREE_FROG_LOW(Sounds.MOLTRECHTS_GREEN_TREE_FROG.get(), 3, new Noise1D(69094, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.75f, 0.25f, 60, 200, 2, 4, 6, 0.3f),
    BROWN_BULBUL_SUMMER(Sounds.BROWN_BULBUL.get(), 5, new Noise1D(69095, 10, 300), List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0.25f, 0.75f, 60, 200, 2, 4, 18, 0.8f),
    BROWN_BULBUL_WINTER(Sounds.BROWN_BULBUL.get(), 5, new Noise1D(69096, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWC, KoppenClimateClassification.CWB), 0.75f, 0.25f, 60, 200, 2, 4, 18, 0.8f),
    JAPANESE_BUSH_WARBLER_RESIDENT(Sounds.JAPANESE_BUSH_WARBLER.get(), 5, new Noise1D(69097, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWC, KoppenClimateClassification.DWA), 0f, 1f, 60, 200, 0, 4, 18, 0.8f),
    JAPANESE_BUSH_WARBLER_BREEDING(Sounds.JAPANESE_BUSH_WARBLER.get(), 5, new Noise1D(69098, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB), 0.333333333333333f, 0.75f, 60, 200, 0, 4, 18, 0.8f),
    AZURE_WINGED_MAGPIE(Sounds.AZURE_WINGED_MAGPIE.get(), 5, new Noise1D(69099, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWA), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    TAIWAN_BARBET(Sounds.TAIWAN_BARBET.get(), 5, new Noise1D(69100, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB), 0f, 1f, 60, 200, 2, 4, 18, 0.8f),
    ASIAN_KOEL(Sounds.ASIAN_KOEL.get(), 5, new Noise1D(69101, 10, 300), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AM, KoppenClimateClassification.AF, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 280, 0, 4, 18, 0.8f),
    BEIJING_BABBLER(Sounds.BEIJING_BABBLER.get(), 5, new Noise1D(69102, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0f, 1f, 60, 200, 0, 4, 18, 0.8f),
    WHISTLING_CISTICOLA(Sounds.WHISTLING_CISTICOLA.get(), 5, new Noise1D(69103, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 3, 18, 0.8f),
    CHALK_BROWED_MOCKINGBIRD(Sounds.CHALK_BROWED_MOCKINGBIRD.get(), 5, new Noise1D(69104, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 2, 18, 0.8f),
    LAUGHING_KOOKABURRA(Sounds.LAUGHING_KOOKABURRA.get(), 12, new Noise1D(69105, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.CFA), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    WESTERN_NICATOR(Sounds.WESTERN_NICATOR.get(), 5, new Noise1D(69106, 10, 300), List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    YELLOW_BILLED_TURACO(Sounds.YELLOW_BILLED_TURACO.get(), 5, new Noise1D(69107, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 2, 4, 18, 0.8f),
    TAMBOURINE_DOVE(Sounds.TAMBOURINE_DOVE.get(), 5, new Noise1D(69108, 10, 300), List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    SUPERB_LYREBIRD(Sounds.SUPERB_LYREBIRD.get(), 12, new Noise1D(69109, 10, 300), List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 1, 4, 18, 0.8f),
    WILLIE_WAGTAIL(Sounds.WILLIE_WAGTAIL.get(), 5, new Noise1D(69110, 10, 300), List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BWK), 0f, 1f, 60, 200, 1, 3, 18, 0.8f),
    GREEN_IMPERIAL_PIGEON(Sounds.GREEN_IMPERIAL_PIGEON.get(), 5, new Noise1D(69111, 10, 300), List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200, 3, 4, 18, 0.8f),
    JAPANESE_CICADA(Sounds.JAPANESE_CICADA.get(), 15, new Noise1D(69112, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.DWA), 0.5f, 0.666666666666667f, 60, 200, 2, 4, 0, 0.2f),
    BRAZILIAN_CICADA(Sounds.BRAZILIAN_CICADA.get(), 10, new Noise1D(69113, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 2, 4, 0, 0.2f),
    CROATIAN_CICADA(Sounds.CROATIAN_CICADA.get(), 12, new Noise1D(69114, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.5f, 0.666666666666667f, 60, 200, 2, 4, 0, 0.2f),
    CICADA(Sounds.CICADA.get(), 8, new Noise1D(69115, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA), 0.5f, 0.666666666666667f, 60, 200, 2, 4, 0, 0.2f),
    CAMBODIAN_CICADA(Sounds.CAMBODIAN_CICADA.get(), 10, new Noise1D(69116, 10, 300), List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200, 2, 4, 0, 0.2f);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction, volumeVariance;
    final int minElevation, maxElevation, chance, minForest, maxForest, minDistance;
    final Noise1D weight;

    LeavesRanges(SoundEvent sound, int chance, Noise1D weight, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation, int minForest, int maxForest, int minDistance, float volumeVariance)
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
//        int val = CacophonyConfig.CLIENT.leavesSoundRarities.getOrDefault(this, this::defaultRarity).get();
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

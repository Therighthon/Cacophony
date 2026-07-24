package com.therighthon.cacophony.common.ranges;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.Sounds;
import java.util.List;
import java.util.Locale;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum LeavesRanges implements RegistryRange
{
    RAVEN(Sounds.RAVEN.get(), 10, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.EF, KoppenClimateClassification.CFC, KoppenClimateClassification.CSC, KoppenClimateClassification.CSB), 0.75f, 0.25f, 60, 200),
    RESPLENDENT_QUETZAL(Sounds.RESPLENDENT_QUETZAL.get(), 10, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CWA), 0f, 1f, 90, 320),
    RAINFOREST_ROCKET_FROG(Sounds.RAINFOREST_ROCKET_FROG.get(), 1, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    STRAWBERRY_POISON_FROG(Sounds.STRAWBERRY_POISON_FROG.get(), 1, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 100),
    HIMALAYA_FOAM_NEST_FROG(Sounds.HIMALAYA_FOAM_NEST_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.75f, 130, 320),
    WHITE_CHEEKED_BARBET(Sounds.WHITE_CHEEKED_BARBET.get(), 10, List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.916666666666667f, 0.416666666666667f, 100, 300),
    MALABAR_GLIDING_FROG(Sounds.MALABAR_GLIDING_FROG.get(), 2, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.25f, 0.75f, 100, 320),
    STUMPFFIA_MEGSONI(Sounds.STUMPFFIA_MEGSONI.get(), 1, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    COPES_GRAY_TREE_FROG(Sounds.COPES_GRAY_TREE_FROG.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.RAIN, Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.333333333333333f, 0.666666666666667f, 60, 200),
    BRILLIANT_THIGHED_POISON_FROG(Sounds.BRILLIANT_THIGHED_POISON_FROG.get(), 1, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    STEPHENS_ROCKET_FROG(Sounds.STEPHENS_ROCKET_FROG.get(), 1, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 320),
    HOLTS_ROBBER_FROG(Sounds.HOLTS_ROBBER_FROG.get(), 1, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CFA), 0f, 1f, 110, 320),
    AMAZON_TOAD(Sounds.AMAZON_TOAD.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    PEBAS_STUBFOOT_TOAD(Sounds.PEBAS_STUBFOOT_TOAD.get(), 1, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    GRANULAR_TOAD(Sounds.GRANULAR_TOAD.get(), 1, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    BLACKSMITH_FROG(Sounds.BLACKSMITH_FROG.get(), 1, List.of(DayTime.DARK, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 80, 300),
    GREAT_KISKADEE(Sounds.GREAT_KISKADEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    THRUSH_NIGHTINGALE_SUMMER(Sounds.THRUSH_NIGHTINGALE.get(), 15, List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFB, KoppenClimateClassification.DFA), 0.25f, 0.75f, 60, 200),
    THRUSH_NIGHTINGALE_WINTER(Sounds.THRUSH_NIGHTINGALE.get(), 15, List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH), 0.75f, 0.416666666666667f, 60, 200),
    BLACK_CAPPED_CHICKADEE(Sounds.BLACK_CAPPED_CHICKADEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSB, KoppenClimateClassification.DSA, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200),
    MOURNING_DOVE_SUMMER(Sounds.MOURNING_DOVE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200),
    MOURNING_DOVE_WINTER(Sounds.MOURNING_DOVE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.75f, 0.416666666666667f, 60, 200),
    EURASIAN_EAGLE_OWL(Sounds.EURASIAN_EAGLE_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200),
    TAWNY_OWL(Sounds.TAWNY_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0f, 1f, 60, 200),
    LONG_EARED_OWL_SUMMER(Sounds.LONG_EARED_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200),
    LONG_EARED_OWL_WINTER(Sounds.LONG_EARED_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA), 0.75f, 0.416666666666667f, 60, 200),
    SNOWY_OWL_SUMMER(Sounds.SNOWY_OWL.get(), 20, List.of(DayTime.DARK, DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.EF), 0.25f, 0.75f, 60, 180),
    SNOWY_OWL_WINTER(Sounds.SNOWY_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DFD, KoppenClimateClassification.DFC, KoppenClimateClassification.DWD, KoppenClimateClassification.DWC, KoppenClimateClassification.DSD, KoppenClimateClassification.DSC), 0.75f, 0.416666666666667f, 60, 180),
    COMMON_CUCKOO_SUMMER(Sounds.COMMON_CUCKOO.get(), 15, List.of(DayTime.DAY, DayTime.DUSK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0.25f, 0.75f, 60, 200),
    COMMON_CUCKOO_WINTER(Sounds.COMMON_CUCKOO.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.416666666666667f, 60, 200),
    BLACK_AND_WHITE_CASQUED_HORNBILL(Sounds.BLACK_AND_WHITE_CASQUED_HORNBILL.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 100),
    GREEN_BACKED_CAMAROPTERA(Sounds.GREEN_BACKED_CAMAROPTERA.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AF, KoppenClimateClassification.BSH), 0f, 1f, 60, 200),
    SPOTTED_DOVE(Sounds.SPOTTED_DOVE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 200),
    ORIENTAL_BAY_OWL(Sounds.ORIENTAL_BAY_OWL.get(), 20, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    COPPERSMITH_BARBET(Sounds.COPPERSMITH_BARBET.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    LARGE_FROGMOUTH(Sounds.LARGE_FROGMOUTH.get(), 15, List.of(DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    BOLD_STRIPED_TIT_BABBLER(Sounds.BOLD_STRIPED_TIT_BABBLER.get(), 15, List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    BLUE_EARED_BARBET(Sounds.BLUE_EARED_BARBET.get(), 15, List.of(DayTime.DAY, DayTime.DAWN), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 320),
    RUFOUS_TAILED_TAILORBIRD(Sounds.RUFOUS_TAILED_TAILORBIRD.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    YELLOW_VENTED_BULBUL(Sounds.YELLOW_VENTED_BULBUL.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    PLAINTIVE_CUCKOO(Sounds.PLAINTIVE_CUCKOO.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    PLAINTIVE_CUCKOO_BREEDING(Sounds.PLAINTIVE_CUCKOO.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA), 0.333333333333333f, 0.583333333333333f, 60, 200),
    WILSONS_BIRD_OF_PARADISE(Sounds.WILSONS_BIRD_OF_PARADISE.get(), 15, List.of(DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0f, 1f, 90, 250),
    PALM_COCKATOO(Sounds.PALM_COCKATOO.get(), 15, List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM), 0.0833333333333333f, 1f, 60, 200),
    BLUE_WINGED_KOOKABURRA(Sounds.BLUE_WINGED_KOOKABURRA.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    SUPERB_PITTA(Sounds.SUPERB_PITTA.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    PAPUAN_KING_PARROT(Sounds.PAPUAN_KING_PARROT.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 100, 240),
    MAGNIFICENT_BIRD_OF_PARADISE(Sounds.MAGNIFICENT_BIRD_OF_PARADISE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 90, 290),
    SULPHUR_CRESTED_COCKATOO(Sounds.SULPHUR_CRESTED_COCKATOO.get(), 15, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.BSH, KoppenClimateClassification.CFA), 0f, 1f, 60, 200),
    PACIFIC_WREN_SUMMER(Sounds.PACIFIC_WREN.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0.333333333333333f, 0.75f, 60, 200),
    PACIFIC_WREN_WINTER(Sounds.PACIFIC_WREN.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSK, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB), 0.75f, 0.333333333333333f, 60, 200),
    AMERICAN_ROBIN_SUMMER(Sounds.AMERICAN_ROBIN.get(), 15, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.ET, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.333333333333333f, 0.75f, 60, 200),
    AMERICAN_ROBIN_WINTER(Sounds.AMERICAN_ROBIN.get(), 15, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH), 0.75f, 0.333333333333333f, 60, 200),
    BARRED_OWL(Sounds.BARRED_OWL.get(), 15, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0f, 1f, 60, 200),
    DARK_EYED_JUNKO_SUMMER(Sounds.DARK_EYED_JUNKO.get(), 15, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFD, KoppenClimateClassification.DFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFA, KoppenClimateClassification.BSK, KoppenClimateClassification.BWK), 0.25f, 0.75f, 60, 200),
    DARK_EYED_JUNKO_WINTER(Sounds.DARK_EYED_JUNKO.get(), 15, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.BWK, KoppenClimateClassification.BSK), 0.75f, 0.25f, 60, 200),
    GREAT_HORNED_OWL(Sounds.GREAT_HORNED_OWL.get(), 15, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.ET, KoppenClimateClassification.BSH, KoppenClimateClassification.BSK, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD), 0f, 1f, 60, 200),
    RAGGIANA_BIRD_OF_PARADISE(Sounds.RAGGIANA_BIRD_OF_PARADISE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    TROPICAL_MOCKINGBIRD(Sounds.TROPICAL_MOCKINGBIRD.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    LEWIS_WOODPECKER_SUMMER(Sounds.LEWIS_WOODPECKER.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.BSK), 0.25f, 0.75f, 60, 200),
    LEWIS_WOODPECKER_WINTER(Sounds.LEWIS_WOODPECKER.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.BSK), 0.75f, 0.25f, 60, 200),
    YELLOW_BACKED_ORIOLE(Sounds.YELLOW_BACKED_ORIOLE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AS, KoppenClimateClassification.AW), 0f, 1f, 60, 100),
    KEEL_BILLED_TOUCAN(Sounds.KEEL_BILLED_TOUCAN.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    YELLOW_THROATED_TOUCAN(Sounds.YELLOW_THROATED_TOUCAN.get(), 15, List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 110),
    CRIMSON_BACKED_TANAGER(Sounds.CRIMSON_BACKED_TANAGER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    SLATE_COLORED_GROSBEAK(Sounds.SLATE_COLORED_GROSBEAK.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 150),
    SPECTACLED_OWL(Sounds.SPECTACLED_OWL.get(), 15, List.of(DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    COLLARED_TROGON(Sounds.COLLARED_TROGON.get(), 20, List.of(DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.CWA), 0f, 1f, 60, 200),
    PALE_BREASTED_THRUSH(Sounds.PALE_BREASTED_THRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    MOUNTAIN_WREN(Sounds.MOUNTAIN_WREN.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB), 0f, 1f, 120, 320),
    GREAT_ANTSHRIKE(Sounds.GREAT_ANTSHRIKE.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    RED_LORED_AMAZON(Sounds.RED_LORED_AMAZON.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 150),
    MONTEZUMA_OROPENDOLA(Sounds.MONTEZUMA_OROPENDOLA.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF), 0f, 1f, 60, 200),
    NORTHERN_CARDINAL(Sounds.NORTHERN_CARDINAL.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    EASTERN_WOOD_PEWEE_SUMMER(Sounds.EASTERN_WOOD_PEWEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.416666666666667f, 0.666666666666667f, 60, 200),
    EASTERN_WOOD_PEWEE_AUTUMN(Sounds.EASTERN_WOOD_PEWEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.666666666666667f, 0.833333333333333f, 60, 200),
    EASTERN_WOOD_PEWEE_WINTER(Sounds.EASTERN_WOOD_PEWEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0.833333333333333f, 0.333333333333333f, 60, 200),
    EASTERN_WOOD_PEWEE_SPRING(Sounds.EASTERN_WOOD_PEWEE.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE, Biome.Precipitation.RAIN), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.166666666666667f, 0.333333333333333f, 60, 200),
    WOOD_THRUSH_SUMMER(Sounds.WOOD_THRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB), 0.333333333333333f, 0.75f, 60, 200),
    WOOD_THRUSH_WINTER(Sounds.WOOD_THRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0.75f, 0.333333333333333f, 60, 200),
    AMERICAN_GOLDFINCH_SUMMER(Sounds.AMERICAN_GOLDFINCH.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.CSC, KoppenClimateClassification.CFC), 0.25f, 0.75f, 60, 200),
    AMERICAN_GOLDFINCH_WINTER(Sounds.AMERICAN_GOLDFINCH.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.BSH), 0.666666666666667f, 0.333333333333333f, 60, 200),
    FOX_SPARROW_SUMMER(Sounds.FOX_SPARROW.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.ET, KoppenClimateClassification.DFD), 0.416666666666667f, 0.666666666666667f, 60, 200),
    FOX_SPARROW_AUTUMN(Sounds.FOX_SPARROW.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.666666666666667f, 0.833333333333333f, 60, 200),
    FOX_SPARROW_WINTER(Sounds.FOX_SPARROW.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC), 0.833333333333333f, 0.333333333333333f, 60, 200),
    FOX_SPARROW_SPRING(Sounds.FOX_SPARROW.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0.166666666666667f, 0.333333333333333f, 60, 200),
    GREAT_TIT(Sounds.GREAT_TIT.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CFB, KoppenClimateClassification.CFC, KoppenClimateClassification.DFA, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC), 0f, 1f, 60, 200),
    MEDITTERANEAN_TREE_FROG(Sounds.MEDITTERANEAN_TREE_FROG.get(), 2, List.of(DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC), 0.166666666666667f, 0.583333333333333f, 60, 200),
    TWO_BARRED_CROSSBILL(Sounds.TWO_BARRED_CROSSBILL.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD), 0f, 1f, 60, 200),
    VARIED_THRUSH_SUMMER(Sounds.VARIED_THRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD, KoppenClimateClassification.DFC), 0.416666666666667f, 0.666666666666667f, 110, 300),
    VARIED_THRUSH_WINTER(Sounds.VARIED_THRUSH.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE, Biome.Precipitation.SNOW), List.of(KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA), 0.666666666666667f, 0.416666666666667f, 110, 300),
    CHINESE_TREE_FROG(Sounds.CHINESE_TREE_FROG.get(), 2, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.666666666666667f, 60, 200),
    MOLTRECHTS_GREEN_TREE_FROG_HIGH(Sounds.MOLTRECHTS_GREEN_TREE_FROG.get(), 4, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.25f, 0.75f, 60, 200),
    MOLTRECHTS_GREEN_TREE_FROG_LOW(Sounds.MOLTRECHTS_GREEN_TREE_FROG.get(), 4, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0.75f, 0.25f, 60, 200),
    BROWN_BULBUL_SUMMER(Sounds.BROWN_BULBUL.get(), 15, List.of(DayTime.DAY, DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0.25f, 0.75f, 60, 200),
    BROWN_BULBUL_WINTER(Sounds.BROWN_BULBUL.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWC, KoppenClimateClassification.CWB), 0.75f, 0.25f, 60, 200),
    JAPANESE_BUSH_WARBLER_RESIDENT(Sounds.JAPANESE_BUSH_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWC, KoppenClimateClassification.DWA), 0f, 1f, 60, 200),
    JAPANESE_BUSH_WARBLER_BREEDING(Sounds.JAPANESE_BUSH_WARBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB), 0.333333333333333f, 0.75f, 60, 200),
    AZURE_WINGED_MAGPIE(Sounds.AZURE_WINGED_MAGPIE.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWA), 0f, 1f, 60, 200),
    TAIWAN_BARBET(Sounds.TAIWAN_BARBET.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.CWA, KoppenClimateClassification.CWB), 0f, 1f, 60, 200),
    ASIAN_KOEL(Sounds.ASIAN_KOEL.get(), 15, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AM, KoppenClimateClassification.AF, KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC), 0f, 1f, 60, 280),
    BEIJING_BABBLER(Sounds.BEIJING_BABBLER.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.DWA, KoppenClimateClassification.DWB), 0f, 1f, 60, 200),
    WHISTLING_CISTICOLA(Sounds.WHISTLING_CISTICOLA.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    CHALK_BROWED_MOCKINGBIRD(Sounds.CHALK_BROWED_MOCKINGBIRD.get(), 15, List.of(DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    LAUGHING_KOOKABURRA(Sounds.LAUGHING_KOOKABURRA.get(), 40, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.CFA), 0f, 1f, 60, 200),
    WESTERN_NICATOR(Sounds.WESTERN_NICATOR.get(), 15, List.of(DayTime.DAWN, DayTime.DAY, DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AW, KoppenClimateClassification.AS, KoppenClimateClassification.AM), 0f, 1f, 60, 200),
    YELLOW_BILLED_TURACO_(Sounds.YELLOW_BILLED_TURACO_.get(), 15, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    TAMBOURINE_DOVE(Sounds.TAMBOURINE_DOVE.get(), 15, List.of(DayTime.DUSK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    SUPERB_LYREBIRD(Sounds.SUPERB_LYREBIRD.get(), 35, List.of(DayTime.DAWN, DayTime.DAY), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BSH, KoppenClimateClassification.CFA, KoppenClimateClassification.AW, KoppenClimateClassification.AS), 0f, 1f, 60, 200),
    WILLIE_WAGTAIL(Sounds.WILLIE_WAGTAIL.get(), 15, List.of(DayTime.DUSK, DayTime.DARK, DayTime.DAWN), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.BWH, KoppenClimateClassification.BWK), 0f, 1f, 60, 200),
    GREEN_IMPERIAL_PIGEON(Sounds.GREEN_IMPERIAL_PIGEON.get(), 15, List.of(DayTime.DAWN, DayTime.DUSK, DayTime.DARK), List.of(Biome.Precipitation.NONE), List.of(KoppenClimateClassification.AF, KoppenClimateClassification.AM), 0f, 1f, 60, 200);

    private final String serializedName;
    final SoundEvent sound;
    final List<DayTime> times;
    final List<Biome.Precipitation> weathers;
    final List<KoppenClimateClassification> climates;
    final float startYearFraction, endYearFraction;
    final int minElevation, maxElevation, chance;

    LeavesRanges(SoundEvent sound, int chance, List<DayTime> times, List<Biome.Precipitation> weathers, List<KoppenClimateClassification> climates, float startYearFraction, float endYearFraction, int minElevation, int maxElevation)
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

package com.therighthon.cacophony.common;

import com.therighthon.cacophony.Cacophony;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.dries007.tfc.util.registry.RegistryHolder;


public final class Sounds
{
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, Cacophony.MOD_ID);

    // Animals
    public static final Id REDWINGED_BLACKBIRD = register("ambient.bird.redwinged_blackbird");
    public static final Id PACIFIC_TREE_FROG = register("ambient.frog.pacific_tree_frog");
    public static final Id SPADEFOOT_TOAD = register("ambient.frog.spadefoot_toad");
    public static final Id SAHARA_FROG = register("ambient.frog.sahara_frog");
    public static final Id STRIPED_ROCKET_FROG = register("ambient.frog.striped_rocket_frog");
    public static final Id BRAZILIAN_TORRENT_FROG = register("ambient.frog.brazilian_torrent_frog");
    public static final Id PURPLE_FROG = register("ambient.frog.purple_frog");
    public static final Id MARSH_FROG = register("ambient.frog.marsh_frog");
    public static final Id BANDED_BULLFROG = register("ambient.frog.banded_bullfrog");
    public static final Id CENTRAL_COAST_STUBFOOT_TOAD = register("ambient.frog.central_coast_stubfoot_toad");
    public static final Id NORTHERN_CRICKET_FROG = register("ambient.frog.northern_cricket_frog");
    public static final Id ANKARAFA_SKELETON_FROG = register("ambient.frog.ankarafa_skeleton_frog");
    public static final Id PALAU_FROG = register("ambient.frog.palau_frog");
    public static final Id EDIBLE_FROG = register("ambient.frog.edible_frog");
    public static final Id MOTORBIKE_FROG = register("ambient.frog.motorbike_frog");
    public static final Id EUROPEAN_TREE_FROG = register("ambient.frog.european_tree_frog");
    public static final Id BOREAL_DIGGING_FROG = register("ambient.frog.boreal_digging_frog");
    public static final Id DYBOWSKIS_FROG = register("ambient.frog.dybowskis_frog");
    public static final Id WOOD_FROG = register("ambient.frog.wood_frog");
    public static final Id TALYSH_TOAD = register("ambient.frog.talysh_toad");
    public static final Id OLIVE_TOAD = register("ambient.frog.olive_toad");
    public static final Id CENTRAL_ASIAN_TOAD = register("ambient.frog.central_asian_toad");
    public static final Id SPECTACLED_TOAD = register("ambient.frog.spectacled_toad");
    public static final Id HAINAN_TOAD = register("ambient.frog.hainan_toad");
    public static final Id TENGCHONG_LEAF_LITTER_TOAD = register("ambient.frog.tengchong_leaf_litter_toad");
    public static final Id PAINTED_CHORUS_FROG = register("ambient.frog.painted_chorus_frog");
    public static final Id DARK_SPOTTED_FROG = register("ambient.frog.dark_spotted_frog");
    public static final Id FIRE_BELLIED_TOAD = register("ambient.frog.fire_bellied_toad");
    public static final Id CASCADES_FROG = register("ambient.frog.cascades_frog");
    public static final Id CANE_TOAD = register("ambient.frog.cane_toad");
    public static final Id WESTERN_MEADOWLARK = register("ambient.bird.western_meadowlark");
    public static final Id TWO_COLORED_OVAL_FROG = register("ambient.frog.two_colored_oval_frog");
    public static final Id SLENDER_HEATH_KATYDID = register("ambient.cricket.slender_heath_katydid");
    public static final Id MEDITERRANEAN_KATYDID = register("ambient.cricket.mediterranean_katydid");
    public static final Id BLACK_LEGGED_MEADOW_KATYDID = register("ambient.cricket.black_legged_meadow_katydid");
    public static final Id SPOTTED_MEADOW_KATYDID = register("ambient.cricket.spotted_meadow_katydid");
    public static final Id EURASIAN_MEADOW_KATYDID = register("ambient.cricket.eurasian_meadow_katydid");
    public static final Id STRAIGHT_LANCED_KATYDID = register("ambient.cricket.straight_lanced_katydid");
    public static final Id AFRICAN_MEADOW_KATYDID = register("ambient.cricket.african_meadow_katydid");
    public static final Id DRUMMING_KATYDID = register("ambient.cricket.drumming_katydid");
    public static final Id BROAD_WINGED_BUSH_KATYDID = register("ambient.cricket.broad_winged_bush_katydid");
    public static final Id CARIBBEAN_MEADOW_KATYDID = register("ambient.cricket.caribbean_meadow_katydid");
    public static final Id LEAF_LADYBIRD_CRICKET = register("ambient.cricket.leaf_ladybird_cricket");
    public static final Id TWO_SPOTTED_CLICKET = register("ambient.cricket.two_spotted_clicket");
    public static final Id STEPPE_CRICKET = register("ambient.cricket.steppe_cricket");
    public static final Id MONGOLIAN_CRICKET = register("ambient.cricket.mongolian_cricket");
    public static final Id COMMON_GREEN_GRASSHOPPER = register("ambient.cricket.common_green_grasshopper");
    public static final Id INDOMALAYAN_FIELD_CRICKET = register("ambient.cricket.indomalayan_field_cricket");
    public static final Id SUMATRAN_BROWN_CRICKET = register("ambient.cricket.sumatran_brown_cricket");
    public static final Id FIELD_CRICKET = register("ambient.cricket.field_cricket");
    public static final Id OCEANIC_FIELD_CRICKET = register("ambient.cricket.oceanic_field_cricket");
    public static final Id BROWN_SPOTTED_BUSH_CRICKET = register("ambient.cricket.brown_spotted_bush_cricket");
    public static final Id RAVEN = register("ambient.bird.raven");
    public static final Id RESPLENDENT_QUETZAL = register("ambient.bird.resplendent_quetzal");
    public static final Id RAINFOREST_ROCKET_FROG = register("ambient.frog.rainforest_rocket_frog");
    public static final Id STRAWBERRY_POISON_FROG = register("ambient.frog.strawberry_poison_frog");
    public static final Id HIMALAYA_FOAM_NEST_FROG = register("ambient.frog.himalaya_foam_nest_frog");
    public static final Id WHITE_CHEEKED_BARBET = register("ambient.bird.white_cheeked_barbet");
    public static final Id MALABAR_GLIDING_FROG = register("ambient.frog.malabar_gliding_frog");
    public static final Id STUMPFFIA_MEGSONI = register("ambient.frog.stumpffia_megsoni");
    public static final Id COPES_GRAY_TREE_FROG = register("ambient.frog.copes_gray_tree_frog");
    public static final Id BRILLIANT_THIGHED_POISON_FROG = register("ambient.frog.brilliant_thighed_poison_frog");
    public static final Id STEPHENS_ROCKET_FROG = register("ambient.frog.stephens_rocket_frog");
    public static final Id HOLTS_ROBBER_FROG = register("ambient.frog.holts_robber_frog");
    public static final Id AMAZON_TOAD = register("ambient.frog.amazon_toad");
    public static final Id PEBAS_STUBFOOT_TOAD = register("ambient.frog.pebas_stubfoot_toad");
    public static final Id GRANULAR_TOAD = register("ambient.frog.granular_toad");
    public static final Id BLACKSMITH_FROG = register("ambient.frog.blacksmith_frog");
    public static final Id LEAVES_IN_WIND = register("ambient.wind.leaves_in_wind");
    public static final Id LEAVES_IN_WIND_STRONG = register("ambient.wind.leaves_in_wind_strong");
    public static final Id WIND_IN_GRASS = register("ambient.wind.wind_in_grass");
    public static final Id WIND_IN_GRASS_STRONG = register("ambient.wind.wind_in_grass_strong");
    public static final Id ICE_CREAK = register("ambient.ice.ice_creak");
    public static final Id WIND_LOOP = register("ambient.wind.wind_loop");


    private static Id register(String name)
    {
        return new Id(SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(CacophonyHelpers.identifier(name))));
    }

    public record Id(DeferredHolder<SoundEvent, SoundEvent> holder) implements RegistryHolder<SoundEvent, SoundEvent> {}
}

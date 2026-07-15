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


    private static Id register(String name)
    {
        return new Id(SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(CacophonyHelpers.identifier(name))));
    }

    public record Id(DeferredHolder<SoundEvent, SoundEvent> holder) implements RegistryHolder<SoundEvent, SoundEvent> {}
}

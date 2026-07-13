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

    // Birds
    public static final Id REDWINGED_BLACKBIRD = register("ambient.bird.redwinged_blackbird");
    public static final Id WESTERN_MEADOWLARK = register("ambient.bird.western_meadowlark");
    public static final Id RAVEN = register("ambient.bird.raven");
    public static final Id RESPLENDENT_QUETZAL = register("ambient.bird.resplendent_quetzal");

    // Insects

    // Frogs

    // Mammals

    // Wind


    private static Id register(String name)
    {
        return new Id(SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(CacophonyHelpers.identifier(name))));
    }

    public record Id(DeferredHolder<SoundEvent, SoundEvent> holder) implements RegistryHolder<SoundEvent, SoundEvent> {}
}

package com.therighthon.cacophony.common.looping;

import com.therighthon.cacophony.common.Sounds;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundSource;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

public class LoopingSoundPlayer
{
    private final Minecraft minecraft;
    private @Nullable WindSoundInstance windSound;

    public LoopingSoundPlayer(final Minecraft minecraft)
    {
        this.minecraft = minecraft;
        this.windSound = null;
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event)
    {
        if (windSound == null)
        {
            this.windSound = new WindSoundInstance(Sounds.WIND_LOOP.get(), SoundSource.AMBIENT);
        }
        else
        {
            this.minecraft.getSoundManager().queueTickingSound(windSound);
        }

    }

}

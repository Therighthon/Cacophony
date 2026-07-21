package com.therighthon.cacophony.common.looping;

import com.therighthon.cacophony.common.Sounds;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.util.climate.Climate;

import static com.therighthon.cacophony.common.SoundPlayers.*;

public class LoopingSoundPlayer
{
    private final Minecraft minecraft;
    private @Nullable SoundInstance windSound;

    public LoopingSoundPlayer(final Minecraft minecraft)
    {
        this.minecraft = minecraft;
        this.windSound = null;
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event)
    {
        // Handle looping wind sounds
        final Level level = ClientHelpers.getLevel();
        if (level != null && !Minecraft.getInstance().isPaused())
        {
            // TODO: This is such a bad implementation...
            // Every 15 seconds...
            if (level.getGameTime() % (15 * 20) == 0)
            {
                final Player player = ClientHelpers.getPlayer();
                final float windSq = Climate.get(level).getWind(level, player.blockPosition()).lengthSquared();
                if (windSq > WIND_NOISE_THRESHOLD)
                {
                    startPlayingWindSound(Sounds.WIND_LOOP.get());
                }
                else
                {
                    stopPlayingWindSound();
                }
            }
        }
    }

    public void startPlayingWindSound(SoundEvent sound)
    {
        if (this.windSound == null)
        {
            this.windSound = SimpleSoundInstance.forAmbientAddition(sound);
        }
        this.minecraft.getSoundManager().play(this.windSound);
    }

    public void stopPlayingWindSound()
    {
        if (this.windSound != null)
        {
            // TODO: Fade out
            this.minecraft.getSoundManager().stop(this.windSound);
            this.windSound = null;
        }
    }
}

package com.therighthon.cacophony.common.looping;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.util.climate.Climate;

import static com.therighthon.cacophony.common.SoundPlayers.*;

// Based on vanilla class BeeSoundInstance
public class WindSoundInstance extends AbstractTickableSoundInstance
{
    public WindSoundInstance(SoundEvent sound, SoundSource source)
    {
        super(sound, source,  SoundInstance.createUnseededRandom());
        this.looping = true;
        this.delay = 0;
        this.volume = 0f;
    }

    @Override
    public void tick()
    {
        final Level level = ClientHelpers.getLevel();
        if (level != null)
        {
            final Player player = ClientHelpers.getPlayer();
            final float windSq = Climate.get(level).getWind(level, player.blockPosition()).lengthSquared();

            if (windSq > WIND_NOISE_THRESHOLD)
            {
                // TODO: We should just be playing directly to the player
                this.x = player.getX();
                this.y = player.getY();
                this.z = player.getZ();
                this.pitch = Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), this.getMinPitch(), this.getMaxPitch());
                this.volume = Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f);
            }
            else
            {
                this.pitch = 0.0F;
                this.volume = 0.0F;
            }
        }
        else
        {
            this.stop();
        }
    }

    private float getMinPitch()
    {
        return 0.7F;
    }

    private float getMaxPitch()
    {
        return 1.3F;
    }

    @Override
    public boolean canStartSilent()
    {
        return true;
    }
}

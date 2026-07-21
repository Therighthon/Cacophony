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
import net.minecraft.world.phys.Vec2;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.util.climate.Climate;
import net.dries007.tfc.world.noise.FastNoiseLite;

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
        this.attenuation = Attenuation.NONE;
    }

    @Override
    public void tick()
    {
        final Level level = ClientHelpers.getLevel();
        final Player player = ClientHelpers.getPlayer();
        if (level != null && player != null)
        {
            final Vec2 wind = Climate.get(level).getWind(level, player.blockPosition());
            final float windSq = wind.lengthSquared();

            if (windSq > WIND_NOISE_THRESHOLD)
            {
                // Play sound from upwind of player so that it sounds like you are facing into the wind when you are
                // Take a sqrt, or draw 20
                this.x = player.getX() - 2 * Math.signum(wind.x) * wind.x * wind.x / windSq;
                this.y = player.getY() + 1;
                this.z = player.getZ() - 2 * Math.signum(wind.y) * wind.y * wind.y / windSq;
                this.pitch = Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.7f, 1.3f);
                this.volume = Mth.clampedMap(windSq, 0.07f, 0.2f, 0.1f, 1.5f);
            }
            else
            {
                this.pitch = 0.0F;
                this.volume = 0.0F;
            }
        }
    }

    @Override
    public boolean canStartSilent()
    {
        return true;
    }
}

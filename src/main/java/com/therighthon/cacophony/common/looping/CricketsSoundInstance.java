package com.therighthon.cacophony.common.looping;

import com.therighthon.cacophony.common.DayTime;
import com.therighthon.cacophony.common.ranges.SnowRanges;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.phys.Vec2;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.client.overworld.SolarCalculator;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.Climate;
import net.dries007.tfc.util.tracker.WeatherHelpers;

import static com.therighthon.cacophony.common.SoundPlayers.*;

// Based on vanilla class BeeSoundInstance
public class CricketsSoundInstance extends AbstractTickableSoundInstance
{
    public CricketsSoundInstance(SoundEvent sound, SoundSource source)
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

            // Checking wind and precipitation because crickets shouldn't sing in storms I don't think
            if (windSq < STRONG_WIND_NOISE_THRESHOLD && WeatherHelpers.getPrecipitationAt(level, player.blockPosition(), Biome.Precipitation.NONE) == Biome.Precipitation.NONE)
            {
                final int dayTime = SolarCalculator.getSunBasedDayTime(player.getBlockZ(), ClimateRenderCache.INSTANCE.getHemisphereScale(), Calendars.CLIENT.getCalendarFractionOfYear(), Calendars.CLIENT.getCalendarFractionOfDay());
                final float timeFactor = dayTime < 6_000 ? -0.5f : dayTime < 16_000 ? Mth.map(dayTime, 4_000, 16_000, -0.5f, 0.75f) : Mth.map(dayTime, 16_000, 24_000, 0.75f, -0.5f);
                final float tempFactor = Mth.clampedMap(ClimateRenderCache.INSTANCE.getInstantTemperature(), 10f, 40f, 0f, 1f);

                // Many crickets sing at higher pitches in hot weather
                this.pitch = Mth.clamp(tempFactor, 0f, 1.5f);
                // Silent during the day, unless it gets very hot. Makes noise at night as long as the min temperature is reached
                // Note that it is cooler at night, so this partially counteracts itself
                this.volume = Mth.clamp(timeFactor + tempFactor, 0f, 1f);

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

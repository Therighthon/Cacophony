package com.therighthon.cacophony.common.looping;

import com.therighthon.cacophony.common.SoundPlayers;
import com.therighthon.cacophony.common.Sounds;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.client.ClimateRenderCache;
import net.dries007.tfc.util.climate.KoppenClimateClassification;

public class LoopingSoundPlayer
{
    private static final float MIN_CRICKET_TEMP = 10;
    private final Minecraft minecraft;
    private @Nullable WindSoundInstance windSound;
    private @Nullable CricketsSoundInstance cricketSound;

    public LoopingSoundPlayer(final Minecraft minecraft)
    {
        this.minecraft = minecraft;
        this.windSound = null;
        this.cricketSound = null;
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event)
    {
        if (ClientHelpers.getLevel() != null && !Minecraft.getInstance().isPaused())
        {
            if (windSound == null)
            {
                this.windSound = new WindSoundInstance(Sounds.WIND_LOOP.get(), SoundSource.AMBIENT);
            }
            else if (!this.minecraft.getSoundManager().isActive(windSound))
            {
                this.minecraft.getSoundManager().queueTickingSound(windSound);
            }

            if (cricketSound == null)
            {
                final ClimateRenderCache climate = ClimateRenderCache.INSTANCE;
                final float temp =  climate.getInstantTemperature();
                if (temp > MIN_CRICKET_TEMP)
                {
                    KoppenClimateClassification kop = KoppenClimateClassification.classify(
                        climate.getAverageTemperature(), climate.getAverageRainfall(), climate.getRainVariance(), ClientHelpers.inNorthernHemisphere());
                    final Sounds.Id sound = getCricketFromClimate(kop);
                    if (sound != null)
                    {
                        this.cricketSound = new CricketsSoundInstance(sound.get(), SoundSource.AMBIENT);
                    }
                }
            }
            else if (!this.minecraft.getSoundManager().isActive(cricketSound))
            {
                this.minecraft.getSoundManager().queueTickingSound(cricketSound);
            }
        }
    }

    public static Sounds.Id getCricketFromClimate(KoppenClimateClassification kop)
    {
        return switch (kop)
        {
            case KoppenClimateClassification.AF, KoppenClimateClassification.AS, KoppenClimateClassification.AM, KoppenClimateClassification.AW -> Sounds.BRAZIL_CRICKETS;
            case KoppenClimateClassification.BWK, KoppenClimateClassification.BSK, KoppenClimateClassification.BWH, KoppenClimateClassification.BSH, KoppenClimateClassification.EF, KoppenClimateClassification.ET -> null;
            case KoppenClimateClassification.CSA, KoppenClimateClassification.CSB, KoppenClimateClassification.CSC, KoppenClimateClassification.DSA, KoppenClimateClassification.DSB, KoppenClimateClassification.DSC, KoppenClimateClassification.DSD -> Sounds.CALIFORNIA_CRICKETS;
            case KoppenClimateClassification.CWA, KoppenClimateClassification.CWB, KoppenClimateClassification.CWC, KoppenClimateClassification.DWA, KoppenClimateClassification.DWB, KoppenClimateClassification.DWC, KoppenClimateClassification.DWD -> Sounds.CHINA_CRICKETS;
            case KoppenClimateClassification.CFA, KoppenClimateClassification.CFB, KoppenClimateClassification.DFA, KoppenClimateClassification.CFC, KoppenClimateClassification.DFB, KoppenClimateClassification.DFC, KoppenClimateClassification.DFD -> Sounds.FRANCE_CRICKETS;
        };

    }

}

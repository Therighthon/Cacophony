package com.therighthon.cacophony.common.looping;

import com.therighthon.cacophony.common.Noise1D;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.checkerframework.checker.units.qual.N;

import net.dries007.tfc.client.ClientHelpers;
import net.dries007.tfc.util.calendar.Calendars;
import net.dries007.tfc.util.climate.Climate;

import static com.therighthon.cacophony.common.SoundPlayers.*;

// Based on vanilla class BeeSoundInstance
public class WindSoundInstance extends AbstractTickableSoundInstance
{
    final Noise1D gustNoise = new Noise1D(42069, 3, 64);

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
                final float scale = (float) gustNoise.windGustNoise(Calendars.CLIENT.getTicks(), 3);
                this.pitch = Mth.lerp(Mth.clamp(windSq, WIND_NOISE_THRESHOLD, STRONG_WIND_NOISE_THRESHOLD), 0.4f + 0.5f * scale, 0.8f + scale);
                final float occlusionScale = getWindOcclusion(level, player.blockPosition());
                this.volume = Mth.clampedMap(windSq, 0.07f, 0.2f, 0.05f + 0.1f * scale, 0.15f + 0.2f * scale) * occlusionScale;
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

    // This method is pulled, nearly verbatim, from Nyonyix's Thermia mod, which is also under EUPL as of copying this (Oct 6, 2026)
    // https://github.com/Nyonyix/Thermia/blob/1.21.1/src/main/java/com/nyonyix/thermia/util/BlockSearch.java
    public static float getWindOcclusion(Level level, BlockPos pos)
    {
        Vec2 windVector = Climate.get(level).getWind(level, pos);

        float direction = (float) Math.atan2(windVector.y, windVector.x);
        float directionX = -(float) Math.cos(direction);
        float directionZ = -(float) Math.sin(direction);

        boolean canSeeSky = isExposedToSky(level, pos);
        double distance = canSeeSky ? 6.0 : 12.0;

        Vec3 startVec = Vec3.atCenterOf(pos.above());
        Vec3 endVec = startVec.add(directionX * distance, 0, directionZ * distance);

        ClipContext context = new ClipContext(startVec, endVec, ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, CollisionContext.empty());
        BlockHitResult hit = level.clip(context);

        if (hit.getType() != HitResult.Type.MISS)
        {
            float hitDist = (float) startVec.distanceTo(hit.getLocation());

            float min = canSeeSky ? 0.5f : 0.25f;
            float surcharge = canSeeSky ? 0.5f : 0.75f;

            return Mth.clamp((float) (min + (hitDist / distance) * surcharge), min, min + surcharge);
        }

        return 1f;
    }

    // This method is pulled, nearly verbatim, from Nyonyix's Thermia mod, which is also under EUPL as of copying this (Oct 6, 2026)
    // https://github.com/Nyonyix/Thermia/blob/1.21.1/src/main/java/com/nyonyix/thermia/util/EnvironmentHelpers.java
    public static boolean isExposedToSky(Level level, BlockPos pos)
    {
        return pos.getY() >= level.getHeight(Heightmap.Types.MOTION_BLOCKING, pos.getX(), pos.getZ());
    }
}

package com.therighthon.cacophony.common;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.climate.Climate;

public class SoundPlayers
{
    public static void playPlantSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        if (random.nextInt(100) == 0)
        {
            float wind = Climate.get(level).getWind(level, pos).lengthSquared();
            if (wind > 1.0f)
            {
                // TODO: play some appropriate wind noises
            }
        }
        else
        {
            // If no wind sound, check daytime
            final DayTime time = DayTime.getDayTimeFromTicks(pos.getZ());

            // Then check blocks
            final Block block = state.getBlock();
            if ((Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_EMERGENT_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.FRESH_FLOATING_PLANTS))
                && random.nextInt(time.getSoundRarityFreshwater()) == 0)
            {
                final SoundEvent sound = CacophonyHelpers.getValidSound(level, pos, random, time, FreshWaterEmergentSpecies.values());

                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }
            else if (Helpers.isBlock(block, CacophonyTags.Blocks.TALL_GRASS)
                && random.nextInt(time.getSoundRarityGrasses()) == 0)
            {
                final SoundEvent sound = CacophonyHelpers.getValidSound(level, pos, random, time, GrassSpecies.values());

                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }
            else if ((Helpers.isBlock(block, CacophonyTags.Blocks.SALTY_EMERGENT_PLANTS) || Helpers.isBlock(block, CacophonyTags.Blocks.SALTY_FLOATING_PLANTS))
                && random.nextInt(time.getSoundRaritySaltwater()) == 0)
            {
                // TODO: Saltwater Species
                final SoundEvent sound = CacophonyHelpers.getValidSound(level, pos, random, time, FreshWaterEmergentSpecies.values());

                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }

        }
    }

    public static void playLeafSound(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        // Wind sounds have a constant likelihood
        if (random.nextInt(100) == 0)
        {
            float wind = Climate.get(level).getWind(level, pos).lengthSquared();
            if (wind > 1.0f)
            {
                // TODO: play some appropriate wind noises
            }
        }
        else
        {
            // If no wind sound, check daytime
            final DayTime time = DayTime.getDayTimeFromTicks(pos.getZ());

            if (random.nextInt(time.getSoundRarityLeaves()) == 0)
            {
                final SoundEvent sound = CacophonyHelpers.getValidSound(level, pos, random, time, LeavesSpecies.values());

                if (sound != null)
                {
                    level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.AMBIENT, 1.0f, 1.0f, false);
                }
            }
        }
    }
}

package com.therighthon.cacophony.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.dries007.tfc.common.blocks.plant.PlantBlock;

@Mixin(PlantBlock.class)
public abstract class PlantBlockMixin
{
    @Inject(method="animateTick", at=@At("HEAD"), remap = false)
    public void playAmbientSounds(BlockState state, Level level, BlockPos pos, RandomSource random, CallbackInfo ci)
    {
        // TODO:
        // See note in TFCLeavesBlockMixin for general code flow. For plants, we also want to do different sound types based on the plant block:
        // 1. Grasses: Plains animal noises, plains wind noises
        // 2. Water plants: Frog noises, water noises?
        if (random.nextInt(200) == 0)
        {
            level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.GHAST_AMBIENT, SoundSource.AMBIENT, 1.0f, 1.0f, false);
        }

        // TODO: Other blocks to mixin to:
        // Sand and Gravel - desolate noises in dry places, beach noises in correct biomes
        // Snow/snow piles - desolate winter noises
        // Ices - cracking noises
        // Groundcover -
    }
}

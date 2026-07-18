package com.therighthon.cacophony.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.therighthon.cacophony.common.CacophonyTags;
import com.therighthon.cacophony.common.SoundPlayers;
import com.therighthon.cacophony.common.Sounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.dries007.tfc.util.Helpers;

@Mixin(Block.class)
abstract class BlockMixin
{
    @Inject(method = "animateTick", at = @At("HEAD"), remap = false)
    public void playAmbientSounds(BlockState state, Level level, BlockPos pos, RandomSource random, CallbackInfo ci)
    {
        if (random.nextInt(5000) == 0)
        {
            final Block block = state.getBlock();
            if (block instanceof IceBlock)
            {
                level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), Sounds.ICE_CREAK.get(), SoundSource.AMBIENT, 1.0f, 1.0f, false);
            }
            else if (Helpers.isBlock(block, CacophonyTags.Blocks.ICE) && (random.nextInt(10) == 0))
            {
                level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), Sounds.ICE_CREAK.get(), SoundSource.AMBIENT, 1.0f, 1.0f, false);
            }
        }
    }
}
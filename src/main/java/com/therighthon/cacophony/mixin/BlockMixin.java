package com.therighthon.cacophony.mixin;

import com.therighthon.cacophony.common.CacophonyTags;
import com.therighthon.cacophony.common.SoundPlayers;
import com.therighthon.cacophony.common.Sounds;
import com.therighthon.cacophony.common.ranges.ShoreRanges;
import com.therighthon.cacophony.common.ranges.SnowRanges;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.util.Helpers;

@Mixin(Block.class)
abstract class BlockMixin
{
    @Inject(method = "animateTick", at = @At("HEAD"), remap = false)
    public void playAmbientSounds(BlockState state, Level level, BlockPos pos, RandomSource random, CallbackInfo ci)
    {
        final int rInt = random.nextInt(5000);
        if (rInt < 21)
        {
            final Block block = state.getBlock();
            if (rInt == 0)
            {
                if (block instanceof IceBlock)
                {
                    SoundPlayers.playLocalSound(level, pos, Sounds.ICE_CREAK.get());
                }
                else if (Helpers.isBlock(block, CacophonyTags.Blocks.ICE) && (random.nextInt(10) == 0))
                {
                    SoundPlayers.playLocalSound(level, pos, Sounds.ICE_CREAK.get());
                }
            }
            else if (rInt < 11 && block instanceof SnowLayerBlock)
            {
                SoundPlayers.playSoundFromRange(state, level, pos, random, SnowRanges.values());
            }
            else if (Helpers.isBlock(block, Tags.Blocks.SANDS) || Helpers.isBlock(block, Tags.Blocks.GRAVELS) || Helpers.isBlock(block, TFCTags.Blocks.MUD) || Helpers.isFluid(state.getFluidState(), TFCTags.Fluids.ANY_INFINITE_WATER))
            {
                SoundPlayers.playSoundFromRange(state, level, pos.above(25), random, ShoreRanges.values());
            }
        }
    }
}
package com.therighthon.cacophony.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.dries007.tfc.util.Helpers.*;

public class CacophonyTags
{
    public static class Blocks
    {
        public static final TagKey<Block> FRESH_EMERGENT_PLANTS = tag("fresh_emergent_plants");
        public static final TagKey<Block> SALTY_EMERGENT_PLANTS = tag("salty_emergent_plants");
        public static final TagKey<Block> FRESH_FLOATING_PLANTS = tag("fresh_floating_plants");
        public static final TagKey<Block> SALTY_FLOATING_PLANTS = tag("salty_floating_plants");
        public static final TagKey<Block> TALL_GRASS = tag("tall_grass");

        public static final TagKey<Block> ICE = mcTag("ice");
    }

    private static TagKey<Block> tag(String name)
    {
        return TagKey.create(Registries.BLOCK, CacophonyHelpers.identifier(name));
    }

    private static TagKey<Block> mcTag(String name)
    {
        return TagKey.create(Registries.BLOCK, resourceLocation("minecraft", name));
    }
}

package com.therighthon.cacophony.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import net.dries007.tfc.util.Helpers;

import static net.dries007.tfc.util.Helpers.*;

public class CacophonyTags
{
    public static class Blocks
    {
        // TFC Tags
        public static final TagKey<Block> FRESH_EMERGENT_PLANTS = blockTag("fresh_emergent_plants");
        public static final TagKey<Block> FRESH_FLOATING_PLANTS = blockTag("fresh_floating_plants");
        public static final TagKey<Block> TALL_GRASS = blockTag("tall_grasses");
        public static final TagKey<Block> DRY_PLANTS = blockTag("dry_plants");
        public static final TagKey<Block> CACTI = blockTag("cacti");

        public static final TagKey<Block> ICE = mcTag("ice");
    }

    public static class Biomes
    {
        public static final TagKey<Biome> IS_SURFACE_LAKE = biomeTag("is_surface_lake");
        public static final TagKey<Biome> IS_SALT_MARSH = biomeTag("is_salt_marsh");
        public static final TagKey<Biome> IS_CLIFFY_SHORE = biomeTag("is_coastal_cliffs");
        public static final TagKey<Biome> IS_OCEANIC_MOUNTAINS = biomeTag("is_oceanic_mountains");
        public static final TagKey<Biome> IS_ISOLATED_ISLAND = biomeTag("is_isolated_island");
    }

    private static TagKey<Block> blockTag(String name)
    {
        return TagKey.create(Registries.BLOCK, Helpers.identifier(name));
    }

    private static TagKey<Biome> biomeTag(String name)
    {
        return TagKey.create(Registries.BIOME, Helpers.identifier(name));
    }

    private static TagKey<Block> mcTag(String name)
    {
        return TagKey.create(Registries.BLOCK, resourceLocation("minecraft", name));
    }
}

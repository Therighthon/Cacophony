package com.therighthon.cacophony.common;

import com.therighthon.cacophony.Cacophony;
import net.minecraft.resources.ResourceLocation;

import static net.dries007.tfc.util.Helpers.*;

public class CacophonyHelpers
{
    /**
     * @return A {@link ResourceLocation} with the {@code tfc} namespace.
     */
    public static ResourceLocation identifier(String name)
    {
        return resourceLocation(Cacophony.MOD_ID, name);
    }
}

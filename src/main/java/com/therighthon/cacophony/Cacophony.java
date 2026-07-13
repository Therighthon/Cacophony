package com.therighthon.cacophony;

import com.mojang.logging.LogUtils;
import com.therighthon.cacophony.common.Sounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Cacophony.MOD_ID)
public class Cacophony
{
    public static final String MOD_ID = "cacophony";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cacophony(ModContainer modContainer, IEventBus bus)
    {
        bus.addListener(this::setup);

        Sounds.SOUNDS.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("CACOPHONY COMMON SETUP");
    }

}

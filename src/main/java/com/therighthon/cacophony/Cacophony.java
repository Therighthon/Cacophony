package com.therighthon.cacophony;

import com.mojang.logging.LogUtils;
import com.therighthon.cacophony.common.Sounds;
import com.therighthon.cacophony.common.looping.LoopingSoundPlayer;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Cacophony.MOD_ID)
public class Cacophony
{
    public static final String MOD_ID = "cacophony";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cacophony(ModContainer modContainer, IEventBus modBus)
    {
        modBus.addListener(this::setup);
        if (FMLEnvironment.dist == Dist.CLIENT)
        {
            NeoForge.EVENT_BUS.register(new LoopingSoundPlayer(Minecraft.getInstance()));
        }
        Sounds.SOUNDS.register(modBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("CACOPHONY COMMON SETUP");
    }


}

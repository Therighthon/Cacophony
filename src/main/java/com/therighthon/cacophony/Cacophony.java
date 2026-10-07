package com.therighthon.cacophony;

import com.mojang.logging.LogUtils;
import com.therighthon.cacophony.client.Sounds;
import com.therighthon.cacophony.client.looping.LoopingSoundPlayer;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(value = Cacophony.MOD_ID, dist = Dist.CLIENT)
public class Cacophony
{
    public static final String MOD_ID = "cacophony";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cacophony(ModContainer modContainer, IEventBus modBus)
    {
        modBus.addListener(this::clientSetup);
        modContainer.registerConfig(ModConfig.Type.CLIENT, CacophonyConfig.CLIENT.spec());
        if (FMLEnvironment.dist == Dist.CLIENT)
        {
            NeoForge.EVENT_BUS.register(new LoopingSoundPlayer(Minecraft.getInstance()));
            Sounds.SOUNDS.register(modBus);
            modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        }
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("CACOPHONY CLIENT SETUP");
    }


}

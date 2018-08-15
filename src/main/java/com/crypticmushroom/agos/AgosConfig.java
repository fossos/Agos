package com.crypticmushroom.agos;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*
 * Config Handler by Choonster
 * Made from the open source mod TestMod3
 * https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.12.2/src/main/java/choonster/testmod3/config/ModConfig.java
 *
 * TestMod3 Copyright Choonster 2015-2017 MIT License
 */

/**
 * PLEASE NOTE: IF YOU ARE GOING TO CHANGE ANY EXISTING
 * CONFIGURATION VARIABLES, YOU MUST DELETE YOUR EXISTING
 * agos.cfg FILE IN THE config FOLDER OF YOUR
 * TESTING DIRECTORY (normally named "run")
 */
@Config(modid = Agos.MOD_ID)
@Config.LangKey(Agos.MOD_ID + ".config.title")
public class AgosConfig
{
    public static final Other other = new Other();

    public static class Other
    {
        public final Developer developer = new Developer();

        public static class Developer
        {
            @Config.Comment("Developer mode outputs extra content to the console for development purposes.")
            public boolean developerMode = false;
        }
    }

    @Mod.EventBusSubscriber(modid = Agos.MOD_ID)
    private static class EventHandler
    {
        /**
         * Inject the new values and save to the config file when the config has been changed from the GUI.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Agos.MOD_ID)) {
                ConfigManager.sync(Agos.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}

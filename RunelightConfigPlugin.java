package net.runelite.client.plugins.MyConfigPlugin;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.ConfigChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

@Slf4j
@PluginDescriptor(
        name = "Confige tutorial plugin",
        description = " this is a plugin demenstrating config for Plugins in Runelite I am following along."
)

public class MyConfigePlugin extends Plugin {
    @Inject
    private MyConfig myConfig;

    @Provides
    MyConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(MyConfig.class);
    }

    @Subscribe
    public void onConfigChannel(ConfigChanged event) {
        System.out.println("Welcome " + myConfig.nickname());
        System.out.println("current goal level = " + myConfig.goallevel());
    }



}
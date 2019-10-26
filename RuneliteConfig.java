package net.runelite.client.plugins.MyConfigPlugin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

// note we need to use an Interface java class in the editor for this setting on the plugin

@ConfigGroup("myconfig")

public interface MyConfig extends Config {

    @ConfigItem(
            keyName = "nickname",
//            dont capalise and no spaces for above
            name = "Nickname",
//            is name user see so spaces/cap
            description = "the users nickname",
            position = 1
//            position starts at 1 not 0 for this

    )
    default String nickname() { return "David";
    }
    @ConfigItem(
            keyName = "goallevel",
            name = "Goal Level",
            description = "Current Goal Level",
            position = 1
    )
    default int goallevel() { return 99; }
}

package net.runelite.client.plugins.MyOverlayPlugin;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@Slf4j
@PluginDescriptor(
        name = "MyOverlayPlugin",
        description = "this is to set up an overlay for runelite plugin."
)

public class MyOverlayPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private MyOverlay myOverlay;

    @Override
    public void startUp(){
        overlayManager.add(myOverlay);
    }
//    this adds my plugin overlay at the start up runelite

    @Override
    public void shutDown() {
        overlayManager.remove(myOverlay);
    }
//    shuts down plugin when shutdown ie quit
    public int getCookingLevel() {
    return client.getRealSkillLevel(Skill.COOKING);
    }
}
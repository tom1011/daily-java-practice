package net.runelite.client.plugins.MyOverlayPlugin;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

import javax.inject.Inject;
import java.awt.*;

public class MyOverlay extends Overlay {

    private MyOverlayPlugin plugin;

    private PanelComponent panelComponent = new PanelComponent();

    @Inject
    public MyOverlay(MyOverlayPlugin plugin) {
        super(plugin);
        setPosition(OverlayPosition.TOP_LEFT);
        setLayer(OverlayLayer.ABOVE_SCENE);
//        this is above the main client/game level.
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics) {

        panelComponent.getChildren().clear();
//        this celars the panel component on refresh of the component.
        panelComponent.getChildren().add(LineComponent.builder()
//                this adds a line to the compont i am building ie what will be displaded on this line comes next
                .left("Cooking Level")
//                this is displade on the left of the component built
                .right(Integer.toString(plugin.getCookingLevel()))
//                this is built on the right not that I am using the public varabile of my plugin getCookingLevel.
//                this plugin is the one from inject ie the one i made in the other file so I can use the diffrent
//                varables in that class here.
                .build());
//        this builds the component.
        return panelComponent.render(graphics);
    }

}


// this is just being uploaded seprately to add notes to what I take from the tutorial to help build future plugins
// this is being uploaded removed from the plugin so the imports and extends wont be working but 
// it should help get a better idea of what I am learning

package net.runelite.client.plugins.Testingplugin;


import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.ExperienceChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.Skill;
import javax.inject.Inject;

// end imports

@Slf4j

// need this so plugin will work with plugin lombok
@PluginDescriptor(
        name="testing setup for runeLite plugin",
        description = "testing set up for using to develop plugin"

)

//plugin descrition

public class Testingplugin extends Plugin {
    // almost all things I will be working with will be extending the plugin class
    // I might need to add some thing to events but I wount be uploading that to github

    @Inject
    private Client client;
    // this is an object that we want access too therefor we will "inject" this object here so we can use it
    // think of this as using redux to grab a variable from somewhere else

    @Subscribe
    // subscribe will listien for this event ie experiance chaged event will be trigged before this will run
    // its basicly extending the "class" of experience change

    // diffrent between inject/subscribe is that inject is getting the variable from there ie we want the variable named client and all properties of that variable
    // subscribe lets us extend that object to use new functionality. 
    // to sum up subscribe when we want to change stuff inject when we just need the info.
    public void onExperienceChanged(ExperienceChanged event){
        Skill skill = event.getSkill();
        // skill is from the experiencechanged class.
        
        int xp = client.getSkillExperience(skill);
        int level = client.getRealSkillLevel(skill);

        if(level != 0){
            System.out.println ("printing skill name: " + skill.getName() + " at " + xp + " xp at level " + level );
        }



    }
}

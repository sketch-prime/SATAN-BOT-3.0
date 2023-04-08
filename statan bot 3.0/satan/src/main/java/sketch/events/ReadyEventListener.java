package sketch.events;

import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.events.*;
import net.dv8tion.jda.api.events.session.ReadyEvent;

public class ReadyEventListener implements EventListener{
    
    /**
     * a listener for the ReadyEvent
     * @param event when the bot is turned on an event is initiated
     */
    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof ReadyEvent){
            System.out.println("SATAN IS READY TO RUMBLE");
        }
    }
}

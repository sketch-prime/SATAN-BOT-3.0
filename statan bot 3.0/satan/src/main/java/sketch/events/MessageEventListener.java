package sketch.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class MessageEventListener extends ListenerAdapter{
    
    @Override
    public void onMessageReceived(MessageReceivedEvent event) 
    {
        super.onMessageReceived(event);
        System.out.printf("[%s]: %s\n", event.getAuthor().getName(), event.getMessage().getContentDisplay());
    }
}

package sketch.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class MessageEventListener extends ListenerAdapter{
    
    @Override
    public void onMessageReceived(MessageReceivedEvent event) 
    {
        super.onMessageReceived(event);
        if(event.getMessage().getContentDisplay().toLowerCase().equals("!respond")) {
            event.getChannel().sendMessage("I HAVE RESPONDED").queue();

        }
        System.out.printf("[%s]: %s\n", event.getAuthor().getName(), event.getMessage().getContentDisplay());
    }
}

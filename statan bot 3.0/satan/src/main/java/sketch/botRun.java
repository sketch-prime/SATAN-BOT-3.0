package sketch;

import java.util.EnumSet;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import sketch.events.MessageEventListener;
import sketch.events.ReadyEventListener;

/**
 * running a shitty discord bot
 *
 */
public class botRun 
{

    public static void main( String[] args ) throws LoginException
    {

        token TOKEN = new token();

        String token = TOKEN.getToken();

        final EnumSet<GatewayIntent> intents = EnumSet.allOf(GatewayIntent.class);

        JDABuilder bot = JDABuilder.createDefault(token);
            bot
                .enableIntents(intents)
                .setActivity(Activity.playing("in the firey pits of hell."))
                .addEventListeners(new ReadyEventListener(), new MessageEventListener())
                .build();
    }
}

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

	public class Principal {
	private static TwitchBot bot;
	private static String canalHoster = "";
	private static String oauth = "";
	private static String admin="dm94dani";
	
	public static void main(String[] args){
		mensajeInicio();
		try {
			crearBot();
		} catch (IOException | IrcException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void crearBot() throws NickAlreadyInUseException, IOException, IrcException{
		
		bot= new TwitchBot(canalHoster,admin);
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv" ,6667,oauth);
		bot.joinChannel("#"+canalHoster);
		
	}
	
	public static void mandarMensaje(String canalHoster,String mensaje){
		bot.sendMessage("#"+canalHoster,mensaje);
	}
	
	public static void mensajeInicio(){
		System.out.println("------------------------------------------------------");
		System.out.println("----------------                        --------------");
		System.out.println("----------------   TwitchPlaysPokemon   --------------");
		System.out.println("----------------                        --------------");
		System.out.println("------------------------------------------------------");
	}
	
}

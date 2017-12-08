import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.jibble.pircbot.*;

/*
 * Esta Clase es el bot una vez iniciada siempre esta activada, se encarga de leer el chat y decidir que hacer
 * en funcion del comando que envien por el chat.
 */

public class TwitchBot extends PircBot{
	private static String canal;
	private static String admin;
	private Pulsaciones botPulsador;
	private Teclas teclas;
	
	//Para que cambien los !comandos solo hace falta que esos comandos no llegen a estar definidos.
	
	public TwitchBot(String nombre, String adminis){
		this.setName(nombre);
		this.canal=nombre;
		this.admin=adminis;
		teclas=new Teclas();
		botPulsador=new Pulsaciones(teclas);
		botPulsador.start();
	}
	
	public static String getCanal(){
		return canal;
	}
	
	public void onMessage(String channel,String sender, String login, String hostname, String message) {
		if(message.toLowerCase().contains("up")){
			teclas.addTecla(1);
		}else if(message.toLowerCase().contains("down")){
			teclas.addTecla(2);	
		}else if(message.toLowerCase().contains("left")){
			teclas.addTecla(3);
		}else if(message.toLowerCase().contains("right")){
			teclas.addTecla(4);
		}else if(message.toLowerCase().contains("!ba")){
			teclas.addTecla(5);
		}else if(message.toLowerCase().contains("!bb")){
			teclas.addTecla(6);
		}else if(message.toLowerCase().contains("start")){
			teclas.addTecla(7);
		}else if(message.toLowerCase().contains("select")){
			teclas.addTecla(8);
		}else if(message.toLowerCase().contains("subir")){
			teclas.addTecla(1);
		}else if(message.toLowerCase().contains("bajar")){
			teclas.addTecla(2);
		}else if(message.toLowerCase().contains("izquierda")){
			teclas.addTecla(3);
		}else if(message.toLowerCase().contains("derecha")){
			teclas.addTecla(4);
		}else if(message.toLowerCase().equalsIgnoreCase("b")){
			teclas.addTecla(6);
		}else if(message.toLowerCase().equalsIgnoreCase("a")){
			teclas.addTecla(5);
		}
		
		
	}
	
	
}

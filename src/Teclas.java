import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Teclas {
	private ArrayList<Integer> teclasPulsadas;
	private int teclasTotales=0;
	
	public Teclas(){
		teclasPulsadas=new ArrayList();
	}
	
	public synchronized void addTecla(int tecla){
		teclasPulsadas.add(tecla);
		teclasTotales++;
		
		System.out.println("Tecla añadida "+tecla);
	}
	
	public synchronized int sacarTecla(){
		int tecla=0;
		
		if(teclasTotales>0){
			tecla=teclasPulsadas.get(teclasTotales-1);
				
			teclasPulsadas.remove(teclasTotales-1);
			teclasTotales--;
		}
		
		return tecla;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

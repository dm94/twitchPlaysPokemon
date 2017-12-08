import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pulsaciones extends Thread {
	private Robot robot;
	private int maxTeclasPulsadas = 100000;
	private int teclasPulsadasTotal = 0;
	private Teclas teclas;

	public Pulsaciones(Teclas teclas) {
		this.teclas = teclas;
		try {
			robot = new Robot();
			robot.setAutoDelay(100);
		} catch (AWTException e) {
			System.out.println("Fallo al crear el robot");
		}
	}

	public void run() {
		try {
			while (teclasPulsadasTotal < maxTeclasPulsadas) {
				if (pulsarTeclas()) {
					teclasPulsadasTotal++;
				}
				Thread.sleep(300);
			}
			
			System.out.println("Bot pulsador parado");
		} catch (Exception e) {
			System.out.println("Fallo en el run del robot");
		}
	}

	private boolean pulsarTeclas() {
		boolean pulsado=false;
		
		int tecla = teclas.sacarTecla();
		switch (tecla) {
		case 1:
			robot.keyPress(KeyEvent.VK_0);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_0);
			pulsado=true;
			break;
		case 2:
			robot.keyPress(KeyEvent.VK_1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_1);
			pulsado=true;
			break;
		case 3:
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_2);
			pulsado=true;
			break;
		case 4:
			robot.keyPress(KeyEvent.VK_3);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_3);
			pulsado=true;
			break;
		case 5:
			robot.keyPress(KeyEvent.VK_C);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_C);
			pulsado=true;
			break;
		case 6:
			robot.keyPress(KeyEvent.VK_X);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_X);
			pulsado=true;
			break;
		case 7:
			robot.keyPress(KeyEvent.VK_Q);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_Q);
			pulsado=true;
			break;
		}
	
		if(tecla>0){
			System.out.println("Tecla pulsada "+tecla);
		}
		
		return pulsado;
	}
}

package es.iesvjp.psp.hilos.Reloj;

public class Sonido extends Thread {
	@Override
	public void run() { /* c�digo concurrente */

		for (int i = 0; i < 10; i++) {
			System.out.println("Beep!!");

			java.awt.Toolkit.getDefaultToolkit().beep();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

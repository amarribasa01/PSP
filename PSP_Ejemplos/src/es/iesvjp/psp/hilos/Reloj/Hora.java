package es.iesvjp.psp.hilos.Reloj;

import java.time.LocalDateTime;

public class Hora extends Thread {

	@Override
	public void run() { /* código concurrente */

		for (int i = 0; i < 10; i++) {
			System.out.println(LocalDateTime.now().toString());
			try {
				sleep(1000);/* esperar 1000 ms */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
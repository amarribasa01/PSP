package es.iesvjp.psp.hilos.ProductorConsumidor;

public class Productor extends Thread {
	private Cola cola;
	

	public Productor(Cola cola) {
		this.cola = cola;
		
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			cola.put(i); // pone el número
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}

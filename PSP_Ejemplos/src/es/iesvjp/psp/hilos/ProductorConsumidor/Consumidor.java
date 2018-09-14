package es.iesvjp.psp.hilos.ProductorConsumidor;

public class Consumidor extends Thread {
	private Cola cola;
	

	public Consumidor(Cola cola) {
		this.cola = cola;
		
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			int valor = cola.get(); // recoge el número
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			

		}
	}
}

package es.iesvjp.psp.hilos.Herencia;

public class ThreadConHerencia extends Thread{
	int numHilo;

	public int getNumHilo() {
		return numHilo;
	}

	public ThreadConHerencia(int hilo) {
		this.numHilo=hilo;
		
	}
	
	public void run()
	{
		for (int i = 0; i < 4; i++) {
			System.out.println("Hilo " + this.getNumHilo());
			
		}
		
	}
}


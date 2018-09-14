package es.iesvjp.psp.hilos.Runnable;

public class ThreadConRunnable implements Runnable {
	String palabra;

	public ThreadConRunnable(String _palabra) {
		this.palabra = _palabra;
	}

	public void run() {
		for (int i = 0; i < 4; i++)
			System.out.println(palabra);

	}
}

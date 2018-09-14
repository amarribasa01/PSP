package es.iesvjp.psp.hilos.Runnable;

public class MainRunnable {
	public static void main (String args[]) {
		ThreadConRunnable a= new ThreadConRunnable("Hilo 1");
		ThreadConRunnable b = new ThreadConRunnable("Hilo 2");
		Thread th1 = new Thread (a);
		Thread th2 = new Thread (b);
		th1.start();
		th2.start();
		System.out.println("Fin del hilo principal");
	}
}

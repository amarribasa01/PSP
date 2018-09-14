package es.iesvjp.psp.hilos.Herencia;

public class MainHerencia {

	public static void main(String[] args) {
		ThreadConHerencia thH1= new ThreadConHerencia(1);
		ThreadConHerencia thH2= new ThreadConHerencia(2);
		
		thH1.start();
		thH2.start();
        System.out.println("Fin del hilo principal");
	}
}

package es.iesvjp.psp.hilos.Ejemplos;

public class Main2 {

	public static void main ( String args [ ]) {
		Ejemplo2 ejem1 = new Ejemplo2("Hilo 1");
		Ejemplo2 ejem2 = new Ejemplo2("Hilo 2");
		
		Thread th1 = new Thread (ejem1);
		Thread th2 = new Thread (ejem2);
		th1.start();
		th1.setPriority(1);//bajamos la prioridad del hilo 1
		
		System.out.println ( "Prioridad del Hilo 1: "+th1.getPriority());
		th2.start() ;
		System.out.println ("Prioridad del Hilo 2: "+th2.getPriority());
	}
}

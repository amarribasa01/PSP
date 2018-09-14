package es.iesvjp.psp.hilos.Ejemplos;

public class Ejemplo2 implements Runnable{

	String palabra;
	
	public Ejemplo2(String _palabra) {
		this.palabra = _palabra;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(palabra);
			
		}
		
	}

}

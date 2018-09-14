package es.iesvjp.psp.hilos.Ejemplos;

public class Ejemplo1 {
	public static void main(String[] args) {
		System.out.println("Este un proceso que cuenta hasta 100");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

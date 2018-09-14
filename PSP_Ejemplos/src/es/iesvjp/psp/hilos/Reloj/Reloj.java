package es.iesvjp.psp.hilos.Reloj;

public class Reloj {
	public static void main(String[] args) {
		Hora hora = new Hora();
		Sonido sonido = new Sonido();
		hora.start();
		sonido.start();
		
	}
}

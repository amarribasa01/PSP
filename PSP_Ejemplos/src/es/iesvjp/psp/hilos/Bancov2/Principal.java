package es.iesvjp.psp.hilos.Bancov2;

public class Principal {
	
	public static void main(String[] args) {
		Cuenta cuenta= new Cuenta(50);
		Persona ana= new Persona("Ana", cuenta);
		Persona juan= new Persona("Juan", cuenta);
		
		ana.start();
		juan.start();
	}

}

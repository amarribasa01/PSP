package es.iesvjp.psp.hilos.ProductorConsumidor;

public class Principal {
	public static void main(String[] args) {
		Cola cola= new Cola();
		Productor prod=new Productor(cola);
		Consumidor con=new Consumidor(cola);
		
		prod.start();
		con.start();
	}

}

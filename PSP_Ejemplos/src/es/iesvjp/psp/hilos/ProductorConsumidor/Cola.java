package es.iesvjp.psp.hilos.ProductorConsumidor;

public class Cola {
	private int numero;
	private boolean llena=false;//inicialmente la cola está vacía
	
	public synchronized void put(int valor)
	{  //esperamos mientras la cola esté llena, cuando se vacíe pondremos un valor
		while(llena)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero=valor;//colocamos valor en la cola
		llena=true;
		System.out.println("=>Productor, produce:"+ valor);
		notifyAll();
		
	}
	
	public synchronized int get()
	{ //esperamos mientras la cola esté vacía,cuando esté llena cogeremos un valor
		while(!llena)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		llena=false;
		System.out.println("<=Consumidor,consume:"+ this.numero);
		notifyAll();
		return this.numero;
		
	}


}

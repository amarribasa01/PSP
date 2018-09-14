package es.iesvjp.psp.hilos.ProductorConsumidor;

public class Cola {
	private int numero;
	private boolean llena=false;//inicialmente la cola est� vac�a
	
	public synchronized void put(int valor)
	{  //esperamos mientras la cola est� llena, cuando se vac�e pondremos un valor
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
	{ //esperamos mientras la cola est� vac�a,cuando est� llena cogeremos un valor
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

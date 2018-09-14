package es.iesvjp.psp.hilos.Reloj;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		Hora hora= new Hora();
		hora.start();
		
//		while(true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}          
//			System.out.println(LocalDateTime.now().toString());
//			
//		}
		

	}

}

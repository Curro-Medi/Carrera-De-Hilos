package Carrera;

public class Carrera implements Runnable{


	public void run() {

		for(int i = 1; i < 2; i++) {
			
			try {
				
				System.out.println(Thread.currentThread().getName() + " Ha recorrido " + i + " metros ");
				Thread.sleep(4000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(Thread.currentThread().getName() + " Ha terminado la carrrreraa ");
		
		
			
			System.out.println(Thread.currentThread().getName() + " Ha quedado--> " + Thread.currentThread());
			
		
		
	}
		
}

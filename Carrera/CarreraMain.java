package Carrera;

import ThreadPruebas.Prueba1;

public class CarreraMain {

	public static void main(String[] args) throws InterruptedException {

		Carrera pepe = new Carrera();
		Thread pepe2 = new Thread(pepe,"Pepe");
		
		Carrera ramos = new Carrera();
		Thread ramos2 = new Thread(ramos,"Sergio Ramos");
		
		Carrera suarez = new Carrera();
		Thread suarez2 = new Thread(suarez,"Luis Suarez");
		
		System.out.println("Cooooooomienza la carrera paquito, hoy hace un dia bastante lluvioso pero estoy seguro de que los corredores van a darlo todo");
		
		pepe2.start();
		Thread.sleep(2000);
		ramos2.start();
		Thread.sleep(2000);
		suarez2.start();
		Thread.sleep(2000);

	}

}

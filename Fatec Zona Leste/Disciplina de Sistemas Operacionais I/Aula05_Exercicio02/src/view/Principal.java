package view;

import controller.FatecCooked;
import java.util.concurrent.Semaphore;

public class Principal {

	public static void main(String[] args) 
	{
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int i = 1; i <= 5; i++) 
		{
			FatecCooked tPrato = new FatecCooked(i, semaforo);
			tPrato.start();
		}
	}
}

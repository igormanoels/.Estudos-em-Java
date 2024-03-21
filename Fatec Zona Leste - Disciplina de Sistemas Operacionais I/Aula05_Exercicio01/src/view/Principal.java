package view;

import java.util.concurrent.Semaphore;

import controller.ThreadsBD;


public class Principal {

	public static void main(String[] args) 
	{
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		int operacao = 0;
		int contador = 1;
		
		for (int i = 1; i < 22; i++) 
		{
			if (i % 3 == 0) 
			{
				operacao = 3;
			}
			else if (i % 3 == 1) 
			{
				operacao = 2;
			}
			else if (i % 3 == 2) 
			{
				operacao = 3;
			}
			
			ThreadsBD bd = new ThreadsBD(i, operacao, semaforo, contador);
			bd.start();
		}
		
	}

}

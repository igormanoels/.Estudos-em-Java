package view;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	2) 4 pessoas caminham, cada uma em um corredor diferente. Os 4 corredores terminam
 * 	em uma única porta. Apenas 1 pessoa pode cruzar a porta, por vez. Considere que cada 
 * 	corredor tem 200m. e cada pessoa anda de 4 a 6 m/s. Cada pessoa leva de 1 a 2 segundos 
 * 	para abrir e cruzar a porta. Faça uma aplicação em java que simule essa situação.
 */

import controller.ThreadPessoas;
import java.util.concurrent.Semaphore;

public class Principal {
	
	public static void main(String[] args) 
	{
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int i = 1; i <= 4; i++) 
		{
			ThreadPessoas pessoa = new ThreadPessoas(i, semaforo);
			pessoa.start();
		}
	}

}

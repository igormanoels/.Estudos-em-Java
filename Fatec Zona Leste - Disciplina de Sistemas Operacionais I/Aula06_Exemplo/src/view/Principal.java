package view;

import controller.ThreadCarros;
import java.util.concurrent.Semaphore;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * Ex.Exemplo.: Considere que 10 automóveis se deslocam de lugares distintos, distantes de 1Km a 2km de um estacionamento. 
 * Todos pretendem estacionar nesse estacionamento que tem 3 vagas. Os carros se deslocam em velocidade de 100 m a cada 100 
 * milissegundos e, quando estacionam, pretendem ficar de 1 a 3 segundos estacionados. Ao chegar e ao sair do estacionamento,
 * deve-se fazer uma notificação. Ao estacionar, também deve-se fazer uma notificação. Os carros que chegam e não conseguem 
 * estacionar,devem aguardar em fila por ordem de chegada.
 */

public class Principal {

	public static void main(String[] args) 
	{
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int i = 1; i <= 10; i++) 
		{
			ThreadCarros carros = new ThreadCarros(i, semaforo);
			carros.start();
		}
	}
}

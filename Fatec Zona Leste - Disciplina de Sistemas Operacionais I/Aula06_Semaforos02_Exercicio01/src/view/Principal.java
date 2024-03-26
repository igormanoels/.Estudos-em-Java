package view;

import java.util.concurrent.Semaphore;
import controller.ControladorDeTransito;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	1) Fazer uma aplicação, console, que gerencie a figura abaixo: Para tal, 
 * 	usar uma variável sentido, que será alterado pela Thread que controla cada 
 * 	carro com a movimentação do carro.Quando a Thread tiver a possibilidade de 
 * 	ser executada, pela deve imprimir em console o sentido que o carro está 
 * 	passando. Só pode passar um carro por vez no cruzamento.
 */
public class Principal {
	
	public static void main(String[] args) 
	{
		int permissao = 1;
		String lado;
		Semaphore quant = new Semaphore(permissao);
		
		for (int i = 1; i < 20; i++) 
		{
			if (i % 2 == 0) 
			{
				lado  = "A";
			} 
			else 
			{
				lado = "B";
			}
			
			ControladorDeTransito cet = new ControladorDeTransito(i, quant, lado);
			cet.start();
		}
	}

}

package controller;

import view.Principal;
import controller.Sacar;

public class Caixa {
	
	static int caixa[] = new int[6]; // contém os valores disponíveis para saque
	
	/***************************************************
	 * Método contrutor para atribuir o valor ao caixa 
	 */
	public Caixa(int[] quantNoCaixa) 
	{
		int notas = 0;
		
		System.out.println("\n\n");
		
		for (int i = 0; i < caixa.length; i++) 
		{
			switch (i) 
			{
				case 0:
					notas = 5;
					break;
				case 1:
					notas = 10;
					break;
				case 2:
					notas = 20;
					break;
				case 3:
					notas = 50;
					break;
				case 4:
					notas = 100;
					break;
				case 5:
					notas = 200;
					break;
			}
			caixa[i] = quantNoCaixa[i] * notas;
			System.out.println("Notas de " + notas + " - Valor R$ " + caixa[i]);
		}
		
		Sacar caixa = new Sacar();
		caixa.caixa(caixa);
		
		Principal.limparConsole();
		System.out.print("As notas foram carregas com sucesso!\n"
				+ "Vocês está de volta ao menu inicial.\n\n\n");
		Principal.menu();	
	}
	
	/****************************************
	 * Método que gerencia saque do caixa.
	 *
	public saque(int valor)
	{
		
	}
	
	public saqueAutomatico()
	{
		// incluir o tratamento de 100 transações automáticas
		Sacar sacar = new Sacar(caixa);
		sacar.start();
	}
	*/
}

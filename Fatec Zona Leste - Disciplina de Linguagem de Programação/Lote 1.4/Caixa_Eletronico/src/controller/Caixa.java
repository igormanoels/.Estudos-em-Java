package controller;

import view.Principal;

public class Caixa {
	
	private int caixa[] = new int[6];
	
	/***************************************************
	 * Método contrutor para atribuir o valor ao caixa 
	 */
	public Caixa(int[] notas) 
	{
		int quant = 0;
		
		System.out.println("\n\n");
		
		for (int i = 0; i < caixa.length; i++) 
		{
			switch (i) 
			{
				case 0:
					quant = 5;
					break;
				case 1:
					quant = 10;
					break;
				case 2:
					quant = 20;
					break;
				case 3:
					quant = 50;
					break;
				case 4:
					quant = 100;
					break;
				case 5:
					quant = 200;
					break;
			}
			this.caixa[i] = notas[i] * quant;
			System.out.println("Notas de " + quant + " - Valor R$ " + caixa[i]);
		}
		
		Principal.limparConsole();
		System.out.print("As notas foram carregas com sucesso!\n"
				+ "Vocês está de volta ao menu inicial.\n\n\n");
		Principal.menu();	
	}
	
	/********************************
	 * Método que gerencia o caixa.
	 */
	public static void saque()
	{
		
	}
}

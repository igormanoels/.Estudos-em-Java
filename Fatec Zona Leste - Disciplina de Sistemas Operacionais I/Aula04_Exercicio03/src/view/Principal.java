package view;

import controller.ThreadVetor;

public class Principal {
	
	static int vetorTd [] = new int [1000];
	
	public static void main(String[] args) 
	{
		gerarN();
		
		for (int i = 1; i <= 2; i++) 
		{
			ThreadVetor vet = new ThreadVetor(vetorTd, i);
			vet.start();
		}
	}
	

	/*****************************************
	 * Gera números aleatórios para a o vetor
	 */
	private static void gerarN() 
	{
		        
		for (int i = 0; i < vetorTd.length; i++) 
		{
			vetorTd[i] = (int) Math.round(Math.random() * 100) + 1;
		}
		
	}

}

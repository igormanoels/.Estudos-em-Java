package exercicio_01_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * 	a. A média dos valores entre 10 e 200;
 *	b. A soma dos números ímpares.
 */

public class exercicio_01_vetores_matrizes {

	public static void main(String[] args) 
	{
		System.out.println("Gera uma matriz com 50 posições e soma os valores do intervalo entre: 10 e 200.");
		int vet[] = new int[50];
		int media, impar;
		vet = geraNums(vet);
		media = calcMedia(vet);
		impar = somaImpares(vet);
		System.out.println("Média: " + media + "\tSoma dos Impares: " + impar);
		
		
	}
	
	
	/********************************************
	 * Função para gerar os valores do vetor
	 */
	public static int [] geraNums(int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) (Math.round(Math.random() * 200) +1);
	
		}
		return v;
	}
	
	
	/*********************************************************************
	 * Função para cálcular a média dos valores do vetor conforme regra
	 */
	public static int calcMedia(int v[])
	{
		int med = 0;
		int c = 0;
		
		for (int i = 0; i < v.length; i++) 
		{
			if (v[i] >= 10 && v[i] <= 200) 
			{
				med +=v[i];
				c+=1;
			} 
		}
		return med / c;
		
	}
	
	
	/************************************************************
	 * Função para cálcular a soma dos valores impares do vetor 
	 */
	public static int somaImpares(int v[])
	{
		int imp = 0;
		for (int i = 0; i < v.length; i++) 
		{
			if (v[i] % 2 != 0) 
			{
				imp += v[i];
			}
		}
		return imp;
	}

}

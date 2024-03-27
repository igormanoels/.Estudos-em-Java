package exercicio_06_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	6. Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
 */

public class exercicio_06_vetores_matrizes {

	public static void main(String[] args) 
	{
		int vet[] = new int[20];

		vet = gerarNums(vet);
		vet = classificarVetor(vet);
		exibirVetor(vet);
	}
	
	 	
	/*******************************************
	 * Função que gera os n meros do vetor
	 */
	static int[] gerarNums(int v[])
	{
		System.out.print("Vetor Gerado: ");
		
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) (Math.random() * 100);
			System.out.print(v[i] + " ");
		}
		return v;
	}
	

	/*******************************************************
	 * Função Classifica o vetor conforme método bubble-sort
	 */
	static int[] classificarVetor(int v[])
	{
		int aux;
		
		for (int i = 0; i < v.length - 1; i++) 
		{
			for (int j = i + 1; j < v.length; j++) 
			{
				if (v[i] > v[j]) 
				{
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}
	
	
	/**************************************
	 * Procedimento que exibe o vetor ordenado
	 */
	static void exibirVetor(int v[])
	{
		System.out.print("\n\nVetor ordenado: ");
		
		for (int i = 0; i < v.length; i++) 
		{
			System.out.print(v[i] + " ");
		}
	}

}

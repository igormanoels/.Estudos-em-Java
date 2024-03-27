package exercicio_05_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 5. Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
 */

public class exercicio_05_vetores_matrizes {
	
	public static void main(String[] args) 
	{
		int vet[] = new int[20];
		double soma;
		vet = gerarVetor(vet);
		
		soma = calcSomatoria(vet);
		
		System.out.println("\nResposta da Função: " + soma);
	}
	
	
	/*******************************************
	 * Função que gera os valores pra um vetor
	 */
	static int[] gerarVetor(int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) (Math.random() * 100);
			System.out.print(v[i] + " ");
		}
		return v;
	}
	
	
	/***********************************************************************************
	 * Função que realiza a soma da primeira com a ultima posição do vetor até o centro
	 */
	static double calcSomatoria(int v[])
	{
		int somar  = 0;
		
		for (int i = 0; i < 10; i++) 
		{
			somar += v[i] - v[i+10];
		}
		return somar;
	}

}

package exercicio_04_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	4. Criar e coletar em um vetor [30] real e calcular e exibir:
 * 	a. A média do grupo;
 * 	b. A quantidade de notas acima do grupo;
 * 	c. As posições dos valores abaixo da média do grupo.
 */

public class exercicio_04_vetores_matrizes {
	
	public static void main(String[] args) 
	{
		int notas[] = new int[30];
		double media;
		
		notas = geraVetor(notas);
		media = calcMedia(notas);
		
		System.out.println("Média: " + media);
		
		quantNotas(notas, media);
		notasAbaixo(notas, media);
	}
	
	
	/****************************************
	 * Função que gera as notas dos alunos
	 */
	public static int[] geraVetor(int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) (Math.random() * 11);
			//Teste de notas: System.out.println(v[i]);
		}
		return v;
	}
	
	
	/******************************************
	 * Função que cálcula a média dos valores 
	 */
	public static double calcMedia(int v[])
	{
		double m = 0;
		
		for (int i = 0; i < v.length; i++) 
		{
			m += v[i];	
		}
		
		return m / v.length;
	}
	
	
	/***************************************************************
	 * Procedimento que realiza a contagem de notas acima da média
	 */
	public static void quantNotas(int v[], double m)
	{
		int c = 0;
		
		for (int i = 0; i < v.length; i++) 
		{
			if (v[i] > m) 
			{
				c++;
			}
		}
		
		System.out.println("Quantidade de Notas acima da média: " + c);
	}
	
	
	/***********************************************************************************
	 * Procedimento que exibe as posições das notas do vetor que estão abaixo da média
	 */
	public static void notasAbaixo(int v[], double m)
	{
		System.out.println("\nNotas Abaixo da média:");
		for (int i = 0; i < v.length; i++) 
		{
			if (v[i] < m)
			{
				System.out.println("#" + i + " ---> Nota: " + v[i]);
			}
		}
	}

}

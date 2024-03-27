package exercicio_02_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  2. Criar e coletar um vetor [100] inteiro e exibir:
 * 	a. O maior e o menor valor;
 * 	b. A média dos valores.
 */

public class exercicio_02_vetores_matrizes {

	public static void main(String[] args) 
	{
		int vet[] = new int[100];
		int max, min;
		double med;
		vet = geraValores(vet);
		max = calcMaior(vet);
		min = calcMenor(vet);
		med = calcMedia(vet);
		
		System.out.println("\nMédia: " + med + "\nMaior: " + max + "\nMenor: " + min);
	}
	
	
	/*****************************************
	 * Função para gerar os valores do vetor
	 */
	public static int [] geraValores(int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) Math.round(Math.random() * 500);
		}
		return v;
	}
	
	/************************************************
	 * Função para cálcular o maior valor do vetor
	 */
	public static int calcMaior(int v[])
	{
		int m = -999999999;
		
		for (int i = 1; i < v.length; i++) 
		{
			m = Math.max(m, Math.max(v[i], v[i-1]));
		}
		
		return m;
	}
	
	/************************************************
	 * Função para cálcular o menor valor do vetor
	 */
	public static int calcMenor(int v[])
	{
		int m = 999999999;
		
		for (int i = 1; i < v.length; i++) 
		{
			m = Math.min(m, Math.min(v[i], v[i-1]));
		}
		
		return m;
	}
	
	/*****************************************
	 * Função para cálcular a media do vetor
	 */
	public static double calcMedia(int v[])
	{
		int m = 0;
		for (int i = 0; i < v.length; i++) 
		{
			m += v[i];
		}
		return m / v.length;
	}

}

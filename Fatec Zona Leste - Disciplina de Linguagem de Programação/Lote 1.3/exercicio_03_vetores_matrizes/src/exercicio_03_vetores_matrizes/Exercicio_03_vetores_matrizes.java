package exercicio_03_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	3. Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 * 	Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
 * P. ex: VT1| 1| 2| 3| 		|VT2| 4| 5| 6| 			|VT3| 1| 2| 3| 4| 5| 6
 */

public class exercicio_03_vetores_matrizes {
	
	public static void main(String[] args) 
	{
		int vetor01[] = {1, 2, 3};
		int vetor02[] = {4, 5, 6};
		int vetor03[] = new int[6];
		
		vetor03 = concVetores(vetor01, vetor02, vetor03);
		mostraVetor(vetor03);
	}

	
	/***********************************
	 * Função que cancate dois vetores
	 */
	public static int[] concVetores(int v1[], int v2[], int v3[])
	{
		for (int i = 0; i < v3.length; i++) 
		{
			if (i < 3) 
			{
				v3[i] = v1[i];
			} 
			else 
			{
				v3[i] = v2[i-3]; // Daqui em diante i = 3 - 3 -- i = 0 .... i = 5 - 3 -- i = 2 
			}
		}
		return v3;
	}
	
	
	/*******************************************************
	 * Procedimento que exibe todas as posições do vetor03 
	 */
	public static void mostraVetor(int v[])
	{
		System.out.print("Vetor03: ");
		
		for (int i = 0; i < v.length; i++) 
		{
			System.out.print(v[i] + " ");
		}
		
	}

}

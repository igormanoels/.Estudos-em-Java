package exercicio_09_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	9. Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que 
 * 	a diagonal principal terá seus dados carregados no programa segundo:
 */

public class exercicio_09_vetores_matrizes {
 
	public static void main(String[] args) 
	{
		int matriz[][] = new int[4][4];
		
		matriz = gerarMatriz(matriz);
		
		exibeMatriz(matriz);
	}
	
	 /*****************************************************
     * Funcition gera os valors da matriz conforme regra
     */
	static int[][] gerarMatriz(int m[][])
	{
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				if (i == j) 
				{
					m[i][j] = (int) Math.pow(4, i);
				} 
				
			}
		}
		return m;
	}
	
	
	 /********************************************
     * Procedure que exibe os valores da matriz
     */
	static void exibeMatriz(int m[][])
	{
		System.out.println("Matriz: ");
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m.length; j++) 
			{
				if (m[i][j] == 0) 
				{
					System.out.print(" " + " ");
				} 
				else 
				{
					System.out.print(m[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
}

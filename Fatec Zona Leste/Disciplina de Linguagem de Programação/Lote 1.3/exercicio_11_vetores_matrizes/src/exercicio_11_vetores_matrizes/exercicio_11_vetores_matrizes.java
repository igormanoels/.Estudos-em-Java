package exercicio_11_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  11. Criar uma matriz [8][8] inteiro e o programa irá carregar segundo regra
 */

public class exercicio_11_vetores_matrizes {
	
	public static void main(String[] args) 
	{
		int matriz[][] = new int[8][8];
		
		matriz = geraMatriz(matriz);
		
		exibeMatriz(matriz);
	}
	
	 /******************************************
     * Function que gera os valores da matriz
     */
	static int[][] geraMatriz(int m[][])
	{
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				if (i == 0 || i == 7 || j == 0 || j == 7) 
				{
					m[i][j] = 1;
				}
				else if (i == 1 || i == 6 || j == 1 || j == 6) 
				{
					m[i][j] = 2;
				}
				else if (i == 2 || i == 5 || j == 2 || j == 5) 
				{
					m[i][j] = 3;
				}
				else
				{
					m[i][j] = 4;
				}
			
			}
		}
		return m;
	}
	
	 /********************************
     * Procedure que exibe a matriz
     */
	static void exibeMatriz(int m[][]) 
	{
		System.out.println("Matriz: ");
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m.length; j++) 
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
}

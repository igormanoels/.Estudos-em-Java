package exercicio_10_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  10. Criar uma matriz [8][8] onde o programa irá carregar segundo:
 *  	Onde:	casa: 	1 | 2 | 3 | 4 | ...
 *  			valor:	1 | 2 | 4 | 8 |	...	
 */

public class exercicio_10_vetores_matrizes {

	public static void main(String[] args) 
	{
		long matriz[][] = new long[8][8];
	
		matriz = carregaMatriz(matriz);
		
		exibeMatriz(matriz);
	}
	
	 /******************************************
     * Function que gera os valores da matriz
     */
	static long[][] carregaMatriz(long m[][])
	{
		int p = 0;
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m.length; j++) 
			{
				m[i][j] = (long) Math.pow(2, p);
				p++;
			}
		}
		return m;
	}
	
	 /********************************************
     * Procedure que exibe os valores da matriz
     */
	static void exibeMatriz(long m[][])
	{
		System.out.println("Matriz: ");
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m.length; j++) 
			{
				System.out.print(m[i][j] + " " );
			}
			System.out.println("");
		}
	}
	
}

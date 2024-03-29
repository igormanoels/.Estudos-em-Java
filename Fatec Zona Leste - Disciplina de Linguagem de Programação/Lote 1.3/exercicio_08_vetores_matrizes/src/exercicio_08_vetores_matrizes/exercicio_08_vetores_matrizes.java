package exercicio_08_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	8. Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. 
 * 	Calcular e exibir:
 * 		a. A quantidade de cada produto vendido no mês;
 * 		b. A quantidade de produtos vendidos por semana;
 * 		c. O total de produtos vendidos no mês.
 */

public class exercicio_08_vetores_matrizes {

	public static void main(String[] args) 
	{
		int matriz[][] = new int[4][3];
		int vdMensal = matriz[0][0];		// Para que não seja chumbado o 0, pode-se atribuir o um valor da matriz que sempre é inciada em zero
		int vdSemana[] = new int[4];
		int vdProduto[] = new int[3];
		
		System.out.println("Valor de Vendas mensal");
		matriz = inserirDados(matriz);
		
		vdMensal = totalMensal(matriz, vdMensal);
		System.out.println("\nTotal de Vendas no Mês: " + vdMensal);
		
		vdSemana = totalSemanal(matriz, vdSemana);
		System.out.println("\nTotal de Vendas por semana: ");
		exibeVetor(vdSemana);
		
		vdProduto = totalProduto(matriz, vdProduto);
		System.out.println("\nTotal de Vendas por produto: ");
		exibeVetor(vdProduto);
	}
	
	 /****************************************
     * Function que gera os dados da matriz
     */
	static int[][] inserirDados(int m[][])
	{
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				m[i][j] = (int) (Math.round(Math.random() * 101));
			}
		}
		
		exibeMatriz(m);
		return m;
	
	}
	
	 /**********************************************
     * Function que soma o total das vendas no mês
     */
	static int totalMensal (int m[][], int v)
	{
		for (int i = 0; i < m.length; i++) 
		{
			// Quando a matriz não for proporcional, m[i].lenght informa ao for quantas colunas estão presentes naquela linha
			for (int j = 0; j < m[i].length; j++) 	
			{
				v += m[i][j];
			}
		}
		return v;
	}
	
	/*****************************************************
     * Function que soma as vendas que ocorrem na semana
     */
	static int[] totalSemanal(int m[][], int v[])
	{
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				v[i] += m[i][j]; 
			}
		}
		return v;
	}
	
	/**********************************************
     * Function que soma as vendas por produto
     */
	static int[] totalProduto(int m[][], int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			for (int j = 0; j < v.length; j++) 
			{
				v[i] += m[j][i];
			}
		}
		return v;
	}
	
	 /*****************************************
     * Procedure que exibe os dados da matriz.
     */
	static void exibeMatriz(int m[][]) 
	{
		for (int i = 0; i < m.length; i++) 
		{
			System.out.print("Semana " + (i+1) + ": ");
			for (int j = 0; j < m[i].length; j++) 
			{
				System.out.print(m[i][j] + " ");
			}			
			System.out.println(" ");
		}
	}
	
	 /******************************************
     * Procedure que exibe os dados do vetor.
     */
	static void exibeVetor(int v[])
	{
		for (int i = 0; i < v.length; i++) 
		{
			System.out.print(v[i] + " ");
		}
		System.out.println(" ");
	}
	
}

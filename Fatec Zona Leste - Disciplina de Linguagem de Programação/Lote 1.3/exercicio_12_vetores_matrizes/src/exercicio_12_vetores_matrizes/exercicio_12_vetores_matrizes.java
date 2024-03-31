package exercicio_12_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
 *  
 *  	1		2		3		4		5		 6	   7
 *  	Peão	Torre	Bispo	Cavalo	Rainha	 Rei   Vazio
 *  
 *  Calcular e mostrar a soma das peças do tabuleiro.
 *  Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça
 */

public class exercicio_12_vetores_matrizes {

	public static void main(String[] args) 
	{
		String xadrez[][] = new String[8][8];
		
		xadrez = geraXadrez(xadrez);
		
		exibeXadrez(xadrez);
		calcTotal(xadrez);
		
	}
	
	
	 /************************************************************
     * Function que gera o tabuleiro de xadrez comforme a regra
     */
	static String[][] geraXadrez(String x[][])
	{
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				x[i][j] = (i == 1 || i == 6) ? "" + (int) (Math.pow(2, 0)) : " " ;
				
				if (i == 0 || i == 7)
				{
					switch (j) 
					{
						case 0:
							x[i][j] = "" + (int) (Math.pow(2, 1));
							break;
						case 1:
							x[i][j] = "" + (Integer.parseInt(x[i][j-1]) * 2);
							break;
						case 2:
							x[i][j] = "" + (Integer.parseInt(x[i][j-1]) - 1);
							break;
						case 3:
							x[i][j] = "" + (Integer.parseInt(x[i][j-1]) * 2);
							break;
						case 4:
							x[i][j] = "" + (Integer.parseInt(x[i][j-1]) - 1);
							break;
						case 5:
							x[i][j] = "" + x[i][2];
							break;
						case 6:
							x[i][j] = "" + x[i][1];
							break;
						case 7:
							x[i][j] = "" + x[i][0];
							break;
					}
				}
			}
		}
		
		
		
		
		return x;
	}
	
	 /*******************************************
     * Procedure que exibe os valores da matriz
     */
	static void exibeXadrez(String x[][]) 
	{
		System.out.println("Tabuleiro de Xadrez: ");
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.print(x[i][j] + " " );
			}
			System.out.println(" ");
		}
	}
	
	/********************************************
     * Procedure que soma os valores da matriz
     */
	static void calcTotal(String x[][]) 
	{
		int somar = 0;
		for(int i = 0; i < x.length; i++)
		{
			for( int j = 0; j < x[i].length; j++)
			{
				if (i <= 1 || i >= 6)
				{
					somar += Integer.parseInt(x[i][j]);
				}
			}
		}
		System.out.println("\nTotal do tabuleiro: " + somar);
	}
}

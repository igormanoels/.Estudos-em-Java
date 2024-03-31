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
		
	}
	
	
	 /************************************************************
     * Function que gera o tabuleiro de xadrez comforme a regra
     */
	static String[][] geraXadrez(String x[][])
	{
		int n = 0;
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				x[i][j] = (i == 1 || i == 6) ? "" + (int) (Math.pow(2, 0)) : " " ;
				
			}
		}
		
		for (int i = 1; i <= 8; i++) 
		{
			n += (int) (Math.pow(i, i));
		}
		System.out.println("teste: "  + n);
		
		
		return x;
	}
	
	 /*******************************************
     * Procedure que exibe os valores da matriz
     */
	static void exibeXadrez(String x[][]) 
	{
		System.out.println("Matriz: ");
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.print(x[i][j] + " " );
			}
			System.out.println(" ");
		}
	}
}

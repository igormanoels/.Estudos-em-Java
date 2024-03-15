package exercicio_39_modulado;

import java.text.DecimalFormat;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *  Casa: 1 2 3 4 ... 64
 *  Qte: 1 2 4 8 ... N
 */

public class Exercicio_39_modulado {

    public static void main(String[] args) 
    {
        DecimalFormat formatar = new DecimalFormat("###,###,###,###,###,###,###");
	int ttGraos = CalcGraosTab();
	String graosFormatado = formatar.format(ttGraos);
	System.err.println("\nO total de grãos no tabuleiro é " + graosFormatado);
    }
    
    /***********************************************************************
     * Função para cálcular a quantidade de grãos em um tabuleiro de xadres
     */
    public static int CalcGraosTab() 
    {
        int[][] tab = new int[8][8];
	int res = 0, quant, cont = 1;
		
	for (int i = 0; i < 8; i++) 
	{
            for (int j = 0; j < 8; j++) 
            {
                quant = (int) Math.pow(2, cont);
                tab[i][j] = (int) quant;
                res += quant;
                cont++;
            }
	}
	return res;
    }

    
}

package exercicio_41_modulado;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */


public class Exercicio_41_modulado {

    public static void main(String[] args) 
    {
        int quant = PossibilidadeDeDado();
	System.out.println("Para os dois dados a soma ser igual a 7 pode acontecer " + quant + " vezes.");
    }
    
    
    /*********************************************************
     * Verifica quantas vezes a soma de um dado pode dar 7 
     */
    public static int PossibilidadeDeDado() 
    {
    int quant = 0;
	for (int i = 1; i <= 6; i++) 
	{
            for (int j = 1; j < 6; j++) 
	    {
	        if ( i + j == 7) 
		{
		    quant+=1;
		}
	    }
	}
	return quant;
    }

    
}

package exercicio_41;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */

public class Exercicio_41 {

    public static void main(String[] args) {
        
        System.out.println("valores de dois dados que d7: ");
        
        for (int i = 1; i <= 6; i++) 
        {
            for (int j = 1; j <= 6; j++) 
            {
                if (i + j == 7)
                {
                    System.out.println("dado 1: " + i + " e dado 2: " + j + " = 7"); 
                } 
            }
        } 
    }
    
}

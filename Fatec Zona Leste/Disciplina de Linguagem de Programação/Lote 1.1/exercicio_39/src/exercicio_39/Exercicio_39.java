package exercicio_39;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
    Casa: 1 2 3 4 ... 64
    Qte:  1 2 4 8 ... N
 */

public class Exercicio_39 {

    public static void main(String[] args) {
        long quant, casa = 0;
        
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                quant = (long) Math.pow(2 , casa);
                System.out.print(quant + " ");
                casa+=1;
            }
            System.out.print("\n");
        }

    }
    
}

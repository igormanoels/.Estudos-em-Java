package exercicio_02_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  2. Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
 */

public class Exercicio_02_recursividade {

    public static void main(String[] args) 
    {
        int num, res;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número desejado para o cálculo da Função: ");
        num = ler.nextInt();
        
        res = calcSerie(num);
        System.out.println("Resposta: " + res);
        ler.close();
    }
    
    /*************************************************
     * Função que calcula com recursividade uma séria.
     */
    static int calcSerie(int n)
    {
        if (n == 1) 
        {
            return n = 1;
        }
        else
        {
            return n += calcSerie(n-1);
        }
                
    }
    
}

package exercicio_00_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  0. Cálcula Fatorial com Recursividade 
 */

public class Exercicio_00_recursividade {

    public static void main(String[] args) 
    {
        int num, resFat;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe um número para cálcular seu \"Fatorial\": ");
        num = ler.nextInt();
        
        resFat = calcFat(num);
        System.out.println("Fatorial de " + num + " é " + resFat); 
        
        ler.close();
    }
    
    
    /******************************************
     * Função Cálcula o fatorial de um número.
     */
    static int calcFat(int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n * calcFat(n-1);
        }
    }
    
}

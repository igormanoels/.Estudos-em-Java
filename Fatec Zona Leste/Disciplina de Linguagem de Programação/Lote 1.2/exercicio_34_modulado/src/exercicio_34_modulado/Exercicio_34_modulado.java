package exercicio_34_modulado;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */

public class Exercicio_34_modulado {

    public static void main(String[] args) 
    {
        int num;
	Scanner ler = new Scanner(System.in);
		
	System.out.print("Informe um número para descobrir sua tabuada: ");
	num = ler.nextInt();
		
	calcTabu(num);
		
	ler.close();
    }
	
	
    /***********************************************
     * Função para Cálcular a tabuada de um número.    
     */ 
    static void calcTabu(int n)
    {
        int res;
	System.out.println("Tabuada do " + n);
		
        for (int i = 0; i <= 10; i++) 
	{
            res = i * n;
            System.out.println(n + " x " + i + " = " + res);
	}	
    }
    
}

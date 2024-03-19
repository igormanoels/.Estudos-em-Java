package exercicio_40_modulo;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels 
 *  40. Receba 2 números inteiros. Verifique e mostre todos os números primos 
 *  existentes entre eles.
 */

public class Exercicio_40_modulo {

    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner ler = new Scanner(System.in);
		
	System.out.print("Informe o primeiro número: ");
	num1 = ler.nextInt();
	System.out.print("Informe o segundo número: ");
	num2 = ler.nextInt();
		
	VerificaPrimoIntervalo(num1, num2);	
        
    }
    
    /*****************************************************************
     * Função para verificar quais os numeros primos em um intervalo.
     */
    public static void VerificaPrimoIntervalo(int n1, int n2) 
    {
        if (n1 == n2) 
	{
            System.out.println("Os números informados são iguais. Portando não há intervalo.");
	}
        else
	{
            if (n1 > n2) 
            {
                int aux = n1;
		n1 = n2;
		n2 = aux;
            }
			
            for (int i = n1; i <= n2; i++) 
            {
                if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7) 
		{
                    System.out.println(i + " <=== Primo");
		}
		else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
		{
                    System.err.println(i + " <=== Não Primo");
		}
		else
		{
                    System.out.println(i + " <=== Primo");
		}
            }
			
	}
    }

    
}

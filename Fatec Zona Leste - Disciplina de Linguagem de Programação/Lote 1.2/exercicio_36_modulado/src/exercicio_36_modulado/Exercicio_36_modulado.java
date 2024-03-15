package exercicio_36_modulado;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

public class Exercicio_36_modulado {
    
    static float serie = 1.0f;

    public static void main(String[] args) 
    {
        int num;
	Scanner ler = new Scanner(System.in);
		
	System.out.print("Informe o número desejado até a onde a função será calculada: ");
	num = ler.nextInt();
		
	CalcSerie(num);
		
	System.out.println("Resultado para essa série: " + serie);
    }
    
    /*********************************************
     * Função para cálculo de um fatorial
     */
    public static int calcfat(int n) 
    {
        int fat = 1;
        
        for (int i = 1; i <= n; i++) {
	fat *= n;   
	}
            return fat;
	}

   	
    /********************************************
     * Função para calcular a série
     */
    public static void CalcSerie(int n) 
    {
    	int f;		
        
	for (int i = 1; i <= n; i++) 
	{
            f = calcfat(i);
            serie = serie + ( 1.0f / f);
	}
    }
    
    
}

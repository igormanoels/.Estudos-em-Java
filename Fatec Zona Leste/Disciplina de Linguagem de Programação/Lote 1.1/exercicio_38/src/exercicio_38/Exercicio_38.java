package exercicio_38;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 38. Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
 */

public class Exercicio_38 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int max = -999999999, min = 999999999;
        
        System.out.print("Saída: ");
        
        for (int i = 0; i < numeros.length ; i++) 
        {
            if (i >= 0) 
            {
                numeros[i] = i;
                System.out.print(numeros[i] + " ");
                
                if (numeros[i] < min) 
                {
                    min = numeros[i];
                }
                
                if (numeros[i] > max) 
                {
                    max = numeros[i];
                }
                
                try 
                {
                    Thread.sleep(250);
                } 
                catch (InterruptedException e) 
                {
                }
                
            }
        }
        
        
        
        System.out.println("\nMaior número: " + max + " - Menor número: " + min);
    }
    
}

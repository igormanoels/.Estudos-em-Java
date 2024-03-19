package exercicio_45_modulado;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */

public class Exercicio_45_modulado {

    static double serie = 0;    
    
    public static void main(String[] args) 
    {
        System.out.println("Algoritmo que cálcula a série proposta no exercício 45.");
        calcSerie();
        System.out.println("Resultado: " + serie);
    }
    
     /*********************************************
     * Método que cálcula a série do exercicio 45. 
     */
    private static void calcSerie()
    {
        for (int i = 1; i <= 15; i++) 
        {
            if (i % 2 != 0)
            {
                serie += ( i / (Math.pow(i, 2)));
            }
            else
            {
                serie -= (i / (Math.pow(i ,2)));
            }
        }
  
    }
    
    
    
}

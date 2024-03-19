package exercicio_42_modulado;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */

public class Exercicio_42_modulado {

    public static void main(String args[]) 
    {
        double res;
        System.out.println("Algoritmo para cálcular uma expressão matemática.");
        res = calcSerie();
        System.out.println("Resposta: " + res);
    }
    
     /*****************************
     * Cálcula a função matemática 
     */
    public static double calcSerie ()
    {
        double serie = 0;
        int cont = 1;
        
        for (int i = 1; i < 50; i++) 
        {
            serie += (serie + (i / cont));
            cont+=2;
        }
        
        return serie;
    }
}

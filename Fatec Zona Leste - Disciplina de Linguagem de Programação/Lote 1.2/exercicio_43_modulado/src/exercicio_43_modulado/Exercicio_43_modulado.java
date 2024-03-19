package exercicio_43_modulado;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 *  sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */

public class Exercicio_43_modulado {

    public static void main(String[] args) 
    {
        float altAna = 1.10f, altMaria = 1.5f;
        int tempo;
        
        System.out.println("Algoritmo que cálcula em quanto tempo Ana será maior que Maria.");
        
        tempo = verifAnos(altAna, altMaria);
        
        System.out.println("Em " + tempo + " anos, Ana será maior que Maria.");
    }
    
    
     /*******************************************************************
     * Função que verifaca em quanto tempo Ana será mais alta que maria
     */    
    static int verifAnos(float ana, float maria)
    {
        int t = 0;
        
        do 
        {
            ana += 0.03f;
            maria += 0.02f;
            t++;
            
        } while (ana < maria);
        
        return t;
    }
    
}

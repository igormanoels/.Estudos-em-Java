package exercicio_01_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *      a. A média dos valores entre 10 e 200;
 *      b. A soma dos números ímpares.
 */

public class Exercicio_01_vetores_matrizes {

    static int vet50[] = new int[50];    
    
    public static void main(String[] args) 
    {
        System.out.println("Algoritmo que gera/ recebe um vetor com 50 posições");
        
        geraVetor();
        
        double media = calcMedia();
        int somaImpar = somaNumImpar();
        
        System.out.print("\nA Média dos números entre 10 e 200 é: " + media 
                       + "\nE a soma dos números impares dentro do vetor é: " + somaImpar);
    }
    
    
    /****************************************************
     * Procedimento que gera um vetor com 50 posições.
     */
    static void geraVetor()
    {
        for (int i = 0; i < 50; i++) 
        {
            vet50[i] = (int) (Math.round(Math.random() * 500 )+ 1);
        }
    }
    
    
    /**********************************************************
     * Função que calcula a média dos valores entre 10 a 200.
     */
    static double calcMedia()
    {
        double media = 0;
        int cont = 0;
        
        for (int i = 0; i < vet50.length ; i++) 
        {
            
            if (vet50[i] >= 10 && vet50[i] <= 200) 
            {
                media += vet50[i];
                cont++;
            }
            
        }
        
        if (cont != 0) 
        {
            media = media / cont;
        }
         
        return media;
    }
    
    
     /****************************************************************
     * Função que cálcula a soma dos números impares dentro do vetor
     */
    static int somaNumImpar()
    {
        int res = 0;
        
        for (int i = 0; i < vet50.length ; i++) 
        {
            if (vet50[i] % 2 != 0) 
            {
                res += vet50[i];
            }
        }
        
        return res;
    }
}

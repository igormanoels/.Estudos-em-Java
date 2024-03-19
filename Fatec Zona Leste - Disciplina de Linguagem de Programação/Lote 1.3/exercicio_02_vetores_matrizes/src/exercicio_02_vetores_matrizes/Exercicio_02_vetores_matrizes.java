package exercicio_02_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  2. Criar e coletar um vetor [100] inteiro e exibir:
 *      a. O maior e o menor valor;
 *      b. A média dos valores.

 */

public class Exercicio_02_vetores_matrizes {

    static int vet100[] = new int[100];
    static double media = 0;
    static int maior, menor;
    
    public static void main(String[] args) 
    {
        System.out.println("Algoritmo que cria/ gera um vetor de 100 números e imprime o maior e menor valor, e a média dos valores");
        geraNumeros();
        calcMedia();
        verifMaiorMenor();
        
        System.out.println("\nMédia do vetor: " + media
                        +  "\nMaior número do vetor: " + maior
                        +  "\nMenor número do vetor: " + menor);
    }
    
    
    /*********************************************
     * Método que gera 100 números para um vetor.
     */
    static void geraNumeros()
    {
        for (int i = 0; i < 100; i++) 
        {
            vet100[i] = (int) (Math.round(Math.random() * 500 ) + 1);
        }
    }
    
    /***************************************
     * Método que cálcula a média do vetor.
     */
    static void calcMedia()
    {
        for (int i = 0; i < vet100.length ; i++) 
        {
            media += vet100[i];
        }
        media = media / 100;
    }
    
    /*********************************************
     * Verifica o maior e o menor valor do vetor.
     */
    static void verifMaiorMenor()
    {
        for (int i = 1; i < vet100.length; i++) 
        {
            maior = Math.max(vet100[i], vet100[1-1]);
            menor = Math.min(vet100[i], vet100[1-1]);
        }
    }    
    
}

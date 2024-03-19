package exercicio_04_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  4. Criar e coletar em um vetor [30] real e calcular e exibir:
 *      a. A média do grupo;
 *      b. A quantidade de notas acima do grupo;
 *      c. As posições dos valores abaixo da média do grupo.
 */

public class Exercicio_04_vetores_matrizes {

    static int vetNotas[] = new int[30];
    static double media = 0;
    
    public static void main(String[] args) 
    {
        System.out.println("Algoritmo que gera um vetor com 30 posições simulando notas de 0 a 10,"
                + "\nCálcula a média, a quantidade de alunos acima da média e se está acima da média ou abaixo com o número da posição.");
        geraVetor();
        calcMedia();
        
        int notas = contAcimaMd();
        System.out.println("\nQuantidade de Notas acima da Média: " + notas);
        
        verifNotas();
    }
    
    
    /**************************************************
     * Método que gera valores de 0 a 10 para o vetor. 
     */
    public static void geraVetor()
    {
        for (int i = 0; i < vetNotas.length ; i++) 
        {
            vetNotas[i] = (int) (Math.round(Math.random() * 11));
            System.out.println(vetNotas[i] + " ");
        }
    }
    
    
    /******************************************
     * Método para cálcular a média das notas.
     */
    public static void calcMedia()
    {
        for (int i = 0; i < vetNotas.length ; i++) 
        {
            media += vetNotas[i];
        }
        
        media = media / 30;
    }
    
    
    /*******************************************************
     * Função que conta quantas notas estão acima da média 
     */
    public static int contAcimaMd()
    {
        int quant = 0;
        
        for (int i = 0; i < 10; i++) 
        {
            if (vetNotas[i] > media) 
            {
                quant+=1;
            }
        }
        return quant;
    }
    
    
    /******************************************************************************
     * Método que verifica a posição das notas e se estão acima ou abaixo da média.
     */
    public static void verifNotas()
    {
        for (int i = 0; i < vetNotas.length ; i++) 
        {
            if (vetNotas[i] > media) 
            {
                System.out.println((i+1) + "# ===> Acima da média, nota: " + vetNotas[i]);
            } 
            else 
            {
                System.err.println((i+1) + "# ===> Abaixo da média, nota: " + vetNotas[i]);                
            }
        }
    }
            
    
}

package exercicio_03_vetores_matrizes;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  3. Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 *  Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
 *  P. ex:  |VT1| 1 | 2 | 3 | 
 *          |VT2| 4 | 5 | 6 | 
 *          |VT3| 1 | 2 | 3 | 4 | 5 | 6 |
 */

public class Exercicio_03_vetores_matrizes {
    
    static int vet1[] = {1, 2, 3};
    static int vet2[] = {4, 5, 6};
    static int vet3[] = new int[vet1.length + vet2.length];
    
    public static void main(String[] args) 
    {
        concatVet();
        for (int i = 0; i < vet3.length; i++) 
        {
            System.out.println("Vet3, posição " + (i+1) + " ===> " + vet3[i]);
        }
        
    }
    
    /*************************************************
     * Método que concatena dois vetores pré-definidos
     */
    public static void concatVet()
    {
        // Copia os dados do primeiro vetor
        for (int i = 0; i < vet1.length ; i++) 
        {
            vet3[i] = vet1[i];
        }
        
        // Copia os dados do segundo vetor
        for (int i = 0; i < vet2.length ; i++) 
        {
            vet3[i + vet2.length] = vet2[i];
        }
    }
    
    
}

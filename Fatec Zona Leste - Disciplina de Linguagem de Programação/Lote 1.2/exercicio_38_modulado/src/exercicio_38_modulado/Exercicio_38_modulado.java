package exercicio_38_modulado;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  38. Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. 
 *  Obs.: somente valores positivos.
 */

public class Exercicio_38_modulado {

    static int[] vet = new int[100];
    static int numMaior, numMenor;    
    
    public static void main(String[] args) 
    {
        System.out.println("Aqui vamos gerar 100 números aleatórios de 1 a 500, e exibir o Maior e o Menor.");
	System.out.println("teste");
	gerar100nums();
               
	verificaOMaior();
	System.err.println("\nO maior número encontrado foi " + numMaior);
		
	verificaOMenor();
	System.err.println("\nO menor número encontrado foi " + numMenor);

    }
    
    
    /**************************************************************
     * Função para gerar 100 números para um vetor de 100 posições
     */
    static void gerar100nums() 
    {
        for (int i = 0; i < vet.length; i++) 
	{
            vet[i] = (int) Math.round(Math.random() * 500) +1;
	}

    }
	

    /**************************************************************
     * Função para verificar qual dos números do vetor é o maior
     */
    static void verificaOMaior() 
    {
	for (int i = 1; i < vet.length; i++) 
	{
            numMaior = Math.max(vet[i], vet[i-1]);
	}
    }
    
	
    /**************************************************************
     * Função para verificar qual dos úmeros do vetor é o menor
     */
    static void verificaOMenor() 
    {
    	for (int i = 1; i < vet.length; i++) 
	{
            numMenor = Math.min(vet[i], vet[i-1]);
	}
    }
    
}

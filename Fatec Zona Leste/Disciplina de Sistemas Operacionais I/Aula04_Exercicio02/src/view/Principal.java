package view;

import controller.Threads;

public class Principal {
    
    static int matriz[][] = new int[3][5];

    
    public static void main(String[] args) 
    {
        geraNumeros(); 
        
        for (int i = 0; i < 3; i++) 
        {
            Threads thread = new Threads(matriz[i]);
            thread.start();
        }
        
    }
    

    /*****************************************
	 * Gera números aleatórios para a matriz 
	 */
    private static void geraNumeros() 
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
        
    }
}

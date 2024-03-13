package exercicio_31_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	31. Calcule e mostre o quadrado dos números entre 10 e 150.
 */

public class Exercicio_31_modulado {

    public static void main(String args[])
    {
        double quad;
	
	for (int i = 10; i <= 150; i++) 
	{	
            quad = calcQuad(i);
            JOptionPane.showMessageDialog(null, "O quadrado de " + i + " é " + quad);
	}
		
    }
	
    /***********************************************
     * Função para cálcular o quadrado de um número    
     */
    static double calcQuad(int n)
    {
        double quadn = Math.pow(n, 2);
    	return quadn;
    }
    
}

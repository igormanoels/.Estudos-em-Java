package exercicio_32_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	32. Receba um número inteiro. Calcule e mostre o seu fatorial.
 */


public class Exercicio_32_modulado {

    public static void main(String[] args) 
    {
        int num, fat;
		
	num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para cálcular o seu \"Fatorial\""));
		
	JOptionPane.showMessageDialog(null, "Fatorial de " + num + " é " + calcFat(num));
    }
	
	
    /***********************************************
     * Função para Cálcular o fatorial de um número.    
     */ 
    static int calcFat(int n)
    {
        int fat = 1;
		
	for (int i = 1; i <= n ; i++) 
	{
            fat = fat * i; 
        }
		
	return fat;
    }
    
}

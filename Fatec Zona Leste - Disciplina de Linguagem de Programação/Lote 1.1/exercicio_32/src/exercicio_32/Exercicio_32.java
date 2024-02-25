package exercicio_32;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 32. Receba um número inteiro. Calcule e mostre o seu fatorial.
 */

public class Exercicio_32 {

    public static void main(String[] args) {
        int fat, num;
		
	num = Integer.parseInt(JOptionPane.showInputDialog("Favor infomar o número desejado."));
	fat = num;
		
	for (int i = 1; i < num; i++) 
	{
            fat = fat * i;
	}
	
	JOptionPane.showMessageDialog(null,"Fatorial de " + num + " é " + fat);

    }
    
}

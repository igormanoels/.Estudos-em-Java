package exercicio_33;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */

public class Exercicio_33 {

    public static void main(String[] args) {
	int num;
        double func = 0;
		
        num = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o número desejado: "));
        
        for (int i = 1; i <= num; i++) 
	{
            func = func + (1.0 / i);
	}
		
	JOptionPane.showMessageDialog(null, "O valor da função é " + func);        
        
    }
    
}

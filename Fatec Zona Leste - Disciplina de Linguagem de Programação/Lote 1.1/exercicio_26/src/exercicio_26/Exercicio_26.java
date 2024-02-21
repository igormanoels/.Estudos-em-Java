package exercicio_26;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_26 {

    public static void main(String[] args) {
        int num1, num2;
	
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número"));
		
	if (num1 > num2)
        {
            if (num1 % num2 == 0) 
            {
            JOptionPane.showMessageDialog(null, "Sim ele é múltiplo.");
            }
            else 
            {
            JOptionPane.showMessageDialog(null, "Infelizmente ele não é múltiplo.");
            }
	} 
	else if (num2 > num1) 
	{
            if (num2 % num1 == 0) 
            {
                JOptionPane.showMessageDialog(null, "Sim ele é múltiplo.");
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Infelizmente ele não é múltiplo.");
            }
	}
	else
	{
            JOptionPane.showMessageDialog(null, "Os números informados são iguais.");
	}
        
    }
    
}

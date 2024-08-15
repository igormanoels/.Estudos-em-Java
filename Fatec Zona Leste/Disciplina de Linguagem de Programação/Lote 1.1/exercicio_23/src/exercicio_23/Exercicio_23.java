package exercicio_23;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */

public class Exercicio_23 {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o terceiro número: "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o quarto número: "));
        
        if (num4 < num1) 
        {
            JOptionPane.showMessageDialog(null, "Sequência: " + num4 + ", " + num1 + ", " + num2 + ", " + num3);
        } 
        else 
        {
            if (num4 < num2) 
            {
                JOptionPane.showMessageDialog(null, "Sequência: " + num1 + ", " + num4 + ", " + num2 + ", " + num3);
            } 
            else 
            {
                if (num4 < num3) 
                {
                    JOptionPane.showMessageDialog(null, "Sequência: " + num1 + ", " + num2 + ", " + num4 + ", " + num3);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sequência: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
                }
            }
        }
        
    }
    
}

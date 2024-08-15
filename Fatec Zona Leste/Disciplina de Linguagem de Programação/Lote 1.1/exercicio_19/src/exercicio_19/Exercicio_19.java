package exercicio_19;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 19. Receba 2 valores reais. Calcule e mostre o maior deles.
 */

public class Exercicio_19 {

    public static void main(String[] args) {
        float num1, num2;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Favor informar o segundo número: "));
    
        if (num1 == num2) 
        {
            JOptionPane.showMessageDialog(null,"Os valores informados são iguais.");
        } 
        else 
        {
            if (num1 > num2) 
            {
                JOptionPane.showMessageDialog(null, "O " + num1 + " é o maior.");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "O " + num2 + " é o maior.");
            }
        }
    
    }
    
}

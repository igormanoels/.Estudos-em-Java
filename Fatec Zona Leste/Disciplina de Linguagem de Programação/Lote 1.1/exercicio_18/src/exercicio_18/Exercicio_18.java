package exercicio_18;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

public class Exercicio_18 {

    public static void main(String[] args) {
        int num1, num2, dif;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        if (num1 > num2) 
        {
            dif = num1 - num2;
        } 
        else 
        {
            dif = num2 - num1;
        }
        
        JOptionPane.showMessageDialog(null, "A diferença é " + dif);
    }
    
}

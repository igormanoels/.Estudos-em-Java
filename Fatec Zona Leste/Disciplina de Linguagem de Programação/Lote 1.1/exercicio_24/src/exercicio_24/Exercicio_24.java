package exercicio_24;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

public class Exercicio_24 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Favor informar um número: "));
        
        if (num % 2 == 0 && num % 3 == 0) 
        {
            JOptionPane.showMessageDialog(null, "O número informado é divisível por 2 e 3.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O número informado não é divisível por 2 e 3.");
        }
        
    }
    
}

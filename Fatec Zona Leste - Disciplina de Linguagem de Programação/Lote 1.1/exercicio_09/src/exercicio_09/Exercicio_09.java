package exercicio_09;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_09 {

    
    public static void main(String[] args) {
        int num1, num2;
        double res;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        res = (double) Math.pow(num1, 2) + Math.pow(num2, 2);
        
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é " + res);
    
    }
    
}
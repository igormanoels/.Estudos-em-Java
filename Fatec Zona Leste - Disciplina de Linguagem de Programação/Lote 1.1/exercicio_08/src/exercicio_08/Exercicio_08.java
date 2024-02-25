package exercicio_08;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 8. Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */

public class Exercicio_08 {
    
    public static void main(String[] args) {
        double poup, mont;
        int temp;
        
        poup = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser investido na poupança: "));
        temp = Integer.parseInt(JOptionPane.showInputDialog("Favor informar agora por quanto tempo o valor será investido: "));
        
        mont = poup * temp * 1.013;
        JOptionPane.showMessageDialog(null, "O montante para essa aplicação será de: R$ " + mont);
                
    }
    
}
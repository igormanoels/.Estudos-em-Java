package exercicio_02;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 2. Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */

public class Exercicio_02 {

    public static void main(String[] args) {
        
        double sal, reaj;
        
        sal = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o salário que deseja ajustar: "));
        reaj = sal * 1.15;
        JOptionPane.showMessageDialog(null, "O salário reajustado será de R$ " + reaj);
        
    }
    
}

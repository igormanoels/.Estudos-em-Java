package exercicio_14;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_14 {

    public static void main(String[] args) {
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do primeiro ângulo: "));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do segundo ângulo: "));
        
        ang3 = (180 - (ang1 + ang2));
        
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é " + ang3);
    }
    
}

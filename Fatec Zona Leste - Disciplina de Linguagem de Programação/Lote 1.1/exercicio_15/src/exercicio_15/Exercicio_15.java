package exercicio_15;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_15 {

    public static void main(String[] args) {
        double hipo, cat1, cat2;
        
        cat1 = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do primeiro cateto: "));
        cat2 = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do segundo cateto: "));
        
        hipo = Math.sqrt( (Math.pow(cat1, 2) + Math.pow(cat2, 2) ));
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é " + hipo);
        
    }
    
}

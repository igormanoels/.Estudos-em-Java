package exercicio_42;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */

public class Exercicio_42 {

    public static void main(String[] args) {
        double res = 1.0, div = 3.0;
        
        for (int i = 2; i <= 50; i++) 
        {
            res += i / div;
            div+=2;
        } 
        
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
    }
    
}

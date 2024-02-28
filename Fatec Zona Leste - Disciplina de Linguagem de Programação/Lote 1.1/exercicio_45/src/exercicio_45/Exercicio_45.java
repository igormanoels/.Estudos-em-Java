package exercicio_45;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */

public class Exercicio_45 {

    
    public static void main(String[] args) {
        double res = 0;
    
        for (int i = 1; i <= 15; i++)
        {
            res = (res + ( i / ( Math.pow(i, i)))); 
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
    }
    
}

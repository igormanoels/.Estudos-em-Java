package exercicio_36;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

public class Exercicio_36 {

    public static void main(String[] args) {
        double num, fat, res = 0.0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Favor infomar o número desejado."));
        
        for (int i = 0; i <= num; i++) 
        {
            fat = 1.0;
            for (int j = 0; j <= i; j++) 
            {
                if (j > 1) 
                {
                   fat *=j;
                }
            }
            res = res + 1.0/fat;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado da função: " + res);
    }
    
}

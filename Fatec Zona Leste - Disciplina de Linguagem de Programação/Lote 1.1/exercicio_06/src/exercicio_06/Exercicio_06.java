package exercicio_06;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_06 {

    public static void main(String[] args) {
        int numX, numY, troca;
        
        numX = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X: "));
        numY = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y: "));
        
        troca = numX;
        numX = numY;
        numY = troca;
        
        JOptionPane.showMessageDialog(null, "Agora o valor de \"X\" é " + numX + " e o valor de \"Y\" é " + numY);        
    }
    
}

package exercicio_01;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

import javax.swing.JOptionPane;

public class Exercicio_01 {

    public static void main(String[] args) {
       
        int area;
        double res;
        
        area = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da área do quadrado: "));
        res = Math.pow(area, 2);
        JOptionPane.showMessageDialog(null,"O total da área do quadrado é " + res);
        
    }
    
}

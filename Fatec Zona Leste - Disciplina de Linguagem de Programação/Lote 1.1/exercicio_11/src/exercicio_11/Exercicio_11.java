package exercicio_11;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 11. Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 */

public class Exercicio_11 {

    public static void main(String[] args) {
        double raio, circ;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do raio: "));
        circ = (2 * raio * Math.PI);
        JOptionPane.showMessageDialog(null,"A circunferência é " + circ);

    }
    
}

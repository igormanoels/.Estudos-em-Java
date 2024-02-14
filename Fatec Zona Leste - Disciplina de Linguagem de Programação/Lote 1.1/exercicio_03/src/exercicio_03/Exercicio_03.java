package exercicio_03;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_03 {

    public static void main(String[] args) {

        int base, altura;
        double res;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da base do triângulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da altura ao triângulo: "));
        res = ((double) (base * altura) / 2);
        JOptionPane.showMessageDialog(null,"A área do triângulo é " + res);
        
    }
    
}

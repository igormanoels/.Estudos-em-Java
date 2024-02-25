package exercicio_07;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 7. Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 */

public class Exercicio_07 {

    public static void main(String[] args) {
        int comp, larg, altu;
        int res;
        
        comp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do comprimento: "));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da largura"));
        altu = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura"));
        
        res = (2 * ((comp * larg) + (comp * altu) + (larg * altu)));

        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é " + res);
    }
    
}

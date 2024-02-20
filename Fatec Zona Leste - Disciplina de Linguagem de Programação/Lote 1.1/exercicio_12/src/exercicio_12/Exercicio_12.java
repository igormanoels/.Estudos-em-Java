package exercicio_12;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_12 {

    public static void main(String[] args) {
        int anoNasc, anoAtual, idade;
        
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Favor informar em qual ano você nasceu: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Favor informar em que ano estamos: "));
        
        idade = anoAtual - anoNasc;
        JOptionPane.showMessageDialog(null, "A sua idade atual é " + idade);
        idade = idade + 17;
        JOptionPane.showMessageDialog(null,"Em 17 anos você terá " + idade);

    }
    
}

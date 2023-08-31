package calculaidade;
/**
 * @author s.igormanoel
 */

import javax.swing.JOptionPane;

public class Calculaidade{
    public static void main (String[]args){
        Integer AnoAtual, AnoNasc, idade, idadeFutura;

        AnoAtual = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano atual"));
        AnoNasc = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento"));

        idade = (AnoAtual - AnoNasc);
        idadeFutura = (idade + 17);
            System.out.println("Sua idade é " + idade + ", em 17 anos você terá: " + idadeFutura);
    }
}
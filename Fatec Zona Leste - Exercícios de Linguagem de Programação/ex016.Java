package salarioliquido;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Salarioliquido{
    public static void main(String[]args){
        Double horasT, Vhora, desconto, filhos, salarioLiq, salRec;

        horasT = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de horas trabalhadas?"));
        Vhora = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da hora trabalhada?"));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do desconto?"));
        filhos = Double.parseDouble(JOptionPane.showInputDialog("Quantos filhos o funcionário tem?"));

        salarioLiq = ((horasT * Vhora) * (100 - desconto) / 100);
        salRec = (salarioLiq + (filhos * 100));
            System.out.println("O salário líquido a receber é de R$ " + salRec);
       }
}
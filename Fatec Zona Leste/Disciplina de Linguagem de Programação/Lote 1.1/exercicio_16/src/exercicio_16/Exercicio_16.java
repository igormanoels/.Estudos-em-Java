package exercicio_16;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as 
    horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário 
    Líquido. Exiba o salário a receber.
 */

public class Exercicio_16 {

    public static void main(String[] args) {
        int qHoras, nFilhos;
        double vHora, pDesc, salLiq;
        
        qHoras = Integer.parseInt(JOptionPane.showInputDialog("Favor informar quantas horas foram trabalharas durante o mês: "));
        vHora = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor da hora trabalhada: "));
        pDesc = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o percentual de desconto: "));
        nFilhos = Integer.parseInt(JOptionPane.showInputDialog("Caso haja filhos, informe quantos são: "));
        
        salLiq = ((qHoras * vHora) * (pDesc / 100)) + (nFilhos * 100);

        JOptionPane.showMessageDialog(null,"Salário Líquido: R$ " + salLiq);
    }
    
}

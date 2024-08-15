package exercicio_16_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 *  Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
 *  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 */

public class Exercicio_16_Modulado {
    static double horasT, valorH, desc, filhos;

    public static void main(String[] args) 
    {
        double salBr, salLiq;
        
        horasT = Double.parseDouble(JOptionPane.showInputDialog("Favor informar a quantidade de horas trabalhadas:"));
        valorH = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor da hora: "));
        desc = Double.parseDouble(JOptionPane.showInputDialog("E qual o percentual do desconto: "));
        filhos = Double.parseDouble(JOptionPane.showInputDialog("Informe tamba quantidade de filhos:"));
        
        salBr = calcSal();
        salLiq = calcSalLiq(salBr);
        
        JOptionPane.showMessageDialog(null, "Salário Bruto: R$ " + salBr + " - Salário Líquido: R$ " + salLiq);
    }
    
    /***************************************
     * Função para Cálcular o Salário Bruto.    
     */  
    static double calcSal() {
        double salL = horasT * valorH;
        return salL;
    }
    
    /*****************************************
     * Função para Cálcular o Salário Líquido.    
     */
    static double calcSalLiq(double sal) {
        double salB = sal - sal * desc / 100.0D + 100.0D * filhos;
        return salB;
    }       
    
}

package investimento;
 /**
 * @author GitHub @igormanoels
  */

import javax.swing.JOptionPane;

public class Investimento{
    public static void main (String[] args){
        Double contaPoup, RendaFixa, retorno;
        Integer opInvest, opcao; 
            System.out.println("Algoritmo: Cálcula o retorno para um investimento");
            System.out.println("Digite 1 para Poupança e 2 para Renda fixa");

        opInvest = Integer.parseInt(JOptionPane.showInputDialog("Informe a forma de investimento desejada"));

        Integer opcao = opInvest;
            switch (opcao) 
                {
                    case 1:
                        contaPoup = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser aplicado na Poupança: "));
                        retorno = (contaPoup * 1.03);
                            System.out.println("Em 30 dias o montante será de " + retorno);
                        break;
                    case 2:
                        RendaFixa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser aplicado na Renda fixa: "));
                        retorno = (RendaFixa * 1.05);
                            System.out.println("Em 30 dias o montante será de R$ " + retorno);
                        break;
                    default:
                        System.out.println("Opção inválida")
                        break;
                }
    }
}
package novopreco;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Novopreco{
    public static void main (String[]args){
        Double precoAtual, mediaMensal, precoNovo;

            System.out.println("Algoritimo cálcula novo preço ");

        mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de produtos vendinos nesse mês"));    
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do preço atual")); 
        
        if (precoAtual == 0)
            {
                System.out.println("Favor verificar se o preço está correto no sistema!");
            }
                else if (mediaMensal == 00 && precoAtual > 0)
                    {
                        System.out.println("Como não houveram vendas o preço deve ser mantido");
                    }
                        else if (mediaMensal < 500 && precoAtual < 30)
                            {
                                precoNovo = (precoAtual * 1.10);
                                    System.out.println("O novo preço deverá ser R$ " + precoNovo);
                            }
                                else if (mediaMensal < 1000 && precoAtual < 80)
                                    {
                                        precoNovo = (precoAtual * 1.15);
                                            System.out.println("O novo preço deverá ser R$ " + precoNovo);
                                    }
                                        else 
                                            {
                                                precoNovo = (precoAtual * 0.95);
                                                    System.out.println("O novo preço deverá ser R& " + precoNovo);
                                            }
    }
}
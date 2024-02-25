package exercicio_28;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
    Venda Mensal Preço Atual Preço Novo
    < 500 < 30 + 10%
    >= 500 e < 1000 >= 30 e < 80 +15%
    >= 1000 >= 80 - 5%
    Obs.: para outras condições, preço novo será igual ao preço atual.
 */

public class Exercicio_28 {

    public static void main(String[] args) {
        double pVenda, medVendas, nPreco;
        
        pVenda = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o preço atual do produto: "));
        medVendas = Double.parseDouble(JOptionPane.showInputDialog("Favor informar a quantidade de vendas: "));
        
        if (medVendas <= 500 && pVenda < 30) 
        {
            nPreco = pVenda * 1.1;
        } 
        else if (medVendas < 100 && pVenda < 80) 
        {
            nPreco = pVenda * 1.15;
        }
        else
        {
            nPreco = pVenda * 0.95;
        }
        
        JOptionPane.showMessageDialog(null,"O novo preço será R$ " + nPreco);
        
    }
    
}

package exercicio_28;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
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

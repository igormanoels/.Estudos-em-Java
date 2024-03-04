package exercicio_28_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
 *  Venda Mensal    | Preço Atual       | Preço Novo
 *  < 500           |   < 30            |   +10%
 *  >= 500 e < 1000 |   >= 30 e < 80    |   +15%
 *  >= 1000         |   >= 80           |   - 5%
 *  Obs.: para outras condições, preço novo será igual ao preço atual.
 */
public class Exercicio_28_modulado {

    public static void main(String[] args) 
    {
        int pVendas, mdMensal;
        double nPreco;
        
        pVendas = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o preço atual de vendas: "));
        mdMensal = Integer.parseInt(JOptionPane.showInputDialog("Favor informar a média mensal de vendas: "));
        
        nPreco = calcNvPreco(pVendas, mdMensal);
        JOptionPane.showMessageDialog(null, "O novo preço de venda será: R$ "+ nPreco);
    }
    
    /*********************************************
     * Função para verifiacar a ordem dos valores.    
     */ 
    static double calcNvPreco(int pVd, int mdM)
    {
        double nPr;
        if (mdM < 500 && pVd < 30) 
        {
            nPr = pVd * 1.1;
        } 
        else if (mdM < 1000 && pVd < 80)
        {
            nPr = pVd * 1.15;
        }
        else 
        {
            nPr = pVd * 0.95;
        }
        
        return nPr;
    }
    
}

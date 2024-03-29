package exercicio_29;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 
 * 29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */

public class Exercicio_29 {

    public static void main(String[] args) {
        int op;
        double invest, mont;
        
        JOptionPane.showMessageDialog(null,"Digite:\n1 - Investimento na Poupança\n2 - Investimento em Renda Fixa");
        
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: "));
            if (op != 1 && op != 2) 
            {
                JOptionPane.showMessageDialog(null,"Opção inválida!");
            }
        } while (op < 1 || op > 2);
        
        invest = Double.parseDouble(JOptionPane.showInputDialog("Favor informar qual o valor que deseja investir: "));
                
        if (op == 1) 
        {
            mont = invest * 1.03;
        }
        else 
        {
            mont = invest * 1.05;
        }
        
        JOptionPane.showMessageDialog(null, "O valor corrigido após os 30 dias de investimento é de: R$ " + mont);
    }
    
}

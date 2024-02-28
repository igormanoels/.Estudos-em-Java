package exercicio_44;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */

public class Exercicio_44 {

    public static void main(String[] args) {
        int base, exp, res;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente: "));
        res = (int) Math.pow(base, exp);
        
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
        
    }
    
}

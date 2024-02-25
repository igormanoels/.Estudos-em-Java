package exercicio_22;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */

public class Exercicio_22 {

    public static void main(String[] args) {
        int valor1, valor2;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        
        if (valor1 < valor2) 
        {
            JOptionPane.showMessageDialog(null, "Sequência: " + valor1 + ", " + valor2);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Sequência: " + valor2 + ", " + valor1);
        }
    }
    
}

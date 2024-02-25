package exercicio_10;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */

public class Exercicio_10 {

    public static void main(String[] args) {
        float num1, num2, dif;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        dif = num1 - num2;

        JOptionPane.showMessageDialog(null, "A diferença entre os valores informador é de " + dif);
    }
    
}

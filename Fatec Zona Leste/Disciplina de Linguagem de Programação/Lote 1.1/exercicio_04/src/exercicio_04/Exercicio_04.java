package exercicio_04;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 4. Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 */

public class Exercicio_04 {

    public static void main(String[] args) {
        
        double tempC, tempF;
        
        tempC = Double.parseDouble(JOptionPane.showInputDialog("Favor informar a temperatura desejada para a conversão: "));
        tempF = (((9 * tempC)+160)/5);
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é " + tempF);

    }
    
}

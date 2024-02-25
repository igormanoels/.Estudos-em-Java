package exercicio_20;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
    Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */

public class Exercicio_20 {

    public static void main(String[] args) {
        int numA, numB, numC;
        double delta, x1Linha, x2Linha;
        
        numA = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de A: "));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de B: "));
        numC = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de C: "));
        
        delta = Math.pow(numB, 2) - (4 * numA * numC);
        
        if (delta > 0) 
        {
            x1Linha = (- numB + Math.sqrt(delta)) / (2 * numA);
            x2Linha = (- numB - Math.sqrt(delta)) / (2 * numA);
            JOptionPane.showMessageDialog(null,"x¹ = " + x1Linha + " e x² = " + x2Linha);
        } 
        else if ( delta == 0) 
        {
            x1Linha = (-numB / (2 * numA));
            JOptionPane.showMessageDialog(null,"x = " + x1Linha);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Não há raízes reais para essa equação.");
        }
        
    }
    
}

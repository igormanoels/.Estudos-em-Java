package exercicio_05;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 5. Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 */

public class Exercicio_05 {

    public static void main(String[] args) {
        
        double numA, numB, numC, delta, vaX1, vaX2;
        
        numA = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor de A: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor de B: "));
        numC = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor de C: "));
         
        if ( numA != 0 )
        {
            delta = Math.pow(numB, 2) - 4 * numA * numC;
            vaX1 = (- numB + Math.sqrt(delta)) / (2 * numA);
            vaX2 = (- numB - Math.sqrt(delta)) / (2 * numA);
            JOptionPane.showMessageDialog(null, "Resultdos, x¹ = " + vaX1 + "  e  x² = " + vaX2);
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Por \"A\" ser igual a \"Zero\", essa equação é linear.");
        }
    }
    
}

package exercicio_21;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_21 {

    public static void main(String[] args) {
        double n1, n2, n3, n4, med;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da N1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da n2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da N3: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da N4: "));
        
        med = ((n1 + n2 + n3 + n4) / 4); 
        
        if (med < 3) 
        {
            JOptionPane.showMessageDialog(null, "Reprovado. Sua nota foi " + med);
        }
        else 
        {
            if (med >= 3 || med < 6) 
            {
                JOptionPane.showMessageDialog(null,"Exame. Sua nota foi " + med);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"Aprovado. Sua nota foi " + med);
            }
        }
        
    }
    
}

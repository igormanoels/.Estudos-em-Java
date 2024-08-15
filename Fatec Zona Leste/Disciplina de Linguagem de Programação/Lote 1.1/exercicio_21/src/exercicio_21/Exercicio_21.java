package exercicio_21;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a. Se a média for >= 6,0 exibir “APROVADO”;
    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c. Se a média for < 3,0 exibir “RETIDO”.
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

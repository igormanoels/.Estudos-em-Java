package exercicio_21_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
 *  a. Se a média for >= 6,0 exibir “APROVADO”;
 *  b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 *  c. Se a média for < 3,0 exibir “RETIDO”.
 */

public class Exercicio_21_modulado {

    public static void main(String[] args) 
    {
        int nt1, nt2, nt3, nt4;
        double media;
        
        nt1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da n1: "));
        nt2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da n2: "));
        nt3 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da n3: "));
        nt4 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor da n4: "));
        
        media = calcMedia (nt1, nt2, nt3, nt4);
        JOptionPane.showMessageDialog(null, "Média: " + media);
              
    }
    
    /************************************************************
     * Função para Cálcular a média das notas anuais de um aluno.
     */ 
    static double calcMedia (int n1, int n2, int n3, int n4)
    {
        double res = ((n1 + n2 + n3 + n4) / 4);
        return res;
    }
    
    
}

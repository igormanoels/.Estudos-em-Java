package exercicio_27;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 */

public class Exercicio_27 {

    public static void main(String[] args) {
        int voltas, percurso, tempo;
	double veloMed;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o número de voltas: "));
        percurso = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o percurso em metros: "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tempo em minutos: "));
        
        veloMed = ((voltas * percurso) / tempo);
        
        JOptionPane.showMessageDialog(null,"A velocidade média da prova foi de " + veloMed + "km/h.");
        
    }
    
}

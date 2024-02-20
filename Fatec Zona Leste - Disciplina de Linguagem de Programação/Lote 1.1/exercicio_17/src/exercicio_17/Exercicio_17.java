package exercicio_17;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_17 {

    public static void main(String[] args) {
        double percurso, veloMed, lits;
        
        percurso = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o tempo da viagem: "));
        veloMed = Double.parseDouble(JOptionPane.showInputDialog("Favor informar qual a velocidade em KM/h: "));
        lits = ((percurso * veloMed) / 12);
        
        JOptionPane.showMessageDialog(null, "A quantidade de litros gasta foi de " + lits + " litros.");
        
    }
    
}

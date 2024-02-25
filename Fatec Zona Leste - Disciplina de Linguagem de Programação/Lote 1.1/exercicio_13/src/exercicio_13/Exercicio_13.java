package exercicio_13;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */

public class Exercicio_13 {

    public static void main(String[] args) {
        double alimentos;
        int tempo;
        
        alimentos = Double.parseDouble(JOptionPane.showInputDialog("Favor informar quantos quilos de alimento foram doados: "));
        tempo = (int) ((alimentos * 1000 ) / 50);
        
        JOptionPane.showMessageDialog(null,"O tempo de duração para essa quantidade de alimentos é de " + tempo + " dias");
        
    }
    
}

package tempoalimentos;

/**
 * @author s.igormanoel
 */

import javax.swing.JOptionPane;

public class Tempoalimentos {
    public static void main(String[] args) {
        Integer quilos, tempo;

        quilos = Integer.parseInt(JOptionPane.showInputDialog("Quantos quilos de alimento tem na dispensa?"));

        tempo = ((quilos * 1000) / 50);
        System.out.println("A quantidade de dias é de " + tempo);
    }
}
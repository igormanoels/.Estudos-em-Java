package velocidademedia;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Velocidademedia{
    public static void main (String[]args){
        Double Nvoltas, Distpista, tempoMin, velocidade;

            System.out.println("Algoritimo: cálcula a velocidade média de um atleta.");
        
        Nvoltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de voltas da prova"));
        Distpista = Double.parseDouble(JOptionPane.showInputDialog("Informe a distância da pista em metros"));
        tempoMin = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da prova em minutos"));

        velocidade = ((Nvoltas * Distpista)/tempoMin);
            System.out.println("O tempo é de " + velocidade + "km/h");     
    }
}

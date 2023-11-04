package velocidademedia;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Velocidademedia{
    public static void main (String[]args){
        Double Nvoltas, Distpista, tempoMin, velocidade;

            System.out.println("Algoritmo: Cálcula a velocidade média de um atleta.");
        
        Nvoltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de voltas da prova"));
        Distpista = Double.parseDouble(JOptionPane.showInputDialog("Informe a distância da pista em metros"));
        tempoMin = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da prova em minutos"));
        // Exemplo: 5 voltas x 400 metro x 20 minutos    
        velocidade = ((Nvoltas * (Distpista / 1000))/(tempoMin / 60 ));
            System.out.println("A velocidade média é de " + velocidade + "km/h");        
    }
}
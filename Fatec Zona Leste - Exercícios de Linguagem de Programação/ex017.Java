package consumonaviagem;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Consumonaviagem {
    public static void main(String[]args){
        Double tempo, veloM, consumo;

        tempo = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o tempo da viagem?"));
        veloM = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a valocidade média?"));

        consumo = ((tempo * veloM) * 12);
            System.out.println("foram gastos " + consumo + " litros");
    }
}
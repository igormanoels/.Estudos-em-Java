package conversosrtemperatura;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;
      
public class Conversosrtemperatura {    
    public static void main(String[] args) {
        Integer temperatura, conversao;
        
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da temperatura?"));
        
        conversao = ((9 * temperatura + 160) / 5);
            System.out.println("A temperatura atual é de " + temperatura + "ºC e em Fahrenheit é de " + conversao + "ºF.");
    }    
}
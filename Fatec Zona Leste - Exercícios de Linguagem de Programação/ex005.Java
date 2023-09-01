package equacaosegundograu;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Equacaosegundograu {
    public static void main(String[] args) {
        Double valorA, valorB, valorC, delta, xLinha1, xLinha2;
        
        valorA = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de A?"));
        valorB = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de B?"));
        valorC = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de C?"));
        
        // terminar o cáculo --> exemplo para teste 5x²-3x-2=0 --> resposta x1 = 1    e   x2 = -0,4
        
        delta = ((valorB * valorB) + (- 4 * (valorA * valorC)));
        delta = Math.sqrt(delta);
        xLinha1 = ((-valorB) + delta) / (2 * valorA);
        xLinha2 = ((-valorB) - delta) / (2 * valorA);
            //System.out.println(delta); teste para ver se delta saiu corretamente
            System.out.println("Sua expressão é " + valorA + "x²" + valorB + "x" + valorC + "=0"); 
            System.out.println("O valor de X1 é " + xLinha1 + " e o valor de X2 é " + xLinha2);
    }    
}
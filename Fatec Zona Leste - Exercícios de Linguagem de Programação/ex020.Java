package raizesreais;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Raizesreais{
    public static void main(String[]args){
        Double valorA, valorB, valorC, delta, xLinha1, xLinha2;

        valorA = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de A?"));
        valorB = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de B?"));
        valorC = Double.valueOf(JOptionPane.showInputDialog("Qual o valor de C?"));

        delta = ((valorB * valorB) + (- 4 * (valorA * valorC)));
        //delta = Math.sqrt(delta); // teste raiz quadrada
        //System.out.println("delta é " + delta); //teste para ver se delta saiu corretamente
             
        if (delta < 0)
            {
                System.out.println("Não é possivel prosseguir com o cálculo, pois as raizes não são reais!");
                // para teste raiz negativa usar A=1, B=-4, C=5
            } 
                else
                    {
                        xLinha1 = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
                        xLinha2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);
                            System.out.println("Sua expressão é " + valorA + "x²" + valorB + "x" + valorC + "=0"); 
                            System.out.println("O valor de X1 é " + xLinha1 + " e o valor de X2 é " + xLinha2);
                    }
    }
}
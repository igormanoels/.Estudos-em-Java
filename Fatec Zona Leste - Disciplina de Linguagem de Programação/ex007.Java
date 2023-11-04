package areadoparalelepipedo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Areadoparalelepipedo {
    public static void main(String[] args) {
        Integer comprimento, largura, altura, resultado;
     
        altura = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da altura"));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da largura?"));
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do comprimento"));
     
        resultado = (((altura * largura) + (altura * comprimento) + (largura * comprimento)) * 2);
        // Fórmula, area = 2(al + ac + lc)
            System.out.println("O valume do Paralelepipedo é de: " + resultado + "m²");
    }
}
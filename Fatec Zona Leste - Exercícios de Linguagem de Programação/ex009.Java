package somadosquadrados;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Somadosquadrados {
    public static void main(String[] args) {
        Integer valor1, valor2, resultado;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("QUal o segundo valor?"));
        
        resultado = ((valor1 * valor1) + (valor2 * valor2));
            System.out.println("O resultado da soma dos quadrados dos valores " + valor1 + " e " + valor2 + ", é de: " + resultado + ".");
    }
}
package calculadiferenca;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculadiferenca{
    public static void main (String[]args){
        Integer valor1, valor2, resultado;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));

        if (valor1 >= valor2)
            {
                resultado = (valor1 - valor2);
                    System.out.println("A diferença entre os valores é de: " + resultado);
            } 
        else 
            {
                resultado = (valor2 - valor1);
                    System.out.println("A diferença entre os valores é de: " + resultado);
            }
    }
}
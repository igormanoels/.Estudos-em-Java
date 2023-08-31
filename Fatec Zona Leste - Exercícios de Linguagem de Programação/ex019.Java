package mostrarmaiorvalor;
/**
 * @author s.igormanoel
 */

import javax.swing.JOptionPane;

public class Mostrarmaiorvalor{
    public static void main (String[]args){
        Integer valor1, valor2;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));

        if (valor1 > valor2){
            System.out.println("O maior valor é " + valor1 + " e o menor é " + valor2);
        } else {
            System.out.println("O maior valor é " + valor2 + " e o menor é " + valor1);
        }
    }
}
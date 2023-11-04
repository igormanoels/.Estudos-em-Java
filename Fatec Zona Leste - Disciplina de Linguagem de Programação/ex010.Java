package diferencasreais;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Diferencasreais{
    public static void main(String[] args){
        Integer valor1, valor2, resultado;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));
        
        resultado = (valor1 - valor2);
            System.out.println("A diferença entre os valores é de: " + resultado);
    }
}
package calculeserie;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculaserie{
    public static void main (String[]args){
        Integer valor, contador;
        Double resultado;
        
        resultado = 0.00;
            System.out.println("Algoritmo: Cálcula o valor da série.");
        
        contador = 1;    
                valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

        while (contador <= valor)
            {
                resultado = resultado + (1.00 / contador);
                contador++;
            }
        System.out.println(resultado);
    }
}

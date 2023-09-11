package tabuada;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Tabuada{
    public static void main(String[]args){
        Integer valor, contador, resultado;

            System.out.println("Algoritmo: Cálcula o valor da série.");
        
        contador = 0;    
        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

            System.out.println("Tabuada do " + valor);
        
        if (valor == 0)
            {
                System.out.println("Todo número vezes zero é zero!");
            }
                else
                    {
                        while (contador <= 10)
                            {
                                resultado = (valor * contador);
                                System.out.println(valor + " x " + contador + " = " + resultado);
                                contador++;
                            }
                    }        
    }
}
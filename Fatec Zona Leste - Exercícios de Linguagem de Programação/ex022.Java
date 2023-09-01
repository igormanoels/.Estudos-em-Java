package ex22.valoresemordem;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex22Valoresemordem {
    public static void main(String[] args) {
        Integer valor1, valor2;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        if (valor1 < valor2)
            {
                System.out.println("A sequencia é " + valor1 + ", " + valor2);
            }
                else
                    {
                        System.out.println("A sequencia é " + valor2 + ", " + valor1);
                    }
    }    
}
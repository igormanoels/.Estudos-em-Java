package ex23.colocaroquartoemordem;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex23Colocaroquartoemordem {
    public static void main(String[] args) {
        Integer valor1, valor2, valor3, valor4;
        
        System.out.println("Informe 4 números, cujo os 3 primeiros estão na sequência");

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor"));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto valor"));
        
        if (valor4 < valor1)
            {
                System.out.println("A sequencia dos valores é: " + valor4 + ", " + valor1 + ", " + valor2 + ", " + valor3);
            } 
                else if (valor4 < valor2)
                        {
                            System.out.println("A sequencia dos valores é: " + valor1 + ", " + valor4 + ", " + valor2 + ", " + valor3);
                        } 
                            else if (valor4 < valor3)
                                    {
                                        System.out.println("A sequencia dos valores é: " + valor1 + ", " + valor2 + ", " + valor4 + ", " + valor3);
                                    } 
                                        else 
                                            {
                                                System.out.println("A sequencia dos valores é: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4);    
                                            }    
    }
}
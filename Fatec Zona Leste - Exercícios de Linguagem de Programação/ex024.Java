package ex24.verificadivisaopordoisetres;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex24Verificadivisaopordoisetres {
    public static void main(String[] args) {
        Double valor;        
            
            System.out.println("Programa que cálcula se o valor é divisivel por 2 e 3.");
       
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
        
        if (valor % 2 == 0 && valor % 3 == 0)
            {
                System.out.println("O " + valor + " é divisível por dois e três!");
            } 
        else
            {
                System.out.println("O " + valor + ", não é divisível por dois e três.");
            }
    }   
}
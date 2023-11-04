package trocadeendereco;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Trocadeendereco {
    public static void main(String[] args) {
        Integer var1, var2, var3;
        
        var1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
        var2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
        
        var3 = var1;
        var1 = var2;
        var2 = var3; 
            System.out.println("O valor de X alterado é de: " + var1);
            System.out.println("O valor de Y alterado é de: " + var2);
    }                       
}
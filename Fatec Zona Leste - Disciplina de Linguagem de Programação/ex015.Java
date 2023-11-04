package calculehipotenusa;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculehipotenusa {
    public static void main(String[]args){
        Double cat1, cat2, hipo;

        cat1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do primeiro cateto?"));
        cat2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do segundo cateto?"));

        hipo = ((cat1 * cat1) + (cat2 * cat2));
            System.out.println("O valor da hipotenusa é " + hipo);
    }
}
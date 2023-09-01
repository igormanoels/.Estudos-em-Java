package areadotriangulo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Areadotriangulo {
    public static void main(String[] args) {
        Integer base, altura, areaTriangulo;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Altura"));
        
        areaTriangulo = ((base * altura) /2);
            System.out.println("A área do triangulo é " + areaTriangulo);   
    }
}

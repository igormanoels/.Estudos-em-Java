package quantgraos;
 /**
 * @author GitHub @igormanoels
 */

 import javax.swing.JOptionPane;

public class QuantGraos{
    public static void main (String[]args){
        Integer contador, casa, graos;
        Double res;
            System.out.println("Algoritmo: Cálcula a quantidade de grãos por casa de xadrez.");
        
        contador = 0;
        casa = 0;
        graos = 2;

        while (casa < 64)
            {
                res = (Double) Math.pow(graos, casa);
                casa++;
                    System.out.println("Casa " + casa + " - Quantidade de Grãos = " + res);   
            }
    }   
}
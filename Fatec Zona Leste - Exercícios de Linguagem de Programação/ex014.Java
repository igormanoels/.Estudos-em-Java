package terceiroangulo;
/**
 * @author s.igormanoel
 */

 import javax.swing.JOptionPane;

 public class Terceiroangulo{
    public static void main(String[]args){
        Double ang1, ang2, ang3;

        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do primeiro angulo?"));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do segundo angulo?"));

        ang3 = (180 - (ang1 + ang2));
            System.out.println("O valor do terceiro angulo é " + ang3);
    }
}
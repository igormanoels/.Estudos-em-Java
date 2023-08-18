package calculaarea;
/**
 *
 * @author s.igormanoel
 */
import javax.swing.JOptionPane;

public class Calculaarea {
    public static void main(String[] args) {
        
        int num1, num2, areatotal;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Primeiro valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Segundo valor"));      
        areatotal = (num1 * num2);
        System.out.println("O valor de sua área é: " + areatotal);
    }
}
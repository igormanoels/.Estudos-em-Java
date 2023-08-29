package calculocircunferencia;
/**
* @author s.igormanoel
*/

import javax.swing.JOptionPane;

public class Calculocircunferencia{
    public static void main(String[]args){
        Double raio, resultado;

        raio = Double.valueOf(JOptionPane.showInputDialog("Informe o valor do raio"));

        resultado = ((2 * 3.14) * raio);
            System.out.println("O valor da circunferencai é de " + resultado);
    }
}
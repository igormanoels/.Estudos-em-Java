package calculaseriecomfatorial;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class CalculaSeriecomFatorial{
    public static void main (String[]args){
        Double fatorial, contador, resultado, valor;

            System.out.println("Algoritmo: Cálcula uma série relacionada a fatorial.");
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

        resultado = 1.00;
        contador = 1.00;
        fatorial = 1.00;

        while (contador <= valor)
            {
                fatorial = (fatorial * contador);
                resultado = (resultado + (1 / fatorial));
                contador++; 
            }
    }
}
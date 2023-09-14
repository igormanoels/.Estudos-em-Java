package seriedefibonacci;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class SeriedeFibonacci{
    public static void main(String[]args){
        Integer valor1, valor2, termo, contador, limite;

            System.out.println("Algoritmo: Cálculo a série de Fibonacci.");

        termo = Integer.parseInt(JOptionPane.showInputDialog("Informe até qual casa você deseja saber"));
        // O número do termo informado, será até onde a sequência será cálculada.

        valor1 = 0; // termo 1
        valor2 = 1; // termo 2
        contador = 2;
        limite = termo;

            System.out.println("A sequência é: ");
            System.out.print(valor1 + " | ");
            System.out.print(valor2 + " | ");

        do 
            {
                termo = (valor1 + valor2);
                valor1 = valor2;
                valor2= termo; 
                System.out.print(termo + " | ");
                contador++; 
            } while(contador < limite);
    }
}
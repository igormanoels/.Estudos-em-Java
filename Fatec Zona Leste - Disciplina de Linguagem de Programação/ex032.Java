package calculafatorial;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculafatorial{
    public static void main (String[]args){
        Integer valor, contador, fatorial, resultado;

            System.out.println("Algoritmo: C?lcula o valor fatorial de um n?mero.");

        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor!"));
            System.out.print("Para " + valor + ", ");
            System.out.print("O Fatorial é: ");
        
        fatorial = valor;    
        contador = 1;    
        resultado = 1;
        
        if (valor < 0)
            {
                System.out.println("Não existem Fatorial para valores negativos!");
            }
        else if (valor == 0)
            {
                System.out.println(resultado);
            }
        else
            {
                do
                    {
                        resultado = (resultado * fatorial);
                        fatorial--;
                        contador++; 
                    }
                while (contador <= valor);
                System.out.println(resultado);
            }
    }
}
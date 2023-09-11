package calculafatorial;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculafatorial {
    public static void main(String[] args) {
        Integer valor, fatorial, contador, resultado;

            System.out.println("Algoritmo: Cálcula o valor da série.");
        
        fatorial = 1;
        contador = 1;    
        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        if (valor < 0)
            {
                System.out.println("Não existem fatorial para numeros negativos");
            }
                else 
                    {
                        while (contador <= valor)
                            {
                                fatorial = (fatorial * contador);
                                contador++;
                            }
                                System.out.println("O fatorial de " + valor + " é " + fatorial);
                    }
    }    
}
package recebecemnumeros;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class RecebeCemNumeros{
    public static void main (String[]args){
        Integer contador = 1;
        Integer entrada;
        Integer menorvalor = Integer.MAX_VALUE; // Inicializa com o maior valor possível
        Integer maiorvalor = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Algoritmo: Recebe 100 valores, e dentre os positivos, exibe o maior e o menor.");

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor."));
            if (entrada >= 0) {
                if (entrada > maiorvalor) {
                    maiorvalor = entrada;
                }
                if (entrada < menorvalor) {
                    menorvalor = entrada;
                }
                contador++;
            } else {
                System.out.println("O valor não será computado, somente são válidos valores positivos.");
            }
        } while (contador <= 100);

            System.out.println("O menor valor da sequência é " + menorvalor + ", e o maior valor é " + maiorvalor);
    }
}
package intervalonumerosprimos;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class {
    public static void main (String[]args){
        Integer valor1, valor2, res, contador;

        System.out.println("Algoritmo: Cálcula os valores dos numeros primos a partir de um intervalo");
    
    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

        System.out.println("A sequência dos números pares é: ");

    if (valor1 < valor2)
        {
            contador = valor1;    
            do 
                {
                    if (valor1 == 2 || valor1 == 3 || valor1 == 5 || valor1 == 7)
                        {
                            res = valor1;
                            System.out.print(res + " | ");
                        }
                    else if (valor1 == 1 || valor1 % 2 == 0 || valor1 % 3 == 0 || valor1 % 5 == 0 || valor1 % 7 == 0)
                        {
                            //pula instrução por estar vazio            
                        }
                    else
                        {
                            res = valor1;
                            System.out.print(res + " | ");
                        }
                contador++;
                valor1++;
                } while (contador <= valor2);  
        } 
    else
        {
            contador = valor2;
            do {
                    if (valor2 == 2 || valor2 == 3 || valor2 == 5 || valor2 == 7)
                        {
                            res = valor2;
                            System.out.print(res + " | ");
                        }
                    else if (valor2 == 1 || valor2 % 2 == 0 || valor2 % 3 == 0 || valor2 % 5 == 0 || valor2 % 7 == 0)
                        {
                            //pula instrução por estar vazio            
                        }
                    else
                        {
                            res = valor2;
                            System.out.print(res + " | ");
                        }
                contador++;
                valor2++;
                } while (contador <= valor1);
        }
    }
}
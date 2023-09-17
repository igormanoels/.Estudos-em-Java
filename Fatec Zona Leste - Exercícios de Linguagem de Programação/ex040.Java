package intervalonumerosprimos;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class {
    public static void main (String[]args){
        Integer valor1, valor2;

            System.out.println("Algoritmo: Cálcula os valores dos numeros primos a partir de um intervalo");
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

            System.out.println("A sequência dos números pares é: ");

        if (valor1 < valor2)
            {
                do 
                    {          
                        if (valor1 % 2 == 0 && valor1 % 3 == 0)
                            {
                                //pula instrução por estar vazio            
                            }
                        else
                            {
                                System.out.print(valor1 + " | ");
                            }
                    valor1++;              
                    } while (valor1 <= valor2);  
            } 
        else
            {
                do {
                    if (valor2 % 2 == 0 || valor2 % 3 == 0)
                        {
                                //pula instrução por estar vazio                        
                        }
                    else 
                        {
                            System.out.print(valor2 + " | ");
                        }
                    valor1++;
                    } while (valor1 <= valor2);
            }
    }
}
package somaimparnointervalo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class SomaImparnoIntervalo{
    public static void main(String[]args){
        Double valor1, valor2, resultado;

            System.out.println("Algoritmo: Soma os valores impares de um intervalo.");

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

        resultado = 0.00;

        if (valor1 == valor2)
            {
                System.out.println("Não existe Intervalo pois os valores são iguais!");
            }
                else if ( valor1 < valor2)
                    {
                        while (valor1 <= valor2)
                            {
                                if (valor1 % 2 == 0)
                                    {
                                        valor1++;
                                    }
                                        else
                                            {
                                                resultado = (resultado + valor1);
                                                valor1++; 
                                            }    
                            }
                    }
                        else
                            {
                                while (valor2 <= valor1)
                                    {
                                        if (valor2 % 2 == 0)
                                            {
                                                valor2++;
                                            }
                                                else
                                                    {
                                                        resultado = (resultado + valor2);
                                                        valor2++;
                                                    }
                                    }
                            }
        System.out.println("A soma dos números impares no intervalo é " + resultado);
    }
}
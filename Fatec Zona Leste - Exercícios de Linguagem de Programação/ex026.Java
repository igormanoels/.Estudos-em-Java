package ex26.omaioremultiplo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex26Omaioremultiplo {
    public static void main(String[] args) {
        Integer valor1, valor2, teste;
        
        System.out.println("Algoritmo: Descobre se o maior valor é multiplo do menor");
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        if (valor1 == valor2)
            {
                System.out.println("Os valores são iguais");
            }    
                else
                    {
        //primeiro passo, entra o menor valor
                        if (valor1 < valor2)
                            {
                                teste = (valor1 * valor1);
        //Segundo passo, compara se o valor do teste é igual ao maior valor
                                if (teste == valor2)
                                    {
                                        System.out.println("O maior valor é o dobro");
                                    }
                                        else 
                                            {
                                                System.out.println("O maior valor não é dobro");
                                            }
                            }
                                else
                                    {
                                        teste = (valor2 * valor2);
                                        if (teste == valor1)
                                            {
                                                System.out.println("O maior valor é o dobro");
                                            }
                                                else
                                                    {
                                                        System.out.println("O maior valor não é o dobro");
                                                    }
                                    }
                    }
    }
}
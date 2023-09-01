package ex26.omaioremultiplo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex26Omaioremultiplo {
    public static void main(String[] args) {
        Integer valor1, valor2, teste;
        
        System.out.println("Programa que descobre se o maior valor é multiplo do menor");
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        //primeiro passo, entra o menor valor
        if (valor1 < valor2)
            {
                teste = (valor1 * valor1);
            }
                else
                    {
                        teste = (valor2 * valor2);
                    }
        //Segundo passo, compara se o valor do teste é igual ao maior valor
        
    }
}
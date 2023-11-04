package calculamedia;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Calculamedia{
    public static void main(String[]args){
        Double nota1, nota2, nota3, nota4, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor da n1?"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor da n2?"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor da n3?"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor da n3?"));
        
        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (media >= 6) 
            {
                System.out.println("Você está Aprovado, sua média final é " + media);
            } 
        else if (media >= 3 && media < 6) 
            {
                System.out.println("Você está de Exame, sua média final é " + media);            
            } 
        else 
            {
                System.out.println("Você foi Reprovado, sua média final é " + media);
            }
    }
}
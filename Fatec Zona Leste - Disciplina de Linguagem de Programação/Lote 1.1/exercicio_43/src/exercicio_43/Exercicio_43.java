package exercicio_43;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m 
 *  e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */

public class Exercicio_43 {

    public static void main(String[] args) {
        float anaAlt = 1.10f, mariaAlt = 1.50f;
        int ano = 0;
    
        while (mariaAlt >= anaAlt) 
        {
            ano++;
            mariaAlt += 0.02f;
            anaAlt += 0.03f;
        } 
    
        JOptionPane.showMessageDialog(null, "Se passaram " + ano + " anos para Ana ficar mais alta que Maria"); 
        
    }
    
}

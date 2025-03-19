/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author sigor
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        int lista = 21;
        float nota = 8.5f;
        System.out.println("Sua nota é: " + nota);
        System.out.printf("%s, sua nota  é: %.2f\n", nome, nota);
        System.out.format("%s, sua nota  é: %.2f\n", nome, nota);

        // CONVERSÃO DE DADOS
        int n1,n2,res;
        System.out.print("\n\nInforme o primeiro número: ");
        n1 = Integer.parseInt(ler.nextLine());
        
        System.out.print("Informe o segundo número: ");
        n2 = Integer.parseInt(ler.nextLine());
        
        res = n1 + n2;
        String txt = Integer.toString(res);
        System.out.println("Resultado: " + txt);
        

    }
    
}

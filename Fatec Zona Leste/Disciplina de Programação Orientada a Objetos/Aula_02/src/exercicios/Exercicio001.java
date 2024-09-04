package exercicio;

import java.util.Scanner;

/*
 * Ex01-Desenho de área Stack e Heap
 * 
 * 	Instruções: Faça um programa que solicite ao usuário para digitar dois números que serão guardados 
 * 	em variáveis do tipo double, e em seguida o programa deve mostrar a soma destas variáveis na tela.
 * 	Assumindo que a primeira linha é aquela linha executada em primeiro na função public static void main, 
 * 	faça um desenho da memória Stack e Heap no momento em que o código estiver executando a 5ª linha.
 * 	Neste exercício serão feitas 2 entregas, o arquivo .java e uma foto do desenho da memória Stack e Heap.
 */
public class Exercicio001 
{
	public static void main(String[] args) 
	{
        Scanner ler = new Scanner(System.in);  
        System.out.print("Digite o primeiro número: ");  
        double num1 = ler.nextDouble();  
        System.out.print("Digite o segundo número: ");  
        double num2 = ler.nextDouble();  
        double soma = num1 + num2;  
        System.out.println("A soma é: " + soma);  
        
        ler.close();
    }
}

package Algoritmo_49;

import java.util.Scanner;

public class CriarVetorComString {

	public static void main(String[] args) {
/*// VALIDAR A SAIDA DOS DADOS QUANDO TIVER A AULA SOBRE TRATAMENTO DAS STRINGS
		String nomeCompleto, nomeFrag;
		String array [] = new String[4];
// cria um vetor com 4 posições
		
		Scanner ler =  new Scanner(System.in);
		System.out.println("Informe seu nome completo");
			nomeCompleto = ler.nextLine();
		
		array = nomeFrag.split(" ");
// fraciona o conteudo da variavel de acordo com a quantidade de posições do vetor
			System.out.println(nomeFrag[4]);
*/		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo");
		 	String nome = ler.nextLine();
		
		System.out.println("Todo o nome: " + nome);
		System.out.println("Primeiro Caracter: " + nome.charAt(0));
		System.out.println("Último Caracter: " + nome.charAt(nome.length()-1));
		System.out.println("Do primeiro ao terceiro: " + nome.substring(0, 3));
		System.out.println("O quarto caracteres: " + nome.charAt(3));
		System.out.println("Todos menos o primeiro: " + nome.substring(1));
		System.out.println("Os dois ultimos caracteres: " + nome.substring(nome.length()-2));	
	}

}

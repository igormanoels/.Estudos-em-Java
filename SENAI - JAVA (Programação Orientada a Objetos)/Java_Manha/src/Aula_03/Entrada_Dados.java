package Aula_03;

import java.util.Scanner;

public class Entrada_Dados {
	static int idade;
	static String nome;
// método para criar variaveis globais
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua Idade");
		idade = ler.nextInt();
		
		ler.nextLine(); // Diz quando haverá uma nova leitura
		// deve ser usado quando os tipos de dados alternam
		
		System.out.println("Informe seu Nome");
		String nome = ler.nextLine();
		
		System.out.println("Olá, me chamo " + nome + " e tenho " + idade + " anos.");
		
		ler.close(); // gera uma interrupção na entrada de dados via Scanner
	}

}

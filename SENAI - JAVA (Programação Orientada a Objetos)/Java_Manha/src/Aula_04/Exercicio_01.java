package Aula_04;

import java.util.Scanner;

public class Exercicio_01 {
	static String nome_Completo;
	static int idade;
	static int teste;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); // para entrada via scanner, a declaração deve ser feita uma unica vez

		System.out.println("Informe seu nome completo");
		nome_Completo = ler.nextLine(); // entrada para textos longos

		System.out.println("Agora informe sua idade");
		idade = ler.nextInt(); // entrada para numeros inteiros
		// o método Scanner cria uma entrada de dados sequencial para as variaveis e
		// independe da quant. delas

		System.out.println("Aluno: " + nome_Completo + ", tem " + idade + " anos.");

		teste = ler.nextInt(); // td vez que for necessario chamar um valor, basta fazer variavel =
								// ler.next"tipo de valor"()
		System.out.println(teste);

		ler.close();
	}

}

package Aula_09;

import java.util.Random;

public class Exerc {

	public static void main(String[] args) {
// Continuação dos exercicios da lista de 500 algoritmos
	
	double num = Math.random();
		System.out.println(num);
	testes();
	vetor();
	
	}
	
	static void vetor() {
		int cdu = 123;
		String numero, invertido;
		System.out.println(123);
		numero = String.valueOf(cdu);
		// converte o valor em string
		invertido = new StringBuilder(numero).reverse().toString();
		// inverte as posições do testo que está na variavel
		System.out.println(invertido);
	}

	static void testes() {
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt();
		System.out.println("Número gerado: " + valor);
	}

}

package com.cursojava;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
	
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println("Subtração -> " + resultado);
		
		resultado = resultado * 2;
		System.out.println("Multiplicação -> " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Divisão -> " + resultado);

		resultado = resultado + 8;
		System.out.println("Soma -> " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Múdulo -> " + resultado);
		
		++resultado;
		System.out.println("Incremento -> " + resultado);
		
		--resultado;
		System.out.println("Decremento -> " + resultado);

		
		System.out.println("Incremento antes -> " + ++resultado);
		System.out.println("Incremento depois -> " + resultado++);
		System.out.println("Decremento antes -> " + --resultado);
		System.out.println("Decremento depois -> " + resultado--);


		
		// + para concatenar
		String nome = "Primeiro nome";
		String sobreNome = "Segundo nome";
		String concatenado = nome + sobreNome;
		System.out.println(concatenado);
		
	}
}

package br.com.dio.Aula_002;

public class anotacoes_01 {
	
	public static void main(String[] args) {
		
		int valor1 = 4;
		int valor2 = 5;
		
		
		// Decisão simples
		if (valor1 != valor2) {
			System.out.println("Os valores são diferentes");
		}
		
		
		// Decisão composta
		if (valor1 < valor2) {
			System.out.println("Primeiro valor é menor.");
		} else {
			System.out.println("Segunda valor é menor.");
		}
		
		
		// Decisão encadeada
		if (valor1 == valor2) {
			System.out.println("Os valores são iguais.");
		} else if (valor1 > valor2) {
			System.out.println("Primeiro valor é maior.");
		} else {
			System.out.println("Segundo valor é maior.");
		}
	
		
		// Decisão Ternária
		var resultado = 4 > 5 ? "É maior": "É menor";
		System.out.println(resultado);
	}
	
}

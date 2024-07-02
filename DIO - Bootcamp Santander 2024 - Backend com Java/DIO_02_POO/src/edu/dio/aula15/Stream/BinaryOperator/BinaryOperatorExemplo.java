package edu.dio.aula15.Stream.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo 
{
	/*
	 * Representa dois argumentos do tipo <T>, e retorna um argumento do mesmo tipo
	 */

	public static void main(String[] args) 
	{
		List<Integer> numerosList = Arrays.asList(1, 2, 3, 4 ,5);
		
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		int resultado = numerosList.stream()
				// o primeiro valor "0", representa uma variavel temporária para incremento dos valores que virão
				.reduce(0, somar); 
		
		System.out.println("A soma dos números é: " + resultado);
		
		
		System.out.println();	
		
		
		// OUTRA FORMA DE FAZER
		int res = numerosList.stream()	
				.reduce(0, (n1, n2) -> n1 + n2); // Não é aceito passar a "variável temporária" como null
		System.out.println("Resultado da soma: " + res);
		
		
		System.out.println();

		
		// OUTRA FORMA DE FAZER
		int res2 = numerosList.stream()	
				.reduce(0, Integer::sum); // Não é aceito passar a "variável temporária" como null
		System.out.println("Somando com method reference: " + res2);
	}

}

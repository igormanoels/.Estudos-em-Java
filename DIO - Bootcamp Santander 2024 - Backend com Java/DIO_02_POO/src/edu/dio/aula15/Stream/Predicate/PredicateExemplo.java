package edu.dio.aula15.Stream.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo 
{
	/*
	 * Representa uma função com argumento <T> e retorna um valor Boolean
	 * geramente usado como filtro de elementos
	 */
	public static void main(String[] args) 
	{
		List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "GO", "Ruby");
		List<Integer> numerosList = Arrays.asList(1, 2, 3, 4 ,5);

		
		// Verifica as palavras que tem um comprimento maior q 5
		Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;
		
		// Filtra as palavras cujjo a  regraa siga o predicate implemeentado, depois imprime
		palavras.stream()
			.filter(maisDeCincoLetras)
			.forEach(System.out::println);
		
		
		System.out.println();
		
		
		// OUTRA FORMA DE FAZER
		palavras.stream()
			.filter(p -> p.length() < 5)
			.forEach(System.out::println);
		
		System.out.println();

		numerosList.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);

	}

}

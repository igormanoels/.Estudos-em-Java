package edu.dio.aula15.Stream.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// As FUNCTIONS são usada para mapear e transformar os elementos do STREAM em outros valores ou tipos
public class FunctionExemple 
{
	public static void main(String[] args) 
	{
		// Lista de números
		List<Integer> numerosList = Arrays.asList(1, 2, 3, 4 ,5);
		
		// Função que recebe um argumento do tipo <T> e retorna um argumento do tipo <R>
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		List<Integer> numerosDobrados = numerosList.stream()
				.map(dobrar)
				.collect(Collectors.toList());
		
		numerosDobrados.forEach(System.out::println);
		
		
		System.out.println();
		
		
		// OUTRA FORMA DE FAZER
		List<Integer> numerosTriplo = numerosList.stream()
				.map(n -> n * 3)
				.toList();
		numerosTriplo.forEach(System.out::println);
		

	}
}

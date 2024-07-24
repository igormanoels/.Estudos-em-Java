package edu.dio.aula15.Stream.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo 
{
	/*
	 * Representa operações que não aceitam argumento e retorna um resultado do tipo <T>
	 * usado geralmente para criar objetos de um determinado tipo
	 */
	public static void main(String[] args) 
	{
		Supplier<String> saudacao = () -> "Olá, seja bem vindo!";
		
		List<String> saudacaoList = Stream.generate(saudacao)
				.limit(5) 		// número de repetições máxima
				.collect(Collectors.toList());  		// Forma de retorno, nesse caso uma lista
		
		saudacaoList.forEach(s -> System.out.println(s));
		
		
		System.out.println();
		
		
		// OUTRA FORMA DE FAZER, É PASSAR O SUPPLIER DENTRO DO GENERETA
		List<String> saudacaoList2 = Stream.generate(() -> "Olá, seja bem vindo!")
				.limit(5) 		// número de repetições máxima
				.collect(Collectors.toList());  		// Forma de retorno, nesse caso uma lista
		
		saudacaoList2.forEach(System.out::println);
	}

}

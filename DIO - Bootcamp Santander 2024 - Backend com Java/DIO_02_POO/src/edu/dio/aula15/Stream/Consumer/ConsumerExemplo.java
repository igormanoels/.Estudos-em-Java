package edu.dio.aula15.Stream.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExemplo 
{
	/*
	 * Representa operações, com possibilidade de tipo <T>
	 * Não retorna resultado e não modifica elementos
	 */
	public static void main(String[] args)
	{
		List<Integer> numerosList = Arrays.asList(1, 2, 3, 4 ,5);
		
			
		// Usa o stream com lambda para percorrer a lista e realizar uma ação
		// Ao usando o Consumer, a classe não pode ter o mesmo nome, pois pode causar confusão
		Consumer<Integer> imprimirNumPar = numero -> { 	
			if (numero % 2 == 0) 
			{
				System.out.print(numero + " ");
			}
		};
		// Faz uso do stream para imprimir os numeros pares
		numerosList.stream().forEach(imprimirNumPar);
		
		
		System.out.println();
		
		
		// OUTRA FORMA DE FAZER
		numerosList.forEach( num -> {
			if (num % 2 != 0){ 
				System.out.print(num + " "); 
				}
			}	
		);
	}
}

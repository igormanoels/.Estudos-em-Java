package collections.D_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class B_StreamAPI 
{
	public static void main(String[] args) 
	{
		List<String> numeros = Arrays.asList("1","4","5","9","9","4","3","2","8","7");
		
		// Imprime todos os elementos
		System.out.print("Usando Consumer: ");
		numeros.stream().forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.print(s + " ");
			}
		});
		
		System.out.print("\n\nUsando lambda: ");
		numeros.stream().forEach(s -> System.out.print(s + " "));
		
		System.out.print("\n\nUsando lambda sem o stream: ");
		numeros.forEach(s -> System.out.print(s + " "));
		
		
		// 5 primeiros números, lembrado que o SET, não armazena números repetidos, 
		// logo ele retorna 4 valores porque o 9 se repete
		System.out.print("\n\nImprima os 5 primeiros números: ");
		numeros.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\n\nImprima os 5 primeiros números, passando para uma variável");
		Set<String> coletarSet = numeros.stream()
				.limit(5)
				.collect(Collectors.toSet());
		
		coletarSet.forEach(s -> System.out.print(s + " "));
			
		
		System.out.print("\n\nConverte os valores em inteiro: ");
		List<Integer> numerosMaiores = numeros.stream()
				.map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());
		numerosMaiores.forEach(s -> System.out.print(s + " "));
		
		
		
		// O filter funciona como o if
		System.out.println("\n\nConverte os valores em inteiro, seleciona os pares maiores que 2");
		List<Integer> numerosConvertidos = numeros.stream()
				.map(Integer::parseInt)
				.filter(i -> i % 2 == 0 && i > 2)
				.collect(Collectors.toList());
		numerosConvertidos.forEach(s -> System.out.print(s + " "));
		
		
		
		
		System.out.println("\n\nRetorna a média da lista");
		OptionalDouble media = numeros.stream()
				.mapToInt(Integer::parseInt)
				.average();		
		
		media.ifPresent(m -> System.out.print("A média é: " + m));
		
		
		
		
		System.out.print("\n\nRemova os valores impares: ");
		// é uma método de lista, por isso ele consegue alterar a lista
		numerosConvertidos.removeIf(i -> (i % 2 != 0));
		
		numerosConvertidos.forEach(s -> System.out.print(s + " "));
		
		
		teste.testando();
		
		
		
		System.out.print("\n\nA soma dos valores: ");
		int somatoria = numeros.stream()
				.mapToInt(Integer::parseInt)
				.sum();
		System.out.print(somatoria);

		
		
		System.out.print("\n\nO maior valor: ");
		OptionalInt maior = numeros.stream()
				.mapToInt(Integer::parseInt)
				.max();
		maior.ifPresent(i -> System.out.print(i + " "));
		
		
		System.out.print("\n\nO menor valor: ");
		OptionalInt menor = numeros.stream()
				.mapToInt(Integer::parseInt)
				.min();
		menor.ifPresent(i -> System.out.print(i + " "));
		
		
		System.out.print("\n\nNúmeros ordenados: ");
		List<Integer> numerosOrdenados = numeros.stream()
				.map(Integer::parseInt)
				.sorted()
				.collect(Collectors.toList());
		numerosOrdenados.forEach(i -> System.out.print(i + " "));
	}
}

class teste
{
	public static void testando()
	{
		List<Integer> numerosConvertidos = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	    System.out.println("\n\nRemova os valores ímpares");

	    // Usando removeIf para remover valores ímpares
	    numerosConvertidos.removeIf(i -> (i % 2 != 0));

	    // Imprimindo os valores restantes
	    numerosConvertidos.forEach(s -> System.out.print(s + " "));
	}
}

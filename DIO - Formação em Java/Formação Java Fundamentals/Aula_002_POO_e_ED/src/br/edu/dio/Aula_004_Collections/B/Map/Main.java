package br.edu.dio.Aula_004_Collections.B.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Integer, Pessoa> lista = new HashMap<>();
		
		lista.put(1, new Pessoa("Joao"));
		lista.put(2, new Pessoa("Leo"));
		lista.put(3, new Pessoa("Lian"));
		
		System.out.println(lista);
		
		System.out.println("\nChaves do MAP");
		lista.keySet().forEach(System.out::print);

		System.out.println("\n\nValores do MAP");
		lista.values().forEach(System.out::print);
		
		
		System.out.println("\n\nBuscando se a chave está presente\n" + lista.containsKey(3));
		
		
		// Iterando sobre a LISTA
		System.out.println("\nIterando sobre a lista");
		lista.forEach((k, v) -> System.out.printf("Chave: %d | Valor: %s \n", k, v));

	
		// Buscando valores em um map
		System.out.println("\nRetorna o objeto ou toString: " + lista.get(1));
		System.out.println("Retorna null se não encontrar: " + lista.get(76));
		
		
	}

}

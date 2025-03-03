package br.edu.dio.Aula_004_Collections.A.Listas_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lista {
	
	public static void main(String[] args) {
		List<Integer> teste = new ArrayList<>();
		teste.add(7);
		teste.add(2);
		teste.add(5);
		
		System.out.println(teste.get(0) + "\n");
		
		// Coloca a lista em reversa
		System.out.println(teste.reversed() + "\n");
		
		// Ordena os valores da lista
		Collections.sort(teste);
		System.out.println(teste + "\n");
		
		// Imprimindo valores usando strems
		teste.forEach(System.out::println);
		
		
		
		
		// Vale mais apena para um cenário onde se há muitas operações de inclusão e remoção
		List<Integer> lista = new LinkedList<>();
		
		
		
		
		
		// Tem a caracterisca de ser thread-safe, para a garantia de a segurança ao acesso em operações multi-threads
		List<Integer> lista2 = new Vector<>();
		
		
		
		
		// Lista de Objetos
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Jose", "21"));
		pessoas.add(new Pessoa("Joseline", "25"));
		pessoas.add(new Pessoa("Josefa", "11"));
		pessoas.add(new Pessoa("Josue", "61"));

		for (Pessoa p : pessoas) {
			System.out.printf("O %s tem %d anos.\n", p.getNome(), p.getIdade());
		}
	}
	
	
	
}

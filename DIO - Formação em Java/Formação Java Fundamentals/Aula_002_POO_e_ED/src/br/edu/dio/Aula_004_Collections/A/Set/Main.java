package br.edu.dio.Aula_004_Collections.A.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		// não permite valores duplicado, e armazena os valores sem ordenar os dados por chegada
		Set<Pessoa> pessoas = new HashSet<>();
		
		pessoas.add(new Pessoa("1","Antoan","2"));
		pessoas.add(new Pessoa("2","Vivi","2"));
		pessoas.add(new Pessoa("3","Luan","4"));
		pessoas.add(new Pessoa("4","Avan","5"));

		System.out.println(pessoas.toString());
		
		System.out.println("\n\n");
		
		var iterator = pessoas.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		System.out.println("\n\n");
		
		
		// não permite valores duplicado, manter a ordem de inserção dos dados
		Set<Pessoa> pessoas2 = new LinkedHashSet<>();
		
		pessoas2.add(new Pessoa("1","Antoan","2"));
		pessoas2.add(new Pessoa("2","Vivi","2"));
		pessoas2.add(new Pessoa("3","Luan","4"));
		pessoas2.add(new Pessoa("4","Avan","5"));

		System.out.println(pessoas2.toString());
		

		
		System.out.println("\n\n");

		
		
		// Cria uma ordenação baseada na implementação do método Comparable, que precisa estar implementada na classe da lista.
		Set<Pessoa> pessoas3 = new TreeSet<>();
		
		
		pessoas3.add(new Pessoa("2","Antoan","2"));
		pessoas3.add(new Pessoa("4","Vivi","2"));
		pessoas3.add(new Pessoa("1","Luan","4"));
		pessoas3.add(new Pessoa("3","Avan","5"));

		System.out.println(pessoas3.toString());

		
		System.out.println("\n\n");

		
		
		// outra forma é implementar o Comparable direto na instancia do objeto
		Set<Pessoa> pessoas4 = new TreeSet<>((Pessoa p1, Pessoa p2) -> {
				var compare = 0;
				if (p1.getId() < p2.getId()) compare--;
				if (p1.getId() > p2.getId()) compare++;
				return compare;
				});
		
		
		pessoas4.add(new Pessoa("1","Antoan","2"));
		pessoas4.add(new Pessoa("2","Vivi","2"));
		pessoas4.add(new Pessoa("3","Luan","4"));
		pessoas4.add(new Pessoa("4","Avan","5"));

		System.out.println(pessoas4);

	}

	
	// Outra forma de implementar
	Set<Pessoa> pessoas5 = new TreeSet<>(Comparator.comparingInt(Pessoa::getId));

	// em ordem reversa
	Set<Pessoa> pessoas6 = new TreeSet<>(Comparator.comparingInt(Pessoa::getId).reversed());

}

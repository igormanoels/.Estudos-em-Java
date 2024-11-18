package collections.A_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class A_Introducao 
{
	public static void main(String[] args) 
	{
		List<String> aluno = new ArrayList<>();
		aluno.add("Igor");
		aluno.add("Bianca");
		aluno.add("Pedro");

		System.out.println("Retorna o indice passado: "+aluno.get(0) + "\n");

		System.out.println("Retorna a lista completa: " + aluno + "\n");

		//----------------------------------------------------------------------------------------------------------------------------

		List<Double> notas = new ArrayList<>(); // Lista utilizando o generics
				
		// Adciona valores a lista
		notas.add(8.0);
		notas.add(4d);
		notas.add(4.8);
		
		System.out.println("Lista após adcionar valores: " + notas + "\n");
		System.out.println("Retorna o indice do elemento: "+ notas.indexOf(4d) + "\n"); 

		// Troca um valor passando o indice
		notas.set(1, 9.7);
		System.out.println("Lista após a troca do valor na posição 1: " + notas + "\n");

		// Retorna um boolean, testando se um valor está presente na lista
		System.out.println("O aluno Igor está na lista? " + aluno.contains("Igor") + "\n");

		
		// Percorre a lista
		System.out.print("Lista: ");
		for (Double n : notas) 
		{
			System.out.print(n + " ");
		}
		System.out.println("\n");


		System.out.println("Retorna a menor nota: " + Collections.min(notas) + "\n");
		System.out.println("Retorna a maior nota: " + Collections.max(notas) + "\n");


		Iterator<Double> iterator = notas.iterator();
		var soma = 0d;
		while(iterator.hasNext())
		{
			soma += iterator.next();
		}
		System.out.println("Usa o Iterator para percorrer a lista e soma os valores: " + soma + "\n");
		System.out.println("Cálcula a média de acordo com o tamanho da lista: " + soma / notas.size() + "\n");
		System.out.println("Remover item da lista: " + aluno.remove(0) + "\n");
		

		// Percorre o iterator e remove os valores menores q 6
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) 
		{
			if (iterator1.next() < 6) iterator1.remove();	
		}
		System.out.println("Notas menores que 6 foram removidas " + notas);
		

		// apaga a lista
		notas.clear(); 
		System.out.println("Verifica se a lista está vazia e retorna um boolean: " + notas.isEmpty());


		// Cria uma lista já com elementos, podendo adcionar ou remover
		List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5d, 4d, 8.8d)); 
		System.out.println("Cria a lista já com os elemento: " + notas2);
		

		// não permite adcionar mais elementos para a lista
		List<Double> notas3 = Arrays.asList(7d, 8.5d, 4d, 8.8d);
		System.out.println("Não permite mais elementos na lista: " + notas3);
		
		
		// Cria uma lista imutável
		List<Double> notas4 = List.of(7d, 8.5d, 4d, 8.8d);
		System.out.println("Lista imutável: " + notas4);
	}
}

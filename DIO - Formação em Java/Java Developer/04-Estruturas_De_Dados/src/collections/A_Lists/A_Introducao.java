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
		List aluno = new ArrayList();
		List<Double> notas = new ArrayList<>(); // Lista utilizando o generics
		
		List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5d, 4d, 8.8d)); // Cria uma lista já com elementos, podendo adcionar ou remover
		List<Double> notas3 = Arrays.asList(7d, 8.5d, 4d, 8.8d); // não permite adcionar mais elementos para a lista
		List<Double> notas4 = List.of(7d, 8.5d, 4d, 8.8d); // Cria uma lista imutável

		
		aluno.add("Igor");
		aluno.add("Bianca");
		aluno.add("Pedro");
		
		System.out.println(aluno);
	
		notas.add(8.0);
		notas.add(4d);
		notas.add(4.8);
		
		System.out.println(notas);
	
		System.out.println("posição: "+ notas.indexOf(4d)); // retorna o indice do elemento
		notas.set(1, 9.7);
		System.out.println(notas);
		
		System.out.println("O aluno Igor está na lista? " + aluno.contains("Igor") + "\n");
		
		for (Double n : notas) 
		{
			System.out.println(n);
		}
		
		System.out.println(aluno.get(0)); // Retorna o indice
		
		System.out.println(Collections.min(notas)); // retorna a menor nota
		System.out.println(Collections.max(notas)); // Retorna a maior nota
		
		Iterator<Double> iterator = notas.iterator();
		var soma = 0d;
		while(iterator.hasNext())
		{
			soma += iterator.next();
		}
		System.out.println(soma); // parei em 7min 
		System.out.println("Média: " + soma / notas.size());
		System.out.println("Remover aluno " + aluno.remove(0));
		
		Iterator<Double> iterator1 = notas.iterator();
		System.out.println("Exibindo notas " + notas);
		while (iterator1.hasNext()) 
		{
			if (iterator1.next() < 6) iterator1.remove();	
		}
		
		System.out.println("Notas menores que 6 foram removidas " + notas);
		notas.clear(); // apaga a lista
		System.out.println(notas.isEmpty());
	}
}

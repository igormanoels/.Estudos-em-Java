package collections.B_Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A_Introducao 
{
	public static void main(String[] args) 
	{
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
		// por não permitir elementos repetidos, apenas um set irá aparecer
		System.out.println(notas);
		
		System.out.println("Verifica se a nota 8 está no conjunto: " + notas.contains(8d)); // retorna um boolean
		
		System.out.println("Menor nota: " + Collections.min(notas));
		
		System.out.println("Maior nota: " + Collections.max(notas));

		Iterator<Double> iterator = notas.iterator();
		Double somatoria = 0d;
		
		while(iterator.hasNext())
		{
			somatoria += iterator.next();
		}
		System.out.println("Soma das notas: " + somatoria);
		
		
		System.out.println("Média das notas: " + (somatoria / notas.size()));
		
		notas.remove(0d);
		System.out.println("Removendo nota 0: " + notas);
		
		
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext())
		{
			if (iterator1.next() < 7) iterator1.remove();
		}
		System.out.println("Remover notas menores que 7 " + notas);
		
		
		// Como o TreeSet funciona em estrutura de árvore, os valores são posicionário e retornados já em ordem
		System.out.println("\nInserindo notas em ordem crescente");
		Set<Double> notas2 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
		System.out.println(notas2); 
		
		System.out.println("\nVerifica se está vazio: " + notas2.isEmpty());
	}

}

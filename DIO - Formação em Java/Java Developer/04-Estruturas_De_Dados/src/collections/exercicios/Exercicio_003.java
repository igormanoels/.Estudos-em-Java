package collections.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 	Crie uma conjunto contendo as cores do arco-íris e:
 * 	A. Exiba todas as cores uma abaixo da outra
 * 	B. A quantidade de cores que o arco-íris tem
 * 	C.Exiba as cores em ordem alfabética
 * 	D.Exiba as cores na ordem inversa da que foi informada
 * 	E.Exiba todas as cores que começam com a letra v
 * 	F.Remova todas as cores que não começam com a letra v
 * 	G.Limpe o conjunto
 * 	H.Confira se o conjunto está vazio
 */

public class Exercicio_003 
{
	public static void main(String[] args) 
	{
		Set<String> cores = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Violeta"));
		
		System.out.println("Exibindo cores uma abaixo da outra: ");
		for (String cor : cores) System.out.println(cor);
		
		
		System.out.println("\nA quantidade de cores do arco-íris é de " + cores.size());
		
		
		System.out.println("\nCores em ordem alfabética");
		Set<String> cores2 = new TreeSet<>(cores);
		for (String cor: cores2) System.out.println(cor);
		
		
		System.out.println("\nInvertendo a ordem alfabética das cores");
		List<String> coresTemp = new LinkedList<>(cores2);
		Collections.reverse(coresTemp);
		Set<String>coresInvertidas = new LinkedHashSet<>(coresTemp);
		for (String cor: coresInvertidas) System.out.println(cor);
	
		
		System.out.println("\nExbibindo cores com letra V");
		for (String cor : coresInvertidas) if(cor.startsWith("V")) System.out.println(cor);
		
		
		System.out.println("\nRemover as cores que não começam com V");
		coresInvertidas.removeIf( cor -> !cor.startsWith("V"));
		for (String cor : coresInvertidas) System.out.println(cor);
		
		
		System.out.println("\nLimpando o conjunto das cores e confirmando se o conjunto está vazio");
		cores.clear();
		System.out.println("O conjunto está vazio? " + cores.isEmpty());
		
	}
}

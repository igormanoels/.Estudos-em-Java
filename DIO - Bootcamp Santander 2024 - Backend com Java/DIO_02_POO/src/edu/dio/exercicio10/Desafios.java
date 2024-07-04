package edu.dio.exercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafios 
{	
	/* Desafio 1 - Mostre a lista na ordem numérica:
	 * Crie um programa que utilize a Stream API para ordenar a lista de números 
	 * em ordem crescente e a exiba no console.
	 */
	static void Desafio01(List<Integer> numeros)
	{
		List<Integer> numerosOrdenados = (List<Integer>) numeros.stream()
				// Organiza os valores em ordem numérica
				.sorted()
				// Cria uma lista com os valores ordenados
				.collect(Collectors.toList());
		
		JOptionPane.showMessageDialog(null, "Números ordenados: " + numerosOrdenados,
				"DESAFIO 1:", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	/* Desafio 2 - Imprima a soma dos números pares da lista:
	 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
	 */
	static void Desafio02(List<Integer> numeros)
	{
		// Variavél que recebe os valores gerados pela stream
        int res = (int) numeros.stream()
        			// Filtra os valores conforme a regra criada
		        	.filter(n -> n % 2 == 0)
		        	// Cria uma soma dos valores filtrados
		        	.reduce(0, (n1, n2) -> n1 + n2);
        			// Outra aplicação reduce(0, Integer::sum);
        
		JOptionPane.showMessageDialog(null, "A somatória dos número é " + res,
				"DESAFIO 2:", JOptionPane.INFORMATION_MESSAGE);
	}	
	
	
	/* Desafio 3 - Verifique se todos os números da lista são positivos:
	 * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
	 */
	static void Desafio03(List<Integer> numeros)
	{
		int res = (int) numeros.stream()
				.filter(n -> n % 2 != 0)
				.count(); // Conta quantas vezes os números da lista são impares 
		JOptionPane.showMessageDialog(null, "A lista contém " + res + " números impares",
				"DESAFIO 3:", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	/* Desafio 4 - Remova todos os valores ímpares:
	 * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
	 */
	static void Desafio04(List<Integer> numeros)
	{
		// para remover, é preciso criar uma nova lista
		List<Integer> listaNumerosPares = new ArrayList<Integer>(numeros); 
		listaNumerosPares.removeIf(n -> n % 2 != 0); // Remove os números da lista conforme regra
		JOptionPane.showMessageDialog(null, "Nova lista: " + listaNumerosPares, 
				"DESAFIO 4:", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/* Desafio 5 - Calcule a média dos números maiores que 5: 
	 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
	 */
	static void Desafio05(List<Integer> numeros)
	{
		List<Integer> numerosMaioresQue5 = new ArrayList<Integer>();
		
		numerosMaioresQue5 = numeros.stream() // Cria uma lista de acordo com o filtro
				.filter(n -> n > 5)
				.collect(Collectors.toList()); // agrupa os elementos filtrados
		
		int quantElementos = (int) numerosMaioresQue5.stream()
				.count(); // Conta a quantidade de elementos
		
		int somatoriaDaLista = numerosMaioresQue5.stream()
				.reduce(0, Integer::sum); // Soma todos os elementos da lista
		
		double media = somatoriaDaLista / quantElementos;
		
		JOptionPane.showMessageDialog(null, "A média dos valores maiores que 5 é --> " + media, 
				"Desafio 5: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	/* Desafio 6 - Verificar se a lista contém algum número maior que 10:
	 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
	 */
	static void Desafio06(List<Integer> numeros)
	{
		int numerosMaioresQueDez = (int) numeros.stream()
				.filter(n -> n > 10)
				.count();

		JOptionPane.showMessageDialog(null, "A quantidade de números maiores que 10 é --> " + numerosMaioresQueDez, 
				"Desafio 6: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/* Desafio 7 - Encontrar o segundo número maior da lista:
	 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
	 */
	static void Desafio07(List<Integer> numeros)
	{
		List<Integer> numerosOrdenados = new ArrayList<Integer>();
		
		numerosOrdenados = (ArrayList<Integer>) numeros.stream()
				.sorted() // Ordena a lista
				.collect(Collectors.toList()); // armazena e retorna a lista ordenada 
				
		// pega o comprimento da lista e atribui a variavel
		int quantElementos = numerosOrdenados.size();
		// pega o penultimo item da lista pelo indice
		int segundoMaiorNum = numerosOrdenados.get(quantElementos - 2); 
		
		JOptionPane.showMessageDialog(null, "O segundo maior número é o " + segundoMaiorNum, 
				"Desafio 7: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/* Desafio 8 - Somar todos os números da lista:
	 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
	 */
	static void Desafio08(List<Integer> numeros)
	{
		int somarNumeros = (int) numeros.stream()
				.reduce(0, Integer::sum);
		
		JOptionPane.showMessageDialog(null, "Total da soma dos números da lista: " + somarNumeros,
				"Desafio 8: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
	 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
	 */
	static void Desafio09(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
	 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
	 */
	static void Desafio10(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
	 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
	 */
	static void Desafio11(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 12 - Encontre o produto de todos os números da lista:
	 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
	 */
	static void Desafio12(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
	 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico 
	 * (por exemplo, entre 5 e 10) e exiba o resultado no console.
	 */
	static void Desafio13(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 14 - Encontre o maior número primo da lista:
	 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	 */
	static void Desafio14(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
	 * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
	 */
	static void Desafio15(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 16 - Agrupe os números em pares e ímpares:
	 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra 
	 * contendo os números ímpares da lista original, e exiba os resultados no console.
	 */
	static void Desafio16(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 17 - Calcule o fatorial de um número: 
	 * Crie um programa que receba um número inteiro como entrada e, utilizando a Stream API, calcule o fatorial desse 
	 * número e exiba o resultado no console.
	 */
	static void Desafio17(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 18 - Filtrar os números primos da lista:
	 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
	 */
	static void Desafio18(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 19 - Verifique se todos os números da lista são iguais:
	 * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
	 */
	static void Desafio19(List<Integer> numeros)
	{
		
	}
	
	/* Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5:
	 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
	 */
	static void Desafio20(List<Integer> numeros)
	{
		
	}	
	
}

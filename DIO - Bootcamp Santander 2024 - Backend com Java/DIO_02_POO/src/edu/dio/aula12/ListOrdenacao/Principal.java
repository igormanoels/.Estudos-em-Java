package edu.dio.aula12.ListOrdenacao;

/*
 * 	Ordenação de Pessoas
 * 	Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo 
 * 	"Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. 
 * 	Implemente os seguintes métodos:
 * 
 * 		- adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
 * 		- ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
 * 		- ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado. 
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
		
		// Cadastrando livros
		pessoa.adicionarPessoa("Diego", 21, 1.94);
		pessoa.adicionarPessoa("João", 22, 1.74);
		pessoa.adicionarPessoa("Cinderela", 14, 1.53);
		pessoa.adicionarPessoa("Chapeuzinho", 12, 1.3);
		pessoa.adicionarPessoa("Roben", 29, 1.4);
		pessoa.adicionarPessoa("Maluquinho", 48, 1.8);
		pessoa.adicionarPessoa("Pedro", 59, 2.4);
		pessoa.adicionarPessoa("Vini", 9, 1.42);
		
		// 
		System.out.println("Ordenar por idade\n"+pessoa.ordenarPorIdade()+"\n\n");

		System.out.println("Ordenado por altura\n"+pessoa.ordenarPorAltura());
	}
}

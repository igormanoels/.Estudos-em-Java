package edu.dio.aula12.List;

/*
 * A interface List é uma coleção ordenada que permite a inclusão de elementos duplicados.
 * É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são ArrayList e LinkedList.
 * A List se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.
 * A interface List fornece métodos úteis para adicionar elementos em posições específicas, remover ou 
 * substituir elementos com base no índice e obter sublistas usando índices.
 * A classe Collections fornece algoritmos úteis para manipulação de List, como ordenação (sort), 
 * embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch).
 * 
 */
import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		ListaTarefa lt = new ListaTarefa();
		String tarefa;
		
		// Verificando se a lista está vazia
		System.out.println("Número atual de Tarefas: " + lt.ObterNumeroTotalDeTarefas());
		
		System.out.print("Informe a Tarefa desejada: ");
		lt.AdcionarTarefa(tarefa = ler.nextLine());
		
		System.out.print("Informe a Tarefa desejada: ");
		lt.AdcionarTarefa(tarefa = ler.nextLine());
		
		System.out.print("Informe a Tarefa desejada: ");
		lt.AdcionarTarefa(tarefa = ler.nextLine());

		//Imprime o número de tarefas
		System.out.println("Número atual de Tarefas: " + lt.ObterNumeroTotalDeTarefas());

		lt.removerTarefa("tarefa 1");
		
		//Imprime o número de tarefas
		System.out.println("Número atual de Tarefas: " + lt.ObterNumeroTotalDeTarefas());

		// Retorna a lista
		lt.ObterDescricaoDasTarefas();

		ler.close();
	}

}

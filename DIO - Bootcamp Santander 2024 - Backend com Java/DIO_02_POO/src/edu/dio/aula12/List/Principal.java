package edu.dio.aula12.CollectionList;

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

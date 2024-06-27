package edu.dio.aula12.List;

/*
 * Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. 
 * Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. 
 * 
 * 	Implemente os seguintes métodos: 
 * 	adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
 * 	removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
 * 	obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
 * 	obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 */

public class Tarefa 
{
	private String descricao;
	
	public Tarefa(String descricaoRecebido) 
	{
		this.descricao = descricaoRecebido;
	}
	
	public String getDescricao()
	{
		return descricao;
	}
	
	public String toString()
	{
		return "Tarefa: " + descricao + "\n";
	}

}

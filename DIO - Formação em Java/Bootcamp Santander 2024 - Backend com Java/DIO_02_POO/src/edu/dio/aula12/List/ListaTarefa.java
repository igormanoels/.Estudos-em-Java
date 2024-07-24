package edu.dio.aula12.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa 
{
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() 
	{
		this.tarefaList = new ArrayList<>();
	}
	
	public void AdcionarTarefa(String descricao) 
	{
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao)
	{
		// Cria um segunda lista com todas as tarefas que serão removidas
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		// Laço de iteração que percorre a lista de tarefas da classe
		for (Tarefa t : tarefaList) 
		{
			// Verifica quais tarefas são iguais a descrição enviada para remover
			if (t.getDescricao().equalsIgnoreCase(descricao)) 
			{
				// Caso seja igual, a tarefa é adicionada a lista de remoção
				tarefasParaRemover.add(t); 
			}
		}
		
		//Realiza a remoção das tarefas que estão presentes na lista de tarefas 
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int ObterNumeroTotalDeTarefas()
	{
		//Retorna o comprimento da lista
		return tarefaList.size();
	}
	
	public void ObterDescricaoDasTarefas()
	{
		System.out.println(tarefaList);
	}
}

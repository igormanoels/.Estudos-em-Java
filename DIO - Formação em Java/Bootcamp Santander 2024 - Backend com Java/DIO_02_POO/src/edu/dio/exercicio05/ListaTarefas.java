package edu.dio.exercicio05;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ListaTarefas 
{
	private Set<Tarefa> tarefasSet;

	public ListaTarefas() 
	{
		this.tarefasSet = new HashSet<Tarefa>();
	}
	
	
	public void adicionarTarefa(String tarefa)
	{
		boolean status = true;
		tarefasSet.add(new Tarefa(tarefa, status));
	}
	
	
	public void removerTarefa(String tarefa)
	{
		// Cria um objeto vazio
		Tarefa removerTarefa = null;
		
		if (!(tarefasSet.isEmpty())) 
		{
			for (Tarefa t : tarefasSet) 
			{
				if (t.getDescricao().equalsIgnoreCase(tarefa)) 
				{
					removerTarefa = t;
					break;
				}
			}
			tarefasSet.remove(removerTarefa);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "A tarefa mensinoada não existe.", 
					"Erro ao tentar remover!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exibirTarefas()
	{
		if (!(tarefasSet.isEmpty())) 
		{
			for (Tarefa t: tarefasSet) 
			{
				if (t.getStatus() == true) 
				{
					System.out.println("Descrição: " + t.getDescricao() + " - Status: Em andamento.");
				} 
				else 
				{
					System.out.println("Descrição: " + t.getDescricao() + " - Status: Finalizada.");
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de tarefas encontra-se vazia.", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void contarTarefas()
	{
		int quant = 0;
		
		if (!(tarefasSet.isEmpty()))
		{
			for (Tarefa t: tarefasSet) 
			{
				if (t.getStatus() == true)
				{
					quant +=1;
				}
			}
			JOptionPane.showMessageDialog(null, "Existem " + quant + " pendentes.", 
					"Quantidade de tarefas:", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Não há tarefas para serem contadas.", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);

		}
		
	}
	
	public void obterTarefasConcluidas()
	{
		if (!(tarefasSet.isEmpty())) 
		{
			System.out.println("Tarefas concluídas:");
			for (Tarefa t : tarefasSet) 
			{
				if (t.getStatus() == false) 
				{
					System.out.println("Tarefa: " + t.getDescricao());
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há tarefas na lista!", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void obterTarefasPendentes()
	{
		if (!(tarefasSet.isEmpty())) 
		{
			System.out.println("Tarefas em aberto:");
			for (Tarefa t : tarefasSet) 
			{
				if (t.getStatus() == true) 
				{
					System.out.println("Tarefa: " + t.getDescricao());
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há tarefas na lista!", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void marcarTarefaConcluida(String tarefa)
	{
		if (!(tarefasSet.isEmpty())) 
		{
			for (Tarefa t : tarefasSet) 
			{
				if (t.getDescricao().equalsIgnoreCase(tarefa)) 
				{
					t.setStatus(false);
					JOptionPane.showMessageDialog(null, "Tarefa: " + tarefa + " listada como concluída.",
							"Alteração no status da tarefa", JOptionPane.INFORMATION_MESSAGE );
					break;
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há tarefas na lista!", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void marcarTarefaPendente(String tarefa)
	{
		if (!(tarefasSet.isEmpty())) 
		{
			for (Tarefa t : tarefasSet) 
			{
				if (t.getDescricao().equalsIgnoreCase(tarefa)) 
				{
					t.setStatus(true);
					JOptionPane.showMessageDialog(null, "Tarefa: " + tarefa + " listada como pendente.",
							"Alteração no status da tarefa", JOptionPane.INFORMATION_MESSAGE );
					break;
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há tarefas na lista!", 
					"Erro ao ler a lista!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void limparListaTarefas()
	{
		Set<Tarefa> limparTarefas = new HashSet<>(tarefasSet);
		
		for (Tarefa t : limparTarefas) 
		{
			if (tarefasSet.contains(t)) 
			{
				tarefasSet.remove(t);
			}
		}
		
		if (tarefasSet.isEmpty()) 
		{
			JOptionPane.showMessageDialog(null, "A lista de tarefas foi esvaziada!", 
					"Limpar lista de Tarefas:", JOptionPane.INFORMATION_MESSAGE);

		}
	}
}

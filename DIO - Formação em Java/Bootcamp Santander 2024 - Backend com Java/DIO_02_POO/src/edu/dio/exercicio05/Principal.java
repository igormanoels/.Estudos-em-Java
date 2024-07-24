package edu.dio.exercicio05;

import javax.swing.JOptionPane;

import edu.dio.exercicio04.ConjuntoPalavrasUnicas;

/*
 * 	Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo 
 * 	"Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo 
 * 	booleano para indicar se a tarefa foi concluída ou não. 
 * 
 * 	Implemente os seguintes métodos:
 * 	- adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
 * 	- removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a 
 * 	  descrição, se estiver presente.
 * 	- exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
 * 	- contarTarefas(): Conta o número total de tarefas na lista de tarefas.
 * 	- obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
 * 	- obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
 * 	- marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída 
 *    de acordo com a descrição.
 * 	- marcarTarefaPendente(String descricao): Marca uma tarefa como pendente 
 *    de acordo com a descrição.
 * 	- limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		boolean continuar = true;
		int op;
		String tarefa;
		ListaTarefas lista = new ListaTarefas();
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, 
					  "1 - Adcionar uma tarefa.\n"
					+ "2 - Remover uma tarefa.\n"
					+ "3 - Exibir todas as tarefas.\n"
					+ "4 - Exibir quantidade de tarefas.\n"
					+ "5 - Exibir tarefas concluídas.\n"
					+ "6 - Exibir tarefas pendentes.\n"
					+ "7 - Marcar tarefa como concluída.\n"
					+ "8 - Marcar tarefa como pendente.\n"
					+ "9 - Limpar todas as tarefas.\n"
					+ "0 - Finalizar.",
					"Informe a opção desejada:", JOptionPane.INFORMATION_MESSAGE ));
			
			switch (op) 
			{
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", 
						"Programa encerrado!", JOptionPane.INFORMATION_MESSAGE);
				continuar = false;
				break;
			case 1:
				tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa desejada: ", 
						"Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
				lista.adicionarTarefa(tarefa);
				break;
			case 2:
				tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa que desejada: ", 
						"Remover tarefas", JOptionPane.INFORMATION_MESSAGE);
				lista.removerTarefa(tarefa);
				break;
			case 3:
				lista.exibirTarefas();
				break;
			case 4:
				lista.contarTarefas();
				break;
			case 5:
				lista.obterTarefasConcluidas();
				break;
			case 6:
				lista.obterTarefasPendentes();
				break;
			case 7:
				tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa que desejada: ", 
						"Marcar tarefa como concluída", JOptionPane.INFORMATION_MESSAGE);
				lista.marcarTarefaConcluida(tarefa);
				break;
			case 8:
				tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa que desejada: ", 
						"Marcar tarefa como pendente", JOptionPane.INFORMATION_MESSAGE);
				lista.marcarTarefaPendente(tarefa);
				break;
			case 9:
				lista.limparListaTarefas();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Favor informar uma opção do menu!", 
						"Entrada inválida.", JOptionPane.CANCEL_OPTION);
				break;
			}
		}
	}
}

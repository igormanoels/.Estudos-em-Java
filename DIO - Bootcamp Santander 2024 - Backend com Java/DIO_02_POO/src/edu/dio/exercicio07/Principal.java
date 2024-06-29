package edu.dio.exercicio07;

import javax.swing.JOptionPane;

/*
 *	Dicionário
 *	Crie uma classe chamada "Dicionario" que utilize um Map para armazenar 
 *	palavras e suas respectivas definições. 
 *
 *	Implemente os seguintes métodos:
 *	- adicionarPalavra(String palavra, String definicao): 
 *	Adiciona uma palavra e sua definição ao dicionário, associando a palavra 
 *	à sua definição correspondente.
 *	- removerPalavra(String palavra): Remove uma palavra do dicionário, dado 
 *	o termo a ser removido.
 *	- exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, 
 *	mostrando cada palavra seguida de sua respectiva definição.
 *	- pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e 
 *	retorna sua definição correspondente.
 */

public class Principal 
{
	public static void main(String[] args) 
	{
		int op;
		String palavra = null, definicao = null;
		boolean continuar = true;
		
		// Definindo os parametros pq o construtor da classe pede
		Dicionario d = new Dicionario(palavra, definicao);
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, 
					  "0- Finalizar.\n"
					+ "1- Adicionar Palavra.\n"
					+ "2- Remover Palavras.\n"
					+ "3- Mostrar Dicionário.\n"
					+ "4- Pesquisar Palavras.\n"
					+ "Digite a opção desejada: ",
					"MENU", JOptionPane.QUESTION_MESSAGE));
			
			switch (op) 
			{
				case 0:
					JOptionPane.showMessageDialog(null,"Obrigado por testar meu algoritmo!");
					continuar = false;
					break;
				case 1:
					palavra = JOptionPane.showInputDialog(null,"Informe a palavra: ", 
							"ADICIONAR PALAVRA", JOptionPane.INFORMATION_MESSAGE );
					definicao = JOptionPane.showInputDialog(null,"Informe agora sua definição: ", 
							"ADICIONAR DEFINIÇÃO DA PALAVRA", JOptionPane.INFORMATION_MESSAGE );
					d.adicionarPalavra(palavra, definicao);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog(null,"Informe a palavra que deseja remover: ", 
							"REMOVER PALAVRA", JOptionPane.INFORMATION_MESSAGE );
					d.removerPalavra(palavra);
					break;
				case 3:
					d.exibirPalavras();
					break;
				case 4:
					palavra = JOptionPane.showInputDialog(null,"Informe a palavra que deseja remover: ", 
							"PESQUISA DE PALAVRAS", JOptionPane.INFORMATION_MESSAGE );
					d.pesquisarPorPalavra(palavra);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Digite uma opção conforme o menu apresentado",
							"OPÇÃO INVÁLIDA!", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
	}
}

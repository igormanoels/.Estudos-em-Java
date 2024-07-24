package edu.dio.exercicio08;

import javax.swing.JOptionPane;

/*
 * Contagem de Palavras
 * 
 * Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar 
 * as palavras e a quantidade de vezes que cada palavra aparece em um texto. 
 * 
 * Implemente os seguintes métodos:
 *  - adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
 *  - removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
 *  - exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
 *  - encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna 
 *  a palavra e sua contagem.
 */
public class Principal 
{
	public static void main(String[]args) 
	{
		int op;
		String palavra = null;
		Integer contagem = null;
		boolean continuar = true;
		
		ContagemPalavras contar = new ContagemPalavras(palavra, contagem);
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, 
					  "0- Finalizar.\n"
					+ "1- Adicionar Palavra.\n"
					+ "2- Remover Palavras.\n"
					+ "3- Mostrar Dicionário.\n"
					+ "4- Verificar qual a palavra mais frequente.\n"
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
							"ADICIONAR PALAVRA: ", JOptionPane.INFORMATION_MESSAGE );
					contar.adicionarPalavra(palavra);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog(null,"Informe a palavra que deseja remover: ", 
							"REMOVER PALAVRA: ", JOptionPane.INFORMATION_MESSAGE );
					contar.removerPalavra(palavra);
					break;
				case 3:
					contar.exibirPalavras();
					break;
				case 4:
					contar.encontrarPalavraMaisFrequente();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Digite uma opção conforme o menu apresentado",
							"OPÇÃO INVÁLIDA!", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
	}
}

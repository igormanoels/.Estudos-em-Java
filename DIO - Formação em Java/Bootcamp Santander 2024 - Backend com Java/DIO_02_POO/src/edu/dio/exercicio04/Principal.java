package edu.dio.exercicio04;

import javax.swing.JOptionPane;

/*
 * 2. Conjunto de Palavras Únicas
 * 
 * Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto 
 * de palavras únicas como atributo. Implemente os seguintes métodos:
 * 
 * adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
 * removerPalavra(String palavra): Remove uma palavra do conjunto.
 * verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
 * exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		boolean continuar = true;
		int op;
		String palavra;
		ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, 
					  "1 - Adcionar uma palavra.\n"
					+ "2 - Remover uma palavra.\n"
					+ "3 - Localizar uma palavra.\n"
					+ "4 - Mostrar Palavras.\n"
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
				palavra = JOptionPane.showInputDialog(null, "Digite a palavra desejada: ", 
						"Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
				cpu.adicionarPalavra(palavra);
				break;
			case 2:
				palavra = JOptionPane.showInputDialog(null, "Digite a palavra desejada: ", 
						"Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
				cpu.removerPalavra(palavra);
				break;
			case 3:
				palavra = JOptionPane.showInputDialog(null, "Digite a palavra desejada: ", 
						"Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
				cpu.verificarPalavra(palavra);
				break;
			case 4:
				cpu.exibirPalavrasUnicas();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Favor informar uma opção do menu!", 
						"Entrada inválida.", JOptionPane.CANCEL_OPTION);
				break;
			}
		}
	}
}

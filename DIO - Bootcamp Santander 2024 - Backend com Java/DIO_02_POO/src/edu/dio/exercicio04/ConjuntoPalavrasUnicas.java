package edu.dio.exercicio04;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ConjuntoPalavrasUnicas 
{
	private Set<Palavra> palavraSet;
	
	// Construtor da classe
	public ConjuntoPalavrasUnicas() 
	{
		this.palavraSet = new HashSet<Palavra>();
	}
	
	// Método que adciona palavras a lista
	public void adicionarPalavra(String p)
	{
		palavraSet.add(new Palavra(p));
	}
	
	// Método para remover palavra
	public void removerPalavra(String p)
	{
		// cria um objeto sem valor
		Palavra removerPalavra = null;
		
		if (!palavraSet.isEmpty()) 
		{
			for (Palavra palavra : palavraSet) 
			{
				if (palavra.getPalavra().equalsIgnoreCase(p)) 
				{
					// Atribui ao objeto o valor de palavra caso igual
					removerPalavra = palavra;
					break;
				}
			}
			// Remove da lista de palavras caso a palavra seja igual
			palavraSet.remove(removerPalavra);
			exibirPalavrasUnicas();
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há palavras para serem removidas", 
					"Atenção!, ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// Método para verificar se palavra informada pertence ao conjunto de palavras
	public void verificarPalavra(String p)
	{
		if (!palavraSet.isEmpty()) 
		{
			for (Palavra palavra : palavraSet) 
			{
				if (palavra.getPalavra().equalsIgnoreCase(p)) 
				{
					JOptionPane.showMessageDialog(null, "A palavra " + palavra + " foi localizada!",
							"Atenção", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Não há palavras para serem procuradas", 
					"Atenção!, ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// Método para exibir as palavras
	public void exibirPalavrasUnicas() 
	{
		for (Palavra palavra : palavraSet) 
		{
			System.out.println(palavra);
		}
		System.out.println("");
		
	}
	
}

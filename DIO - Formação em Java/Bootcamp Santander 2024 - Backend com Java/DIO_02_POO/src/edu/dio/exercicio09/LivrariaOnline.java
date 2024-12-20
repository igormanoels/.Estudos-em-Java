package edu.dio.exercicio09;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class LivrariaOnline 
{
	private Map<String, Livro> livrariaMap;
	
	// Construtor da classe
	public LivrariaOnline() 
	{
		this.livrariaMap = new HashMap<>();
	}

	public void adicionarPalavra(String link, String titulo, String autor, double preco ) 
	{
		livrariaMap.put(link, new Livro(titulo, autor, preco));
	}
	
	public void removerLivro(String titulo) {
		if (!livrariaMap.isEmpty()) {
			String chaveParaRemover = null;
	
			// Procurar a chave do livro com base no título
			for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
				if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
					chaveParaRemover = entry.getKey();
					break;
				}
			}
	
			// Verificar se encontrou o livro para remover
			if (chaveParaRemover != null) {
				livrariaMap.remove(chaveParaRemover); // Remover pelo identificador
				JOptionPane.showMessageDialog(null, "O livro '" + titulo + "' foi removido.",
						"REMOVER LIVRO", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "O livro '" + titulo + "' não está presente na livraria.",
						"REMOVER LIVRO", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "A livraria está vazia.",
					"REMOVER LIVRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void exibirLivrosOrdenadosPorPreco()
	{
		for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) 
		{
			System.out.println(entry.getValue().getTitulo() + ", Preço: " + entry.getValue().getPreco());
		}
	}
	
	public void pesquisarLivrosPorAutor(String autor)
	{
		if (!(livrariaMap.isEmpty()))
		{
			for(Livro l : livrariaMap.values())
			{
				if (l.getAutor().equalsIgnoreCase(autor)) 
				{
					JOptionPane.showMessageDialog(null,"Livro encontrato: " + l.getTitulo() + ", Preço: " + l.getPreco(),
							"PESQUISAR LIVRO POR AUTOR: ", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O autor " + autor + ", não tem livros na livraria",
					"PESQUISAR LIVRO POR AUTOR: ", JOptionPane.ERROR_MESSAGE);
		}	
	}
	
	public void obterLivroMaisCaro()
	{
		if (!(livrariaMap.isEmpty())) 
		{
			Livro livroMaisCaro = null; 
			double maiorPreco = Double.MIN_VALUE;
			
			for (Livro l : livrariaMap.values())
			{
				if (l.getPreco() > maiorPreco) 
				{
					livroMaisCaro = l;
				}
			}
			JOptionPane.showMessageDialog(null,"O livro mais caro é " + livroMaisCaro.getTitulo() + ", Preço: " + livroMaisCaro.getPreco(),
					"PESQUISAR PELO LIVRO MAIS CARO: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista da livraria está vazia!",
					"PESQUISAR PELO LIVRO MAIS CARO:", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exibirLivroMaisBarato()
	{
		if (!(livrariaMap.isEmpty())) 
		{
			Livro livroMaisBarato = null; 
			double menorPreco = Double.MAX_VALUE;
			
			for (Livro l : livrariaMap.values())
			{
				if (l.getPreco() > menorPreco) 
				{
					livroMaisBarato = l;
				}
			}
			JOptionPane.showMessageDialog(null,"O livro mais barato é " + livroMaisBarato.getTitulo() + ", Preço: " + livroMaisBarato.getPreco(),
					"PESQUISAR PELO LIVRO MAIS BARATO: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista da livraria está vazia!",
					"PESQUISAR PELO LIVRO MAIS BARATO:", JOptionPane.ERROR_MESSAGE);
		}
	}
}

	
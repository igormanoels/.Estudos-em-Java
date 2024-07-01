package edu.dio.aula12.ListPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro 
{
	// Atributo da classe
	private List<Livro> livrosList;
	
	public CatalogoLivro() 
	{
		// Faz com que o ArrayList seja vazio
		this.livrosList = new ArrayList<>();
	}
	
	
	public void adcionarLivro(String titulo, String autor, int ano) 
	{
		// Adiciona ao Array um novo Livro, seguindo os atributos da classe Livro
		livrosList.add(new Livro(titulo, autor, ano));
	}
	
	
	public List<Livro> pesquisarPorAutor(String autor)
	{
		// Cria um novo arraylist vazio que recebera os livros dentro do intervalo
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		// Verifica se a lista contem elementos, caso contrário o método não é iniciado
		if (!livrosList.isEmpty()) 
		{
			for (Livro livro : livrosList) 
			{
				if (livro.getAutor().equalsIgnoreCase(autor)) 
				{
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	
	public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal)
	{
		// Cria um novo arraylist vazio que recebera os livros dentro do intervalo
		List<Livro> livrosNoIntervalo = new ArrayList<>();
		
		// Verifica se a lista contem elementos, caso contrário o método não é iniciado
		if (!livrosList.isEmpty()) 
		{
			for (Livro livro : livrosList) 
			{
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) 
				{
					livrosNoIntervalo.add(livro);
				}
			}
		}
		return livrosNoIntervalo;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo)
	{
		// Cria um Objeto para que vai receber os dados do ArrayList
		Livro livroPorTitulo = null;
		
		if (!livrosList.isEmpty()) 
		{
			for (Livro livro : livrosList) 
			{
				if (livro.getTitulo().equalsIgnoreCase(titulo)) 
				{
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
}

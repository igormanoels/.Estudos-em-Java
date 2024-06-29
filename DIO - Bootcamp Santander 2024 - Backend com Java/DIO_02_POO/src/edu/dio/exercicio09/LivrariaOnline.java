package edu.dio.exercicio09;

import java.util.HashMap;
import java.util.Map;

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
	
	
	
}

	
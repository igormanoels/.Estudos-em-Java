package edu.dio.exercicio07;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Dicionario 
{
	Map<String, String> dicionario;
	
	public Dicionario(String palavra, String definicao) 
	{
		this.dicionario = new HashMap<>();
	}
	
	
	public void adicionarPalavra(String palavra, String definicao)
	{
		dicionario.put(palavra, definicao);
	}
	
	
	public void removerPalavra(String palavra)
	{
		if (!(dicionario.isEmpty())) 
		{
			dicionario.remove(palavra);
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " foi removida!",
					"REMOVER PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não foi localizada!",
					"REMOVER PALAVRA: ", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void exibirPalavras()
	{
		System.out.println(dicionario);
	}
	
	
	public void pesquisarPorPalavra(String palavra)
	{
		if (!(dicionario.isEmpty())) 
		{
			if (dicionario.get(palavra) != null) 
			{
				JOptionPane.showMessageDialog(null,"A palavra " + palavra + " significa: " + dicionario.get(palavra),
							"PESQUISAR POR PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "A palavra: " + palavra + " não foi localizada.",
						"PESQUISAR POR PALAVRA: ERRO!", JOptionPane.ERROR_MESSAGE);	
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Seu dicionário está vazio",
					"PESQUISAR POR PALAVRA: ERRO!", JOptionPane.ERROR_MESSAGE);
		}
	}
}

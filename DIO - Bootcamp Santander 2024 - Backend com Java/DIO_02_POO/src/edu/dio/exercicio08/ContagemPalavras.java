package edu.dio.exercicio08;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class ContagemPalavras 
{
	private Map<String, Integer> contarPalavras;
	private Entry<String, Integer> palavraMaisFrequente;
	
	public ContagemPalavras(String palavra, Integer contagem) 
	{
		this.contarPalavras = new HashMap<>();
	}
	
	
	public void adicionarPalavra(String palavra)
	{
		// Verifica que a palavra já existe, se sim soma 1, senão informa add1
		if (contarPalavras.get(palavra) != null) 
		{
			int quant = (int) contarPalavras.get(palavra); 
			quant += 1;
			contarPalavras.put(palavra, quant);
			JOptionPane.showMessageDialog(null,"A palavra " + palavra + " foi adicionada, a quantidade agora é de " + quant + "x!",
					"ADICIONAR PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			contarPalavras.put(palavra, 1);
			JOptionPane.showMessageDialog(null,"A palavra " + palavra + " foi adicionada!",
					"ADICIONAR PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}


	public void removerPalavra(String palavra) 
	{
		if (contarPalavras.get(palavra) != null) 
		{
			int quant = (int) contarPalavras.get(palavra); 
			
			if (quant == 1) 
			{
				contarPalavras.remove(palavra);
				JOptionPane.showMessageDialog(null,"A palavra " + palavra + " foi removida!",
						"REMOVER PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);

			} 
			else 
			{
				quant -= 1;
				contarPalavras.put(palavra, quant);
				JOptionPane.showMessageDialog(null,"Uma das palavras " + palavra + " foi removida, agora restam " + quant + "x!",
						"REMOVER PALAVRA: ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else 
		{
			contarPalavras.put(palavra, 1);
			JOptionPane.showMessageDialog(null,"A palavra não está presente no dicionário!",
					"REMOVER PALAVRA: ", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exibirPalavras()
	{
		System.out.println(contarPalavras);
	}
	
	public void encontrarPalavraMaisFrequente()
	{
		palavraMaisFrequente = null;
		int frequencia = Integer.MIN_VALUE;
		
		for (var e: contarPalavras.entrySet()) 
		{
			if (e.getValue() > frequencia) 
			{
				frequencia = e.getValue();
				palavraMaisFrequente = e;
			}
		}
		JOptionPane.showMessageDialog(null,"Palavra mais frequente: " + palavraMaisFrequente.getKey() + ", quantidade: " + frequencia);
	}
	
	
}

package edu.dio.aula16.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos 
{
	private Map<String, Integer> agendaMap;
	
	public AgendaContatos() 
	{
		this.agendaMap = new HashMap<>();
	}
	
	public void adcionarContato(String nome, Integer telefone)
	{
		// Tanto insere quando atualizada os dados conforme a chave
		agendaMap.put(nome, telefone);
	}
	
	public void removerContato(String nome)
	{
		if (!(agendaMap.isEmpty())) 
		{
			agendaMap.remove(nome);		}
	}
	
	public void exibirContatos()
	{
		System.out.println(agendaMap);
	}
	
	public Integer pesquisarPorNome(String nome)
	{
		Integer numero = null;
		if (!(agendaMap.isEmpty())) 
		{
			numero = agendaMap.get(nome);
		}
		
		return numero;
	}
	
	
}

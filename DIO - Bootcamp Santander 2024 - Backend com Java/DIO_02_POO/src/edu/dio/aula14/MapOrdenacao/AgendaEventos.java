package edu.dio.aula16.MapOrdenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos 
{
	private Map<LocalDate, Eventos> eventosMap;

	public AgendaEventos() 
	{
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao)
	{
		eventosMap.put(data, new Eventos(nome, atracao));
	}
	
	public void exibirAgenda() 
	{
		// Organiza os dados em ordem de acordo com sua chave
		Map<LocalDate, Eventos> eventosOrdenados = new TreeMap<>(eventosMap); 
		System.out.println(eventosOrdenados);
	}
	
	public void obterProximoEvento()
	{
		/* Retorna todas as datas
		Set<LocalDate> listaDatas = eventosMap.keySet(); 
		   Retorna todos os valores
		Collection<Eventos> valores = eventosMap.values();
		*/
		
		// Coleta a Data atual do Sistema
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Eventos> eventosOrdenados = new TreeMap<>(eventosMap); 
		
		for(Map.Entry<LocalDate, Eventos> e: eventosOrdenados.entrySet())
		{
			if (e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual)) 
			{
				System.out.println("Evento: " + e.getValue() + " - Data: " + e.getKey());
				break;
			}
		}
		
	
	}
	
	
	
}

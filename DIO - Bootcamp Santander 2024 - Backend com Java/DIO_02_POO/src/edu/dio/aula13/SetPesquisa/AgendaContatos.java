package edu.dio.aula13.SetPesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos 
{
	Set<Contatos> contatosSet;
	
	public AgendaContatos() 
	{
		this.contatosSet = new HashSet<>();	
	}
	
	public void adcionarContatos(String nome, int num) 
	{
		contatosSet.add(new Contatos(nome, num));
	}
	
	public void exibirContato() 
	{
		System.out.println(contatosSet);
	}
	
	
	// Método que retorna a lista de acordo com a busca
	public Set<Contatos> pesquisarPorNome(String nome)
	{
		Set<Contatos> contatosPorNome = new HashSet<>();
		for (Contatos contato : contatosSet) 
		{
			// startsWith busca todos os conteúdos que começam com aquela palavra
			if (contato.getNome().startsWith(nome)) 
			{
				contatosPorNome.add(contato);
			}
		}
		return contatosPorNome;
	}
	
	// Método que retorna o objeto da lista
	public Contatos atualizarContato(String nome, int novoNum) 
	{
		Contatos contatoAtualizado = null;
		for (Contatos contato : contatosSet) 
		{
			if (contato.getNome().equalsIgnoreCase(nome)) 
			{
				contato.setNumero(novoNum);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}
}

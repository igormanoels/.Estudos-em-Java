package edu.dio.aula14.Map;

/*
 * 	1. Agenda de Contatos
 * 	Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. 
 * 	Cada contato possui um nome como chave e um número de telefone como valor. 
 * 
 * 	Implemente os seguintes métodos:
 * 	- adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
 * 	- removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
 * 	- exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
 * 	- pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
 * 
 */

public class Principal {

	/*
	 * A interface Map é usada para mapear dados na forma de chaves e valores.
	 * O Map do Java é um objeto que mapeia chaves para valores.
	 * Um Map não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
	 * A plataforma Java possui três implementações gerais de Map: HashMap, TreeMap e LinkedHashMap.
	 * As operações básicas do Map são: put (inserir ou atualizar), get (obter), containsKey (verificar se contém uma chave), 
	 * containsValue (verificar se contém um valor), size (obter o tamanho) e isEmpty (verificar se está vazio).
	 * 
	 */
	
	public static void main(String[] args) 
	{
		AgendaContatos agenda = new AgendaContatos();
		agenda.adcionarContato("Igor Manoel", 11985456);
		
		agenda.exibirContatos();
		
		System.out.println(agenda.pesquisarPorNome("Igor Manoel"));
		
		//Não deve remover, porque o nome precisa ser exato
		agenda.removerContato("Igor");
		
		agenda.exibirContatos();
	}
	
	
	
	
}

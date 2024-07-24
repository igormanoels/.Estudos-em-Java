package edu.dio.aula13.SetOrdenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos 
{
	private Set<Produto> produtoSet;
	
	public CadastroProdutos() 
	{
		this.produtoSet = new HashSet<Produto>();
	}
	
	public void adicionarProduto(String nome, int cod, double preco, int quantidade)
	{
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	// Classe para ordenação dos objetos
	public Set<Produto> exibirProdutosPorNome()
	{
		// O TreeSet ordena os objetos, diferente do HashSet que nem aceita ordenação
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto>exibirProdutosPorPreco()
	{
		// Chama o metodo comparator para realizara ordenação conforme a regra de negócio
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
}

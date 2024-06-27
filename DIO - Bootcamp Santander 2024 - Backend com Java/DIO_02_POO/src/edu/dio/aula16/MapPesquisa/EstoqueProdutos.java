package edu.dio.aula16.MapPesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos 
{
	private Map<Long, Produto> estoqueMap;
	
	
	public EstoqueProdutos() {
		this.estoqueMap = new HashMap<>(); 
	}
	
	
	public void adicionarProduto(long cod, String nome, double preco, int quant)
	{
		estoqueMap.put(cod, new Produto(nome, preco, quant));
	}
	
	public void exibirProdutos()
	{
		System.out.println(estoqueMap);
	}
	
	public double calcularValorTotalEstoque()
	{
		double estoqueTotal = 0;
		
		if (!(estoqueMap.isEmpty())) 
		{
			for (Produto p : estoqueMap.values()) 
			{
				estoqueTotal += p.getPreco() * p.getQuantidade();
			}
		}
		return estoqueTotal;
	}
	
	public Produto obterProdutoMaisCaro()
	{
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		for(Produto p: estoqueMap.values())
		{
			if (p.getPreco() > maiorPreco) 
			{
				maiorPreco = p.getPreco();
				produtoMaisCaro = p;
			} 
		}
		return produtoMaisCaro;
	}
	
	public Produto obteProdutoMaisBarato()
	{
		Produto produtoMaisbarato = null;
		double maiorPreco = Double.MAX_VALUE;
		
		for(Produto p: estoqueMap.values())
		{
			if (p.getPreco() < maiorPreco) 
			{
				maiorPreco = p.getPreco();
				produtoMaisbarato = p;
			} 
		}
		return produtoMaisbarato;
	}
	
	
}

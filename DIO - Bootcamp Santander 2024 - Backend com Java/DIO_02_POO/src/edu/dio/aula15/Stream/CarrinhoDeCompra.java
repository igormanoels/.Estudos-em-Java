package edu.dio.aula15.Stream;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class CarrinhoDeCompra 
{
	private Set<Lista> carrinhoSet;
	
	public CarrinhoDeCompra() {
		this.carrinhoSet = new HashSet<>();
	}
	
	public void adicionarItem(String nome, double preco, int quant) 
	{
		carrinhoSet.add(new Lista(nome, preco, quant));
	}
	
	
	public double calcularValorTotal() 
	{
		double valorTotal = 0d;
		
		// Lança uma exceção caso a lista esteja vazio
		if(carrinhoSet.isEmpty())
		{
			throw new RuntimeException("A lista está vazia");
		}
		// Retorna da lista, a multiplicação de todos os preços pelas quantidades. E depois soma os valores.
		return carrinhoSet.stream()
				.mapToDouble(Lista -> Lista.getPreco() * Lista.getQuant())
				.sum();
	}
	
	public static void main(String[] args) 
	{
		// Adcionar itens 
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		carrinho.adicionarItem("Garrafa", 2.45 , 8);
		carrinho.adicionarItem("Monitor", 455.5 , 3);
		carrinho.adicionarItem("Teclado", 134.22 , 3);
		carrinho.adicionarItem("Mouse", 28.53 , 3);
		carrinho.adicionarItem("Pilha", 5.99 , 12);
		
		// Imprime a soma dos valore
		System.out.println("Total do carrinho: R$ " + carrinho.calcularValorTotal());
	}
}

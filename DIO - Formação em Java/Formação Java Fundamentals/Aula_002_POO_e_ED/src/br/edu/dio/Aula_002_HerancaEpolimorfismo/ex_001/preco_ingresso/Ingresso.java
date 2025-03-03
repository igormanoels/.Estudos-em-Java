package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001.preco_ingresso;

public sealed abstract class Ingresso permits MeiaEntrada, FamiliaEntrada, Entrada{
	
	private final double preco = 34.99;
	
	abstract double calcularPreco(int qtd);
	
	public double getPreco() {
		return preco;
	}
}

package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001.preco_ingresso;

public non-sealed class Entrada extends Ingresso{

	@Override
	public double calcularPreco(int qtd) {
		return super.getPreco() * qtd;
	}

}

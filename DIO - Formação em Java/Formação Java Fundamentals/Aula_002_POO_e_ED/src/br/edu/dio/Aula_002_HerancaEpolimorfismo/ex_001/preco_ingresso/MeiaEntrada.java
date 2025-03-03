package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001.preco_ingresso;

public non-sealed class MeiaEntrada extends Ingresso{

	@Override
	public double calcularPreco(int qtd) {
		return (qtd * (super.getPreco() * 0.5));
	}

}

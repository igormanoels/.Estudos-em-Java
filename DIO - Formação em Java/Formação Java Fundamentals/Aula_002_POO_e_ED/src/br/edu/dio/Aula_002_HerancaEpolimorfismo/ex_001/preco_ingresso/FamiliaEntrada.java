package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001.preco_ingresso;

public non-sealed class FamiliaEntrada extends Ingresso{

	@Override
	public double calcularPreco(int qtd) {
		
		if (qtd >= 3) {
			return ((super.getPreco() * 0.95) * qtd);
		} else {
			return super.getPreco() * qtd;
		}
	}

}

package br.edu.dio.Aula_002_HerancaEpolimorfismo;

// Ao definir a classe como final, ela deixa de poder ser extendida, porque passa a ser a última da hierarquia
// A sub classe de uma 'sealed' (selada), precisa ter como propriedade 'final' ou 'non-sealed'
public non-sealed class Vendedor extends Empregado{
	
	public Double bonusVendas;
	
	public Double getBonusVendas() {
		return bonusVendas;
	}
	
	public void setBonusVendas(Double bonusVendas) {
		this.bonusVendas = bonusVendas;
	}
}

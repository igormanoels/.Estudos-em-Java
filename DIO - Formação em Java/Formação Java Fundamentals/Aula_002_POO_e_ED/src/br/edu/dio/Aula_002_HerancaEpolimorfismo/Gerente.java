package br.edu.dio.Aula_002_HerancaEpolimorfismo;

//Ao definir a classe como final, ela deixa de poder ser extendida, porque passa a ser a última da hierarquia
//A sub classe de uma 'sealed' (selada), precisa ter como propriedade 'final' ou 'non-sealed'
//A classe record não pode externder outra classe
public final class Gerente extends Empregado{
	private String login;
	private String senha;
	private String comissao;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getComissao() {
		return comissao;
	}
	public void setComissao(String comissao) {
		this.comissao = comissao;
	}

	

}

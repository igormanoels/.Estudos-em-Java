package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_002.organizacao;

public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente{
	
	private String nome;
	private String email;
	private String senha;
	private boolean adm;
	
	public abstract void login();
	
	public abstract void logoff();
	
	public abstract void alterarDados();
	
	public abstract void alterarSenha(String sn);
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isAdm() {
		return adm;
	}
	
	public void setAdm(boolean adm) {
		this.adm = adm;
	}
	
	
}

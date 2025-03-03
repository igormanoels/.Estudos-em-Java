package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_002.organizacao;

public final class Vendedor extends Funcionario {
	
	private double qtdVendas;
	
	public Vendedor() {
		super.setAdm(false);
	}
	@Override
	public void login() {
		System.out.println("Login realizado");
	}

	@Override
	public void logoff() {
		System.out.println(getClass().getSimpleName() + " está se desconectando...");
	}

	@Override
	public void alterarDados() {
		System.out.println("Dados alterados");
	}

	@Override
	public void alterarSenha(String sn) {
		super.setSenha(sn);
		System.out.println("Senha alterada com sucesso.");
	}
	
	public double consultarVendas() {
		return qtdVendas;
	}
	
	public void adcVenda() {
		this.qtdVendas++;
	}
}

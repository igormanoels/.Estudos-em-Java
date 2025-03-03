package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_002.organizacao;

public final class Atendente extends Funcionario {

	private double saldoCaixa;
	
	public Atendente() {
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
	
	public void entradaCaixa(double valorVenda, Vendedor v) {
		this.saldoCaixa += valorVenda;
		v.adcVenda();
	}
	
	public void fecharCaixa() {
		System.out.printf("Saldo final do caixa R$ %.2f \n\n", this.saldoCaixa);
	}
	
	

}

package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_002.organizacao;

public final class Gerente extends Funcionario {

	public Gerente() {
		super.setAdm(true);
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
	
	public void gerarRelatorio() {
		System.out.println("Relatório financeiro gerado.");
	}
	
	public void consultarVendas(Vendedor v) {
		System.out.println("Total de vendas: " + v.consultarVendas() + "\n");
	}
	
	
	
}

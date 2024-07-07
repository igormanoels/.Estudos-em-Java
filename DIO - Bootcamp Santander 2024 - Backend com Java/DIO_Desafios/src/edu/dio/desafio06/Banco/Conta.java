package edu.dio.desafio06.Banco;

/*
 * Tornar a conta abstrata, faz com que outras classes não possam instanciar a classe Conta
 * isso deve ser feito, porque ao manusear o valores em uma transação, a conta a ser instanciada 
 * deva ser as classes ContaCorrente e ContaPoupanca
 */
public abstract class Conta extends Banco
{
	// PARA ESSE EXERCÍCIO A AGENCIA É ÚNICA, MAS PODERIA SER UM ENUM COM UMA LISTA COM TODAS AS FILIAIS DA EMPRESA
	private final static int AGENCIA_PADRAO = 1234; 
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() 
	{
		// Super é a forma de chamar pelos filhos os atributos da classe mãe
		this.numero = SEQUENCIAL++;
		this.agencia = super.agencia;
		
	}
	
		
	public void sacar(double valor) 
	{
		saldo -= valor;
	}
	
	public void depositar(double valor) 
	{
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); // INDICA UMA MOVIMENTAÇÃO DE SAQUE PARA ESSA CONTA
		contaDestino.depositar(valor); // INDICA UMA MOVIMENTAÇÃO DE DEPÓSITO PARA OUTRA CONTA
	}
	
	public abstract void extrato(); // MÉTODO ABSTRATO PORQUE CADA TIPO CONTA POSSUI UMA FORMA DE IMPRIMIR SUAS MOVIMENTAÇÕES
	
	// Getters and Setters
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
}

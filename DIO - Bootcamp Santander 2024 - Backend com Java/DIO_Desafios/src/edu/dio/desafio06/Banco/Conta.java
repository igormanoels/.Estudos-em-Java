package edu.dio.desafio06.Banco;

public abstract class Conta extends Banco
{
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, double valor) 
	{
		this.agencia = super.agencia;
		this.numero = SEQUENCIAL++;
		this.saldo = valor;
		this.cliente = cliente;
		cliente.setConta(this);
	}
	
	
	// MÉTODO PARA REALIZAR SAQUE
	public void sacar(double valor) 
	{
		saldo -= valor;
	}
	
	
	// MÉTODO PARA REALIZAR DEPÓSITOS
	public void depositar(double valor) 
	{
		saldo += valor;
	}
	
	
	// MÉTODO PARA REALIZAR TRANSFERÊNCIA
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); // INDICA UMA MOVIMENTAÇÃO DE SAQUE PARA ESSA CONTA
		contaDestino.depositar(valor); // INDICA UMA MOVIMENTAÇÃO DE DEPÓSITO PARA OUTRA CONTA
	}
	
	
	// MÉTODO ABSTRATO PORQUE CADA TIPO CONTA POSSUI UMA FORMA DE IMPRIMIR SUAS MOVIMENTAÇÕES
	public abstract void extrato(); 	
	
	
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

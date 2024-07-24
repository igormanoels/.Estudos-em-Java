package edu.dio.desafio06.Banco;

import javax.swing.JOptionPane;

public abstract class Conta extends Banco
{
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	// MÉTODOS CONSTRUTORES DA CLASSE 
	public Conta(Cliente cliente, double valor) 
	{
		this.agencia = super.agencia;
		this.numero = SEQUENCIAL++;
		this.saldo = valor; // CHAMA A VARIÁVEL PELA CLASSE POR SER STATIC
		this.cliente = cliente;
		cliente.setConta(this);
	}
	
	public Conta() {} // CONSTRUTOR SEM PARAMETRO
	
	
	// MÉTODO PARA REALIZAR DEPÓSITOS
	public void depositarPoupanca(String documento, double valor) 
	{
		if (!(super.clientesPF.isEmpty())) 
		{
			for (PessoaFisica pf : clientesPF) 
			{
				if (pf.getDocumento().equalsIgnoreCase(documento)) 
				{
					saldo += valor;
					ContaPoupanca pp = new ContaPoupanca();
					pp.extrato(documento);
					break;
				}
				
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia.",
					"OPERAÇÃO DE DEPÓSITO:", JOptionPane.ERROR_MESSAGE);
		}	

		
	}
	
	public void depositarCorrente(String documento, double valor) 
	{
		if (!(super.clientesPJ.isEmpty())) 
		{
			for (PessoaJuridica pj : clientesPJ) 
			{
				if (pj.getDocumento().equalsIgnoreCase(documento)) 
				{
					saldo += valor;
					ContaCorrente cc = new ContaCorrente();
					cc.extrato(documento);
					break;
				}
				
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia.",
					"OPERAÇÃO DE DEPÓSITO:", JOptionPane.ERROR_MESSAGE);
		}	

		
	}
	

		
		
	// MÉTODO PARA REALIZAR SAQUE
	public void sacarPoupanca(String documento, double valor) 
	{
		if (!(super.clientesPF.isEmpty())) 
		{
			for (PessoaFisica pf : clientesPF) 
			{
				if (pf.getDocumento().equalsIgnoreCase(documento)) 
				{
					saldo -= valor;
					ContaPoupanca pp = new ContaPoupanca();
					pp.extrato(documento);
					break;
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia.",
					"OPERAÇÃO DE SAQUE:", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void sacarCorrente(String documento, double valor) 
	{
		if (!(super.clientesPJ.isEmpty())) 
		{
			for (PessoaJuridica pj : clientesPJ) 
			{
				if (pj.getDocumento().equalsIgnoreCase(documento)) 
				{
					saldo -= valor;
					ContaCorrente cc = new ContaCorrente();
					cc.extrato(documento);
					break;
				}
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia.",
					"OPERAÇÃO DE SAQUE:", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
	// MÉTODO PARA REALIZAR TRANSFERÊNCIA
	public void transferirPoupanca(String contaOrigem, String contaDestino, double valor) {
		this.sacarPoupanca(contaOrigem, valor); // INDICA UMA MOVIMENTAÇÃO DE SAQUE PARA ESSA CONTA
		depositarPoupanca(contaDestino, valor); // INDICA UMA MOVIMENTAÇÃO DE DEPÓSITO PARA OUTRA CONTA
		
	}
	
	public void transferirCorrente(String docOrigem, String contaDestino, double valor) {
		this.sacarCorrente(docOrigem, valor); // INDICA UMA MOVIMENTAÇÃO DE SAQUE PARA ESSA CONTA
		depositarCorrente(contaDestino, valor); // INDICA UMA MOVIMENTAÇÃO DE DEPÓSITO PARA OUTRA CONTA
	}
	
	
	// MÉTODO ABSTRATO PORQUE CADA TIPO CONTA POSSUI UMA FORMA DE IMPRIMIR SUAS MOVIMENTAÇÕES
	public abstract void extrato(String documento); 	
	
	
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

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
	public void sacar(double valor) 
	{
		saldo -= valor;
	}
	
	
	
	
	// MÉTODO PARA REALIZAR TRANSFERÊNCIA
	public void transferir(String documento, double valor) {
		this.sacar(valor); // INDICA UMA MOVIMENTAÇÃO DE SAQUE PARA ESSA CONTA
		//contaDestino.depositar(contaDestino, valor); // INDICA UMA MOVIMENTAÇÃO DE DEPÓSITO PARA OUTRA CONTA
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

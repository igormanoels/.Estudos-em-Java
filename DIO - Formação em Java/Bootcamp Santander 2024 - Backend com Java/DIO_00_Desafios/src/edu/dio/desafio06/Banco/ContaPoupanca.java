package edu.dio.desafio06.Banco;

public class ContaPoupanca extends Conta
{
	public ContaPoupanca(Cliente cliente, double valor) 
	{
		super(cliente, valor);	
	}

	public ContaPoupanca() {}
	
	
	public void extrato(String documento)
	{
		for (PessoaFisica pf : clientesPF) 
		{
			if (pf.getDocumento().equalsIgnoreCase(documento)) 
			{
				System.out.println("Extrato da Conta Poupança\n"
						+ "Cliente: " + getCliente() + "\n" 
						+ "Agência: " + super.agencia + "\n"
						+ "Conta: " + super.numero + "\n"
						+ "Saldo: " + super.saldo + "\n");	
			}
		}		
	}
}

package edu.dio.desafio06.Banco;

public class ContaCorrente extends Conta
{
	public ContaCorrente(Cliente cliente, double valor) 
	{
		super(cliente, valor);
	}
	
	public ContaCorrente() {}

	
	public void extrato(String documento)
	{
		for (PessoaJuridica pj : clientesPJ) 
		{
			if (pj.getDocumento().equalsIgnoreCase(documento)) 
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

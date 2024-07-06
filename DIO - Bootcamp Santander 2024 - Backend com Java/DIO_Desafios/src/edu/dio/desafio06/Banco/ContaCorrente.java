package edu.dio.desafio06.Banco;

public class ContaCorrente extends Conta
{
	public void extrato()
	{
		System.out.println("Extrato da Conta Corrente\n" 
				+ "Agência: " + super.agencia + "\n"
				+ "Conta: " + super.numero + "\n"
				+ "Saldo: " + super.saldo + "\n");
	}
}

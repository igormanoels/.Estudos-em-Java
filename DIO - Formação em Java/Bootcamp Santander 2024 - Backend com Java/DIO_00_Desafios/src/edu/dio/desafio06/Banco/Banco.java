package edu.dio.desafio06.Banco;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco
{
	protected final int agencia = 001;
	protected final String enderecoAgencia = "Rua das flores";
	protected final int numeroAgencia = 91;
	protected final String bairroAgencia = "Sé";
	protected final String estadoAgencia = "São Paulo";
	
	public List<PessoaFisica> clientesPF;
	public List<PessoaJuridica> clientesPJ;
	
	Conta cc = new ContaCorrente(null, agencia);
	Conta pp = new ContaPoupanca(null, agencia);
	
	// MÉTODO CONSTRUTOR, INICIALIZA AS LISTAS VAZIAS.
	public Banco() 
	{
		this.clientesPF = new ArrayList<>();
		this.clientesPJ = new ArrayList<>();
	}
	
	
	/* 
	 * MÉTODOS PARA REALIZAR ABERTURA DE CONTA PARA PESSOA FÍSICA E JURÍDICA.
	 * COMO REGRA DE NEGÓCIO, OBRIGATÓRIAMENTE A ABERTURA DE CONTA PESSOA FÍSICA LEVA 5 REAIS
	 * E AS CONTAS PESSOA JURÍDICA LEVAM 1000 NO ATO DA ABERTURA.
	 */
	public void abrirContaPF(String nome, String cpf, String rua, int numero, String bairro, String estado, String uf) 
	{
		PessoaFisica novoCliente = (new PessoaFisica (nome, cpf, rua, numero, bairro, estado, uf));
		Conta contaPP = new ContaPoupanca(novoCliente, 5.00);
		clientesPF.add(novoCliente);
		System.out.println(contaPP);
	}

	public void abrirContaPJ(String nome, String cnpj, String rua, int numero, String bairro, String estado, String uf) 
	{
		PessoaJuridica novoCliente = (new PessoaJuridica (nome, cnpj, rua, numero, bairro, estado, uf));
		Conta contaCC = new ContaCorrente(novoCliente, 1000.00);
		clientesPJ.add(novoCliente);
		System.out.println(contaCC);
	}
	
	
	// MÉTODOs PARA REALIZAR O ENCERRAMENTO DE CONTA PARA PESSOA FÍSICA OU JURÍDICA
	public void encerrarContaPF(String cpf)
	{
		PessoaFisica removerPF = null;
		
		if (!(clientesPF.isEmpty())) 
		{
			for (PessoaFisica pf : clientesPF) 
			{
				if (pf.getDocumento().equalsIgnoreCase(cpf)) 
				{
					removerPF = pf;
					break;
				}
			}
			clientesPF.remove(removerPF);
			JOptionPane.showMessageDialog(null, "O cliente: " + removerPF.getNome() + " - CPF: " + removerPF.getDocumento(),
					"ENCERRAR CONTA PESSOA FÍSICA: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia!",
					"ENCERRAR CONTA PESSOA FÍSICA: ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void encerrarContaPJ(String cnpj) 
	{
		PessoaJuridica removerPJ = null;

		if (!(clientesPF.isEmpty())) 
		{
			for (PessoaJuridica pj : clientesPJ) 
			{
				if (pj.getDocumento().equalsIgnoreCase(cnpj)) 
				{
					removerPJ = pj;
					break;
				}
			}
			clientesPJ.remove(removerPJ);
			JOptionPane.showMessageDialog(null, "O cliente: " + removerPJ.getNome() + " - CNPJ: " + removerPJ.getDocumento(),
					"ENCERRAR CONTA PESSOA FÍSICA: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "A lista de clientes está vazia!",
					"ENCERRAR CONTA PESSOA JURÍDICA: ", JOptionPane.ERROR_MESSAGE);
		}
	}

	
}

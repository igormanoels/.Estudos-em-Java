package com.empresa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.empresa.colaboradores.PessoaFisica;
import com.empresa.colaboradores.PessoaJuridica;
import com.empresa.colaboradores.cargos.Gerente;
import com.empresa.colaboradores.cargos.OperadorDeCaixa;
import com.empresa.colaboradores.cargos.Vendedor;

public class Empresa 
{
	private List<PessoaFisica> pessoaFisica;
	private List<PessoaJuridica> pessoaJuridica;	
	
	
	// CONSTRUTOR QUE INICIA AS LISTAS VAZIAS
	public Empresa()
	{
		this.pessoaFisica = new ArrayList<>();
		this.pessoaJuridica = new ArrayList<>();
	}
	
	
	// MÉTODOS DE CADASTRO
	public void cadastrarVendedor(String nome, String documento, String categoria, String rua, String bairro, String complemento, double remuneracao)
	{ 
		pessoaFisica.add(new Vendedor(nome, documento, categoria, new Endereco(rua, bairro, complemento), remuneracao));
	}
	
	public void cadastrarOperador(String nome, String documento, String categoria, String rua, String bairro, String complemento, double remuneracao)
	{ 
		pessoaFisica.add(new OperadorDeCaixa(nome, documento, categoria, new Endereco(rua, bairro, complemento), remuneracao));
	} 
	
	public void cadastrarPessoaJuridica(String nome, String documento, String categoria, String rua, String bairro, String complemento, double remuneracao)
	{ 
		pessoaJuridica.add(new Gerente(nome, documento, categoria, new Endereco(rua, bairro, complemento), remuneracao));
	}
	
	
	// MÉTODOS DE PAGAMENTO
	public void gerarPagamentoVendedor(String documento, int quantidadeVendas) 
	{
		for (PessoaFisica pf: pessoaFisica) 
		{
			if (pf.getDocumento().equalsIgnoreCase(documento)) 
			{
				double pagamento = quantidadeVendas * 150.43;
				((Vendedor) pf).setBonificacao(pagamento);
				System.out.printf("\nO valor para pagamento será de R$ %.2f", pagamento);
			}
		}
	}
	
	public void gerarPagamentoGerente(String documento) 
	{
		int totalVendas = 0;
		
		for (PessoaFisica pf : pessoaFisica) 
		{
			totalVendas += ((Vendedor) pf).getQuantidadeVendas();
		}
		
		for (PessoaJuridica pj : pessoaJuridica) 
		{
			if (pj.getDocumento().equalsIgnoreCase(documento)) 
			{
				double pagamento = totalVendas * 80;
				((Gerente)pj).setRemuneracao(pagamento);
				System.out.printf("\nO valor para pagamento será de R$ %.2f", pagamento);
			}
		}
	}
	
	
	// MÉTODOS DE CONSULTA - IMPRIMIR
	public void consultarColaboradorPF(String documento)
	{
		if (!(pessoaFisica.isEmpty())) 
		{
			for (PessoaFisica pf : pessoaFisica) 
			{
				if (pf.getDocumento().equals(documento)) 
				{
					System.out.println(pf.toString());
				}
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Esse colaborador pessoa física não está cadastrado.");
			System.out.println(pessoaFisica); // Para teste 
		}
	}
	
	public void consultarColaboradorPJ(String documento)
	{
		if (!(pessoaFisica.isEmpty())) 
		{
			for (PessoaJuridica pj : pessoaJuridica) 
			{
				if (pj.getDocumento().equals(documento)) 
				{
					System.out.println(pj.toString());
				}
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Esse colaborador pessoa juridíca não está cadastrado.");
			System.out.println(pessoaJuridica); // Para teste
		}
	}
}

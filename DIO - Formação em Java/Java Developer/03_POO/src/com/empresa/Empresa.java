package com.empresa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.empresa.colaboradores.Colaborador;
import com.empresa.colaboradores.PessoaJuridica;
import com.empresa.colaboradores.Vendedor;

public class Empresa 
{
	private List<Colaborador> colaboradores;
	
	
	public Empresa() 
	{
		this.colaboradores = new ArrayList<>();
	}
	
	
	public void cadastrarPessoaFisica(String nome, String documento, String categoria, Double remuneracao, String rua, String bairro, String complemento, int quantidadeVendas)
	{ 
		colaboradores.add(new Vendedor(nome, documento, categoria, remuneracao, new Endereco(rua, bairro, complemento), quantidadeVendas));
	}

	
	public void cadastrarPessoaJuridica(String nome, String documento, String categoria, Double remuneracao, String rua, String bairro, String complemento)
	{ 
		colaboradores.add(new PessoaJuridica(nome, documento, categoria, remuneracao, new Endereco(rua, bairro, complemento)));
	}
	
	
	public void consultarColaborador(String documento)
	{
		if (!(colaboradores.isEmpty())) 
		{
			for (Colaborador colaborador : colaboradores) 
			{
				if (colaborador.getDocumento().equalsIgnoreCase(documento)) 
				{
					colaborador.toString();
				}
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Não existem colaboradores cadastrados no momento.");
			System.out.println(colaboradores);
		}
	}
	
}

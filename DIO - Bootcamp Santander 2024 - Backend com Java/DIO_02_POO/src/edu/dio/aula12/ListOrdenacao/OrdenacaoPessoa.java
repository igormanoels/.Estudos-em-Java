package edu.dio.aula12.ListOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa 
{
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() 
	{
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura)
	{
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade()
	{
		// Cria um lista de pessoa por idade, copíando a lista que é atributo da classe
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura()
	{
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	
}

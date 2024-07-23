package edu.dio.desafio07.POO.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev 
{
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	private int status;
	private int statusAtual;
	
	
	
	
	public void inscreverBootcamp(Bootcamp bootcamp) 
	{
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		this.status = conteudosInscritos.size();
		bootcamp.getDevsInscritos().add(this);
	};
	
	public void progredir()	
	{
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) 
		{
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
			this.statusAtual = conteudosConcluidos.size();
		}
		else 
		{
			System.err.println("Você não está matriculado em nenhum conteúdo.");
		}
	};
	
	public double calcularXP() 
	{
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}

	
	public int getStatus() {
		return status;
	}
	
	public int getStatusAtual() {
		return statusAtual;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	};
	
	
	
}

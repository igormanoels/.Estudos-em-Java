package edu.dio.exercicio05;

public class Tarefa 
{
	private String descricao;
	private boolean status;
	
	public Tarefa(String descricao, boolean status) 
	{
		this.descricao = descricao;
		this.status = status;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// Método que retorna os dados como String
	public String toString() 
	{
		return descricao;
	}
	
}

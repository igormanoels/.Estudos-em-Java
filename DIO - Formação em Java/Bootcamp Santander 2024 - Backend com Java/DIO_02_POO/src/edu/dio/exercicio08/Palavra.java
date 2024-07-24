package edu.dio.exercicio08;

public class Palavra 
{
	private Integer contagem;
	
	public Palavra(Integer cont) 
	{
		this.contagem = cont;
	}
	
	public Integer getContagem() {
		return contagem;
	}
	
	@Override
	public String toString() 
	{
		if (contagem == 1) 
		{
			return " " + contagem + "x vezes";

		} 
		else 
		{
			return " " + contagem + "x vez";
		}
	}
}

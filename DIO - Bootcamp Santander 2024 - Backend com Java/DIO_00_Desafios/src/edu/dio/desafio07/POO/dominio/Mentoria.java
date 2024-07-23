package edu.dio.desafio07.POO.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo
{

	private LocalDate data;
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return super.xpPadrao + 20;
	}


	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	
	@Override
	public String toString() {
		return "\nCurso [titulo= " + super.getTitulo() + 
				", descricao= " + super.getDescricao()+ 
				", data= " + data + "]";
	}


}

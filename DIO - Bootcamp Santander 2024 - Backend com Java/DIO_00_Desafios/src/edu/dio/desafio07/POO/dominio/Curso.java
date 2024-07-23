package edu.dio.desafio07.POO.dominio;

public class Curso extends Conteudo
{
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return super.xpPadrao * cargaHoraria;
	}

	

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
	@Override
	public String toString() {
		return "\nCurso [titulo= " + super.getTitulo() + 
				", descricao= " + super.getDescricao()+ 
				", cargaHoraria= " + cargaHoraria + "]";
	}

	
	
}

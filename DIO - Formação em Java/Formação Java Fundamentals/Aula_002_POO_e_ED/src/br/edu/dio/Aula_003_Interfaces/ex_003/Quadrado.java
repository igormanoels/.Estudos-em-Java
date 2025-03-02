package br.edu.dio.Aula_003_Interfaces.ex_003;

public record Quadrado(double lado) implements FormasGeometricas{

	
	
	@Override
	public double getArea() {
		return lado * lado;
	}
	
	

}

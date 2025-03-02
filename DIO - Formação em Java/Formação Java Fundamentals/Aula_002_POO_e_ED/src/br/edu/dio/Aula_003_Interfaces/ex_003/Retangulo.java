package br.edu.dio.Aula_003_Interfaces.ex_003;

public record Retangulo(double altura, double largura) implements FormasGeometricas{
	
	@Override
	public double getArea() {
		return (altura * largura);
	}	

}

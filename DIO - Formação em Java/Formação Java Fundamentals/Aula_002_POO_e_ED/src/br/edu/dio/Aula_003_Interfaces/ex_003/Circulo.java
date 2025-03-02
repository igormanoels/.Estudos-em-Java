package br.edu.dio.Aula_003_Interfaces.ex_003;

public record Circulo(double raio) implements FormasGeometricas{

	private static final double pi = 4.14;

	@Override
	public double getArea() {
		return pi * (raio * raio);
	}
	
}

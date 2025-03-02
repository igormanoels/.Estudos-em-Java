package br.edu.dio.Aula_003_Interfaces.ex_003;

public record Triangulo(double altura, double base) implements FormasGeometricas{

	@Override
	public double getArea() {
		return ((base * altura) / 2);
	}

}

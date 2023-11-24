package Aula_14_POO;

public class CalculadoraBase {
	double valor01, valor02, total;
	
	
	void somar(double a, double b) {
		total = a + b;
		System.out.println("Resultado da Operação: " + total);
	}
	
	void subtrair(double a, double b) {
		total = a - b;
		System.out.println("Resultado da Operação: " + total);
	}
	
	void multiplicar(double a, double b) {
		total = a * b;
		System.out.println("Resultado da Operação: " + total);
	}
	
	void dividir(double a, double b) {
		total = a / b;
		System.out.println("Resultado da Operação: " + total);
	}
}

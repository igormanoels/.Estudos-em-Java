package controller;

public class Imprimir {

	public static int Calcular(int numero) {
		if (numero < 10 ) {
			System.out.println(numero);
			return Calcular(numero + 1);
		}
		System.out.println(numero);
		return numero;
	}
}

package Algoritmo_66;

import java.util.Scanner;

public class CalcularCombustivel {
	static double tempo, velo;

	public static void main(String[] args) {
		double res;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o tempo da viagem");
			tempo = ler.nextDouble();
		System.out.println("Informe agora a velocidade média");
		 	velo = ler.nextDouble();
		
		res = calccombustivel(tempo, velo);
			System.out.println("Foram gastos " + res + " litros.");
	}
	
	static double calccombustivel(double tempo, double velo) {
		double litros = ((tempo * velo) / 12);
		return litros;
	}
}

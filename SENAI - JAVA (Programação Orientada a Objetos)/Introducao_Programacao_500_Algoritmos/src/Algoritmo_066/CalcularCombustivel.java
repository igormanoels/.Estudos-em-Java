package Algoritmo_66;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularCombustivel {
	static double tempo, velo;

	public static void main(String[] args) {
		double res;
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		
		System.out.println("Algoritmo: Lê o tempo e velocidade, e imprime a quantidade de litros.");
		
		System.out.print("Informe o tempo da viagem: ");
			tempo = ler.nextDouble();
		System.out.print("Informe agora a velocidade média: ");
		 	velo = ler.nextDouble();
		
		res = calccombustivel(tempo, velo);
		String resFormatado = formatar.format(res);
			System.out.println("\nForam gastos " + resFormatado + " litros.");
			
		ler.close();
	}
	
	static double calccombustivel(double tempo, double velo) {
		double litros = ((tempo * velo) / 12);
		return litros;
	}
}

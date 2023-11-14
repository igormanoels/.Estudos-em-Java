package Algoritmo_63;

import java.util.Scanner;

public class CalculoSalarioLiquido {
	static double hrtrabalhadas, quantaulas, desc, salfinal;

	public static void main(String[] args) {
		System.out.println("Algoritmo: Cálculadora de Salário Líquaido");
		
		salfinal = calcularSalario();
			System.out.println("O salário final será de R$" + salfinal);
	}
	
	static double calcularSalario() {
		double res;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora aula");
			hrtrabalhadas = ler.nextDouble();
		System.out.println("Informe agora a quantidade de aulas dadas no mês");
		 	quantaulas = ler.nextDouble();
		System.out.println("Informe o valor do desconto");
		 	desc = ler.nextDouble();
		
		res = (hrtrabalhadas * quantaulas);
		res = (res - ((res * desc)/100));
		return res;
	}
	
}

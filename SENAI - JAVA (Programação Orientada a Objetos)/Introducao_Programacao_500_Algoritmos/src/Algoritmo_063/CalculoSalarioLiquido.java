package Algoritmo_063;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalarioLiquido {
	static double hrtrabalhadas, quantaulas, desc, salfinal;

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
				
		System.out.println("Algoritmo: Lê as horas trabalhadas, quantidade de aulas e desconto. E imprime o Salário Líquido.");
		
		salfinal = calcularSalario();
		String salfinalFormatado = formatar.format(salfinal);
			System.out.println("\nO salário final será de R$ " + salfinalFormatado);
	}
	
	static double calcularSalario() {
		double res;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor da hora aula: ");
			hrtrabalhadas = ler.nextDouble();
		System.out.print("Informe agora a quantidade de aulas dadas no mês: ");
		 	quantaulas = ler.nextDouble();
		System.out.print("Informe o valor do desconto: ");
		 	desc = ler.nextDouble();
		
		res = (hrtrabalhadas * quantaulas);
		res = (res - ((res * desc)/100));
		ler.close();
		return res;
	}
	
}

package Algoritmo_129;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VerificaDescSalarial {
	static double salB, salLiq;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		System.out.println("Algoritmo: Lê o salário e imprimi o seu valor líquido.");

		
		System.out.print("Informe o valor do salário: R$ ");
			salB = ler.nextDouble();
			
		calcDesc();
		
		String salFormatado = formatar.format(calcDesc());
		System.out.print("\nO salário líquido será de: R$ " + salFormatado);
		ler.close();
	}

	private static double calcDesc() {
		if (salB <= 600) {
			salLiq = salB;	
		} 
			else {
				if (salB <= 1200) {
					salLiq = (salB * 0.8);
				} 
					else {
						if (salB <= 2000) {
							salLiq = (salB * 0.75);
						} 
							else {
								salLiq = (salB * 0.7);
							}
					}
			}
		
		return salLiq;
	}
	
	
	

}

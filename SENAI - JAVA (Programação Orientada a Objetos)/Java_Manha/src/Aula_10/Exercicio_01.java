package Aula_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_01 {
	static double sal, rsal;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		
		System.out.println("Informe o valor do salário atual");
			sal = ler.nextDouble();
		
		rsal = calcreajuste(sal);
		String salFormatado = formatar.format(calcreajuste(rsal));
			System.out.println("Salário Reajustado: R$ " + salFormatado);

		ler.close();
	}
	
	static double calcreajuste(double a) {
		double resp;
		
		if (a <= 1000) {
			resp = (a + ((a * 40)/100));
			
		} else {
			resp = (a + ((a * 30)/100));
		}
		return resp;
	}
	
}	

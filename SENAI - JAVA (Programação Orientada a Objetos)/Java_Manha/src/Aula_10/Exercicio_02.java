package Aula_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_02 {
	static double pgmt, data, lv, desc;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		
		System.out.println("Informe o dia do mês");
			data = ler.nextDouble();
		System.out.println("Informe o nivel do aluno");
			lv = ler.nextDouble();
			
		if (data == 1) {
			desc = 15;
		} else if (data <= 5 ) {
			desc = 10;
		} else if (data <= 10) {
			desc = 3.89;
		} else {
			desc = 0;
		}
		
		if (lv == 1) {
			pgmt = 51.50;
		} else if (lv == 2 ) {
			pgmt = 65.00;
		} else if (lv == 3) {
			pgmt = 80.00;
		} else {
			pgmt = 100.00;
		}
		
		pgmt = (pgmt + ((pgmt * desc )/100));
		
		String pgmtFormatado = formatar.format(pgmt);
			System.out.println("Valor a pagar: R$ " + pgmtFormatado);
			
		ler.close();
	}

}

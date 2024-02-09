package Algoritmo_192;

import java.util.Scanner;

public class ImparesdoIntervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o limite e o número do intervalo e imprime os números impares de zero ao limite.\n");
		
		System.out.print("Favor informar até onde deverá ser feito a contagem: ");
		var lim = ler.nextInt();
		System.out.print("Agora por favor informe qual o número do intervalo: ");
		var num = ler.nextInt();
		
		System.out.print("\nContando... ");
		for (int i = 0; i <= lim; i+=num) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		}
		
		ler.close();
	}

}

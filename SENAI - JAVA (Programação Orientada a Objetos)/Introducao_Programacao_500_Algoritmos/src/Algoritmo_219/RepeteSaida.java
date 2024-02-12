package Algoritmo_219;

import java.util.Iterator;
import java.util.Scanner;

public class RepeteSaida {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Lê um número e imprime a palavra \"Sol\" na quantidade desejada.");
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantas vezes você gostaria que a palavra \"Sol\" seja impressa? ");
		var quant = ler.nextInt();
		
		for (int i = 0; i < quant; i++) {
			System.out.println((i+1) + "º Sol");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	
		ler.close();
	}

}

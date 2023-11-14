package Algoritmo_60;

import java.util.Scanner;

public class DecimoTermo {

	public static void main(String[] args) {
		double dec, razao, termo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe qual o termo");
			termo = ler.nextDouble();
		System.out.println("Informe qual a razão");
			razao = ler.nextDouble();
		
		dec = (termo + (9*razao));
			System.out.println("O décimo termo desta P.A. é: " + dec);
	}

}

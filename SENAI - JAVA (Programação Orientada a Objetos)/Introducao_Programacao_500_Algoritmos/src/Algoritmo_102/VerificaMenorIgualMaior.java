package Algoritmo_102;

import java.util.Scanner;

public class VerificaMenorIgualMaior {
	static int num;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
		 	num = ler.nextInt();
		
		if (num < 20) {
			System.out.println("O número informado é menor que 20");
		} else if (num == 20){
			System.out.println("O número informado foi o 20");
		} else {
			System.out.println("O número informado é maior que 20");
		}
		
		ler.close();
	}

}

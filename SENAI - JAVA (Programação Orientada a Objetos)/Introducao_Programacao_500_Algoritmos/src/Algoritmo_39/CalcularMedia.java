package Algoritmo_39;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		double num1, num2, res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		num1 = ler.nextDouble();
		
		System.out.println("Informe o segundo valor");
		num2 = ler.nextDouble();
		
		res =((num1 + num2)/2);
			System.out.println("A média para os valores informado é de " + res);
			
	}

}

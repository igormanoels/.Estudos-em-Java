package Algoritmo_39;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		double num1, num2, res;
		
		System.out.println("Algoritmo: Lê e imprime a média entre dois valores.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor ");
			num1 = ler.nextDouble();
		System.out.print("Informe o segundo valor ");
			num2 = ler.nextDouble();
		
		res =((num1 + num2)/2);
			System.out.println("A média para os valores informados é de " + res);
	
		ler.close();
	}

}

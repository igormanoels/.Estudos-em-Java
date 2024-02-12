package Algoritmo_215;

import java.util.Scanner;

public class DivisoresDoNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número do usuário e imprime seus divisores.");
	
		System.out.print("Favor informar um número: ");
		var num = ler.nextInt();
		
		System.out.print("\nPara " + num + " os divisores são: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			try {
				Thread.sleep(250);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		ler.close();
	}

}

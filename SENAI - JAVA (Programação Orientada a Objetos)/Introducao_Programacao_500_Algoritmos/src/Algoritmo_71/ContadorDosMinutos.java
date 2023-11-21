package Algoritmo_71;

import java.util.Scanner;

public class ContadorDosMinutos {
	static int hr, min;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê a hora e os minutos e imprime quantos minutos já se passaram.");

		System.out.print("Informe qual é a hora atual: ");
		 	hr = ler.nextInt();
		System.out.print("Informe em quantos minutos estamos: ");
			min = ler.nextInt();
		
		int res = calcminutos(hr, min);
			System.out.println("\nDesde que o dia começou se passaram " + res + " minutos");
		
		ler.close();
	}
	
	static int calcminutos(int a, int b) {
		int resp = ((a * 60)+b);
		return resp;
	}
}

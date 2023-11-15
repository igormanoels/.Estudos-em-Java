package Algoritmo_71;

import java.util.Scanner;

public class ContadorDosMinutos {
	static int hr, min;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe qual é a hora atual");
		 	hr = ler.nextInt();
		System.out.println("Informe em quantos minutos estamos");
			min = ler.nextInt();
		
		int res = calcminutos(hr, min);
			System.out.println("Desde que o dia começou se passaram " + res + " minutos");		
	}
	
	static int calcminutos(int a, int b) {
		int resp = ((a * 60)+b);
		return resp;
	}
}

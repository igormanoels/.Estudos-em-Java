package Algoritmo_042;

import java.util.Scanner;

public class ValoresParaAngulo {
	static double angulo, seno, coseno, tangente, cosecante, secante, cotangente;
	
	public static void main(String[] args) {
		System.out.println("Algoritmo: Lê o angulo e imprime seno, co-seno, tangente, cosecante, secante, cotangente.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o angulo ");
		 	angulo = ler.nextDouble();
		 
		seno = (Math.sin(Math.toRadians(angulo)));
			System.out.println("\nSeno: " + seno);
		coseno = (Math.cos(Math.toRadians(angulo)));
			System.out.println("Co-seno: " + coseno);
		tangente = (Math.tan(Math.toRadians(angulo)));
			System.out.println("Tangente: " + tangente);
		cosecante = (1 / seno);
			System.out.println("Co-secante: " + cosecante);
		secante = (1 / coseno);
			System.out.println("Secante: " + secante);
		cotangente = (1 / tangente);
			System.out.println("Co-tangente: " + cotangente);
		
		ler.close();
	}

}

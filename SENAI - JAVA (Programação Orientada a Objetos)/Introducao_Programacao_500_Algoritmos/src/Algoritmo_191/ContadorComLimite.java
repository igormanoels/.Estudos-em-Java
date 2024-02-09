package Algoritmo_191;

import java.util.Scanner;

public class ContadorComLimite {

	public static void main(String[] args) {
		int num, lim;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o valor de incremento e o limite, e conta a partir do zero até o limite informado.\n");
		
		System.out.print("Favor informar até onde iremos contar: ");
		lim = ler.nextInt();
		System.out.print("Agora informe por favor de quanto em quanto devemos contar: ");
		num = ler.nextInt();
		
		System.out.print("\nContando... ");
		
		for (int i = 0; i <= lim; i += num) {
			System.out.print(" " + i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
		}
		
		ler.close();
	}

}

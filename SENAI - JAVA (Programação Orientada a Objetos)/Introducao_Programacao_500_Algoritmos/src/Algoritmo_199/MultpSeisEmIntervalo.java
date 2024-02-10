package Algoritmo_199;

import java.util.Scanner;

public class MultpSeisEmIntervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o limite inferior e o superior, e imprime os valores múltiplos de 6.");
		
		System.out.print("Favor informar o limite inferior: ");
		var limInf = ler.nextInt();
		System.out.print("Favor informar o limite superior: ");
		var limSup = ler.nextInt();
		
		System.out.print("Contando... ");
		
		for (int i = limInf; i <= limSup; i++) {
			if (i % 6 == 0 && i != 0) {
				System.out.print(i + " ");
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}

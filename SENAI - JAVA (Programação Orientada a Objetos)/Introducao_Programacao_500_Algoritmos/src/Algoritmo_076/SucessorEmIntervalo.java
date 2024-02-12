package Algoritmo_076;

import java.util.Scanner;

public class SucessorEmIntervalo {
		static int num;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprimi o sucessor para o intervalo de 0 à 60.");
		
		System.out.print("Informe um número: ");
			num = ler.nextInt();
		
		if (num < 0 || num > 60) {
			System.out.println("Informe um número no intervalo de 0 à 60!");
			System.out.print("Informe um número novamente: ");
			num = ler.nextInt();
			if (num == 60) {
				System.out.println("\nO seu sucessor é: 0");
				}
				else {
					num++;
					System.out.println("\nO seu sucessor é: " + num);
				}
			}
			else if (num == 60) {
				System.out.println("\nO seu sucessor é: 0");
			}
			else {
				num++;
				System.out.println("\nO seu sucessor é: " + num);
			}
				
		ler.close();
	}

}

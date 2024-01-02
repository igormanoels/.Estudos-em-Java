package Algoritmo_134;

import java.util.Scanner;

public class DefineCategoria {
	static int idade;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a idade e imprimi a classificação para a disputa de natação.");

		System.out.print("Informe a idade do competidor: ");
			idade = ler.nextInt();
		
		if (idade <= 4) {
			System.out.print("\nIdade do participante inválida.");
		}
			else if (idade <= 7) {
				System.out.print("\nCategoria: Infantil A.");
			} 
			else if (idade <= 10) {
				System.out.print("\nCategoria: Infantil B.");
			} 
			else if (idade <= 13) {
				System.out.print("\nCategoria: Juvenil A.");
			} 
			else if (idade <= 17) {
				System.out.print("\nCategoria: Juvenil B.");
			} 
			else if (idade <= 65) {
				System.out.print("\nCategoria: Sênio");
			} 
			else {
				System.out.print("\nIdade do participante inválida.");
			}		
		
		ler.close();
	}

}

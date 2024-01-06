package Algoritmo_145;

import java.util.Scanner;

public class ControleEmpLivros {
	static String livro, user;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o livro e o usuario e imprimi o tempo de empréstimo do livro.");

		System.out.print("Informe o nome do livro: ");
			livro = ler.nextLine();
		System.out.print("Para quem será emprestado, aluno ou professor? ");
			user = ler.nextLine();
			
			if (user.equals("aluno")|| user.equals("ALUNO") || user.equals("Aluno")) {
				System.out.print("\nO livro: " + livro 
							+    "\nO empréstimo deve ser realizado por 3 dias.");
			} 
			else {
				if (user.equals("professor") || user.equals("PROFESSOR") || user.equals("Professor")) {
					System.out.print("\nO livro: " + livro 
							+    "\nO empréstimo deve ser realizado por 10 dias.");
				} 
				else {
					System.out.print("\nTipo de usuário não específicado. Favor reiniciar o programa.");
				}
			}
				
		
		ler.close();
	}

}

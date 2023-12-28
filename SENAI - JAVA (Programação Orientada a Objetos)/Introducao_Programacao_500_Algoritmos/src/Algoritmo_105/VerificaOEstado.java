package Algoritmo_105;

import java.util.Scanner;

public class VerificaOEstado {
		static String op;
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a sigla do estado e imprimi sua origem.");
		
		System.out.print("Qual o seu estado? ");
			op = ler.nextLine();
		
		if (op.equals("SP") || op.equals("sp") || op.equals("São Paulo") || op.equals("são paulo")) {
			System.out.print("\nVocê é Paulista!");
		}
			else if (op.equals("RJ") || op.equals("rj") || op.equals("Rio de Janeiro") || op.equals("rio de janeiro")) {
				System.out.print("\nVocê é Carioca");
			}
			else if (op.equals("MG") || op.equals("mg") || op.equals("Minas Gerais") || op.equals("minas gerais")) {
				System.out.print("\nVocê é Mineiro");
			}
			else {
				System.out.print("\nVocê pertence a outro estado.");
			}
		
		
		ler.close();
	}

}

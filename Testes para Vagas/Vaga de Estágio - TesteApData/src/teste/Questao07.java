package teste;

import java.util.Scanner;

// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

public class Questao07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número desejado: ");
		int n = ler.nextInt();
		
		System.out.println("\nO número informado " + verificar(n));
		
		ler.close();
	}
	
	public static String verificar(int n) {
		String resp;
		if (n >= 0) {
			resp = "é positivo";
		} else {
			resp = "é negativo";
		}
		
		return resp;		
	}
	
}	

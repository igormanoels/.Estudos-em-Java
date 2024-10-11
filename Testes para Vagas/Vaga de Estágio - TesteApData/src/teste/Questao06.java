package teste;

import java.util.Scanner;

/* Ler um valor e escrever a mensagem É MAIOR OUE 10! se o valor lido for major que 10, 
 * caso contrário escrever NÃO É MAIOR QUE 10!
 */

public class Questao06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número desejado: ");
		int n = ler.nextInt();
		
		System.out.println("\nO número informado " + verificar(n));
		
		ler.close();
	}
	
	public static String verificar(int n) {
		String resp;
		if (n > 10) {
			resp = "é maior que 10";
		} else {
			resp = "não é maior que 10";
		}
		
		return resp;		
	}
	
}	


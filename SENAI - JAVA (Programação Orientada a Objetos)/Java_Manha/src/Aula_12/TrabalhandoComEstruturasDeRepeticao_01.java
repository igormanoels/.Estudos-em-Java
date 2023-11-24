package Aula_12;

import java.util.Scanner;

public class TrabalhandoComEstruturasDeRepeticao_01 {
	static int num;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
			num = ler.nextInt();
		System.out.print("Estrutura de Repetição While (Enquanto)... \nContando: ");
		
		while (num <=5) {
			System.out.print(num + ", ");
			num++;
		}
				
		ler.close();
	}

}

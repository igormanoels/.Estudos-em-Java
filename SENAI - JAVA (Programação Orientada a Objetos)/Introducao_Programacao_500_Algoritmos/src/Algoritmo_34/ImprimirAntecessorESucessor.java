package Algoritmo_34;

import java.util.Scanner;

public class ImprimirAntecessorESucessor {

	public static void main(String[] args) {
		int num, res;
		
		Scanner ler = new Scanner(System.in);
			
		System.out.print("Informe um número ");
		
		num = ler.nextInt();
		
		res = num + 1;
		System.out.print("\nO numero informado foi " + num + ". Seu sucessor é " + res);
		res = num - 1;
		System.out.print(" .E seu antecessor é " + res);
		
	}

}

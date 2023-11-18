package Algoritmo_103;

import java.util.Scanner;

public class VerificaIdade {
	static int anoAt, anoNasc, idade;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o ano atual");
		 	anoAt = ler.nextInt();
		System.out.println("Informe o ano de nascimento");
		 	anoNasc = ler.nextInt();
		
		if (anoNasc > anoAt) {
			System.out.println("O ano de nascimento não pode ser maior que o Ano Atual");
		} else {
				
			idade = anoAt - anoNasc;
					
			if (idade <= 125 ) {
				System.out.println("Idade: " + idade);
			} else {
				System.out.println("A idade para os anos informados passa dos 125 anos.");
			}
		}
		ler.close();
	}

}

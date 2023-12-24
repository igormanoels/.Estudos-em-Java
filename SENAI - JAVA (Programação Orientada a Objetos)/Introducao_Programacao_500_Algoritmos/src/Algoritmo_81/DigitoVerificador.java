package Algoritmo_81;

import java.util.Scanner;

public class DigitoVerificador {
	static int conta, digito, uni, dez, cen;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Algoritmo: Lê o número da conta correte	e imprimi seu dígito verificador.");
		
		System.out.print("Informe o número da sua conta correte: ");
			conta = ler.nextInt();
		
		System.out.println("O dígito dá conta informada é: " + calcDigito(conta));
		
		ler.close();
	}
	
	public static int calcDigito(int num) {
		int p1, p2, p3;
		
		cen = (num / 100);
		dez = ((num % 100)/10);
		uni = ((num % 100)% 10);
		
		p1 = (cen + uni);
		p2 = (dez + dez);
		p3 = (uni + cen);
		digito = p1 + p2 + p3;		
		return digito;
	}

}

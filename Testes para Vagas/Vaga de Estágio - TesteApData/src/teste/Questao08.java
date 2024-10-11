package teste;

import java.util.Scanner;

/* As maças custam RS 1,30 cada se forem compradas menos de uma dúzia, 
 * e RS 1 se forem compradas pelo menos 12. Digite um programa que leia 
 * o número de maças compradas, calcule e escreva o custo total da compra.
 */

public class Questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de maçãs: ");
		int quantidadeMacas = ler.nextInt();
		
		System.out.printf("Custo total R$ %.2f", calcValor(quantidadeMacas));
	
		ler.close();
	}
	
	public static double calcValor(int quant) {
		double pgmt;
		if (quant < 12) {
			pgmt = quant * 1.3;
		} else {
			pgmt = quant * 1;
		}
		return pgmt;		
	}
	
}

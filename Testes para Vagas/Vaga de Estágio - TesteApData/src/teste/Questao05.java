package teste;

import java.util.Scanner;

/* Digite um algoritmo para ler o salário mensal atual de um funcionário e o 
 * percentual de reajuste. Calcular e escrever o valor do novo salário.
 */

public class Questao05 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o salário: R$ ");
		double salario = ler.nextDouble();
		
		System.out.print("Informe o percentual de reajuste: ");
		double reaj = ler.nextDouble();
		
		System.out.printf("\nO novo salário será de R$ %.2f", (salario + (salario * reaj) / 100));
		ler.close();
	}
	
}

package br.edu.dio.Aula_003_Interfaces.ex_003;

import java.util.Scanner;

/* 
 * 3 - Escreva um código onde seja possivel calcular a área de uma figura geométrica, todas devem ter 
 * método que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:
 * 
 * 	Quadrado: possui 0 valor dos seus lados;
 * 	Retângulo: possui os valores de base a altura;
 * 	Circulor: possui o atributo raio.
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor1, valor2, res;
		int op;
		
		while (true) {
			System.out.print("Cálcule a área da forma geométrica desejada!\n"
					+ "1 - Quadrado\n"
					+ "2 - Retangulo\n"
					+ "3 - Triangulo\n"
					+ "4 - Circulo\n"
					+ "0 - Encerrar a aplicação"
					+ "Digite a opção desejada: ");
			op = Integer.parseInt(ler.nextLine());
			
			switch (op) {
				case 0 -> {
					ler.close();
					break; 
					}
				
				case 1 -> {
					System.out.print("Informe o valor do lado: ");
					valor1 = Double.parseDouble(ler.nextLine());
					
					res = new Quadrado(valor1).getArea();
					System.out.println("\nÁrea do Quadrado: " + res + "\n");
				} 

				case 2 -> {
					System.out.print("Informe o valor da altura: ");
					valor1 = Double.parseDouble(ler.nextLine());
					System.out.print("Informe o valor da largura: ");
					valor2 = Double.parseDouble(ler.nextLine());
					
					res = new Retangulo(valor1, valor2).getArea();
					System.out.println("\nÁrea do Retangulo: " + res + "\n");
				} 

				case 3 -> {
					System.out.print("Informe o valor da altura: ");
					valor1 = Double.parseDouble(ler.nextLine());
					System.out.print("Informe o valor da base: ");
					valor2 = Double.parseDouble(ler.nextLine());
					
					res = new Triangulo(valor1, valor2).getArea();
					System.out.println("\nÁrea do Triângulo: " + res + "\n");
				}
				
				case 4 -> {
					System.out.print("Informe o valor do raio: ");
					valor1 = Double.parseDouble(ler.nextLine());
					
					res = new Circulo(valor1).getArea();
					System.out.println("\nÁrea do Circulo: " + res + "\n");
				} 				
				
				default -> {
					System.out.println("Opção inválida");
					}
			}
		}
		
		
	}
	
}

package Aula_04;

import java.util.Scanner;

public class Classe_Somar {
	static double numero1;
	static double numero2;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
// entrada de dados
		
		System.out.println("Informe o primeiro Número");
		numero1 = ler.nextDouble();
// direciona a entrada de um dado para a variavél 
		System.out.println("Informe o segundo Número");
		numero2 = ler.nextDouble();
		
		ler.close();
// encerra a leitura de dados
		
		double resultado = somar();
// Direciona o programa para o método somar(), nele o cálculo é executado 
		
		
		System.out.println("A soma dos valores é " + resultado);
		
	}

	public static double somar() {
		Double res;
		
		res = (numero1 + numero2);
		return res;
// Retorna para o programa principal o resultado da operação
		
	}
}

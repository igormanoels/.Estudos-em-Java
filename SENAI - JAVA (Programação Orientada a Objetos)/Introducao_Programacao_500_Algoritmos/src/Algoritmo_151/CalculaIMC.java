package Algoritmo_151;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaIMC {
	static double imc, peso, altura;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("#.##");
		System.out.println("Algoritmo: Lê o peso e a altura e imprimi a faixa de risco segundo seu IMC.");
		
		System.out.print("Primeiramente vamos fazer o cálculo do IMC do paciente."
				+ "\nInforme o peso do paciente: ");
			peso = ler.nextDouble();
		System.out.print("Agora informe a altura: ");
			altura = ler.nextDouble();
		
		imc = (peso / (Math.pow(altura, 2)));
		String imcFormatado = formatar.format(imc);
		System.out.print("\nO IMC do paciente atualmente está em: " + imcFormatado);
		
		if (imc < 20) {
			System.out.print("\nO paciente está abaixo do peso ideal.");
		} 
		else {
			if (imc < 25) {
				System.out.print("\nO paciente está dentro do peso ideal.");
			} 
			else {
				if (imc < 30) {
					System.out.print("\nO paciente está com excesso de peso.");
				} 
				else {
					if (imc < 35) {
						System.out.print("\nO paciente está em estado de obesidade.");
					} 
					else {
						System.out.println("\nO paciente está em estado de obesidade mórmida.");
					}
					
				}
			}
		}
		
		
		ler.close();
	}

}

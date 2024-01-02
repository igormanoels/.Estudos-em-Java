package Algoritmo_133;

import java.util.Scanner;

public class VerificaPeso {
		static int op;
		static double altura, peso;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o sexo e a altura e imprimi o peso ideal ");

		System.out.print("\nQual o sexo do paciente?"
				+ 		 "\nDigite 1 para Masculino."
				+ 		 "\nDigite 2 para Feminino."
				+ 		 "\n\nInforme a opção desejada: ");
			op = ler.nextInt();
		System.out.print("Informe a altura do paciente: ");
			altura = ler.nextDouble();
			
		/*
		 *  2,50m foi a maior altura registrada para um homem
		 *	e a menor foi de 54,6 cm  
		 */
		
		if (altura > 54.6) {
			altura = altura / 100;
		}
					
		if (altura < 2.5) {
			switch (op) {
			case 1: {
				peso = ((72.7 * altura) - 58);
				System.out.println("\nO peso ideal é de: " + peso + " kg");
				break;
			}
			case 2: {
				peso = ((62.1 * altura) - 44.7);
				System.out.print("\nO peso ideal é de: " + peso + " kg");
				break;
			}
			default:
				System.out.print("\nOpção inválida.");
			}
		}
		else {
			System.out.print("\nAltura inválida.");
		}
		
		
		ler.close();
	}

}

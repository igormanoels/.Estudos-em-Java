package Algoritmo_234;

import java.util.Scanner;

public class AnalisaImpostoRenda {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		float[] sal = new float[10];
		float[] imposto = new float[10];
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 10 nomes e o salário, e imprime uma tabela com o valor de contruibuição.");
	
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("\nFavor informar o nome do funcionário: ");
			nomes[i] = ler.nextLine().toUpperCase();
			System.out.print("Agora informe o salário: R$ ");
			sal[i] = ler.nextFloat();
			ler.nextLine();
			
			if (sal[i] >= 1500 ) 
			{
				imposto[i] = sal[i] * 0.85f;
			}
			else if (sal[i] >= 600 && sal[i] < 1500)
			{
				imposto[i] = sal[i] * 0.90f;
			}
			else 
			{
				imposto[i] = 0f;
			}
		}
		
		System.out.println("\n\t\tTABELA DE CONTRIBUIÇÃO DO IMPOSTO DE RENDA"
				+ "\n============================================================================="
				+ "\nContribuinte\t\t\tSalário\t\t\tImposto");
		for (int i = 0; i < 3; i++) {
			System.out.printf("\n" + nomes[i] + "\t\t\t\tR$ " + sal[i] + "\t\tR$ " + imposto[i]);
		}
	
		ler.close();
	}
	
}

package Algoritmo_206;

import java.util.Scanner;

public class MaiorEoMenor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a quantidade de entradas e imprime para cada uma o maior e o menor.");
		
		System.out.print("Favar informar quantos números deverão ser verificados: ");
		var quant = ler.nextInt();
		
		int[] nums = new int[quant];
		int[] maior = new int[quant];
		int[] menor = new int[quant];
		
		for (int i = 0; i < quant; i++) {
			System.out.print("Favor informar o " + (i+1) + "º número: ");
			nums[i] = ler.nextInt();
			maior[i] = nums[i] + 1;
			menor[i] = nums[i] - 1;
		}
		
		System.out.println("Número\t\tO Maior\t\tO Menor"
					+	 "\n----------------------------------------");
		for (int i = 0; i < quant; i++) {
			System.out.println(nums[i] + "\t\t" + maior[i] + "\t\t" + menor[i]);
		}
		
		
		ler.close();
	}

}

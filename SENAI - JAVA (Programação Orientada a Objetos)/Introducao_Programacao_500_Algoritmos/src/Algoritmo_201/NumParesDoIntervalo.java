package Algoritmo_201;

import java.util.Scanner;

public class NumParesDoIntervalo {

	public static void main(String[] args) {
		//var cont = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o limite inferior, o superior e a quantidade, e imprime a quantidade de números pares.");
		
		System.out.print("Favor informar o limite inferior: ");
		var limInf = ler.nextInt();
		System.out.print("Favor informar o limite superior: ");
		var limSup = ler.nextInt();
		System.out.print("Informe agora a quantidade de números pares que deseja saber: ");
		var quant = ler.nextInt();
		
		while(quant != 0 || limInf == limSup) {
			if (limInf % 2 == 0) {
				System.out.print(limInf + " ");
				quant--;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			limInf++;
		}
		
		
		ler.close();
	}

}

package Algoritmo_200;

import java.util.Scanner;

public class MultiplosDoIntervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o limite inferior, o superior e um número, e imprime o múltiplo desse número.");
		
		System.out.print("Favor informar o limite inferior: ");
		var limInf = ler.nextInt();
		System.out.print("Favor informar o limite superior: ");
		var limSup = ler.nextInt();
		System.out.print("Agora informe um valor para buscar no múltiplo dentro do intervalo: ");
		var num = ler.nextInt();
		
		var res = num;
		
		System.out.print("Contando... ");
		for (int i = limInf; i <= limSup; i++) 
		{
			if (i == res) 
			{
				System.out.print(i + " ");
				res = res + num;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}

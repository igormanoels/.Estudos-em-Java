package Algoritmo_40;

import java.util.Scanner;

public class DividendoDivisorQuociente {

	public static void main(String[] args) {
		int dividendo, divisor, quociente, resto;
		
		System.out.println("Algoritmo: Lê o dividendo e o divisor e imprime o quociente e o resto.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o dividendo ");
			dividendo = ler.nextInt();
		System.out.print("Informe o divisor ");
			divisor = ler.nextInt();
		
		quociente = dividendo / divisor;
			System.out.println("\nQuociente: " + quociente);
		resto = dividendo % divisor;
			System.out.println("Resto = " + resto);
// Representa o resto da divisão como 1, dizendo que há valores após a virgula. 
// Difirente do Assembly MIPS que retorna o valor
			
		ler.close();
	}

}

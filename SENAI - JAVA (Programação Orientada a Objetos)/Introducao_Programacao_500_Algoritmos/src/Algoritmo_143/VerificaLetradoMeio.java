package Algoritmo_143;

import java.util.Scanner;

public class VerificaLetradoMeio {
	static String nome;
	static char letraqi, letraqp;
	static int quant, posi;
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um nome e imprimi qual a letra do meio.");
		
		System.out.print("Informe uma palavra: ");
			nome = ler.nextLine();
		
		quant = nome.length();
		posi = quant / 2;
		letraqi = nome.charAt(posi);
		letraqp = nome.charAt(posi - 1);
		
			if (quant % 2 == 1) {
			// vai verificar quando a quant total de letras é impar, se tem uma vogal no meio da palavra
				if (letraqi == 'a' || letraqi == 'e' || letraqi == 'i' || letraqi == 'o' || letraqi == 'u' ) {
					System.out.println("\nSim é uma vogal.");
				} 
				else {
					System.out.println("\nNão é uma vogal.");
				}
			} 
			else {
			// vai verificar quando a quant total de letras é par, as tem consoantes 'S' e 'R' no meio da palavra
				if (letraqi == 's' || letraqp == 's' || letraqi == 'r' || letraqp == 'r') {
					System.out.print("\nSim no meio dessa palavra está contida uma letra R ou S.");
				} 
				else {
					System.out.print("\nNão, no meio dessa palavra não contém uma letra R ou S.");
				}
			}			
/*Teste
*System.out.print("\n\n" + quant + " " + posi);
*System.out.print("\n" + letraqi + " " + letraqp);
*/	
		ler.close();
	}

}

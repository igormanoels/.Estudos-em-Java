package teste;

import java.util.Scanner;

/* Digite um algoritmo para ler o número total de eleitores de um município, o 
 * número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
 * que cada um representa em relação ao total de eleitores.
 */

public class Questao04 {
	
	private static int totalEleitores;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos eleitores estão presentes no múnicipio: ");
		totalEleitores = ler.nextInt();
		
		System.out.print("Informe a quantidade de votos válidos: ");
		int votosValidos = ler.nextInt();
		
		System.out.print("Informe a quantidade de votos nulos: ");
		int votosNulos = ler.nextInt();
		
		System.out.print("Informe a quantidade de votos brancos: ");
		int votosBrancos = ler.nextInt();
		
		System.out.printf("\n%% de votos válidos: %.2f%%\n", calcPercentual(votosValidos));
		System.out.printf("%% de votos nulos: %.2f%%\n", calcPercentual(votosNulos));
		System.out.printf("%% de votos brancos: %.2f%%\n", calcPercentual(votosBrancos));
		
		ler.close();
	}
	
	public static double calcPercentual(int votos) {
		return (((double) votos / totalEleitores) * 100);
	}

}


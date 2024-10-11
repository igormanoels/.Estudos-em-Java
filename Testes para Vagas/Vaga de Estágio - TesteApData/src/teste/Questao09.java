package teste;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor na n1: ");
		double n1 = ler.nextDouble();
		
		System.out.print("Informe o valor da n2: ");
		double n2 = ler.nextDouble();
		double media = verificarNota(n1, n2);
		String situacao = verificarSituacao(media);
		
		System.out.printf("O aluno está %s. Sua média foi %.2f.", situacao, media);
		ler.close();
	}
	
	public static double verificarNota(double a, double b) {
		return ((a + b) / 2);
	}
	
	public static String verificarSituacao(Double m) {
		if (m >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

}

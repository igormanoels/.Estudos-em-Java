package Algoritmo_137;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	static int a, b, c, delta, x1, x2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê valores de uma equação de segundo grau e imprimi o x1 linha e x2 linha.");
		
		System.out.println("\nA equação de segundo grau é dada pela expressão: ax²+bx+c=0");
		System.out.println("Portanto, favor informar o seguintes dados para o cálculo.");
		
		System.out.print("Valor de A = ");
			a = ler.nextInt();
		System.out.print("Valor de B = ");
			b = ler.nextInt();
		System.out.print("Valor de C = ");
			c = ler.nextInt();
			
		delta();
		
		if (delta > 0) {
			System.out.print("\nPara delta = " + delta + ", temos uma solução real."
						   + "\nNela a parábola toca o eixo x em dois pontos diferentes.");
			calcReal();
			System.out.print("\nx1 linha = " + x1 
							+"\nx2 linha = " + x2);
			
		} else {
			if (delta == 0) {
				System.out.print("\nPara delta = " + delta + ", temos a solução igual a zero."
							   + "\nNela a parábola toca o eixo x em apenas um ponto");
				calcIgZero();
				System.out.print("\nx linha = " + x1);
				
			} else {
				System.out.print("\nPara delta = " + delta + ", temos a solução menor que zero."
							   + "\nNela a parábola não cruza o eixo x, pois trata-se de número imaginários 'raiz(i)'.");
				calcMenorZero();
				System.out.print("\nx1 linha = " + x1 + " + raiz(" + delta + "i)"
							   + "\nx2 linha = " + x2 + " - raiz(" + delta + "i)");
			}
		}
						
		
		ler.close();
	}
	
	static void calcReal() {
		x1 = (int)( -b + (Math.sqrt(delta)) / 2 * a);
		x2 = (int) ( -b - (Math.sqrt(delta)) / 2 * a);
	}
	
	static void calcIgZero(){
		x1 = ( -b / 2 * a);
	}
	
	static void calcMenorZero() {
		x1 = ( -b / 2 * a);
		x2 = x1;
	}
	
	static void delta() {
		delta = (int) (Math.pow(b, 2) - 4 * a * c);
		// é necessário fazer o casto porque ao fazer o cálculo é utilizado uma função considerada double (Math.pow)
	}
}

package Algoritmo_141;

import java.util.Scanner;

public class VerificaPontos {
	static String nome1, nome2, nome3;
	static int pt1, pt2, pt3, prim, seg, terc;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três participantes e sua pontuação e imprimi a classicação.");
		
		System.out.print("Informe o nome do participante A: ");
			nome1 = ler.nextLine();
		System.out.print("Informe a pontuação do participante A: ");
			pt1 = ler.nextInt();
			ler.nextLine(); 
/*  
 * é necessário limpar o buffer de entrada, uma vezes que foi feito o uso de dois métodos seguidos
 * isso garante que não haverá um pulo entrei as leituras. 
 */
		System.out.print("Informe o nome do participante B: ");
			nome2 = ler.nextLine();
		System.out.print("Informe a pontuação do participante B: ");
			pt2 = ler.nextInt();
			ler.nextLine();
			
		System.out.print("Informe o nome do participante C: ");
			nome3 = ler.nextLine();
		System.out.print("Informe a pontuação do participante C: ");
			pt3 = ler.nextInt();
			ler.nextLine();
		
		prim = (Math.max(pt1, Math.max(pt2, pt3)));
		terc = (Math.min(pt1, Math.min(pt2, pt3)));
		seg = (pt1 + pt2 + pt3 - (prim + terc));
		
		System.out.println(prim + " " + seg + " " + terc);
		
			if (prim == pt1) {
				System.out.print("\nVencedor: " + nome1 + ", pontuação: " + prim);
			}	
				else if (prim == pt2) {
					System.out.print("\nVencedor: " + nome2 + ", pontuação: " + prim);
				}
				else if ( prim == pt3){
					System.out.print("\nVencedor: " + nome3 + ", pontuação: " + prim );
				}
// Construir a estrutura if + else if, garante que o 1º teste se encerre e realize os outros.						
			
			if (seg == pt1) {
				System.out.print("\nSegundo colocado: " + nome1 + ", pontuação:  " + seg);
				}
				else if (seg == pt2) {
					System.out.print("\nSegundo colocado: " + nome2 + ", pontuação: " + seg);
				}
				else if ( seg == pt3) {
					System.out.print("\nSegundo colocado: " + nome3 + ", pontuação: " + seg);
				}
			
			
			if (terc == pt1) {
				System.out.print("\nTerceiro colocado: " + nome1 + ", pontuação: " + terc);
			}
				else if (terc == pt2) {
					System.out.print("\nTerceiro colocado: " + nome2 + ", pontuação: " + terc);
				}	
				else if (terc == pt3){
					System.out.print("\nTerceiro colocado: " + nome3 + ", pontuação: " + terc);
				}
						
		
		ler.close();
	}

}

package Algoritmo_124;

import java.util.Scanner;

public class ClassificaAngulos {
	static int ladoA, ladoB, ladoC;
	static double maior, lados;
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Algoritmo: Lê três números e imprimi a classificação do triângulo.");

	System.out.print("Informe o valor do lado A: ");	
		ladoA = ler.nextInt();
	System.out.print("Informe o valor do lado B: ");
		ladoB = ler.nextInt();
	System.out.print("Informe o valor do lado C: ");
		ladoC = ler.nextInt();
		
		if( ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA  + ladoB) { 
			if (ladoA > ladoB && ladoA > ladoC){ 
				maior = Math.pow(ladoA, 2); 
				lados = Math.pow(ladoB, 2) + Math.pow(ladoC, 2); 
				}
			else {
				if (ladoB > ladoC){	
					maior = Math.pow(ladoB, 2); 
					lados = Math.pow(ladoA, 2) + Math.pow(ladoC, 2); 
					} 
					else{
						maior = Math.pow(ladoC, 2); 
						lados = Math.pow(ladoA, 2) + Math.pow(ladoB, 2); 
						} 
				}
			if ( maior == lados ){ 
				System.out.print("\nTriangulo Retangulo"); 
			}
				else { 
					if ( maior > lados ){ 
						System.out.print("\nTriangulo Obtusangulo"); 
						} 
						else{ 
							System.out.print("\nTriangulo Acutangulo"); 
							} 
					} 
			}
			else { 
				System.out.print("\nas medidas não formam um triangulo"); 
			}
		
		
		ler.close();
	}

}

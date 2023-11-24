package Aula_14_POO;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		CalculadoraBase calculadora = new CalculadoraBase();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor");
		 	calculadora.valor01=ler.nextDouble();
		System.out.println("Informe outro valor");
		 	calculadora.valor02=ler.nextDouble();
		 	
		calculadora.somar(calculadora.valor01, calculadora.valor02);
		
		ler.close();	 	
	}

}

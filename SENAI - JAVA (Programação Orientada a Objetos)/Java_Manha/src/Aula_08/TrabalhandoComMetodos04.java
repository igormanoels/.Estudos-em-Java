package Aula_08;

import java.util.Scanner;

public class TrabalhandoComMetodos04 {

	public static void main(String[] args) {
/* ESSA É A FORMA DE TRABALHAR EM METODOS COM RETORNO SEM PASSAGEM DE PARAMETRO
 * public static int solicitarvalor()
 * Recebe o valor e retorna o valor com
 * return Nomevariavel;
 */
	double total = lervalor1() + lervalor2();
// soma os valores recebidos a partir dos métodos criados 
	System.out.println("Total: " + total);
		
	}

	private static double lervalor2() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o segundo valor");
		double valor2 = ler.nextDouble();
// recebe o valor e armazena na variavel local (valor2) 
		ler.close();
		return valor2;
	}
// envia o valor armazenado na variavel local, para o metodo chamador

	public static double lervalor1() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		double valor1 = ler.nextDouble();
		ler.close();
		return valor1;
	}

}

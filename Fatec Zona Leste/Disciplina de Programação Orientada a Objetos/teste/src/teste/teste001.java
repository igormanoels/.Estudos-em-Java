package teste;

import java.util.Scanner;

public class teste001 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o texto desejado para converter em ASCII: ");
		String texto = ler.nextLine();
		
		char[] vetLetras = texto.toCharArray();
		
		for (int i = 0; i < vetLetras.length; i++) 
		{
			String binario = Integer.toBinaryString(vetLetras[i]);
			while(binario.length() < 8) binario = "0" + binario;
			System.out.print(binario + " ");
		}
		
		
		ler.close();
	}
}

package Aula_12;

import java.util.Scanner;

public class TrabalhandoComEstruturasDeRepeticao_04 {

	public static void main(String[] args) {
		String resposta;
		
		Scanner ler = new Scanner(System.in);
		
		while (true) {
			System.out.print("Desaja continuar?  ");
				resposta = ler.nextLine();
			if (resposta.equals("sim")) {
				System.out.print("Digite um nome:  ");
					ler.nextLine();
// o ler.nextLine(); não está com uma variavel porque apenas é inserido um nunmero
// não a tratamento da informação dentro do programa
				}
				else if (resposta.equals("não")){
					System.out.println("Fim do programa! ");
					break;
				}
			}
		ler.close();
	}

}

package br.edu.dio.Aula_003_Interfaces.ex_001;

import java.util.Scanner;

/* 
 * 1 - Escreva urn código para enviu mensagens de texto, para isso você deve ter a possibilidade 
 * de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um método para 
 * receber a mensagem como parâmetro, os serviços que devem estar disponiveis Ao:
 * 
 * sms
 * e-mail
 * redes sociais
 * whatsapp
 */
public class Main {
	
	private static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("Aplicativos instalados\n"
					+ "1 - SMS\n"
					+ "2 - E-mail\n"
					+ "3 - Redes Sociais\n"
					+ "4 - Whatsapp\n"
					+ "0 - Encerrar "
					+ "Escolha um serviço de mensagem: ");
			var op = Integer.parseInt(ler.nextLine());
			
			switch (op) {
				case 1 -> aplicativo(new Sms());
				
				case 2 -> aplicativo(new Email());
				
				case 3 -> aplicativo(new RedesSociais());
				
				case 4 -> aplicativo(new Whatsapp());
				
				case 0 -> {
					System.out.println("Encerrando aplicação");
					break;
				}
				
				default -> System.out.println("Opção inválida.");
			}			
		}
		
		
		
	}
	
	
	
	public static void aplicativo(Object app) {

		while(true) {
			
			
		}

	}

}

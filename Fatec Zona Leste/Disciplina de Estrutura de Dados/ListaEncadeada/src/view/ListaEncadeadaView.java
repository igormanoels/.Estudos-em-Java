package view;

import java.util.Scanner;

import control.ListaEncadeadaControl;

public class ListaEncadeadaView {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String entrada;
		ListaEncadeadaControl<String> control = 
				new ListaEncadeadaControl<>();
		boolean continuar = true;
		while(continuar) {
			System.out.print("Informe um valor para a lista: ");
			entrada = ler.nextLine();
			if (entrada.equals("0")) {
				continuar  = false;
			} else {
				control.adicionar(entrada);
			}
		}
		
		// Imprimir a lista
		System.out.println(control.toString());
		
		// Imprimir a indice
		System.out.println(control.toString(3));
		
		ler.close();
	}

}

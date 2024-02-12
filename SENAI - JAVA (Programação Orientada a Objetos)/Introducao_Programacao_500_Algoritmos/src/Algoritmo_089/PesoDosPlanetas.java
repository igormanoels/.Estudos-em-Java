package Algoritmo_89;

import java.util.Scanner;

public class PesoDosPlanetas {
	static int opcao;
	static double massa, peso;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	System.out.println("Descubra o seu peso nos outros planetas do Sistema Solar");
	System.out.println("Digite a opção 1 para: Mercúrio");
	System.out.println("Digite a opção 2 para: Venus");
	System.out.println("Digite a opção 3 para: Marte");
	System.out.println("Digite a opção 4 para: Júpter");
	System.out.println("Digite a opção 5 para: Saturno");
	System.out.println("Digite a opção 6 para: Urano");
		opcao = ler.nextInt();
	System.out.println("Informe o seu peso na terra");
		peso = ler.nextDouble();
		
	mostramassa(opcao, peso);
	
		ler.close();
	}
	
	static void mostramassa(int op, double ps) {		
		switch (op){
		case 1:
			massa = ((ps/10)*0.37);
			System.out.println("Massa: " + massa);
			break;
		case 2:
			massa = ((ps/10)*0.88);
			System.out.println("Massa: " + massa);
			break;
		case 3:
			massa = ((ps/10)*0.38);
			System.out.println("Massa: " + massa);
			break;
		case 4:
			massa = ((ps/10)*2.64);
			System.out.println("Massa: " + massa);
			break;
		case 5:
			massa = ((ps/10)*1.15);
			System.out.println("Massa: " + massa);
			break;
		case 6:
			massa = ((ps/10)*1.17);
			System.out.println("Massa: " + massa);
			break;		
		default:
			System.out.println("Opção inválida");
		}
	}

}

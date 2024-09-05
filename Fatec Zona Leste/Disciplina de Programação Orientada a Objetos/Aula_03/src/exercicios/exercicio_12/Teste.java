package exercicios.exercicio_12;

import java.util.Scanner;

public class Teste {
	
	private static boolean iniciar = true;
	private static String op;
	public static Dinossauro skeep = new Dinossauro();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\t\tDinosaur Adventures 'Skeep'!!!\n"
				+ "=================================================================");
		
		while (iniciar) {		
			if (skeep.getEnergia() > 0 && skeep.getHumor() > 0 && skeep.getVelocidade() > 0
					&& skeep.getTemperatura() > 0 && skeep.getTemperatura() < 100  ) {
				exibirStatus();
				System.out.print("=================================================================\n"
						+ "Pressione a opção desejada para interagir com Skeep\n"
						+ "\n"
						+ "(P)ular \t (C)orrer \t Co(M)er\r\n"
						+ "C(A)ntar \t Tomar (S)ol \t Ficar na S(O)mbra\n"
						+ "=================================================================\n"
						+ "Digite a opção desejada ou (Q)uit para encerrar: ");
				op = scan.nextLine().toUpperCase();
			} else {
				System.out.println("Você deixou Skeep morrer!!!");
				op = "Q";
			}
			
			switch (op) {
			case "P":
				skeep.pular();
				break;
			case "C":
				skeep.correr();
				break;
			case "M":
				skeep.comer();
				break;
			case "A":
				skeep.cantar();
				break;
			case "S":
				skeep.tomarSol();
				break;
			case "O":
				skeep.ficarNaSombra();
				break;
			case "Q":
					System.out.println("\n\nJogo finalizado!\n\n");
					iniciar = false;
				break;
			default:
				System.out.println("\n\nOpção inválida! \nEscolha uma das letras: \"P, C, M, A, S, O ou Q\". \n"
						+ "Conforme o menu a seguir.\n\n");
				break;
			}
		}
		
		scan.close();
	}
	
	private static void exibirStatus() {
		System.out.println("Status do Skeep:\n"
				+ "Energia = " + skeep.getEnergia() + " | Humor = " + skeep.getHumor()
				+ " | Temperatura = " + skeep.getTemperatura() + " | Velocidade = " + skeep.getVelocidade());
	}
	
}

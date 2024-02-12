package Algoritmo_002;

import javax.swing.JOptionPane;

public class Mascar_Chiclete {

	public static void main(String[] args) {
		String resposta;
		System.out.println("Algoritmo para mascar um chiclete");

		resposta = JOptionPane.showInputDialog("Você comprou chiclete?");
		
		if (resposta.equals("sim"))
			{
				System.out.println("Abra a embalagem, masque o chiquelete!");
				System.out.println("E n ão esqueça de jogar o papel no chão");
			}
			else if (resposta.equals("não"))
				{
					System.out.println("Vá até a venda do Sr. Zé para comprar!");
				}
				else
					{
						System.out.println("Confira sua resposta");
					}
	}

}

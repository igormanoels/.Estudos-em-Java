package Aula_02;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		Double saldo, saque;
		
		saldo = 2000.00;
				
		saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar"));
		
		if (saque <= saldo)
			{
				System.out.println("Saque liberado");
				saldo = (saldo - saque);
				System.out.println("Valor do saque R$" + saque);
				System.out.println("Saldo Disponivel R$" + saldo);
			} 
			else
				{
					System.out.println("Saldo indisponivel");
				}
	}

}

package Aula_02;

import javax.swing.JOptionPane;

public class Funcionarios {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Por favor escreva seu nome");
		Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Agora informe sua idade"));
		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por mês?"));
		
		//System.out.println(nome + ", sua idade é " + idade + "\nO salário informado é de R$ " + salario);
		// primeira forma
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + ", idade: " + idade + ", Salário: " + salario);
		// para usar a mensagem não é necessário fazer System.out...
		
	}

}

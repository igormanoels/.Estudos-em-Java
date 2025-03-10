package exercicio001;

import javax.swing.JOptionPane;

public class Principal {
	
	static int vetor[] = new int[10];
	
	public static void main(String[] args) 
	{
		menu();
	}
	
	public static void menu()
	{
		int op;
		Funcoes funcoes = new Funcoes();
		
		do 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu com opções: "
					+ "\n1- Gerar vetor"
					+ "\n2- Classificar vetor"
					+ "\n3- Exibir vetor"
					+ "\n9- Sair"));
			if (op != 1 && op != 2 && op !=3 && op != 9) 
			{
				JOptionPane.showMessageDialog(null, "Opção inválida! \nDigite novamente... ");
			} 
		} while (op != 1 && op != 2 && op !=3 && op != 9);
	
		switch (op) 
		{
		case 1:
			vetor = funcoes.gerarVetor(vetor);
			JOptionPane.showMessageDialog(null, "Vetor gerado com sucesso!");
			menu();
			break;
		case 2:
			vetor = funcoes.classificaVetor(vetor);
			JOptionPane.showMessageDialog(null, "Vetor classificado com sucesso!");
			menu();
			break;
		case 3:
			funcoes.exibeVetor(vetor);
			menu();
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Até logo, obrigado por testar meu algoritmo!");
			break;

		}
	}
}

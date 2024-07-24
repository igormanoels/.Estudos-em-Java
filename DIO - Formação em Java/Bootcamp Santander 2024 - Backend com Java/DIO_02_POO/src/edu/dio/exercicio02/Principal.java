package edu.dio.exercicio02;

import javax.swing.JOptionPane;

/*
 * Soma de Números
 * Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
 * Implemente os seguintes métodos:
 * 
 * 	- adicionarNumero(int numero): Adiciona um número à lista de números.
 * 	- calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
 * 	- encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
 * 	- encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
 * 	- exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 * 
 */
public class Principal 
{
	static int numero;
	
	public static void main(String[] args) 
	{
		boolean finalizar = true;
        int op;
        SomaNumeros numeros = new SomaNumeros();

        while (finalizar) 
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Lista de Números\n"
                    + "1 - Adicionar número. \n"
                    + "2 - Cálcular soma. \n"
                    + "3 - Encontrar o maior número.\n"
                    + "4 - Encontrar o menor número. \n"
                    + "5 - Mostrar os números. \n"
                    + "0 - Finalizar."));
            switch (op) 
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", "Fim da Aplicação.", JOptionPane.CLOSED_OPTION);
                    finalizar = false;
                    break;
                case 1:
                	numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Incluir número", JOptionPane.INFORMATION_MESSAGE));
                    numeros.adicionarNumero(numero);
                    JOptionPane.showMessageDialog(null, "Número Adcionado!");
                    break;
                case 2:
                    numeros.calcularSoma();
                    break;
                case 3:
                    numeros.encontrarMaiorNumero();
                    break;
                case 4:
                    numeros.encontrarMenorNumero();
                    break;
                case 5:
                	numeros.exibirNumeros();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção conforme o menu a seguir","Opção inválida!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
	}

}

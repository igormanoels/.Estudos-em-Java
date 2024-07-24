package edu.dio.exercicio03;

import javax.swing.JOptionPane;

import edu.dio.exercicio02.SomaNumeros;

/*
 * 2. Ordenação de Números
 * Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. 
 * 
 * Implemente os seguintes métodos:
 * 	- adicionarNumero(int numero): Adiciona um número à lista.
 * 	- ordenarAscendente(): Ordena os números da lista em ordem ascendente usando 
 * 	a interface Comparable e a class Collections.
 * 	- ordenarDescendente(): Ordena os números da lista em ordem descendente usando um 
 * 	Comparable e a class Collections. 
 */
public class Principal 
{
	
	public static void main(String[] args) 
	{
		boolean finalizar = true;
        int op, numero;
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        

        while (finalizar) 
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Lista de Números\n"
                    + "1 - Adicionar número. \n"
                    + "2 - Exibir em Ordem Crescente.\n"
                    + "3 - Exibir em Ordem Decrescente.\n"
                    + "0 - Finalizar."));
            switch (op) 
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", "Fim da Aplicação.", JOptionPane.CLOSED_OPTION);
                    finalizar = false;
                    break;
                case 1:
                	numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Incluir número", JOptionPane.INFORMATION_MESSAGE));
                    numeros.adcionarNumero(numero);
                    break;
                case 2:
                    numeros.ordenarAscendente();
                    break;
                case 3:
                    numeros.ordenarDescendente();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção conforme o menu a seguir","Opção inválida!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
	}
}

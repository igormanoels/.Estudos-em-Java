package exercicios;

/*
 * Ex02-Estouro da memória Stack
 * 
 * Instruções: Faça um código em Java para estourar a memória Stack. Você saberá 
 * que o programa foi bem sucedido quando ocorrer um erro de StackOverflow
 */
public class Exercicio002 
{	
	public static int contador = 0;
	
	public static void main(String[] args) 
	{
		System.out.println("Contando até a memória Stack estourar: " + ++contador + "vezes");
		main(args); // O meu só chegou perto de 5k repetições
	}

}

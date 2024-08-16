package calculos;

import java.util.Scanner;

public class somarValores 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		double num1 = ler.nextDouble();
		
		System.out.print("Informe o segundo valor: ");
		double num2 = ler.nextDouble();
		
		double soma = num1 + num2;
		System.out.printf("Soma: %.2f", soma);
		
		double divisao = num1 / num2;
		System.out.printf("\nDivisão: %.2f", divisao);
		
		ler.close();
		
		
		
		/* Essa operação, diz que C mod 100, soma a C e atribui a C
		 * Como o mod é a operação realizada, há uma garantia implicita que apenas 
		 * os valores depois da vigula serão apresentados para o usuário.
		 */
		int c = 0;
		while(true)
		{
			c++;
			c %= 100; 
			System.out.println(c);
		}
		
		
	}
}

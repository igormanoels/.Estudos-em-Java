package Aula_13;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		// COMPARADORES RETORNAM VALORES BOLEANOS
		int valor1 = 1;
		int valor2 = 2;
		
		// And -> && - ambos precisam ser verdadeiros
		System.out.println(valor1 == 1 && valor2 == 2);
		
		// Or -> || - apenas um precisa ser verdadeiro
		System.out.println(valor1 == 1 || valor2 == 2);

		
		boolean a = true;
		boolean b = false;
		
		// & (Conjunção) - Precisa de ambas verades para ser verdade
		System.out.println("Conjunção  -> " + (a && b));

		// | (Disjunção) - Precisa de apenas uma verdade para ser verdade
		System.out.println("Disjunção  -> " + (a || b));

		// ~ (Negação) - Inverte a condução
		System.out.println("Negação  -> " + (!a));

		// 'XOR' / 'OU Exclusivo' - Precisa que os valores sejam diferentes para ser verdade
		System.out.println("Ou exclusivo  -> " + (a ^ b));
		
		


		// Utilizando o comparador & ou | para comparação, o java ira percorer as duas variáveis para comparação
		boolean resultado1 = a 
				& b;
		// Utilizando o modelo curto circuito, assim que o java encontra uma resposta que atenda a condição ele encerra
		// isso torna a verificação mais ágil
		boolean resultado2 = a 
				&& b;
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}

package teste;

/* Digite um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. 
 * A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com 
 * que o valor que estâ em A passe para B e vice-versa. Ao final, escrever os valores que ficaram 
 * armazenados nas variáveis
 */
public class Questao01 {
	
	public static void main(String[] args) {
		int varA = 10;
		int varB = 20;
		int tmp;
		
		tmp = varA;
		varA = varB;
		varB = tmp;
		
		System.out.printf("Valor A: %d \nValor B: %d", varA, varB);	
	}
}

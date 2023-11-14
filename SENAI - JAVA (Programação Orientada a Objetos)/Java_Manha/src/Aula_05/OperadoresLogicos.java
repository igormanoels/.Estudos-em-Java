package Aula_05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int valor01 = 1 , valor02 = 2 , valor03 = 3 , valor04 = 4;
		boolean teste;
		
		teste = ((valor01 < valor02) && (valor03 > valor04));
		System.out.println(teste);
// teste se ambos os valores são verdadeiros para ser verdadeiro
		
		teste = ((valor01 > valor02) || (valor03 < valor04));
		System.out.println(teste);
// teste quando um dos valores for verdadeiro, a senteça td é verdade
// apenas quando ambas condições forem falsas a resposta será falsa
		

	}

}

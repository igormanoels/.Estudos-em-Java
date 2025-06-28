package Aula_11;

public class CuriosidadeInteiros {
	
	public static void main(String[] args) {
		
		int var1 = 214783647;
		int var2 = 1;
		
		System.out.println(var1 + var2);
		/* 
		 * Os números em java funcionam como uma roleta, ao somar os número, caso a soma ultrapasse o limite
		 * ele será incrementado para o número negativo.
		 * 
		 * */
		
		
		int x = Integer.MAX_VALUE;
		x = x + 1;
		System.out.println(x);
		// saída esperada = -2147483648

		int x2 = Integer.MIN_VALUE;
		x2 = x2 - 1;
		System.out.println(x);
		// saída esperada = 2147483647
		
		
	}
	
}

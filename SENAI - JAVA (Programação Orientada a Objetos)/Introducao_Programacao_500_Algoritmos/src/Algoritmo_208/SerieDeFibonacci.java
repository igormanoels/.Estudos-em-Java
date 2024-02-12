package Algoritmo_208;

public class SerieDeFibonacci {

	public static void main(String[] args) {
		int[] fibo = new int[10];
		fibo[1]++; // atribui um ao elemento e realiza a operação sem chumbar um número.
		
		System.out.println("Algoritmo: Imprime os 10 primeiros termos da série de Fibonacci.");
		
		System.out.print("Série Fibonacci: ");
		
		for (int i = 2; i < fibo.length; i++) {
			
				fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int i = 0; i < fibo.length; i++) 
		{
			System.out.print(fibo[i] + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TOD O: handle exception
			}
		}
		
	}

}

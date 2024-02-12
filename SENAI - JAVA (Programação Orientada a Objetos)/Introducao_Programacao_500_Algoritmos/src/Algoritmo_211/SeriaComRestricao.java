package Algoritmo_211;

public class SeriaComRestricao {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os valores de 10 a 100, se N não acabar em 0 e também se N == quando dividido pelo primeiro termo.");
		
		
		System.out.print("Valores da série: ");
		for (int i = 10; i <= 100; i++) {
			if (i % 10 != 0) 
			{
				var div = i / 10;
				if (i % div == 0) 
				{
					System.out.print(i + " ");
				}
			}
		}
		
		
	}

}

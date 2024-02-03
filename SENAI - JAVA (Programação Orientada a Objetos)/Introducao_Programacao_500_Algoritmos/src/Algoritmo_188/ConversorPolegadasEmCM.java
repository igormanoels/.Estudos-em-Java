package Algoritmo_188;

public class ConversorPolegadasEmCM {

	public static void main(String[] args) {
		double [] cm = new double[20];
		int pol = 1;

		System.out.println("Algoritmo: Imprime uma tabela com as polegadas de 1 a 20.");
		
		System.out.println("POLEGADA(S)\t|\tCENTIMETROS");
		for (int i = 0; i <= 19; i++) {
			cm[i] = pol * 2.54; 
			System.out.println(pol + " polegada(s) \t|\t " + cm[i] + " cm");
			pol++;
		}
		
		
	}

}

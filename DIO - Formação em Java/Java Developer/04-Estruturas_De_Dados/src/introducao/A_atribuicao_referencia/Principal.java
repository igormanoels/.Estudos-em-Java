package introducao.A_atribuicao_referencia;

public class Principal 
{
	public static void main(String[] args) 
	{
		int valorA = 1;
		int valorB = valorA;
		System.out.println("Valor A: " + valorA + " - Valor B: " + valorB);

		valorA = 2;
		System.out.println("Valor A: " + valorA + " - Valor B: " + valorB);

		System.out.println();
		
		Objeto objA = new Objeto(1);
		Objeto objB = objA;
		System.out.println("Valor A: " + objA + " - Valor B: " + objB);
		
		objA.setNum(2);
		System.out.println("Valor A: " + objA + " - Valor B: " + objB);
	}

}

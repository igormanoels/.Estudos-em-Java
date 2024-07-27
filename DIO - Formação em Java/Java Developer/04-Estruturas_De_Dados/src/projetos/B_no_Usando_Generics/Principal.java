package projetos.B_no_Usando_Generics;

public class Principal 
{
	public static void main(String[] args) 
	{
		No<String> no1 = new No<>("Conteúdo Nó 1");
		
		No<String>  no2  = new No<>("Conteúdo Nó 2");
		no1.setProximoNo(no2);
		
		No<String>  no3  = new No<>("Conteúdo Nó 3");
		no2.setProximoNo(no3);
	
		No<String>  no4  = new No<>("Conteúdo Nó 4");
		no3.setProximoNo(no4);
	
		// no1 -> no2 -> no3 -> no4 -> null
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
		

		System.out.println();

		
		No<Double> num1 = new No<>(45.2);
		
		No<Double> num2 = new No<>(45.2*2);
		num1.setProximoNo(num2);
		
		System.out.println(num1);
		System.out.println(num1.getProximoNo());
		System.out.println(num1.getProximoNo().getProximoNo());
		
		
		
	}
}

package Aula_01;

public class Vendedor {

	public static void main(String[] args) {
		Double salario = 1599.35;
		Double comissao = 300.00;
		Double desconto = 150.00;
		Double res;
		
		res = (salario + comissao - desconto);
		System.out.println("O salário do vendedor é R$ " + res);
	}

}

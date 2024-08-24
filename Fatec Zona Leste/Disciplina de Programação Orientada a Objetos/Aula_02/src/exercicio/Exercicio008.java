package exercicio;

/*
 * Ex08 - Métodos classe Caixa com varargs
 * 
 * Instruções: Com base no exercício anterior o seu cliente pediu para que as vendas possam receber 
 * diversos produtos simultaneamente.Faça a modificação no método venda de maneira que possa somar 
 * os valores de diversos produtos de uma única vez.
 */
public class Exercicio008 
{
	public static void main(String[] args) 
	{
		Caixaa caixa = new Caixaa();
		
		double valorVenda = caixa.venda(4.5, 88.4, 98.49, 45.12, 89,1.17);
		
		System.out.printf("O total da venda será: R$ %.2f", valorVenda);
	}
	
	
	
}

class Caixaa
{
	private double saldo = 0d;
	
	public double venda(double ...itens)
	{
			
		for (double item : itens) saldo+= item;
			
		return saldo;
	}
}
package exercicio;

/*
 * Ex07 - Métodos classe Caixa
 * 
 * Instruções: Crie uma classe chamada Caixa que faça venda de produtos, conforme o layout em anexo. 
 * A função da venda deverá acrescer o valor do produto no saldo, e deverá retornar o valor do novo saldo
 * Faça também uma classe para testes que instancie o objeto Caixa e invoque a função venda.
 */
public class Exercicio07 
{
	public static void main(String[] args) 
	{
		Caixa caixa = new Caixa();
		
		double valorVenda = caixa.venda(4.50d);
		
		System.out.printf("O total da venda será: R$ %.2f", valorVenda);
	}
	
	
}

class Caixa
{
	private double saldo = 0d;
	
	public double venda(double item)
	{			
		return saldo += item;
	}
}
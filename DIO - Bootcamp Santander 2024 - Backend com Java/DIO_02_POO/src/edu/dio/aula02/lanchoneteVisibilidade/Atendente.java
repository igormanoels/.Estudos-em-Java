package edu.dio.aula02.lanchoneteVisibilidade;

public class Atendente 
{
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() // quando não houver modificador, apenas as classes do próprio pacote, tem acesso a ter esse acesso.
	{
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	public void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}

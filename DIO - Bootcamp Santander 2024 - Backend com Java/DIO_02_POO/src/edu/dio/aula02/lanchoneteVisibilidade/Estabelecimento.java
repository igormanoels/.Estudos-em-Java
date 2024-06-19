package edu.dio.aula02.lanchonete;

public class Estabelecimento 
{
	public static void main(String[] args) 
	{
		Cozinheiro cozinheiro = new Cozinheiro();
		Cliente cliente = new Cliente();
		Atendente atendente = new Atendente();
		
		cliente.escolherLanche();
		cliente.fazerPedido();

		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		atendente.pegarPedidoBalcao();
		atendente.servindoMesa();		
		
		cliente.pagarConta();		
		
		atendente.receberPagamento();
	}
}

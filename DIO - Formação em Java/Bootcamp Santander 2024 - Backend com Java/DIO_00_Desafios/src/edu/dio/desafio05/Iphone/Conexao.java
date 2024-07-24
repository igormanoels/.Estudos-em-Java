package edu.dio.desafio05.Iphone;


public abstract class Conexao 
{
	/*	Essa seria uma classe que o usuário não precisaria enxergar, mas estou deixando visivel 
	 * 	a titulo de conhecimento para a avaliação do desafio
	 */
	
	protected String url;
	protected String paginas[] = new String[5];
	protected int abas = 0;
	
	protected void VerificarConexao()
	{
		System.out.print("\nVerificando conexão");
		for (int i = 0; i < 6; i++) 
		{
			try {
				System.out.print(".");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Conectar();
	}
	
	protected void Conectar() 
	{
		System.out.print(" Conectado.\n");
	}
	
	public abstract void CarregarPagina();
	
	public abstract void AtualizarPagina();
}

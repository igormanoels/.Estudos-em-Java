package edu.dio.desafio05.Iphone;

import java.util.Scanner;

public class Safari extends Conexao
{

	@Override
	public void CarregarPagina() 
	{	
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o URL: ");
		this.setUrl(ler.nextLine());
		this.paginas[abas] = getUrl();
		
		VerificarConexao();
		
		System.out.println("Contúdo do site sendo visualizado pelo usuário");
		ler.close();
	}	

	
	@Override
	public void AtualizarPagina() 
	{	
		System.out.print("\nCarregando página novamente.");
		VerificarConexao();
	}
	
	
	public void NovaAba()
	{
		if (abas > 5) 
		{
			System.out.println("Número máximo de abas atingido");
		}
		else
		{
			this.abas += 1;
			CarregarPagina();
		}
	}
	
	public void FecharAba() 
	{
		System.out.println("Página Fechada");
		this.abas -= 1; 
	}

	// Métodos Getter e Setters
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas[]) {
		this.paginas = paginas;
	}
	

}

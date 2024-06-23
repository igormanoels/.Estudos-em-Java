package edu.dio.aula13.CollectionsList;

/*
 * 	Catálogo de Livros
 * 	Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. 
 * 	
 * 	Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:
 * 		- adicionarLivro(String titulo, String autor, int anoPublicacao)Adiciona um livro ao catálogo.
 * 		
 * 		- pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
 * 		
 * 		- pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado 
 * 		intervalo de anos e retorna uma lista com os livros encontrados.
 * 		
 * 		- pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
 * 
 */
public class Principal 
{

	public static void main(String[] args) 
	{
		CatalogoLivro catalogo = new CatalogoLivro();
		
		// Cadastrando livros
		catalogo.adcionarLivro("Branca de Neve", "Disney", 1994);
		catalogo.adcionarLivro("João e o pé de feijão", "Pedro", 1998);
		catalogo.adcionarLivro("Cinderela", "Disney", 2002);
		catalogo.adcionarLivro("Chapeuzinho Vermelho", "Disney", 2000);
		catalogo.adcionarLivro("O homem da floresta", "Castro", 2003);
		catalogo.adcionarLivro("Menino Maluquinho", "Saraiva", 2014);
		catalogo.adcionarLivro("Meu amigo favorito", "J.O.P", 2020);
		catalogo.adcionarLivro("Meu mundo, minha vida!", "Flavinho", 2023);
		
		// Pesquisa por autor
		System.out.println(catalogo.pesquisarPorAutor("disney") + "\n\n\n");
		
		
		// Pesquisa por Intervalo de ano
		System.out.println(catalogo.pesquisarPorIntervaloDeAno(2000, 2020) + "\n\n\n");
		
		
		// Pesquisa por Titulo
		System.out.println(catalogo.pesquisarPorTitulo("branca de neve") + "\n\n\n");
		
	}

}

package main;

/***************************************************************************************
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas - 3º Semestre
 * @author Igor Manoel
 * Github: igormanoels
 * Teste: Requisitos: Cadastro e Listagem de Produtos
 * 	Cadastro:
 * 		Formulário com os campos abaixo:
 * 		- Nome do produto (campo de texto);
 * 		- Descrição do Produto (campo de texto);
 * 		- Valor do Produto (campo de valor);
 * 		- Disponível para venda (campo com opções de s/n)
 * 	Listagem:
 * 		- Colunas da listagem: nome e valor;
 * 		- Ordenação por valor do menor para o maior;
 * 		- Quando cadastrar um novo produto é para abrir a listagem automaticamente;
 * 		- Deve existir um botão para cadastar um novo produto a partir da listagem.		
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        RepositorioProduto repositorioProduto = new RepositorioProduto();

        int opcao;
        do 
        {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) 
            {
                case 1:
                	cadastrarProduto(scanner, repositorioProduto);
                    break;
                case 2:
                	listarProdutos(repositorioProduto);
                    break;
                case 9:
                    System.out.println("\n\nObrigado por testar! Até logo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);
        
        scanner.close();
    }
    
    private static void exibirMenu() 
    {
        System.out.println("\n----- MENU -----");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("9 - Sair");
        System.out.print("Opção: ");
    }
    
    private static void cadastrarProduto(Scanner scanner, RepositorioProduto repositorioProduto) 
    {
        System.out.println("\n\n** Cadastro de Produto **");

        Produto produto = new Produto();

        System.out.print("Nome: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Descrição: ");
        produto.setDescricao(scanner.nextLine());

        System.out.print("Valor: ");
        produto.setValor(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Disponível para venda (S/N): ");
        produto.setDisponivelVenda(scanner.nextLine().equalsIgnoreCase("S"));

        repositorioProduto.cadastrar(produto);

        System.out.println("\nProduto cadastrado com sucesso!");

        listarProdutos(repositorioProduto);
    }

    private static void listarProdutos(RepositorioProduto repositorioProduto) 
    {
        System.out.println("\n\n** Lista de Produtos **");

        System.out.println("|Nome\t|\tValor\t|\tDisponível\t|\t\tDescrição\t\t|");
        System.out.println("|\t|\t\t|\t\t\t|\t\t\t\t\t|");

        for (Produto produto : repositorioProduto.listar()) 
        {
            System.out.printf("|\t%s\t|\tR$ %.2f\t|\t%s\t\t|\t\t%s\t\t\t|\n", produto.getNome(), 
            		produto.getValor(), produto.isDisponivelVenda() ? "Sim" : "Não", produto.getDescricao());
        }

        System.out.println();
    }


}

class Produto 
{
	private int id;
	private String nome;
	private String descricao;
	private double valor;
	private boolean disponivelVenda;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public void setDescricao(String descricao) 
	{
	this.descricao = descricao;
	}

    public double getValor() 
    {
        return valor;
    }

    public void setValor(double valor) 
    {
        this.valor = valor;
    }

    public boolean isDisponivelVenda() 
    {
        return disponivelVenda;
    }

    public void setDisponivelVenda(boolean disponivelVenda) 
    {
        this.disponivelVenda = disponivelVenda;
    }

}

class RepositorioProduto 
{

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto) 
    {
        produtos.add(produto);
    }

    public List<Produto> listar() 
    {
        Collections.sort(produtos, Comparator.comparing(Produto::getValor));
        return produtos;
    }

    public Produto buscarPorId(int id) 
    {
        for (Produto produto : produtos) 
        {
            if (produto.getId() == id) 
            {
                return produto;
            }
        }
        return null;
    }

    public void atualizar(Produto produto) 
    {
        for (int i = 0; i < produtos.size(); i++) 
        {
            if (produtos.get(i).getId() == produto.getId()) 
            {
                produtos.set(i, produto);
                return;
            }
        }
    }
    
    
}

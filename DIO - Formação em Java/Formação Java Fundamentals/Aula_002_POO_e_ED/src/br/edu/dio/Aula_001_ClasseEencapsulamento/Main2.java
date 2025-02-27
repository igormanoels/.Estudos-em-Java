package br.edu.dio.Aula_001_ClasseEencapsulamento;

public class Main2 {
	
	public static void main(String[] args) {
		Pessoa2 joao = new Pessoa2("João");
		
		// Além do acesso convencional de acesso
		System.out.println(joao.toString());
		
		
		// O record também conta com acessos dinamicos, que subistituem a nescessidade de utilizar getter and setters
		System.out.println(joao.nome());
		
		
		// Você também pode fazer uso de métodos
		System.out.println(joao.getInfo());
	}
}

// O record se comporta como se fosse o contrutor da classe, obrigando o parametro na instancia
// O problema do record é que ele age como uma classe final, não permitindo alterações em seu conteúdo
record Pessoa2 (String nome){
	
	// o construtor dessa classe, é chamado de compact construtor. Ele é executado logo após da classe ser instanciada 
	// e pode ser usado como método para validação de dados
	public Pessoa2 {
		System.out.println(nome + "pelo construtor compacto");
	}
	
	// Também é possivel criar seus métodos
	public String getInfo() {
		return "Nome: " + nome;
	}
}

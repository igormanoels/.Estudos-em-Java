package Aula_14_POO;

public class Homem {

	public static void main(String[] args) {
		
		Pessoa homem = new Pessoa();
		
		homem.nome="Luiz";
		homem.idade=25;
		homem.cor="Preto";
		homem.acordado=false;
		
		System.out.println("Nome: " + homem.nome);
		homem.dormir(homem.acordado);
	}

}

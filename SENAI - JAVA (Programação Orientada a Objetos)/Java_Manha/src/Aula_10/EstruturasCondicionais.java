package Aula_10;

public class EstruturasCondicionais {

	public static void main(String[] args) {

		casomodelo();
		casogenero();
	}
	
	static double casomodelo() {
		double idade = 15;
		
		if (idade >= 15) {
			System.out.println("Aprovada");
		}	else {
			System.out.println("Reprovada");
		}
		return idade;
	}
	
	static int casogenero() {
		String genero = "F";
		int idade = 16;
		if (genero.equals("F") && idade >= 15) {
			System.out.println("Feminino e Maior de 15");
		} else if (genero.equals("M") && idade >= 15){
			System.out.println("Masculino e Maior de 15");
		} else if (genero.equals("T") && idade >= 15) {
			System.out.println("Transgenero e Maior de 15");
		} else {
			System.out.println("Não atende os requisitos");
		}
		return idade;
// Verificar porque o método não retorna a resposta
	}
}

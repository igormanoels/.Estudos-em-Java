package Aula_01;

public class Pessoas {

	public static void main(String[] args) {
		String nome = "Igor Manoel";
		Integer idade = 28;
		Double salario = 1899.99;
		float peso = 100;
		int rg = 01234567; //há um limite de dados
		char sexo = 'M';
		
		// \n quebra a linha no meio da saída
		System.out.println(nome + ", tem " + idade + " anos." + "\nSeu salário atual é de R$ " + salario);
		System.out.println("Peso: " + peso + "\nRG: " + rg + "\nSexo: " + sexo);
		
	}

}

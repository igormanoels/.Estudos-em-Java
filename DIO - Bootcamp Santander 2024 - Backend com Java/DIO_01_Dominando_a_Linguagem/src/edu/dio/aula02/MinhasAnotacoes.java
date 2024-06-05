package edu.dio.aula002;

public class MinhasAnotacoes {
	public static void main(String[] args) 
	{
		
		/* 	Nomeando pacotes
		 * 
		 * 	com.empresa.NomeDaAplicação			--> Nomeando para empresa/ organizacional
		 * 	edu.seuNome.tema.NomeDaAplicação	--> Nomeando pacotes para projetos educacionais
		 * 	opensource.projeto					--> Nomeando pacotes abertos ao público
		 *	 
		 */
		
		
		// Nomeando Variáveis
		int numero$um = 1;
		int numero1 = 1;
		int numeroUm = 1;
		int longo = 1;
		
		
		// Tipos de Variáveis
		String meuNome = "Igor";
		String sobreNome = "Santana";
		char sexo = 'M';
		int idade = 21;							// Uma sequência de 10 digitos inteiros
		short numeroCurto = 2024;				// Uma sequência de 4 digitos inteiros
		long numeroLongo = 455584777;			// Uma sequência de 9 digitos inteiros
		double numeroDecimal = 2.5;
		float numeroFlutuante = 2.5f;
		boolean usaOculos = true;				// 0 ou 1 bit 
		
		
		// Operadores Aritiméticos
		int valorA = 5;
		int valorB = 8;
		int somar = valorA + valorB; 			// Adição
		int subtrair = valorB - valorA; 		// Subtração
		int multiplicar = valorA * valorB;		// Multiplição
		double dividir = valorA / valorB;		// Divisão
		int resto = valorA % valorB;			// Resto da divisão
		
		
		// Operadores Unários 
		int numero = 5; 						// Número positivo
		numero++;								// Incremente 1 a variável
		numero--;								// Decrementa 1 a variável
		numero = - numero;						// transforma o número em negativo
		
		// Operadores Ternários
		
		
		String nomeCompleto = meuNome.concat(" " + sobreNome); // Concatena um texto
		System.out.println(nomeCompleto);
		
		int ano = 2020;
		ano = 2023;
		final String br = "Brasil"; // a palavra reservada final faz com que a variável se torne imutável
		
		

		
	}
}

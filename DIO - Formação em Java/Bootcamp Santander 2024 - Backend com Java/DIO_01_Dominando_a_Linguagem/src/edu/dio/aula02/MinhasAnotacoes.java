package edu.dio.aula02;

public class MinhasAnotacoes 
{
	public static void main(String[] args) 
	{
		
		/* 	Nomeando pacotes
		 * 
		 * 	gov.projeto							--> Nomeando pacotes para orgãos governamentais 
		 * 	com.empresa.NomeDaAplicação			--> Nomeando pacotes para empresa/ organizacional
		 * 	edu.seuNome.tema.NomeDaAplicação	--> Nomeando pacotes para projetos educacionais
		 * 	opensource.projeto					--> Nomeando pacotes abertos ao público
		 *	ou org.projeto 						--> Nomeando pacotes abertos ao público
		 */
		
		
		// Nomeando Variáveis
		int numero$um = 1;
		int numero1 = 1;
		int numeroUm = 1;
		int longo = 1;
		System.out.print(numero$um + numero1 + numeroUm + longo);

		
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
		int numero = 5; 						// Declaração de variável
		numero++;								// Incremente 1 a variável
		int x = numero ++;						// Incrementa o valor após atribuição
		numero--;								// Decrementa 1 a variável
		numero = -numero;						// transforma o número em negativo
		int y = numero --;						// Decrementa o valor após atribuição
		
		boolean a = true;
		boolean b = !a;							// Inverte o operador lógico negando o valor atribuido
		
		int c = 0;       						// Inverte o valor considerando as posições binárias
		int d = ~c; 							// -6 -5 -4 -3 -2 -1 | 0 1 2 3 4 5
		
		double e = 5.5;							// Casting de um valor
		int f = (int) e; 
		
		// Operadores Ternários
        String categoria = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";		
        	// Verifica se uma condição é verdadeira ou falsa
        	// Tipo Varialvel = Condicao ? Verdadeiro : Falso;
        
        // Operadores Relacionais
        categoria = (idade > 18) ? "Maior" : "Menor ou Igual";		// Operador maior  
        categoria = (idade < 18) ? "Menor" : "Maior ou Igual";		// Operador menor
        categoria = (idade >= 18) ? "Maior ou igual" : "Menor";		// Operador maior ou igual 
        categoria = (idade <= 18) ? "Menor ou Igual" : "Maior";		// Operador menor ou igual
        categoria = (idade == 18) ? "É Igual" : "É Diferente";		// Operador igual
        categoria = (idade != 18) ? "É diferente" : "É Igual";		// Operador Diferente
        
        String texto1 = "casa";
        String texto2 = "roupa";
        boolean compara = texto1.equals(texto2); 					// retorna true ou false        
        
        // Operadores Lógicos
        int nota = 7;
        String avaliar1 = (nota >= 6 && nota <= 10) ? "Aprovado" : "Reprovado";				// Condição 'E'/'AND'
        String avaliar2 = (nota >= 4 || idade < 6) ? "Exame" : "Não ficou de Exame";		// Condição 'OU'/'OR'
        String avaliar3 = (nota != 10)? "Aprovado":"Aprovado com louvor!" ;					// Negação	'Not'
        
        boolean avaliar4 = true;		// estabelece condição como verdadeira
        avaliar4 = !avaliar4;			// nega a condição e inverte para falsa
        
        
		// Testes
		String nomeCompleto = meuNome.concat(" " + sobreNome); // Concatena um texto
		
		final String br = "Brasil"; // a palavra reservada final faz com que a variável se torne imutável


		
		// PRINT APENAS PARA TIRAR O ERRO POR NÃO USAR AS VARIÁVEIS
		System.out.println(somar + subtrair + multiplicar + dividir + resto + x + y + ""+ b +""+ d + f + "Compara: " + compara);
		System.out.println(avaliar1 + avaliar2 + avaliar3 + nomeCompleto + avaliar4 + br + categoria);
		System.out.println(sexo + numeroCurto + numeroLongo + numeroDecimal + numeroFlutuante + ""+ usaOculos); 
	}
}

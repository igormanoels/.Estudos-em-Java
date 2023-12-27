package Aula_04;

public class TiposPrimitivos {

	public static void main(String[] args) {
		int valor_01 = 1000000000;
		// double valor_02 = 1000000000.09;
		// float valor_03 = 1000000000.09f;
		// String palavra = "Texto";
		// boolean condicao = false; // true or false
		// byte valor_04 = 127; //1111111 representado em binário
		// short valor_05 = 11299; // limitado a esse volume de dados numéricos
		// char letra = 'f';
		// long valor_06 = 1000000000000000000l;

		System.out.println(valor_01);
		valor_01 = 3455;
		System.out.println(valor_01);
		// variáveis podem ter seus valores sobrepostos no decorrer do programa, mas não
		// é conveniente atribuir valores no meio do código

		final double PI = 3.14159265358979323846;
		// método para tornar uma variavel constante
		System.out.println("O valor de PI é " + PI);
		// PI = 455;
		// por ser uma constante a variável se torna imutavél, não sendo possivel
		// atribuir outro valor para ela
		// se ainda sim houve uma tentativa, será apresentado um código de erro

	}

}

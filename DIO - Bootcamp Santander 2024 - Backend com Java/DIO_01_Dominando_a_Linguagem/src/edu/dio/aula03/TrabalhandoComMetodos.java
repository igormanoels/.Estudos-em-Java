package edu.dio.aula03;

public class TrabalhandoComMetodos 
{
	// Variáveis Globais 
	// Acessíveis em todos os métodos de classe, independentemente de uma instância da classe.
	static String variavelGlobal = "Visivel apenas nessa classe!";
	
	// Acessíveis em todos os métodos da instância da classe.
	private static String variavelPrivada = "Visivel apenas quando na própria classe";
	
	
	// Método principal da Classe
	public static void main(String[] args) 
	{
		int valor01 = 5;
		int valor02 = 10;
		int resultado;
		dividirSemRetorno(valor01, valor02);
		
		resultado = dividirComRetorno(valor01, valor02);
		System.out.println(resultado);
		
		metodoPrivado();
	}
	
	/* Métodos públicos são visiveis por outras classes,
	 * podendo ser com ou sem returno de valores para o método chamador.	
	 */
	public static void dividirSemRetorno(int v1, int v2) 
	{
		int res = v1 / v2;
		System.out.println(res);
	}
	
	public static int dividirComRetorno(int v1, int v2)
	{
		int res = v1 / v2;
		return res;
	}
	
	
	// Apenas visivel na mesma classes
	private static void metodoPrivado()
	{
		System.out.println(variavelGlobal);
		System.out.println(variavelPrivada);
	}
	
	
}

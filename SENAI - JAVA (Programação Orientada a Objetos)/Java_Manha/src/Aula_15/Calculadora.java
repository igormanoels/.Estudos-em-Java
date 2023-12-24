package Aula_15;

public class Calculadora {

	public static void main(String[] args) {
		EntradaDosDados leitura = new EntradaDosDados();
		OperacoesAritimeticas calcular = new OperacoesAritimeticas();
		
		System.out.println("------------------------------------------------");
		System.out.println("   Seja Bem Vindo a minha primeira cáculadora!  ");
		System.out.println("------------------------------------------------");
		System.out.println("Aqui você pode realizar as seguinte operações: ");
		System.out.println("  Soma, Subtração, Multiplicação e Divisão.\n");
		
		System.out.print("Informe a operação desejada: ");
			leitura.setOperador();
		
			
/*		System.out.println("Operador escolhido: " + leitura.getOperador());
		
		System.out.print("Agora informe o primeiro número: ");
			leitura.setRecValor1();
		System.out.println("Primeiro valor informado: " + leitura.getRecValor1());

		System.out.print("Agora informe o segundo número: ");
			leitura.setRecValor2();
		System.out.println("Primeiro valor informado: " + leitura.getRecValor2());
*/
	}

}

package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonDevagar;
import dio.gof.singleton.SingletonDevagaroOtimizado;
import dio.gof.singleton.SingletonRapido;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Robo;

public class Test 
{
	public static void main(String[] args) 
	{
		//SINGLETON
		SingletonDevagar lazy = SingletonDevagar.getInstancia();
		System.out.println(lazy); // RETORNA A POSIÇÃO DA MEMÓRIA DO OBJETO INSTANCIADO
		
		SingletonDevagar lazy2 = SingletonDevagar.getInstancia();
		System.out.println(lazy2);
		// COMO A IMPLEMENTAÇÃO FUNCIONOU, O CONSOLE RETORNA A MESMA POSIÇÃO DE MEMÓRIA DO OBJETO
		
		SingletonRapido rapido = SingletonRapido.getInstancia();
		System.out.println(rapido); // RETORNA A POSIÇÃO DA MEMÓRIA DO OBJETO INSTANCIADO
		
		SingletonRapido rapido2 = SingletonRapido.getInstancia();
		System.out.println(rapido2);
		// COMO A IMPLEMENTAÇÃO FUNCIONOU, O CONSOLE RETORNA A MESMA POSIÇÃO DE MEMÓRIA DO OBJETO
		
		SingletonDevagaroOtimizado lazy3 = SingletonDevagaroOtimizado.getInstancia();
		System.out.println(lazy3); // RETORNA A POSIÇÃO DA MEMÓRIA DO OBJETO INSTANCIADO

		SingletonDevagaroOtimizado lazy4 = SingletonDevagaroOtimizado.getInstancia();
		System.out.println(lazy4);
		// COMO A IMPLEMENTAÇÃO FUNCIONOU, O CONSOLE RETORNA A MESMA POSIÇÃO DE MEMÓRIA DO OBJETO
		
		
		System.out.println("\n\n");

		
		// STRATEGY
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		
		System.out.println("\n\n");
		
		
		// FACADE
		Facade facade = new Facade();
		facade.migrarCliente("Igor Manoel", "12254-084");

	}
}

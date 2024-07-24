package dio.gof.singleton;

/*
 * ASSIM QUE CHAMADO ELE JÁ INSTANCIA O OBJETO E DEPOIS RETORNA
 * OCUPA MAIS MEMÓRIA
 */
public class SingletonRapido 
{
	private static SingletonRapido instancia = new SingletonRapido();
	
	private SingletonRapido() 
	{
		super();
	}
	
	public static SingletonRapido getInstancia() 
	{
		return instancia;
	}
	
}

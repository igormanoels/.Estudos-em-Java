package dio.gof.singleton;

/*
 * PRIMEIRO É FEITO UMA VERIFICAÇÃO, SE JÁ HÁ UMA INSTANCIA CRIADA, PARA DEPOIS RETORNAR O OBJETO
 * OCUPO MENOS MEMÓRIA
 */
public class SingletonDevagar 
{
	private static SingletonDevagar instancia;
	
	private SingletonDevagar() 
	{
		super();
	}
	
	public static SingletonDevagar getInstancia() {
		if (instancia == null)
		{
			instancia = new SingletonDevagar();
		}
		return instancia;
	}
	
}

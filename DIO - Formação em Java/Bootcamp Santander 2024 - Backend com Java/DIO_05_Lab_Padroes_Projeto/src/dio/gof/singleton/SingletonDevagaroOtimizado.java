package dio.gof.singleton;

/*
 * É RECOMENDADO POR SER THREAD-SAFE, PASSA POR UM CONCEITO DE ENCAPSULAMENTO DO SINGLETON
 */
public class SingletonDevagaroOtimizado 
{
	private static class InstanceHolder 
	{
		public static SingletonDevagaroOtimizado instancia;
	}
	
	private SingletonDevagaroOtimizado() 
	{
		super();
	}
	
	public static SingletonDevagaroOtimizado getInstancia() {
		if (InstanceHolder.instancia == null)
		{
			InstanceHolder.instancia = new SingletonDevagaroOtimizado();
		}
		return InstanceHolder.instancia;
	}
	
}

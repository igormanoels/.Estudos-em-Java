package projetos.D_Fila_UsandoGenerics;

public class Fila<T>
{
	private No<T> refEntrada;
	
	// assim que a classe for instânciada, a variável iniciará vazia.
	public Fila() 
	{
		this.refEntrada = null;
	}
	
	public boolean isEmpty()
	{
		return refEntrada == null? true: false;
	}
	
	// enfileirar
	public void enqueue(T obj) 
	{
		No novoNo = new No(obj);
		novoNo.setRefNo(refEntrada);
		refEntrada = novoNo;
	}
	
	// retorna o primeiro
	public T first()
	{
		if (!this.isEmpty()) 
		{
			No primeiroNo = refEntrada;
			while(true)
			{
				if (primeiroNo.getRefNo() != null) 
				{
					primeiroNo = primeiroNo.getRefNo();
				}
				else
				{
					break;
				}
			}
			return (T) primeiroNo.getNo();
		}
		return null;
	}
	
	// desenfileirar
	public T dequeue()
	{
		if (!this.isEmpty()) 
		{
			No primeiroNo = refEntrada;
			No auxiliar = refEntrada;
			while(true)
			{
				if (primeiroNo.getRefNo() != null) 
				{
					auxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}
				else
				{
					auxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getNo();
		}
		return null;
	}
	
	@Override
	public String toString() 
	{
		String retorno = "";
		No auxiliar = refEntrada;
		
		if (!this.isEmpty()) 
		{
			while(true)
			{
				retorno += "" + auxiliar.getNo() + " ---> ";
				if (auxiliar.getRefNo() != null) 
				{
					auxiliar = auxiliar.getRefNo();
				}
				else
				{
					retorno += "null";
					break;
				}
			}
			return retorno;
		}
		else
		{
			return "null";
		}
	}
	
	
	
	
}

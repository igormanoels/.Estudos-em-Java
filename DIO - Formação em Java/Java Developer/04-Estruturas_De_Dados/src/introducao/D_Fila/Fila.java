package introducao.D_Fila;

public class Fila 
{
	private No refEntrada;
	
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
	public void enqueue(No novoNo) 
	{
		novoNo.setRefNo(refEntrada);
		refEntrada = novoNo;
	}
	
	// retorna o primeiro
	public No first()
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
			return primeiroNo;
		}
		return null;
	}
	
	// desenfileirar
	public No dequeue()
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
			return primeiroNo;
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
